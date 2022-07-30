package ro.fasttrackit.homeworksecurity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.fasttrackit.homeworksecurity.model.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
  Student findByStudentId(String studentId);
}
