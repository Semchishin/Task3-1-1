package com.springboot.task311.repository;



import com.springboot.task311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
