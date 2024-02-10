package com.birthdayevent.nanthags.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthdayevent.nanthags.modal.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
