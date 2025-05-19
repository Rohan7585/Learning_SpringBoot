package com.XYZHospital.PatientAppointmentManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="appointment")
public class AppointmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appointment_id")
	private int appointmentId;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private DoctorEntity doctor;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;
	
	@Column(name="disease")
	private String disease;
	
	public AppointmentEntity() {
		
	}

	public AppointmentEntity(DoctorEntity doctor, PatientEntity patient, String disease) {
		super();
		this.doctor = doctor;
		this.patient = patient;
		this.disease = disease;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	
	
	

}
