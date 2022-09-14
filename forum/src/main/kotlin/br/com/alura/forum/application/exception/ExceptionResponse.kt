package br.com.alura.forum.application.exception

import java.net.http.HttpResponse
import java.time.LocalDateTime

class ExceptionResponse (
    val timestamp: LocalDateTime = LocalDateTime.now(),
    val status: Int,
    val error: String,
    val message: String?,
    val path: String
)

