package com.XYZHospital.PatientAppointmentManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.XYZHospital.PatientAppointmentManagementSystem.Entity.AppointmentEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired AppointmentRepository appointmentRepository;
	
	public AppointmentEntity addAppointment(AppointmentEntity appointmentEntity) {
		return appointmentRepository.save(appointmentEntity);
	}
	
	public List<AppointmentEntity> getAllAppointment(){
		return appointmentRepository.findAll();
	}
	
}
