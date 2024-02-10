package com.birthdayeventmanagement.mukesh.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.birthdayeventmanagement.mukesh.model.UserEvent;

@SuppressWarnings("null")
public interface UserEventRepository extends JpaRepository<UserEvent,String> {
    Optional<UserEvent> findById(String eventid);
}
