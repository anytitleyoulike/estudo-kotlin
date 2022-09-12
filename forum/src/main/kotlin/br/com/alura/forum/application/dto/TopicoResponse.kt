package br.com.alura.forum.application.dto

import br.com.alura.forum.application.model.Curso
import br.com.alura.forum.application.model.StatusTopico
import java.time.LocalDateTime

data class TopicoResponse(
    val titulo: String,
    val mensagem: String,
    val data: LocalDateTime,
    val status: StatusTopico,
)