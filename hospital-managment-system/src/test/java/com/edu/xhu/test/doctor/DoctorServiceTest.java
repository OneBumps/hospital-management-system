package com.edu.xhu.test.doctor;

import com.edu.xhu.pojo.dao.dto.DoctorQueryDto;
import com.edu.xhu.pojo.entity.Doctor;
import com.edu.xhu.service.DoctorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class DoctorServiceTest {
    @Autowired
    private DoctorService doctorService;

    private Doctor doctor;

    @Test
    public void insertUpdateFindTest() {
        Long id = 1000L; // 可修改
        doctor = new Doctor();
        doctor.setDoctorNumber("D999");
        doctor.setDepartmentId(3);
        doctorService.insertDoctor(doctor);
        doctor.setId(id);
        doctorService.insertDoctor(doctor);
        doctor.setNotes("update test");
        doctorService.updateDoctor(doctor);
        doctorService.findDoctorById(id);
        System.out.println("total: " + doctorService.findDoctorCount(new DoctorQueryDto()));
    }

    @Test
    public void deleteTest() {
        Long id = 132L; // 可修改
        doctorService.deleteDoctorById(id);
    }
    @Test

    public void findAllTest() {
        System.out.println(doctorService.findDoctorAll(new DoctorQueryDto()));
    }
}