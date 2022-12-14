package ro.fasttrackit.homeworksecurity.model.security;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document("users")
@Builder
public record MyUser(
  @Id
  String userId,
  @Indexed(unique = true)
  String username,
  String password,
  List<String> roles
) {

}
