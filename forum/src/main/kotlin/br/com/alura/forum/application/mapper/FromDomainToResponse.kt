package br.com.alura.forum.application.mapper

import br.com.alura.forum.application.dto.TopicResponse
import br.com.alura.forum.application.model.Topic
import org.springframework.stereotype.Component

@Component
class FromDomainToResponse: Mapper<Topic,TopicResponse> {
    override fun convert(topic: Topic): TopicResponse {
        return TopicResponse(
            id = topic.id,
            titulo = topic.titulo,
            mensagem = topic.mensagem,
            data = topic.dataCriacao,
            status = topic.status
        )
    }
}