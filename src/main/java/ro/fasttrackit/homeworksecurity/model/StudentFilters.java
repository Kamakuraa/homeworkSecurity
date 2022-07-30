package ro.fasttrackit.homeworksecurity.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StudentFilters {

  String name;
  String studentId;
  Integer age;
  Integer minAge;
  Integer maxAge;

}
