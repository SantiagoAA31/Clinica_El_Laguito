package co.edu.uptc.clinica.domain;

import java.time.LocalDateTime;


public class MedicalAppoinmet {
	
	private int idMedicalAppoinmet;
	private LocalDateTime timeAppoinmet;
	private Patient patient;
	private Doctor doctor;

	public MedicalAppoinmet() {
		super();
	}

	public MedicalAppoinmet(int idMedicalAppoinmet, LocalDateTime timeAppoinmet, Patient patient, Doctor doctor) {
		super();
		this.idMedicalAppoinmet = idMedicalAppoinmet;
		this.timeAppoinmet = timeAppoinmet;
		this.patient = patient;
		this.doctor = doctor;
	}

	public int getIdMedicalAppoinmet() {
		return idMedicalAppoinmet;
	}

	public void setIdMedicalAppoinmet(int idMedicalAppoinmet) {
		this.idMedicalAppoinmet = idMedicalAppoinmet;
	}

	public LocalDateTime getTimeAppoinmet() {
		return timeAppoinmet;
	}

	public void setTimeAppoinmet(LocalDateTime timeAppoinmet) {
		this.timeAppoinmet = timeAppoinmet;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	

}
