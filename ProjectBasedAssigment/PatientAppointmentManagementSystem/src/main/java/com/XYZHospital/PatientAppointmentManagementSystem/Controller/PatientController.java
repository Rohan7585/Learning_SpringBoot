package com.XYZHospital.PatientAppointmentManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.XYZHospital.PatientAppointmentManagementSystem.Entity.PatientEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Service.PatientService;

@RestController
@RequestMapping("/patient/viewDoctors")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping
	public String addPatient(@RequestBody PatientEntity patientEntity) {
		return patientService.setPatient(patientEntity);
	}
	
	@GetMapping
	public List<PatientEntity> getAllPatient(){
		return patientService.getAllPatient();
	}

	/*Paylaod
{
  "patientName": "ABCD",
  "patientAge": 20,
  "patientGender": "Male",
  "patientContact": "9876543210"
}
	  */
}
