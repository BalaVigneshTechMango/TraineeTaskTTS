package com.onboarding.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onboarding.employee.entity.QualificationOfEmployeeEntity;

public interface QualificationRepository extends JpaRepository<QualificationOfEmployeeEntity, Integer>{

}
