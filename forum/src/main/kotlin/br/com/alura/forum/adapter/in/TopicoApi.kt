package br.com.alura.forum.adapter.`in`

import br.com.alura.forum.application.dto.TopicoDTO
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.model.Topico
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

interface TopicoApi {
    @GetMapping("/topicos")
    fun listar(): List<Topico>

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico

    @PostMapping
    fun adicionarTopico(@RequestBody topico: TopicoRequest): Unit
}