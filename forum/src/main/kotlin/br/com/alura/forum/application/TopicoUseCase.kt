package br.com.alura.forum.application

import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicResponse

interface TopicoUseCase {
    fun getTopics(): List<TopicResponse>
    fun getById(id: Long): TopicResponse
    fun addTopic(topico: TopicoRequest): TopicResponse
    fun updateTopic(editTopicRequest: EditTopicRequest): TopicResponse
    fun removeTopic(id: Long): Unit
}