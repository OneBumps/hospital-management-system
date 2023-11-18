package com.edu.xhu.service;

import com.edu.xhu.pojo.dao.dto.DoctorQueryDto;
import com.edu.xhu.pojo.entity.Doctor;

import java.util.List;

public interface DoctorService {

    int insertDoctor(Doctor doctor);

    int deleteDoctorById(Long id);

    int updateDoctor(Doctor doctor);

    List<Doctor> findDoctorAll(DoctorQueryDto doctorQueryDto);

    Doctor findDoctorById(Long id);

    Long findDoctorCount(DoctorQueryDto doctorQueryDto);

    int deleteDoctorByIds(Long[] ids);
}