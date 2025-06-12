package com.juancortizgonz.patientservice.service;

import com.juancortizgonz.patientservice.dto.PatientRequestDTO;
import com.juancortizgonz.patientservice.dto.PatientResponseDTO;
import com.juancortizgonz.patientservice.mapper.PatientMapper;
import com.juancortizgonz.patientservice.model.Patient;
import com.juancortizgonz.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::toDto).toList();
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDto(newPatient);
    }
}
