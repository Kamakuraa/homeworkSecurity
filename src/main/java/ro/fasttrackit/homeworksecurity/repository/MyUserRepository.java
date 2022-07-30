package ro.fasttrackit.homeworksecurity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.homeworksecurity.model.security.MyUser;

import java.util.Optional;

@Repository

public interface MyUserRepository extends MongoRepository<MyUser, String> {
  Optional<MyUser> findByUsername(String username);
}
