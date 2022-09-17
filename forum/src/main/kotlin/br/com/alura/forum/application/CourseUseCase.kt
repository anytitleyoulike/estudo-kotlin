package br.com.alura.forum.application

import br.com.alura.forum.application.model.Course

interface CourseUseCase {
    fun save(course: Course): Unit;
    fun listCourses(): List<Course>
}