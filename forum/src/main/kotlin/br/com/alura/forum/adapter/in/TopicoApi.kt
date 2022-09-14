package br.com.alura.forum.adapter.`in`

import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

interface TopicoApi {
    @GetMapping
    fun getTopics(): List<TopicResponse>

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): TopicResponse

    @PostMapping
    fun addTopic(@RequestBody topico: TopicoRequest): ResponseEntity<TopicResponse>
    @PutMapping
    fun updateTopic(@RequestBody editTopicRequest: EditTopicRequest): ResponseEntity<TopicResponse>

    @DeleteMapping("/{id}")
    fun deleteTopic(@PathVariable id: Long): Unit
}