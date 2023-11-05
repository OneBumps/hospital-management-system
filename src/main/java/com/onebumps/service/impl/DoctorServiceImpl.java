package com.onebumps.service.impl;

import com.onebumps.mapper.DoctorMapper;
import com.onebumps.pojo.entity.Doctor;
import com.onebumps.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public int insertDoctor(Doctor doctor) {
        return doctorMapper.insert(doctor);
    }

    @Override
    public Doctor findDoctorById(Long id) {
        return doctorMapper.selectById(id);
    }

    @Override
    public List<Doctor> findDoctorAll() {
        return doctorMapper.selectAll();
    }

    @Override
    public int deleteDoctorById(Long id) {
        return doctorMapper.deleteById(id);
    }

    @Override
    public int updateDoctor(Doctor doctor) {
        return doctorMapper.updateById(doctor);
    }
}