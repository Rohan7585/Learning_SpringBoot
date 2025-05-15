package com.XYZHospital.PatientAppointmentManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.XYZHospital.PatientAppointmentManagementSystem.Entity.DoctorEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired 
	private DoctorRepository doctorRepository;
	
	public DoctorEntity addDoctors(DoctorEntity doctorEntity){
		return doctorRepository.save(doctorEntity);
	}
	
	public List<DoctorEntity> getAllDoctor(){
		return doctorRepository.findAll();
	}

}
