package com.XYZHospital.PatientAppointmentManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="appointment")
public class AppointmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appointment_id")
	private int appointmentId;
	
	@Column(name="patient_Id")
	private int patientId;
	
	@Column(name="doctor_Id")
	private int doctorId;
	
	@Column(name="disease")
	private String disease;

	public AppointmentEntity(int patientId, int doctorId, String disease) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.disease = disease;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	

}
