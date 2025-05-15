package com.XYZHospital.PatientAppointmentManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.XYZHospital.PatientAppointmentManagementSystem.Entity.PatientEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Repository.PatientRepository;

@Service
public class PatientService {

	@Autowired PatientRepository patientRepository;
	
	public String setPatient(PatientEntity patientEntity) {
		patientRepository.save(patientEntity);
		return "Patient admitted succefully";
	}
	
	public List<PatientEntity> getAllPatient(){
		return patientRepository.findAll();
	}
	
}
