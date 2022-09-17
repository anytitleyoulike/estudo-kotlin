package br.com.alura.forum.application.controller

import br.com.alura.forum.application.CourseUseCase
import br.com.alura.forum.application.model.Course
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/curso")
class CourseController(private val courseUseCase: CourseUseCase)  {
    @PostMapping
    fun save(@RequestBody course: Course) {
        return courseUseCase.save(course);
    }

    @GetMapping
    fun listAll() : ResponseEntity<List<Course>>{
        val cursos = courseUseCase.listCourses();

        return ResponseEntity.ok(cursos);
    }
}