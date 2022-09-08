package br.com.alura.forum.application.dto

class TopicoRequest(
    val titulo: String,
    val mensagem: String,
    val idCurso: Long,
    val idAutor: Long
)
