package ro.fasttrackit.homeworksecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.List;

//@Configuration
public class InMemoryUsersConfig {
  @Bean
  InMemoryUserDetailsManager userDetailsManager() {
    return new InMemoryUserDetailsManager(List.of(
      User.builder()
        .username("admin")
        .password("admin")
        .roles("ADMIN")
        .build(),
      User.builder()
        .username("user")
        .password("user")
        .roles("USER")
        .build()
    ));
  }

  @Bean
  PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }
}
