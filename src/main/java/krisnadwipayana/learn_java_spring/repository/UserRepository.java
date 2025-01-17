package krisnadwipayana.learn_java_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import krisnadwipayana.learn_java_spring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
