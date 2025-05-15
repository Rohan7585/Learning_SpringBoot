package com.XYZHospital.PatientAppointmentManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.XYZHospital.PatientAppointmentManagementSystem.Entity.AppointmentEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping
	public AppointmentEntity addAppointment(@RequestBody AppointmentEntity appointmentEntity) {
		return appointmentService.addAppointment(appointmentEntity);
	}
	
	@GetMapping
	public List<AppointmentEntity> getAllApppointment(){
		return appointmentService.getAllAppointment();
	}
	
	/*Paylaod
	{
	  "patientId": 1,
	  "doctorId": 2,
	  "disease": "Cancer"
	}
	*/
}
