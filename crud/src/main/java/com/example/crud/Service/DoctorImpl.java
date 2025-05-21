package com.example.crud.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.Entity.DoctorEntity;
import com.example.crud.Repository.DoctorRepository;

@Service
public class DoctorImpl implements DoctorService{

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public DoctorEntity saveDoctor(DoctorEntity doctorEntity) {
		return doctorRepository.save(doctorEntity);
	}
	
	@Override
	public List<DoctorEntity> fetchAllDoctor(){
		return doctorRepository.findAll();
	}
	
	@Override
	public DoctorEntity getDoctorById(Long id) {
		Optional<DoctorEntity> doctor = doctorRepository.findById(id);
		if(doctor.isPresent())	return doctor.get();
		return null;
	}
	
	@Override
	public String updateDoctorById(Long id, DoctorEntity doctorEntity) {
		Optional<DoctorEntity> doctor = doctorRepository.findById(id);
		if(doctor.isPresent()) {
			DoctorEntity originalDoctor = doctor.get();
			
			System.out.print("Original Dcotro = " + originalDoctor.getDoctor_name() +"Name = "+doctorEntity.getDoctor_name()+" domain = " +doctorEntity.getDoctor_domain()+" Degree = "+doctorEntity.getDoctor_degree());
			
			if(Objects.nonNull(doctorEntity.getDoctor_name()) && !"".equalsIgnoreCase(doctorEntity.getDoctor_name())) {
				originalDoctor.setDoctor_name(doctorEntity.getDoctor_name());
			}
			
			if(Objects.nonNull(doctorEntity.getDoctor_domain()) && !"".equalsIgnoreCase(doctorEntity.getDoctor_domain())) {
				originalDoctor.setDoctor_domain(doctorEntity.getDoctor_domain());
			}
			
			if(Objects.nonNull(doctorEntity.getDoctor_degree()) && !"".equalsIgnoreCase(doctorEntity.getDoctor_degree())) {
				originalDoctor.setDoctor_degree(doctorEntity.getDoctor_degree());
			}
			doctorRepository.save(originalDoctor);
			return "Updated succeddfully";
		}
		else	return "Doctor isn't found";
	}
	
	@Override
	public String deleteDoctorById(Long id) {
		Optional<DoctorEntity> doctor = doctorRepository.findById(id);
		if(doctor.isPresent()) {
			doctorRepository.deleteById(id);
			return (doctor.get().getDoctor_name() + " has been deleted successfully");
		}
		return "No such doctor has been found";
	}
}

