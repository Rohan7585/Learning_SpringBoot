package com.XYZHospital.PatientAppointmentManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="patient")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="patient_age")
	private int PatientAge;
	
	@Column(name="patient_gender")
	private String PatientGender;
	
	@Column(name="patient_contact")
	private String PatientContact;

	public PatientEntity(String patientName, int patientAge, String patientGender, String patientContact) {
		super();
		this.patientName = patientName;
		PatientAge = patientAge;
		PatientGender = patientGender;
		PatientContact = patientContact;
	}


	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return PatientAge;
	}

	public void setPatientAge(int patientAge) {
		PatientAge = patientAge;
	}

	public String getPatientGender() {
		return PatientGender;
	}

	public void setPatientGender(String patientGender) {
		PatientGender = patientGender;
	}

	public String getPatientContact() {
		return PatientContact;
	}

	public void setPatientContact(String patientContact) {
		PatientContact = patientContact;
	}
	
	
	
	
}
