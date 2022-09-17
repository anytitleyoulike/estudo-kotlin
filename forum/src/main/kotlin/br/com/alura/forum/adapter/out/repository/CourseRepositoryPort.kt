package br.com.alura.forum.adapter.out.repository

import br.com.alura.forum.application.model.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepositoryPort: JpaRepository<Course, Long> {
}