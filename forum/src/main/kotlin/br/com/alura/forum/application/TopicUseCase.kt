package br.com.alura.forum.application

import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicRequest
import br.com.alura.forum.application.dto.TopicResponse

interface TopicUseCase {
    fun getTopics(): List<TopicResponse>
    fun getById(id: Long): TopicResponse
    fun addTopic(topico: TopicRequest): TopicResponse
    fun updateTopic(editTopicRequest: EditTopicRequest): TopicResponse
    fun removeTopic(id: Long): Unit
}