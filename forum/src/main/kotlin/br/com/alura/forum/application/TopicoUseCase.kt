package br.com.alura.forum.application

import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicoResponse

interface TopicoUseCase {
    fun getTopics(): List<TopicoResponse>
    fun getById(id: Long): TopicoResponse
    fun addTopic(topico: TopicoRequest): Unit
    fun updateTopic(editTopicRequest: EditTopicRequest): Unit
    fun removeTopic(id: Long): Unit
}