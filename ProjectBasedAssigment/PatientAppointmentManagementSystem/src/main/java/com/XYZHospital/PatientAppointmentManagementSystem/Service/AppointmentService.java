package com.XYZHospital.PatientAppointmentManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.XYZHospital.PatientAppointmentManagementSystem.DTO.DoctorAppointmentPatientDTO;
import com.XYZHospital.PatientAppointmentManagementSystem.Entity.AppointmentEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired 
	private AppointmentRepository appointmentRepository;
	
	public AppointmentEntity addAppointment(AppointmentEntity appointmentEntity) {
		return appointmentRepository.save(appointmentEntity);
	}
	
	public List<AppointmentEntity> getAllAppointment(){
		return appointmentRepository.findAll();
	}
	
	/*
	public List<DoctorAppointmentPatientDTO> getAppointmentsForDoctor(Long doctorId) {
        return appointmentRepository.getAppointmentsByDoctorId(doctorId);
    }*/
}
