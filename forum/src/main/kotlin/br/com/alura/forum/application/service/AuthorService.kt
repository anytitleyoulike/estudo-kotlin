package br.com.alura.forum.application.service

import br.com.alura.forum.application.repository.AuthorRepositoryPort
import br.com.alura.forum.application.exception.NotFoundException
import br.com.alura.forum.application.model.Author
import org.springframework.stereotype.Service

import java.lang.Exception
@Service
class AuthorService(private val authorRepositoryPort: AuthorRepositoryPort) {
      fun buscarUsuario(idAuthor: Long): Author {
        try {
            return authorRepositoryPort.findById(idAuthor).get()
        } catch(exception: Exception) {
            throw NotFoundException("Author not found")
        }
    }
}
