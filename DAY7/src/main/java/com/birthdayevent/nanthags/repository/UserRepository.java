package com.birthdayevent.nanthags.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayevent.nanthags.modal.Users;

public interface UserRepository extends JpaRepository<Users,String>{
    Optional<Users> findByEmail(String email);
}
