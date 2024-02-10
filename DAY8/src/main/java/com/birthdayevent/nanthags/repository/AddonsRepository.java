package com.birthdayevent.nanthags.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthdayevent.nanthags.modal.Addons;

@Repository
public interface AddonsRepository extends JpaRepository<Addons,Integer>{

}
