package com.birthdayevent.nanthags.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthdayevent.nanthags.modal.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer>{

}
