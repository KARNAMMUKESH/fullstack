package com.birthdayevent.nanthags.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayevent.nanthags.modal.EventDetails;

public interface EdetailsRepository extends JpaRepository<EventDetails,Long> {

}
