package com.onebumps.service;


import com.onebumps.pojo.entity.Doctor;

import java.util.List;

public interface DoctorService {

    int insertDoctor(Doctor doctor);

    Doctor findDoctorById(Long id);

    List<Doctor> findDoctorAll();

    int deleteDoctorById(Long id);

    int updateDoctor(Doctor doctor);

}