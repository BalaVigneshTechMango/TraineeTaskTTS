package com.onboarding.employee.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qualificationOfEmployeeEntity")
public class QualificationOfEmployeeEntity {
	
	@Id
	@Column(name = "eduId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eduId;
	@Column(name = "qualification")
	private String qualification;
	@Column(name = "universityName")
	private String universityName;
	@Column(name = "major")
	private String major;
	@Column(name = "yearOfJoining")
	private String yearOfJoining;
	@Column(name = "yearOfPassing")
	private String yearOfPassing;
	@Column(name = "percentage")
	private String percentage;
	@Column(name = "regularDistance")
	private String regularDistance;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = EmployeeEntity.class)
	@JoinColumn(name = "emp_qfk")
	private EmployeeEntity employeePojo;
//,targetEntity = EmployeeOnBoarding.class

	public int getEduId() {
		return eduId;
	}


	public void setEduId(int eduId) {
		this.eduId = eduId;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getUniversityName() {
		return universityName;
	}


	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getYearOfJoining() {
		return yearOfJoining;
	}


	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}


	public String getYearOfPassing() {
		return yearOfPassing;
	}


	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}


	public String getPercentage() {
		return percentage;
	}


	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}


	public String getRegularDistance() {
		return regularDistance;
	}


	public void setRegularDistance(String regularDistance) {
		this.regularDistance = regularDistance;
	}


	public EmployeeEntity getEmployeePojo() {
		return employeePojo;
	}


	public void setEmployeePojo(EmployeeEntity employeePojo) {
		this.employeePojo = employeePojo;
	}
	

}
