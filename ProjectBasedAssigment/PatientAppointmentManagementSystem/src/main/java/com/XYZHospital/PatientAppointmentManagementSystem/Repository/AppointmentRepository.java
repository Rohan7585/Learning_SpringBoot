package com.XYZHospital.PatientAppointmentManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.XYZHospital.PatientAppointmentManagementSystem.DTO.DoctorAppointmentPatientDTO;
import com.XYZHospital.PatientAppointmentManagementSystem.Entity.AppointmentEntity;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long>{

	@Query("select a.appointment_id, p.patient_name, patient_age, patient_gender, a.disease\r\n"
			+ "from doctor d, patient p, appointment a where\r\n"
			+ "a.patient_id = p.patient_id\r\n"
			+ "and a.doctor_id = d.doctor_id\r\n"
			+ "and d.doctor_id = :doctorId")
		List<DoctorAppointmentPatientDTO> findAppointmentsByDoctorId(@Param("doctorId") Long doctorId);
}


