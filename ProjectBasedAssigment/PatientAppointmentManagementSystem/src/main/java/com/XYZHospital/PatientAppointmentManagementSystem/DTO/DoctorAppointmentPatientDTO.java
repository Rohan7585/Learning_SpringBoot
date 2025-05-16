package com.XYZHospital.PatientAppointmentManagementSystem.DTO;

public class DoctorAppointmentPatientDTO {

	private Long appointmentId;
    private String patientName;
    private int patientAge;
    private String patientGender;
    private String patientDisease;
    
    
    
	public DoctorAppointmentPatientDTO() {
		super();
	}
	public DoctorAppointmentPatientDTO(Long appointmentId, String patientName, int patientAge, String patientGender,
			String patientDisease) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientDisease = patientDisease;
	}
	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}
    
    
}
