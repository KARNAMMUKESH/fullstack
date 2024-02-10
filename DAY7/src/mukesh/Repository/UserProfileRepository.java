package com.birthdayeventmanagement.mukesh.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayeventmanagement.mukesh.model.UserProfile;
@SuppressWarnings("null")
public interface UserProfileRepository extends JpaRepository<UserProfile,String> {
     Optional<UserProfile> findById(String profileid);
}
