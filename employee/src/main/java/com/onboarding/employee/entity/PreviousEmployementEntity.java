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
@Table(name = "previousEmployementEntity")
public class PreviousEmployementEntity {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "perviousEmpDetailsId")
	private int perviousEmpDetailsId;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "workingPeriod")
	private String workingPeriod;
	@Column(name = "roleDuringDateOfJoining")
	private String roleDuringDateOfJoining;
	@Column(name = "roleOnRelieving")
	private String roleOnRelieving;
	@Column(name = "ctcDuringDateOfJoining")
	private String ctcDuringDateOfJoining;
	@Column(name = "ctcOnRelieving")
	private String ctcOnRelieving;
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = EmployeeEntity.class)
	@JoinColumn(name = "emp_Pefk")
	private EmployeeEntity employeePojo;

	public int getPerviousEmpDetailsId() {
		return perviousEmpDetailsId;
	}

	public void setPerviousEmpDetailsId(int perviousEmpDetailsId) {
		this.perviousEmpDetailsId = perviousEmpDetailsId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWorkingPeriod() {
		return workingPeriod;
	}

	public void setWorkingPeriod(String workingPeriod) {
		this.workingPeriod = workingPeriod;
	}

	public String getRoleDuringDateOfJoining() {
		return roleDuringDateOfJoining;
	}

	public void setRoleDuringDateOfJoining(String roleDuringDateOfJoining) {
		this.roleDuringDateOfJoining = roleDuringDateOfJoining;
	}

	public String getRoleOnRelieving() {
		return roleOnRelieving;
	}

	public void setRoleOnRelieving(String roleOnRelieving) {
		this.roleOnRelieving = roleOnRelieving;
	}

	public String getCtcDuringDateOfJoining() {
		return ctcDuringDateOfJoining;
	}

	public void setCtcDuringDateOfJoining(String ctcDuringDateOfJoining) {
		this.ctcDuringDateOfJoining = ctcDuringDateOfJoining;
	}

	public String getCtcOnRelieving() {
		return ctcOnRelieving;
	}

	public void setCtcOnRelieving(String ctcOnRelieving) {
		this.ctcOnRelieving = ctcOnRelieving;
	}

	public EmployeeEntity getEmployeePojo() {
		return employeePojo;
	}

	public void setEmployeePojo(EmployeeEntity employeePojo) {
		this.employeePojo = employeePojo;
	}
	
	
	
	
}
