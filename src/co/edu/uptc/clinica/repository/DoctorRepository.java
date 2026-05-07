package co.edu.uptc.clinica.repository;

import java.util.HashMap;
import java.util.Map;

import co.edu.uptc.clinica.domain.Doctor;

public class DoctorRepository {

    private Map<Integer, Doctor> doctors;

    public DoctorRepository() {
        this.doctors = new HashMap<>();
    }

    public boolean addDoctor(Doctor doctor) {
        if (doctors.containsKey(doctor.getMedicalId())) {
            return false;
        }
        doctors.put(doctor.getMedicalId(), doctor);
        return true;
    }

    public Doctor findById(int medicalId) {
        return doctors.get(medicalId);
    }

    public boolean existsById(int medicalId) {
        return doctors.containsKey(medicalId);
    }

    public boolean removeDoctor(int medicalId) {
        return doctors.remove(medicalId) != null;
    }

    public Map<Integer, Doctor> getAllDoctors() {
        return doctors;
    }

    public int count() {
        return doctors.size();
    }
}