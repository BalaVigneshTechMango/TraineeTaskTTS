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
@Table(name = "technicalAndNonSkillEntity")
public class TechnicalAndNonSkillEntity {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skillId")
	private int skillId;
	@Column(name = "skills")
	private String skills;
	@Column(name = "levelOftheSkill")
	private String levelOftheSkill;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = EmployeeEntity.class)
	@JoinColumn(name = "emp_tfk")
	private EmployeeEntity employeePojo;

	
	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLevelOftheSkill() {
		return levelOftheSkill;
	}

	public void setLevelOftheSkill(String levelOftheSkill) {
		this.levelOftheSkill = levelOftheSkill;
	}

	public EmployeeEntity getEmployeePojo() {
		return employeePojo;
	}

	public void setEmployeePojo(EmployeeEntity employeePojo) {
		this.employeePojo = employeePojo;
	}
	
	
	
}
