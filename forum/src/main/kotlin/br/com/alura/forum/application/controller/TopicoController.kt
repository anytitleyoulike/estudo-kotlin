package br.com.alura.forum.application.controller

import br.com.alura.forum.adapter.`in`.TopicoApi
import br.com.alura.forum.application.TopicoUseCase
import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/topico")
class TopicoController(val useCase: TopicoUseCase) : TopicoApi {

    override fun getTopics(): List<TopicResponse> {
        return useCase.getTopics()
    }

    override fun getById(id: Long): TopicResponse {
        return useCase.getById(id)
    }

    override fun addTopic(@RequestBody @Valid topic: TopicoRequest): ResponseEntity<TopicResponse> {
       val topicResponse = useCase.addTopic(topic);
//        val uri = UriComponentsBuilder().path("/topico/$topicResponse.id").build().toUri()
//       return ResponseEntity.created(uri).body(topicResponse)
       return ResponseEntity.ok(topicResponse)
    }

    override fun updateTopic(editTopicRequest: EditTopicRequest): ResponseEntity<TopicResponse> {
        val topicResponse= useCase.updateTopic(editTopicRequest)
        return ResponseEntity.ok(topicResponse)
    }

    override fun deleteTopic(id: Long) {
        useCase.removeTopic(id)
    }
}