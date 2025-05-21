package com.example.crud.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="doctor_id")
	private Long doctor_id;
	
	@Column(name="doctor_name")
	private String doctor_name;
	
	@Column(name="doctor_domain")
	private String doctor_domain;
	
	@Column(name="doctor_degree")
	private String doctor_degree;

	public DoctorEntity() {
		super();
	}

	public DoctorEntity(String doctor_name, String doctor_domain, String doctor_degree) {
		super();
		this.doctor_name = doctor_name;
		this.doctor_domain = doctor_domain;
		this.doctor_degree = doctor_degree;
	}

	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getDoctor_domain() {
		return doctor_domain;
	}

	public void setDoctor_domain(String doctor_domain) {
		this.doctor_domain = doctor_domain;
	}

	public String getDoctor_degree() {
		return doctor_degree;
	}

	public void setDoctor_degree(String doctor_degree) {
		this.doctor_degree = doctor_degree;
	}
	
	
	
}
