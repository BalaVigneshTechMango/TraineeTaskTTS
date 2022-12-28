package com.onboarding.employee.request;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.onboarding.employee.entity.EmployeeEntity;
import com.onboarding.employee.entity.HobbiesEntity;
import com.onboarding.employee.entity.PreviousEmployementEntity;
import com.onboarding.employee.entity.QualificationOfEmployeeEntity;
import com.onboarding.employee.entity.TechnicalAndNonSkillEntity;


public class EmployeeOnBoardingRequestPojo {

	private String fullName;
	private String fatherName;
	private String dataOfBirth;
	private String designation;
	private String reportingManager;
	private String employeeId;
	private String dataOfJoining;
	private int yearOfExperience;
	private String dataOfExitFromPerviousCom;
	private String mobileNumberOne;
	private String mobileNumberTwo;
	private String bloodGroup;
	private String personalEmailId;
	private String officialMailId;
	private String skypeId;
	private String persentAddress;
	private String permanentAddress;
	private String pfNumber;
	private String panNumber;
	private String aadhaarNumber;
	private String maritalStatus;
	private String spouseName;
	private String voterIdNumber;
	private String passPortNumber;
	private String dateOfExpiryPassport;
	private License license;
	private String dateOfExpiryLicense;
	private String drivingLicenseNumber;
	
	private String bankName;
	private String branchName;
	private String accountNumber;
	private String ifscCode;
	
	private String nomineeName;
	private int    nomineeAge;
	private String nomineeDob;
	private String emgCtPersonOne;
	private String perContactOne;
	private String emgCtPersonTwo;
	private String perContactTwo;

	private Set<QualificationOfEmployeeEntity> eduQ;
	private Set<PreviousEmployementEntity>previousEmployementEntities;
	private Set<HobbiesEntity>hobbiesEntities;
	private Set<TechnicalAndNonSkillEntity>technicalAndNonSkillEntities;
	
	
	
	public Set<PreviousEmployementEntity> getPreviousEmployementEntities() {
		return previousEmployementEntities;
	}
	public void setPreviousEmployementEntities(Set<PreviousEmployementEntity> previousEmployementEntities) {
		this.previousEmployementEntities = previousEmployementEntities;
	}
	public Set<HobbiesEntity> getHobbiesEntities() {
		return hobbiesEntities;
	}
	public void setHobbiesEntities(Set<HobbiesEntity> hobbiesEntities) {
		this.hobbiesEntities = hobbiesEntities;
	}
	public Set<TechnicalAndNonSkillEntity> getTechnicalAndNonSkillEntities() {
		return technicalAndNonSkillEntities;
	}
	public void setTechnicalAndNonSkillEntities(Set<TechnicalAndNonSkillEntity> technicalAndNonSkillEntities) {
		this.technicalAndNonSkillEntities = technicalAndNonSkillEntities;
	}
	public Set<QualificationOfEmployeeEntity> getEduQ() {
		return eduQ;
	}
	public void setEduQ(Set<QualificationOfEmployeeEntity> eduQ) {
		this.eduQ = eduQ;
	}	
	
	public String getDateOfExpiryLicense() {
		return dateOfExpiryLicense;
	}
	public void setDateOfExpiryLicense(String dateOfExpiryLicense) {
		this.dateOfExpiryLicense = dateOfExpiryLicense;
	}
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public int getNomineeAge() {
		return nomineeAge;
	}
	public void setNomineeAge(int nomineeAge) {
		this.nomineeAge = nomineeAge;
	}
	public String getNomineeDob() {
		return nomineeDob;
	}
	public void setNomineeDob(String nomineeDob) {
		this.nomineeDob = nomineeDob;
	}
	public String getEmgCtPersonOne() {
		return emgCtPersonOne;
	}
	public void setEmgCtPersonOne(String emgCtPersonOne) {
		this.emgCtPersonOne = emgCtPersonOne;
	}
	public String getPerContactOne() {
		return perContactOne;
	}
	public void setPerContactOne(String perContactOne) {
		this.perContactOne = perContactOne;
	}
	public String getEmgCtPersonTwo() {
		return emgCtPersonTwo;
	}
	public void setEmgCtPersonTwo(String emgCtPersonTwo) {
		this.emgCtPersonTwo = emgCtPersonTwo;
	}
	public String getPerContactTwo() {
		return perContactTwo;
	}
	public void setPerContactTwo(String perContactTwo) {
		this.perContactTwo = perContactTwo;
	}
	
//	public String getQualification() {
//		return qualification;
//	}
//	public void setQualification(String qualification) {
//		this.qualification = qualification;
//	}
//	public String getUniversityName() {
//		return universityName;
//	}
//	public void setUniversityName(String universityName) {
//		this.universityName = universityName;
//	}
//	public String getMajor() {
//		return major;
//	}
//	public void setMajor(String major) {
//		this.major = major;
//	}
//	public String getYearOfJoining() {
//		return yearOfJoining;
//	}
//	public void setYearOfJoining(String yearOfJoining) {
//		this.yearOfJoining = yearOfJoining;
//	}
//	public String getYearOfPassing() {
//		return yearOfPassing;
//	}
//	public void setYearOfPassing(String yearOfPassing) {
//		this.yearOfPassing = yearOfPassing;
//	}
//	public String getPercentage() {
//		return percentage;
//	}
//	public void setPercentage(String percentage) {
//		this.percentage = percentage;
//	}
//	public String getRegularDistance() {
//		return regularDistance;
//	}
//	public void setRegularDistance(String regularDistance) {
//		this.regularDistance = regularDistance;
//	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDataOfBirth() {
		return dataOfBirth;
	}
	public void setDataOfBirth(String dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDataOfJoining() {
		return dataOfJoining;
	}
	public void setDataOfJoining(String dataOfJoining) {
		this.dataOfJoining = dataOfJoining;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getDataOfExitFromPerviousCom() {
		return dataOfExitFromPerviousCom;
	}
	public void setDataOfExitFromPerviousCom(String dataOfExitFromPerviousCom) {
		this.dataOfExitFromPerviousCom = dataOfExitFromPerviousCom;
	}
	public String getMobileNumberOne() {
		return mobileNumberOne;
	}
	public void setMobileNumberOne(String mobileNumberOne) {
		this.mobileNumberOne = mobileNumberOne;
	}
	public String getMobileNumberTwo() {
		return mobileNumberTwo;
	}
	public void setMobileNumberTwo(String mobileNumberTwo) {
		this.mobileNumberTwo = mobileNumberTwo;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getPersonalEmailId() {
		return personalEmailId;
	}
	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}
	public String getOfficialMailId() {
		return officialMailId;
	}
	public void setOfficialMailId(String officialMailId) {
		this.officialMailId = officialMailId;
	}
	public String getSkypeId() {
		return skypeId;
	}
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}
	public String getPersentAddress() {
		return persentAddress;
	}
	public void setPersentAddress(String persentAddress) {
		this.persentAddress = persentAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPfNumber() {
		return pfNumber;
	}
	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getVoterIdNumber() {
		return voterIdNumber;
	}
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
	public void setVoterIdNumber(String voterIdNumber) {
		this.voterIdNumber = voterIdNumber;
	}
	public String getPassPortNumber() {
		return passPortNumber;
	}
	public void setPassPortNumber(String passPortNumber) {
		this.passPortNumber = passPortNumber;
	}
	public String getDateOfExpiryPassport() {
		return dateOfExpiryPassport;
	}
	public void setDateOfExpiryPassport(String dateOfExpiryPassport) {
		this.dateOfExpiryPassport = dateOfExpiryPassport;
	}
	
	
}
