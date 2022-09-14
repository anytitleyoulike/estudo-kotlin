package br.com.alura.forum.application.mapper

import br.com.alura.forum.application.dto.TopicResponse
import br.com.alura.forum.application.model.Topico
import org.springframework.stereotype.Component

@Component
class FromDomainToResponse:Mapper<Topico,TopicResponse> {
    override fun convert(topico: Topico): TopicResponse {
        return TopicResponse(
            id = topico.id,
            titulo = topico.titulo,
            mensagem = topico.mensagem,
            data = topico.dataCriacao,
            status = topico.status
        )
    }
}