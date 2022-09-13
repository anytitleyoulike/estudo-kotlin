package br.com.alura.forum.adapter.`in`

import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicoResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

interface TopicoApi {
    @GetMapping
    fun listar(): List<TopicoResponse>

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoResponse

    @PostMapping
    fun adicionarTopico(@RequestBody topico: TopicoRequest): Unit
    @PutMapping
    fun editarTopico(@RequestBody editTopicRequest: EditTopicRequest): Unit

    @DeleteMapping("/{id}")
    fun deleteTopic(@PathVariable id: Long): Unit
}