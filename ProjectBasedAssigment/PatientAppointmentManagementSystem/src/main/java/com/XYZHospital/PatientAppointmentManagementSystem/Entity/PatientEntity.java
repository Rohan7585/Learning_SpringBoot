package com.XYZHospital.PatientAppointmentManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="patient")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="patient_age")
	private int patientAge;
	
	@Column(name="patient_gender")
	private String patientGender;
	
	@Column(name="patient_contact")
	private String patientContact;
	

	public PatientEntity() {
	}

	public PatientEntity(String patientName, int patientAge, String patientGender, String patientContact) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
	}


	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientContact() {
		return patientContact;
	}

	public void setPatientContact(String patientContact) {
		this.patientContact = patientContact;
	}
	
	
	
	
}
