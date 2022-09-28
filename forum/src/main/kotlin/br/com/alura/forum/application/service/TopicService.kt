package br.com.alura.forum.application.service

import br.com.alura.forum.application.TopicUseCase
import br.com.alura.forum.application.dto.EditTopicRequest
import br.com.alura.forum.application.dto.TopicRequest
import br.com.alura.forum.application.dto.TopicResponse
import br.com.alura.forum.application.exception.NotFoundException
import br.com.alura.forum.application.mapper.FromDomainToResponse
import br.com.alura.forum.application.model.Topic
import br.com.alura.forum.application.repository.TopicRepository
import org.springframework.stereotype.Service

@Service
class TopicService(
    private val topicRepository: TopicRepository,
    private val courseService: CourseService,
    private val authorService: AuthorService,
    private val fromDomainToResponse: FromDomainToResponse,
): TopicUseCase {
    override fun getTopics(): List<TopicResponse> {
        val topicos = topicRepository.findAll();
        return topicos.map {
            fromDomainToResponse.convert(it)
        }
    }

    override fun getById(id: Long): TopicResponse {
        try {
            val topicos = topicRepository.findById(id);
            return topicos.filter { topico -> topico.id == id  }.get().run {
                fromDomainToResponse.convert(this)
            }
        } catch (exception: Exception) {
          throw NotFoundException("Topic not found")
        }
    }

    override fun addTopic(dto: TopicRequest): TopicResponse {
        val topic = topicRepository.save(
            Topic(
                titulo = dto.titulo,
                mensagem = dto.mensagem,
                course = courseService.buscarCurso(dto.idCurso),
                autor = authorService.buscarUsuario(dto.idAutor),
            ),
        )
        return fromDomainToResponse.convert(topic)
    }

    override fun updateTopic(editTopicRequest: EditTopicRequest):TopicResponse {
        val topico = topicRepository.findById(editTopicRequest.id).get()
        topico.mensagem = editTopicRequest.mensagem
        topico.titulo = editTopicRequest.titulo
        topicRepository.save(topico)
        return fromDomainToResponse.convert(topico)
    }

    override fun removeTopic(id: Long) {
        try {
        topicRepository.deleteById(id);

        } catch(exception: Exception) {
            throw java.lang.Exception("Error when removing topic")
        }
    }

}