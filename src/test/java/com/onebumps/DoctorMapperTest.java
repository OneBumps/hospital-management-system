package com.onebumps;

import com.onebumps.mapper.DoctorMapper;
import com.onebumps.pojo.entity.Doctor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class DoctorMapperTest {
    @Autowired
    private DoctorMapper doctorMapper;
    //    int deleteById(Long id);
//    int insert(Doctor record);
//    int insertSelective(Doctor record);
//    Doctor selectByPrimaryKey(Long id);
//    int updateByPrimaryKeySelective(Doctor record);
//    int updateById(Doctor record);
    private Doctor doctor;

    @Test
    public void testInsert() {
        doctor = new Doctor();
        doctor.setDoctorNumber("XW00001");
        doctor.setName("晨曦策");
        doctorMapper.insert(doctor);
    }

    @Test
    public void testDelete() {
        doctor = new Doctor();
        doctor.setId(1L);
        doctorMapper.deleteById(doctor.getId());
    }

    @Test
    public void testSelect() {
        doctor = new Doctor();
        doctor.setId(2L);
        Doctor result = doctorMapper.selectById(doctor.getId());
        System.out.println(result);
    }
}