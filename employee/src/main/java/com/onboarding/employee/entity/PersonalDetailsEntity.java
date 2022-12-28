package com.onboarding.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personalDetailsEntity")
public class PersonalDetailsEntity {
	
	@Id
	@Column(name = "personalId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personalId;
	@Column(name = "nomineeName")
	private String nomineeName;
	@Column(name = "nomineeAge")
	private int nomineeAge;
	@Column(name = "nomineeDob")
	private String nomineeDob;
	@Column(name = "emgCtPersonOne")
	private String emgCtPersonOne;
	@Column(name = "perContactOne")
	private String perContactOne;
	@Column(name = "emgCtPersonTwo")
	private String emgCtPersonTwo;
	@Column(name = "perContactTwo")
	private String perContactTwo;
	
    
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = EmployeeEntity.class)
	@JoinColumn(name = "emp_pfk",referencedColumnName = "empInfoId")
	private EmployeeEntity employeeEntity;
	


	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}

	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}

	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
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

//	public EmployeePojo getEmployeePojo() {
//		return employeePojo;
//	}
//
//	public void setEmployeePojo(EmployeePojo employeePojo) {
//		this.employeePojo = employeePojo;
//	}

    
}
