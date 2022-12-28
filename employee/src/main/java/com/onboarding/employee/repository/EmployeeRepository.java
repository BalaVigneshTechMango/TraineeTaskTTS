package com.onboarding.employee.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onboarding.employee.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	

//	@Query("select e.fullName,e.fatherName,p.nomineeName,b.bankName,q.qualification, from EmployeeEntity e join PersonalDetailsEntity p   "
//			
//			)public ArrayList getAllEmployeeDetails();
//
//	@Query("select p.empId,p.empName,q.city,q.addressType,from Employee p join PersonalDetails q on p.empId=q.addressId"
//			 )public ArrayList getEmployeeDetails();
//	
	
}
