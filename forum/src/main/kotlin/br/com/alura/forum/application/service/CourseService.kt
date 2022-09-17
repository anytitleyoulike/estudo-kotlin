package br.com.alura.forum.application.service

import br.com.alura.forum.application.CourseUseCase
import br.com.alura.forum.application.exception.NotFoundException
import br.com.alura.forum.application.model.Course
import br.com.alura.forum.adapter.out.repository.CourseRepositoryPort
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class CourseService(private val courseRepositoryPort: CourseRepositoryPort): CourseUseCase{
    init {
        val courses = listOf<Course>(
            Course(nome = "Kotlin com Spring Boot", categoria = "Programação"),
            Course(nome = "Programação funcional com Kotlin", categoria = "Programação"),
            Course(nome = "API REST com spring boot: Camada de Persistência", categoria = "Programação")
        )

        courseRepositoryPort.saveAll(courses)
    }
    fun buscarCurso(idCurso: Long): Course {
        try {
            return courseRepositoryPort.findById(idCurso).get();
        } catch (exception: Exception) {
            throw NotFoundException("Course not found")
        }
    }

    override fun save(course: Course) {
        try {
            courseRepositoryPort.save(course)
        } catch (exception: Exception) {
            throw Exception("Error when saving courses")
        }
    }

    override fun listCourses(): List<Course> {
        return courseRepositoryPort.findAll();
    }
}
