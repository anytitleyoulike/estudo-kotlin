package br.com.alura.forum.application.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size
import kotlin.math.min

class EditTopicRequest {
    @NotBlank
    val id: Long = 0;
    @NotBlank
    @Size(min = 3)
    val titulo: String = "";
    @NotBlank
    @Size(min = 3)
    val mensagem: String = "";
}
