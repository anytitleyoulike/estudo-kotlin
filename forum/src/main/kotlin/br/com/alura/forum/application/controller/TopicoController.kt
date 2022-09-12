package br.com.alura.forum.application.controller

import br.com.alura.forum.adapter.`in`.TopicoApi
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicoResponse
import br.com.alura.forum.application.service.TopicoService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/topico")
class TopicoController(val topicoService: TopicoService) : TopicoApi {

    override fun listar(): List<TopicoResponse> {
        return topicoService.listarTopicos()
    }

    override fun buscarPorId(id: Long): TopicoResponse {
        return topicoService.buscarPorId(id)
    }

    override fun adicionarTopico(@RequestBody @Valid topico: TopicoRequest) {
        topicoService.adicionarTopico(topico)
    }
}