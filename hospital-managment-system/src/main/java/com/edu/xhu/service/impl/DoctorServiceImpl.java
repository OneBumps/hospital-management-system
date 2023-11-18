package com.edu.xhu.service.impl;


import com.edu.xhu.mapper.DoctorMapper;
import com.edu.xhu.pojo.dao.dto.DoctorQueryDto;
import com.edu.xhu.pojo.entity.Doctor;
import com.edu.xhu.service.DoctorService;
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
    public int deleteDoctorById(Long id) {
        return doctorMapper.deleteById(id);
    }

    @Override
    public int updateDoctor(Doctor doctor) {
        return doctorMapper.updateById(doctor);
    }

    @Override
    public List<Doctor> findDoctorAll(DoctorQueryDto doctorQueryDto) {
        return doctorMapper.selectAll(doctorQueryDto);
    }

    @Override
    public Doctor findDoctorById(Long id) {
        return doctorMapper.selectById(id);
    }

    @Override
    public Long findDoctorCount(DoctorQueryDto doctorQueryDto) {
        return doctorMapper.selectCount(doctorQueryDto);
    }

    @Override
    public int deleteDoctorByIds(Long[] ids) {
        return doctorMapper.deleteByIds(ids);
    }
}