package br.com.alura.forum.application.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Answer (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    val autor: Author,
    @ManyToOne
    val topic: Topic,
    val solucao: Boolean,
)
