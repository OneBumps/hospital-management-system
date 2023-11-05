package com.onebumps.mapper;

import com.onebumps.pojo.entity.Doctor;

import java.util.List;

public interface DoctorMapper {

    int deleteById(Long id);

    int insert(Doctor record);

    Doctor selectById(Long id);

    int updateById(Doctor record);

    List<Doctor> selectAll();
}