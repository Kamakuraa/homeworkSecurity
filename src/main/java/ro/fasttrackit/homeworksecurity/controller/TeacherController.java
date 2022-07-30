package ro.fasttrackit.homeworksecurity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.homeworksecurity.model.entity.Teacher;
import ro.fasttrackit.homeworksecurity.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("teachers")
@RequiredArgsConstructor
public class TeacherController {
  private final TeacherService courseService;

  @GetMapping
  List<Teacher> getAll(){
    return courseService.getAll();
  }


}
