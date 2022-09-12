package br.com.alura.forum.application.mapper

import br.com.alura.forum.application.dto.TopicoResponse
import br.com.alura.forum.application.model.Curso
import br.com.alura.forum.application.model.Topico
import org.springframework.stereotype.Component

@Component
class FromDomainToResponse:Mapper<Topico,TopicoResponse> {
    override fun convert(topico: Topico): TopicoResponse {
        return TopicoResponse(
            titulo = topico.titulo,
            mensagem = topico.mensagem,
            data = topico.dataCriacao,
            status = topico.status
        )
    }
}