package com.edu.xhu.mapper;


import com.edu.xhu.pojo.dao.dto.DoctorQueryDto;
import com.edu.xhu.pojo.entity.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper {

    int insert(Doctor record);

    int deleteById(Long id);

    int updateById(Doctor doctor);

    List<Doctor> selectAll(DoctorQueryDto doctorQueryDto);

    Doctor selectById(Long id);

    Long selectCount(DoctorQueryDto doctorQueryDto);

    int deleteByIds(@Param("ids") Long[] ids);
}