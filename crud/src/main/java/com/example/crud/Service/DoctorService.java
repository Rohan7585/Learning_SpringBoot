package com.example.crud.Service;

import java.util.List;

import com.example.crud.Entity.DoctorEntity;

public interface DoctorService {
	DoctorEntity saveDoctor(DoctorEntity doctorEntity);
	List<DoctorEntity> fetchAllDoctor();
	DoctorEntity getDoctorById(Long id);
	String updateDoctorById(Long id, DoctorEntity doctorEntity);
	String deleteDoctorById(Long id);
}
