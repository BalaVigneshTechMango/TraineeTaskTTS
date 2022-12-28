package com.onboarding.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onboarding.employee.entity.BankDetailsEntity;

public interface BankDetailsRepository extends JpaRepository<BankDetailsEntity, Integer>{

}
