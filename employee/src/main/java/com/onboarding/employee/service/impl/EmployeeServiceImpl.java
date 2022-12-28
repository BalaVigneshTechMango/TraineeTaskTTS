package com.onboarding.employee.service.impl;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onboarding.employee.dao.EmployeeOnBoardingDao;
import com.onboarding.employee.entity.BankDetailsEntity;
import com.onboarding.employee.entity.EmployeeEntity;
import com.onboarding.employee.entity.PersonalDetailsEntity;
import com.onboarding.employee.entity.QualificationOfEmployeeEntity;
import com.onboarding.employee.request.EmployeeOnBoardingRequestPojo;
import com.onboarding.employee.request.License;
import com.onboarding.employee.request.QualificationRequestPojo;
import com.onboarding.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeOnBoardingDao employeeDao;
	
	public void employeeOnboard(EmployeeOnBoardingRequestPojo employeeRequestPojo,EmployeeEntity employeeEntity) {
		   BankDetailsEntity bankDetailsEntity=new BankDetailsEntity();
		   PersonalDetailsEntity personalDetailsEntity=new PersonalDetailsEntity();
		   
		  // Set<QualificationOfEmployeeEntity>qualificationOfEmployee2=new HashSet<>();
		   
		   employeeEntity.setFullName(employeeRequestPojo.getFullName());
		   employeeEntity.setFatherName(employeeRequestPojo.getFatherName());
		   employeeEntity.setDataOfBirth(employeeRequestPojo.getDataOfBirth());
		   employeeEntity.setDesignation(employeeRequestPojo.getDesignation());
		   employeeEntity.setReportingManager(employeeRequestPojo.getReportingManager());
		   employeeEntity.setEmployeeId(employeeRequestPojo.getEmployeeId());
		   employeeEntity.setDataOfJoining(employeeRequestPojo.getDataOfJoining());
		   employeeEntity.setYearOfExperience(employeeRequestPojo.getYearOfExperience());
		   employeeEntity.setDataOfExitFromPerviousCom(employeeRequestPojo.getDataOfExitFromPerviousCom());
		   employeeEntity.setMobileNumberOne(employeeRequestPojo.getMobileNumberOne());
		   employeeEntity.setMobileNumberTwo(employeeRequestPojo.getMobileNumberTwo());
		   employeeEntity.setBloodGroup(employeeRequestPojo.getBloodGroup());
		   employeeEntity.setPersonalEmailId(employeeRequestPojo.getPersonalEmailId());
		   employeeEntity.setOfficialMailId(employeeRequestPojo.getOfficialMailId());
		   employeeEntity.setSkypeId(employeeRequestPojo.getSkypeId());
		   employeeEntity.setPersentAddress(employeeRequestPojo.getPersentAddress());
		   employeeEntity.setPermanentAddress(employeeRequestPojo.getPermanentAddress());
		   employeeEntity.setPfNumber(employeeRequestPojo.getPfNumber());
		   employeeEntity.setPanNumber(employeeRequestPojo.getPanNumber());
		   employeeEntity.setAadhaarNumber(employeeRequestPojo.getAadhaarNumber());
		   employeeEntity.setMaritalStatus(employeeRequestPojo.getMaritalStatus());
		   employeeEntity.setSpouseName(employeeRequestPojo.getSpouseName());
		   employeeEntity.setDrivingLicenseNumber(employeeRequestPojo.getDrivingLicenseNumber());
		   employeeEntity.setDateOfExpiryLicense(employeeRequestPojo.getDateOfExpiryLicense());
		   employeeEntity.setVoterIdNumber(employeeRequestPojo.getVoterIdNumber());
		   employeeEntity.setPassPortNumber(employeeRequestPojo.getPassPortNumber());
		   employeeEntity.setDateOfExpiryPassport(employeeRequestPojo.getDateOfExpiryPassport());
		   
		   bankDetailsEntity .setAccountNumber(employeeRequestPojo.getAccountNumber());
		   bankDetailsEntity.setBankName(employeeRequestPojo.getBankName());
		   bankDetailsEntity.setBranchName(employeeRequestPojo.getBranchName());
		   bankDetailsEntity.setIfscCode(employeeRequestPojo.getIfscCode());
		   bankDetailsEntity.setEmployeeEntity(employeeEntity);
		   

		   personalDetailsEntity.setNomineeName(employeeRequestPojo.getNomineeName());
		   personalDetailsEntity.setNomineeAge(employeeRequestPojo.getNomineeAge());
		   personalDetailsEntity.setNomineeDob(employeeRequestPojo.getNomineeDob());
		   personalDetailsEntity.setEmgCtPersonOne(employeeRequestPojo.getEmgCtPersonOne());
		   personalDetailsEntity.setPerContactOne(employeeRequestPojo.getPerContactOne());
		   personalDetailsEntity.setEmgCtPersonTwo(employeeRequestPojo.getEmgCtPersonTwo());
		   personalDetailsEntity.setPerContactTwo(employeeRequestPojo.getPerContactTwo());
		   personalDetailsEntity.setEmployeeEntity(employeeEntity);
		  
//		   qualificationOfEmployeeEntity.setQualification(employeeRequestPojo.getQualification());
//		   qualificationOfEmployeeEntity.setUniversityName(employeeRequestPojo.getUniversityName());
//		   qualificationOfEmployeeEntity.setMajor(employeeRequestPojo.getMajor());
//		   qualificationOfEmployeeEntity.setYearOfJoining(employeeRequestPojo.getYearOfJoining());
//		   qualificationOfEmployeeEntity.setYearOfPassing(employeeRequestPojo.getYearOfPassing());
//		   qualificationOfEmployeeEntity.setPercentage(employeeRequestPojo.getPercentage());
//		   qualificationOfEmployeeEntity.setRegularDistance(employeeRequestPojo.getRegularDistance());
          // qualificationOfEmployee2.add(qualificationOfEmployeeEntity);
		   
		   employeeEntity.setQualificationOfEmployee(employeeRequestPojo.getEduQ());
		   employeeEntity.setTechnicalAndNonSkillEntities(employeeRequestPojo.getTechnicalAndNonSkillEntities());
		   employeeEntity.setHobbiesEntities(employeeRequestPojo.getHobbiesEntities());
		   employeeEntity.setPreviousEmployementEntities(employeeRequestPojo.getPreviousEmployementEntities());
		   employeeEntity.setBankDetailsEntity(bankDetailsEntity);
		   employeeEntity.setPersonalDetailsEntity(personalDetailsEntity);
         //  employeeEntity.setQualificationOfEmployee(qualificationOfEmployee2);
		
		    employeeDao.employeeOnboard(employeeRequestPojo,employeeEntity);
		  
	}
	
	  public List<EmployeeEntity>getAllEmployee(){
		
	 	    return employeeDao.getAllEmployee();
	  }
	  
	  public List<EmployeeEntity> getParticularEmployee(){
		  
		  return employeeDao.getParticularEmployee();
	  }

	
	
	
	
}
