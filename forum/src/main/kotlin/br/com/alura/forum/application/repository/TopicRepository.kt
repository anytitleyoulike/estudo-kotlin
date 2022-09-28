package br.com.alura.forum.application.repository

import br.com.alura.forum.application.model.Topic
import org.springframework.data.jpa.repository.JpaRepository

interface TopicRepository:JpaRepository<Topic, Long> {
}