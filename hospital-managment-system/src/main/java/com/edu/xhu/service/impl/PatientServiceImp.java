package com.edu.xhu.service.impl;

import com.edu.xhu.mapper.PatientMapper;
import com.edu.xhu.pojo.dao.dto.PatientQueryDto;
import com.edu.xhu.pojo.entity.Patient;

import com.edu.xhu.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImp implements PatientService {

    @Autowired
    private PatientMapper patientMapper;
    @Override
    public int insertPatient(Patient patient) {
        return patientMapper.insertPatient(patient);
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientMapper.findPatientById(id);
    }

    @Override
    public List<Patient> findAll() {
        return patientMapper.findAll();
    }

    @Override
    public int deletePatientById(Long id) {
        return patientMapper.deletePatientById(id);
    }

    @Override
    public int updatePatient(Patient patient) {
        return patientMapper.updatePatient(patient);
    }

    @Override
    public List<Patient> findPatientByPage(PatientQueryDto patientQueryDto) {
        return patientMapper.findPatientByPage(patientQueryDto);
    }

    @Override
    public Long findPatientByPageCount(PatientQueryDto patientQueryDto) {
        return patientMapper.findPatientByPageCount(patientQueryDto);
    }
}
