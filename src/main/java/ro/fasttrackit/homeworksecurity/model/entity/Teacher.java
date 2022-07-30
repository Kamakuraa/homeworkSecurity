package ro.fasttrackit.homeworksecurity.model.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collection = "teachers")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
  @Id
  private String teacherId;
  @NonNull
  private String name;

  @NonNull
  private int age;
  @NonNull
  private String discipline;



}
