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

	@Query("SELECT new com.XYZHospital.PatientAppointmentManagementSystem.DTO.DoctorAppointmentPatientDTO(" +
		       " a.appointmentId, p.patientName, p.patientAge, p.patientGender, a.disease) " +
		       "FROM AppointmentEntity a " +
		       "JOIN a.patient p " +
		       "JOIN a.doctor d " +
		       "WHERE d.id = :doctorId")
		List<DoctorAppointmentPatientDTO> findAppointmentsByDoctorId(@Param("doctorId") Long doctorId);

}


