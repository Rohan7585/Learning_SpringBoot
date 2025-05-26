package com.example.DTOmapper.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class ExampleEntity {

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
	

	public ExampleEntity() {
	}

	public ExampleEntity(String patientName, int patientAge, String patientGender, String patientContact) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
	}


	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
