package ro.fasttrackit.homeworksecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.homeworksecurity.model.entity.Student;
import ro.fasttrackit.homeworksecurity.model.entity.Teacher;
import ro.fasttrackit.homeworksecurity.model.security.MyUser;
import ro.fasttrackit.homeworksecurity.repository.MyUserRepository;
import ro.fasttrackit.homeworksecurity.repository.StudentRepository;
import ro.fasttrackit.homeworksecurity.repository.TeacherRepository;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class HomeworkSecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run (HomeworkSecurityApplication.class, args);
  }

  CommandLineRunner addUsers(MyUserRepository repo) {
    return args -> repo.saveAll(List.of(
      new MyUser (UUID.randomUUID().toString(), "admin", "admin",  List.of("ROLE_ADMIN", "READ", "WRITE")),
      new MyUser(UUID.randomUUID().toString(), "user", "user",  List.of("ROLE_ADMIN", "READ", "WRITE"))
    ));
  }
  @Bean
  CommandLineRunner atStartup(TeacherRepository repository) {
    return args -> {
      repository.saveAll (List.of (
        Teacher.builder ()
          .teacherId ("1")
          .name ("Literature")
          .discipline ("Poezie")
          .build (),

        Teacher.builder ()
          .teacherId ("2")
          .discipline ("JAVA")
          .name ("Info")
          .build ()
      ));
    };
  }

  @Bean
  CommandLineRunner atStartup1(StudentRepository repository) {
    return args -> {
      repository.saveAll (List.of (
        Student.builder ()
          .studentId ("1")
          .age (35)
          .name ("Alex")
          .build (),

        Student.builder ()
          .studentId ("1")
          .age (37)
          .name ("Stefan")
          .build ()

      ));
    };
  }
}
