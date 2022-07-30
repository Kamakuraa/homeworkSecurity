package ro.fasttrackit.homeworksecurity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collection = "schools")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolInfo {
  @Id
  private String schoolId;

  private String teacherId;
  private String studentId;
}
