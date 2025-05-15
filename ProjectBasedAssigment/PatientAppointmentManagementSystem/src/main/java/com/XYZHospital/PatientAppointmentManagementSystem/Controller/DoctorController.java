package com.XYZHospital.PatientAppointmentManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.XYZHospital.PatientAppointmentManagementSystem.Entity.DoctorEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired 
	private DoctorService doctorService;
	
	@PostMapping
	public DoctorEntity addDoctor(@RequestBody DoctorEntity doctorEntity) {
		return doctorService.addDoctors(doctorEntity);
	}
	
	@GetMapping
	public List<DoctorEntity> getAllDoctors(){
		return doctorService.getAllDoctor();
	}
	
	/*Paylaod
	{
	  "docName": "XYZdoc",
	  "docDomain": "Teeth",
	  "docDegree": "MBBS"
	}
	*/
}
