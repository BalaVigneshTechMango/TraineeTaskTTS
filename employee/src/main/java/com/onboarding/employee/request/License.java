package com.onboarding.employee.request;

import java.sql.Date;

public class License {

	private String drivingLicenseNumber;
	private String dateOfExpiryLicense;
	
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
	
	
}
