package ro.fasttrackit.homeworksecurity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.fasttrackit.homeworksecurity.model.entity.Teacher;

public interface TeacherRepository extends MongoRepository <Teacher, String>{
}
