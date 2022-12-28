package com.onboarding.employee.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "employeeEntity")
public class EmployeeEntity {
	
    @Id
	@Column(name = "empInfoId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empInfoId;
	@Column(name = "fullName")
	private String fullName;
	@Column(name = "fatherName")
	private String fatherName;
	@Column(name = "dataOfBirth")
	private String dataOfBirth;
	@Column(name = "designation")
	private String designation;
	@Column(name = "reportingManager")
	private String reportingManager;
	@Column(name = "employeeId")
	private String employeeId;
	@Column(name = "dataOfJoining")
	private String dataOfJoining;
	@Column(name = "yearOfExperience")
	private int yearOfExperience;
	@Column(name = "dataOfExitFromPerviousCom")
	private String dataOfExitFromPerviousCom;
	@Column(name = "mobileNumberOne")
	private String mobileNumberOne;
	@Column(name = "mobileNumberTwo")
	private String mobileNumberTwo;
	@Column(name = "bloodGroup")
	private String bloodGroup;
	@Column(name = "personalEmailId")
	private String personalEmailId;
	@Column(name = "officialMailId")
	private String officialMailId;
	@Column(name = "skypeId")
	private String skypeId;
	@Column(name = "persentAddress")
	private String persentAddress;
	@Column(name = "permanentAddress")
	private String permanentAddress;
	@Column(name = "pfNumber")
	private String pfNumber;
	@Column(name = "panNumber")
	private String panNumber;
	@Column(name = "aadhaarNumber")
	private String aadhaarNumber;
	@Column(name = "maritalStatus")
	private String maritalStatus;
	@Column(name = "spouseName")
	private String spouseName;
	@Column(name = "drivingLicenseNumber")
	private String drivingLicenseNumber;
	@Column(name = "dateOfExpiryLicense")
	private String dateOfExpiryLicense;
	@Column(name = "voterIdNumber")
	private String voterIdNumber;
	@Column(name = "passPortNumber")
	private String passPortNumber;
	@Column(name = "dateOfExpiryPassport")
	private String dateOfExpiryPassport;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employeeEntity")
	private BankDetailsEntity bankDetailsEntity;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employeeEntity")
	private PersonalDetailsEntity personalDetailsEntity;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = QualificationOfEmployeeEntity.class)
	@JoinColumn(name = "emp_qfk",referencedColumnName = "empInfoId")
    private Set<QualificationOfEmployeeEntity>qualificationOfEmployee=new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = PreviousEmployementEntity.class)
	@JoinColumn(name = "emp_Pefk",referencedColumnName = "empInfoId")
	private Set<PreviousEmployementEntity>previousEmployementEntities=new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = TechnicalAndNonSkillEntity.class)
	@JoinColumn(name = "emp_tfk",referencedColumnName = "empInfoId")
	private Set<TechnicalAndNonSkillEntity>technicalAndNonSkillEntities=new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = HobbiesEntity.class)
	@JoinColumn(name = "emp_hbfk",referencedColumnName = "empInfoId")
	private Set<HobbiesEntity>hobbiesEntities=new HashSet<>();
	
	
	public Set<PreviousEmployementEntity> getPreviousEmployementEntities() {
		return previousEmployementEntities;
	}
	public void setPreviousEmployementEntities(Set<PreviousEmployementEntity> previousEmployementEntities) {
		this.previousEmployementEntities = previousEmployementEntities;
	}
	public Set<TechnicalAndNonSkillEntity> getTechnicalAndNonSkillEntities() {
		return technicalAndNonSkillEntities;
	}
	public void setTechnicalAndNonSkillEntities(Set<TechnicalAndNonSkillEntity> technicalAndNonSkillEntities) {
		this.technicalAndNonSkillEntities = technicalAndNonSkillEntities;
	}
	public Set<HobbiesEntity> getHobbiesEntities() {
		return hobbiesEntities;
	}
	public void setHobbiesEntities(Set<HobbiesEntity> hobbiesEntities) {
		this.hobbiesEntities = hobbiesEntities;
	}
	public int getEmpInfoId() {
		return empInfoId;
	}
	public void setEmpInfoId(int empInfoId) {
		this.empInfoId = empInfoId;
	}
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
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	public String getDateOfExpiryLicense() {
		return dateOfExpiryLicense;
	}
	public void setDateOfExpiryLicense(String dateOfExpiryLicense) {
		this.dateOfExpiryLicense = dateOfExpiryLicense;
	}
	public String getVoterIdNumber() {
		return voterIdNumber;
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
	
	public BankDetailsEntity getBankDetailsEntity() {
		return bankDetailsEntity;
	}
	public void setBankDetailsEntity(BankDetailsEntity bankDetailsEntity) {
		this.bankDetailsEntity = bankDetailsEntity;
	}
	public PersonalDetailsEntity getPersonalDetailsEntity() {
		return personalDetailsEntity;
	}
	public void setPersonalDetailsEntity(PersonalDetailsEntity personalDetailsEntity) {
		this.personalDetailsEntity = personalDetailsEntity;
	}
	public Set<QualificationOfEmployeeEntity> getQualificationOfEmployee() {
		return qualificationOfEmployee;
	}
	
	public void setQualificationOfEmployee(Set<QualificationOfEmployeeEntity> qualificationOfEmployee) {
		this.qualificationOfEmployee = qualificationOfEmployee;
	}

	

	
	
	
	
	
	
}
