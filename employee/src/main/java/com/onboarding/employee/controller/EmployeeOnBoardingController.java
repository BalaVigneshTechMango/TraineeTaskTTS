package com.onboarding.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onboarding.employee.entity.EmployeeEntity;
import com.onboarding.employee.entity.QualificationOfEmployeeEntity;
import com.onboarding.employee.request.EmployeeOnBoardingRequestPojo;
import com.onboarding.employee.request.QualificationRequestPojo;
import com.onboarding.employee.response.ResponsePojo;
import com.onboarding.employee.service.EmployeeService;


@RestController
@RequestMapping("/onboarding")
public class EmployeeOnBoardingController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/registerform")
	public ResponsePojo onboard(@RequestBody EmployeeOnBoardingRequestPojo employeeRequestPojo,EmployeeEntity employeeEntity) {
		ResponsePojo responsePojo=new ResponsePojo();
		employeeService.employeeOnboard(employeeRequestPojo,employeeEntity);
		responsePojo.setData(employeeRequestPojo);
		return responsePojo;
	}
	
	@PostMapping("/getAllEmployee")
	public List<EmployeeEntity>getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/getParticularEmployee")
	public ResponsePojo getSingleEmployee() {
		ResponsePojo responsePojo=new ResponsePojo();
		employeeService.getParticularEmployee();
		return responsePojo;
	}
	
}
