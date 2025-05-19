package com.XYZHospital.PatientAppointmentManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.XYZHospital.PatientAppointmentManagementSystem.DTO.DoctorAppointmentPatientDTO;
import com.XYZHospital.PatientAppointmentManagementSystem.Entity.DoctorEntity;
import com.XYZHospital.PatientAppointmentManagementSystem.Repository.AppointmentRepository;
import com.XYZHospital.PatientAppointmentManagementSystem.Service.AppointmentService;
import com.XYZHospital.PatientAppointmentManagementSystem.Service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired 
	private DoctorService doctorService;
	@Autowired
    private AppointmentService appointmentService;
	
	@PostMapping
	public DoctorEntity addDoctor(@RequestBody DoctorEntity doctorEntity) {
		return doctorService.addDoctors(doctorEntity);
	}
	
	@GetMapping
	public List<DoctorEntity> getAllDoctors(){
		return doctorService.getAllDoctor();
	}
	
	private final AppointmentRepository appointmentRepository;

    public DoctorController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping("/{doctorId}/appointments")
    public ResponseEntity<List<DoctorAppointmentPatientDTO>> getAppointmentsForDoctor(@PathVariable Long doctorId) {
        List<DoctorAppointmentPatientDTO> appointments = appointmentRepository.findAppointmentsByDoctorId(doctorId);
        if (appointments.isEmpty()) {
            return ResponseEntity.noContent().build(); // or you could return an empty list with 200 OK
        }
        return ResponseEntity.ok(appointments);
    }
	
	/*
	@GetMapping("/{doctorId}/appointments")
    public List<DoctorAppointmentPatientDTO> getDoctorAppointments(@PathVariable Long doctorId) {
        return appointmentService.getAppointmentsForDoctor(doctorId);
    }*/
	
	/*Paylaod
	{
	  "docName": "XYZdoc",
	  "docDomain": "Teeth",
	  "docDegree": "MBBS"
	}
	*/
}
