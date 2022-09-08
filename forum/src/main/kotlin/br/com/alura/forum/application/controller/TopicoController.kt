package br.com.alura.forum.application.controller

import br.com.alura.forum.adapter.`in`.TopicoApi
import br.com.alura.forum.application.model.Curso
import br.com.alura.forum.application.model.StatusTopico
import br.com.alura.forum.application.model.Topico
import br.com.alura.forum.application.model.Usuario
import br.com.alura.forum.application.service.TopicoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topico")
class TopicoController(val topicoService: TopicoService) : TopicoApi {

    override fun listar(): List<Topico> {
        return topicoService.listarTopicos()

    }

    override fun buscarPorId(id: Long): Topico {
        return topicoService.buscarPorId(id);
    }

    override fun adicionarTopico(topico: Topico) {
        topicoService.adicionarTopico(topico);
    }
}