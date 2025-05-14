package com.XYZHospital.PatientAppointmentManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="doctor")
public class DoctorEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="doctor_name")
	private String docName;
	
	@Column(name="doctor_domain")
	private String docDomain;
	
	@Column(name="doctor_degree")
	private String docDegree;

	public DoctorEntity(String docName, String docDomain, String docDegree) {
		super();
		this.docName = docName;
		this.docDomain = docDomain;
		this.docDegree = docDegree;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocDomain() {
		return docDomain;
	}

	public void setDocDomain(String docDomain) {
		this.docDomain = docDomain;
	}

	public String getDocDegree() {
		return docDegree;
	}

	public void setDocDegree(String docDegree) {
		this.docDegree = docDegree;
	}
	
	
}
