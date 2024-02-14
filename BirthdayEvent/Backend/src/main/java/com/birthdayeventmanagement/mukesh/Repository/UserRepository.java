package com.birthdayeventmanagement.mukesh.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayeventmanagement.mukesh.model.User;

public interface UserRepository extends JpaRepository<User,String>{
    Optional<User> findByEmail(String username);
}
