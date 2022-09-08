package br.com.alura.forum.application.service

import br.com.alura.forum.application.model.Curso
import br.com.alura.forum.application.model.StatusTopico
import br.com.alura.forum.application.model.Topico
import br.com.alura.forum.application.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico> = listOf<Topico>() ) {
    init {
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variáveis no kotlin",
            curso = Curso(id = 1, nome = "Kotlin", categoria = "Programacao"),
            autor = Usuario(id = 1, "marcello@email.com", "Marcello Cordeiro"),
            status = StatusTopico.NAO_RESPONDIDO
        )
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Kotlin2",
            mensagem = "Variáveis no kotlin",
            curso = Curso(id = 1, nome = "Kotlin", categoria = "Programacao"),
            autor = Usuario(id = 1, "marcello@email.com", "Marcello Cordeiro"),
            status = StatusTopico.NAO_RESPONDIDO
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida Kotlin3",
            mensagem = "Variáveis no kotlin",
            curso = Curso(id = 1, nome = "Kotlin", categoria = "Programacao"),
            autor = Usuario(id = 1, "marcello@email.com", "Marcello Cordeiro"),
            status = StatusTopico.NAO_RESPONDIDO
        )

        topicos = Arrays.asList(topico, topico2, topico3)

    }

    fun listarTopicos(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.filter { topico -> topico.id == id  }.first()
    }

    fun adicionarTopico(topico: Topico) {
        topicos.plus(topico)
    }

}