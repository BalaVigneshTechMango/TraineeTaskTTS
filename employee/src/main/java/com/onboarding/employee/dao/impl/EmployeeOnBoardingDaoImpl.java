package com.onboarding.employee.dao.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onboarding.employee.dao.EmployeeOnBoardingDao;
import com.onboarding.employee.entity.EmployeeEntity;
import com.onboarding.employee.entity.QualificationOfEmployeeEntity;
import com.onboarding.employee.repository.EmployeeRepository;
import com.onboarding.employee.request.EmployeeOnBoardingRequestPojo;
import com.onboarding.employee.request.QualificationRequestPojo;

@Service
public class EmployeeOnBoardingDaoImpl implements EmployeeOnBoardingDao{

	@Autowired 
	private EmployeeRepository employeeRepository;
	
	   public void employeeOnboard(EmployeeOnBoardingRequestPojo employeeRequestPojo,EmployeeEntity employeeEntity) {
           
		   employeeRepository.save(employeeEntity);
		   
//		    EmployeeEntity s = employeeRepository.save(employeePojo);
//             System.out.println(s.getEmpInfoId());
		   
	   }
	   
	   
	   
	   public List<EmployeeEntity>getAllEmployee(){
		
		   return (List<EmployeeEntity>)employeeRepository.findAll();
	   }
	   
	   public List<EmployeeEntity> getParticularEmployee(){
		   
		   return employeeRepository.findAll();
	   }
	   
}
