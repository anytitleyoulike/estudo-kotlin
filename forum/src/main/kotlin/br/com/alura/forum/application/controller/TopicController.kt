package br.com.alura.forum.application.controller

import br.com.alura.forum.adapter.`in`.TopicApi
import br.com.alura.forum.application.TopicUseCase
import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicRequest
import br.com.alura.forum.application.dto.TopicResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.transaction.Transactional
import javax.validation.Valid

@RestController
@RequestMapping("/topico")
class TopicController(val useCase: TopicUseCase) : TopicApi {

    override fun getTopics(): List<TopicResponse> {
        return useCase.getTopics()
    }

    override fun getById(id: Long): TopicResponse {
        return useCase.getById(id)
    }
    @Transactional
    override fun addTopic(@RequestBody @Valid topic: TopicRequest): ResponseEntity<TopicResponse> {
       val topicResponse = useCase.addTopic(topic);
//        val uri = UriComponentsBuilder().path("/topico/$topicResponse.id").build().toUri()
//       return ResponseEntity.created(uri).body(topicResponse)
       return ResponseEntity.ok(topicResponse)
    }
    @Transactional
    override fun updateTopic(editTopicRequest: EditTopicRequest): ResponseEntity<TopicResponse> {
        val topicResponse= useCase.updateTopic(editTopicRequest)
        return ResponseEntity.ok(topicResponse)
    }
    @Transactional
    override fun deleteTopic(id: Long):Unit {
        useCase.removeTopic(id)
    }
}