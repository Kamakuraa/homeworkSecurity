package ro.fasttrackit.homeworksecurity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.homeworksecurity.model.StudentFilters;
import ro.fasttrackit.homeworksecurity.model.entity.Student;
import ro.fasttrackit.homeworksecurity.service.StudentService;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {
  private final StudentService studentService;

  @GetMapping
  List<Student> getAll(StudentFilters filters) {
    return studentService.getAllByFilters (filters);
  }

  @GetMapping("{studentId}")
  Student getStudentById(@PathVariable String studentId) {
    return studentService.getStudentById (studentId)
      .orElseThrow (() -> new EntityNotFoundException ("Student with id " + studentId + " not found "));
  }
}
