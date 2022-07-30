package ro.fasttrackit.homeworksecurity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.homeworksecurity.model.entity.Teacher;
import ro.fasttrackit.homeworksecurity.repository.TeacherRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
  private final TeacherRepository repository;

  public List<Teacher> getAll() {
    return repository.findAll ();
  }
}
