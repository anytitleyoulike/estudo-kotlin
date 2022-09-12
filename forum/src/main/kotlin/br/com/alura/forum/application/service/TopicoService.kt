package br.com.alura.forum.application.service

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
) {
    fun listarTopicos(): List<TopicoResponse> {
        return topicos.map {
            fromDomainToResponse.convert(it)
        }
    }

    fun buscarPorId(id: Long): TopicoResponse {
        return topicos.filter { topico -> topico.id == id  }.first().run {
            fromDomainToResponse.convert(this)
        }
    }

    fun adicionarTopico(dto: TopicoRequest): Unit {
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

}