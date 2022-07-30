package ro.fasttrackit.homeworksecurity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.homeworksecurity.model.StudentFilters;
import ro.fasttrackit.homeworksecurity.model.entity.Student;
import ro.fasttrackit.homeworksecurity.repository.StudentRepository;
import ro.fasttrackit.homeworksecurity.repository.dao.StudentDao;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentDao studentDao;
  private final StudentRepository studentRepository;

  public List<Student> getAllByFilters(StudentFilters filters) {
    return studentDao.getAll(filters);
  }

  public Optional<Student> getStudentById(String studentId) {
    return studentRepository.findById (studentId);
  }
}
