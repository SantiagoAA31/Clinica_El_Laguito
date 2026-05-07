package co.edu.uptc.clinica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import co.edu.uptc.clinica.domain.Doctor;
import co.edu.uptc.clinica.enums.TypeDocID;
import co.edu.uptc.clinica.repository.DoctorRepository;

public class DoctorService {

    private DoctorRepository doctorRepository;

    public DoctorService() {
        this.doctorRepository = new DoctorRepository();
    }

    public boolean registerDoctor(TypeDocID identificationType, int medicalId,
            String firstName, String lastName,
            String specialty, int yearsOfExperience) {

        if (doctorRepository.existsById(medicalId)) {
            return false;
        }

        Doctor doctor = new Doctor(identificationType, medicalId,
                firstName, lastName, specialty, yearsOfExperience);
        return doctorRepository.addDoctor(doctor);
    }

    public Doctor findDoctor(int medicalId) {
        return doctorRepository.findById(medicalId);
    }

    public boolean doctorExists(int medicalId) {
        return doctorRepository.existsById(medicalId);
    }

    public Map<Integer, Doctor> getAllDoctors() {
        return doctorRepository.getAllDoctors();
    }

    public List<Doctor> getReportByExperience() {
        List<Doctor> list = new ArrayList<>(doctorRepository.getAllDoctors().values());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Doctor current = list.get(j);
                Doctor next = list.get(j + 1);

                boolean shouldSwap = false;

                if (current.getYearsOfExperience() < next.getYearsOfExperience()) {
                    shouldSwap = true;
                } else if (current.getYearsOfExperience() == next.getYearsOfExperience()) {
                    String fullNameCurrent = current.getFirstName() + " " + current.getLastName();
                    String fullNameNext = next.getFirstName() + " " + next.getLastName();
                    if (fullNameCurrent.compareToIgnoreCase(fullNameNext) > 0) {
                        shouldSwap = true;
                    }
                }

                if (shouldSwap) {
                    list.set(j, next);
                    list.set(j + 1, current);
                }
            }
        }

        return list;
    }

    public int getTotalDoctors() {
        return doctorRepository.count();
    }
}
