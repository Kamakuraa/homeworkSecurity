package ro.fasttrackit.homeworksecurity.model.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collection = "students")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
  @Id
  private String studentId;

  @NonNull
  private String name;

  @NonNull
  private int age;
}
