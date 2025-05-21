package com.example.crud.Entity;

import jakarta.persistence.*;

@Entity
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="doctor_id")
	private int doctor_id;
	
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
	
	
}
