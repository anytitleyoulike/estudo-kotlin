package br.com.alura.forum.application.model

import java.time.LocalDateTime
import javax.persistence.*


@Entity
data class Topic(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var titulo: String,
    var mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    val course: Course,
    @ManyToOne
    val autor: Usuario,
    @Enumerated(value = EnumType.STRING) //saves constant name, number not included
    val status: TopicStatus = TopicStatus.NAO_RESPONDIDO,
    @OneToMany(mappedBy = "topic")
    val respostas: List<Respostas> = listOf()

)

enum class TopicStatus {
    NAO_RESPONDIDO,
    NAO_SOLUCIONADO,
    FECHADO,
    SOLUCIONADO
}