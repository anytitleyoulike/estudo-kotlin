package br.com.alura.forum.application.service

import br.com.alura.forum.application.TopicoUseCase
import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicoRequest
import br.com.alura.forum.application.dto.TopicoResponse
import br.com.alura.forum.application.mapper.FromDomainToResponse
import br.com.alura.forum.application.model.Topico
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(
    private var topicos: MutableList<Topico> = mutableListOf<Topico>(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService,
    private val fromDomainToResponse: FromDomainToResponse,
): TopicoUseCase {
    override fun getTopics(): List<TopicoResponse> {
        return topicos.map {
            fromDomainToResponse.convert(it)
        }
    }

    override fun getById(id: Long): TopicoResponse {
        return topicos.filter { topico -> topico.id == id  }.first().run {
            fromDomainToResponse.convert(this)
        }
    }

    override fun addTopic(dto: TopicoRequest): Unit {
         topicos.add(
            Topico(
                id = topicos.size.toLong(),
                titulo = dto.titulo,
                mensagem = dto.mensagem,
                curso = cursoService.buscarCurso(dto.idCurso),
                autor = usuarioService.buscarUsuario(dto.idAutor)
            )
        )
    }

    override fun updateTopic(editTopicRequest: EditTopicRequest) {
        topicos.filter { topico: Topico -> topico.id == editTopicRequest.id }.first().let{
            it.mensagem = editTopicRequest.mensagem;
            it.titulo = editTopicRequest.titulo
        }
    }

    override fun removeTopic(id: Long) {
        topicos.filter { t: Topico -> t.id == id }.first().apply {
            topicos.remove(this)
        }
    }

}