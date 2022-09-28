package br.com.alura.forum.application.repository

import br.com.alura.forum.application.model.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepositoryPort:JpaRepository<Author, Long> {
}