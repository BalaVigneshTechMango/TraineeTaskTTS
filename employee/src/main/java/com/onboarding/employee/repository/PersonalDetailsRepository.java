package com.onboarding.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onboarding.employee.entity.PersonalDetailsEntity;

public interface PersonalDetailsRepository extends JpaRepository<PersonalDetailsEntity, Integer>{

}
