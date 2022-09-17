package br.com.alura.forum.application.dto

import org.jetbrains.annotations.NotNull
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

class TopicRequest(

    @field:NotEmpty(message = "Cannot be empty")
    @field:Size(min=5, max = 100, message = "Field must have a size between 5 and 100 characters")
    val titulo: String,

    @field:NotEmpty(message = "Cannot be empty")
    @field:Size(min=5, max=100, message = "Field must have a size between 5 and 100 characters")
    val mensagem: String,

    @field:NotNull
    val idCurso: Long,

    @field:NotNull
    val idAutor: Long
) {

    // para adicionar validação fora do construtor não é necessário a adição da annotation field
//    @NotEmpty
//    @Size(min=5, max = 100)
//    val titulo: String = ""
//
//    @NotEmpty
//    @Size(min=5, max=100)
//    val mensagem: String =""
//    @NotNull
//    val idCurso: Long = 0
//    @NotNull
//    val idAutor: Long = 0
}
