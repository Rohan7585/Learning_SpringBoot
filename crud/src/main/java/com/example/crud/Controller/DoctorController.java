package com.example.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.crud.Entity.DoctorEntity;
import com.example.crud.Service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/doctor")
	public DoctorEntity saveDoctor(@RequestBody DoctorEntity doctorEntity) {
		return doctorService.saveDoctor(doctorEntity);
	}
	
	@GetMapping("/doctor")
	public List<DoctorEntity> fetchAllDoctor() {
		return doctorService.fetchAllDoctor();
	}
	
	@GetMapping("/doctor/{id}")
	public DoctorEntity getDoctorById(@PathVariable("id") Long id) {
		return doctorService.getDoctorById(id);
	}
	
	@PutMapping("/doctor/{id}")
	public String updateDoctorById(@PathVariable("id") Long id, @RequestBody  DoctorEntity doctorEntity) {
		return doctorService.updateDoctorById(id, doctorEntity);
	}
	
	@DeleteMapping("/doctor/{id}")
	public String deleteDoctorById(@PathVariable("id") Long id) {
		return doctorService.deleteDoctorById(id);
	}
}
