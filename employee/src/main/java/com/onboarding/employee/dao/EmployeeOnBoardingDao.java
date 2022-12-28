package com.onboarding.employee.dao;

import java.util.List;

import com.onboarding.employee.entity.EmployeeEntity;
import com.onboarding.employee.entity.QualificationOfEmployeeEntity;
import com.onboarding.employee.request.EmployeeOnBoardingRequestPojo;
import com.onboarding.employee.request.QualificationRequestPojo;

public interface EmployeeOnBoardingDao {

   public void employeeOnboard(EmployeeOnBoardingRequestPojo employeeRequestPojo,EmployeeEntity employeeEntity);

   public List<EmployeeEntity>getAllEmployee();

   public List<EmployeeEntity> getParticularEmployee();
   
   
   
}
