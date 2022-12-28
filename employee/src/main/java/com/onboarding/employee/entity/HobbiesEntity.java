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
import javax.persistence.Table;

@Entity
@Table(name = "hobbiesEntity")
public class HobbiesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hobbiesId")
	private int hobbiesId;
	@Column(name = "hobbies")
	private String hobbies;
	@Column(name = "hobbiesSkillLevel")
	private String hobbiesSkillLevel;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = HobbiesEntity.class)
	@JoinColumn(name = "emp_hbfk")
	private EmployeeEntity employeeEntity;

	public int getHobbiesId() {
		return hobbiesId;
	}

	public void setHobbiesId(int hobbiesId) {
		this.hobbiesId = hobbiesId;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getHobbiesSkillLevel() {
		return hobbiesSkillLevel;
	}

	public void setHobbiesSkillLevel(String hobbiesSkillLevel) {
		this.hobbiesSkillLevel = hobbiesSkillLevel;
	}

	public EmployeeEntity getEmployeePojo() {
		return employeeEntity;
	}

	public void setEmployeePojo(EmployeeEntity employeePojo) {
		this.employeeEntity = employeePojo;
	}
	
	
	
	
	
	
}
