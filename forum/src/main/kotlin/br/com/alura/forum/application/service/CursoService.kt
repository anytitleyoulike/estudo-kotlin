package br.com.alura.forum.application.service

import br.com.alura.forum.application.model.Curso
import org.springframework.stereotype.Service

@Service
class CursoService(){
    val cursos = listOf<Curso>(
        Curso(1, "Kotlin com Spring Boot", "Programação"),
        Curso(2, "Programação funcional com Kotlin", "Programação")
    )
    fun buscarCurso(idCurso: Long): Curso {
       return cursos.filter { it.id == idCurso }.first()
    }
}
