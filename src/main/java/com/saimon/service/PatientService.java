package com.saimon.service;

import com.saimon.models.PatientEntity;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    void addPatient(PatientEntity patientEntity);

    void updatePatient(PatientEntity patientEntity);

    Optional<PatientEntity> getPatientById(int id);

    List<PatientEntity> getAllPatients();

    Optional<PatientEntity> getPatientByPatientName(String name);

    List<String> getAllPatientsByKey(String patientName);

    void deletePatient(int id);
}
