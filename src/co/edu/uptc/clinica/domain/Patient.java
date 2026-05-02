package co.edu.uptc.clinica.domain;

import java.util.LinkedHashSet;
import java.util.Set;
import co.edu.uptc.clinica.enums.Priority;
import co.edu.uptc.clinica.enums.TypeDocID;

public class Patient {
	
	private TypeDocID identificationType;
	private int idPatient;
	private String firstName;
	private String lastName;
	private String email;
	private String domainEmail;
	private Set<String> medicationHistory;
	private Priority priority;
	
	public Patient(TypeDocID identificationType, int idPatient, String firstName, String lastName, String email,
			String domainEmail, Priority priority) {
		super();
		this.identificationType = identificationType;
		this.idPatient = idPatient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.domainEmail = domainEmail;
		this.priority = priority;
		
		this.medicationHistory = new LinkedHashSet<>();
	}

	public TypeDocID getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(TypeDocID identificationType) {
		this.identificationType = identificationType;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomainEmail() {
		return domainEmail;
	}

	public void setDomainEmail(String domainEmail) {
		this.domainEmail = domainEmail;
	}

	public Set<String> getMedicationHistory() {
		return medicationHistory;
	}

	public void setMedicationHistory(Set<String> medicationHistory) {
		this.medicationHistory = medicationHistory;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	
	public void addMedication(String medication) {
        this.medicationHistory.add(medication);
    }

	@Override
	public String toString() {
		return "Paciente: "
				+ "\n Tipo de documento de identidad:" + identificationType 
				+ "\n Numero de documento de identidad: " + idPatient
				+ "\n Primer nombre: " + firstName
				+ "\n Apellido: " + lastName
				+ "\n Email: "+email +"@" + domainEmail
				+ "\n Historial de medicamentos: " + medicationHistory
				+ "\n Prioridad de atencion: " + priority;
	}
	
	
	
}
