package co.edu.uptc.clinica.domain;

import co.edu.uptc.clinica.enums.TypeDocID;

public class Doctor {
	private TypeDocID identificationType;
	private int medicalId;
	private String firstName;
	private String lastName;
	private String specialty;
	private int yearsOfExperience;
	
	
	public Doctor() {
		super();
	}

	public Doctor(TypeDocID identificationType, int medicalId, String firstName, String lastName, String specialty,
			int yearsOfExperience) {
		super();
		this.identificationType = identificationType;
		this.medicalId = medicalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialty = specialty;
		this.yearsOfExperience = yearsOfExperience;
	}

	public TypeDocID getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(TypeDocID identificationType) {
		this.identificationType = identificationType;
	}

	public int getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(int medicalId) {
		this.medicalId = medicalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return " Doctor:"
	            + "\n Tipo de documento de identidad: "+ identificationType
	            + "\n Numero de icentidad del medico: " + medicalId
	            + "\n Primer Nombre: " + firstName
	            + "\n Apellido: " + lastName
	            + "\n Especialidad: " + specialty
	            + "\n Años de expeciencia" + yearsOfExperience ;
	}
	
	
	
}
