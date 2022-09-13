package br.com.alura.forum.application.controller

import br.com.alura.forum.adapter.`in`.TopicoApi
import br.com.alura.forum.application.TopicoUseCase
import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicoResponse
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/topico")
class TopicoController(val useCase: TopicoUseCase) : TopicoApi {

    override fun listar(): List<TopicoResponse> {
        return useCase.getTopics()
    }

    override fun buscarPorId(id: Long): TopicoResponse {
        return useCase.getById(id)
    }

    override fun adicionarTopico(@RequestBody @Valid topic: TopicoRequest): Unit {
        useCase.addTopic(topic)
    }

    override fun editarTopico(editTopicRequest: EditTopicRequest): Unit {
        useCase.updateTopic(editTopicRequest)
    }

    override fun deleteTopic(id: Long) {
        useCase.removeTopic(id)
    }
}