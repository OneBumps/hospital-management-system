package com.edu.xhu.test.doctor;

import com.edu.xhu.mapper.DoctorMapper;
import com.edu.xhu.pojo.dao.dto.DoctorQueryDto;
import com.edu.xhu.pojo.entity.Doctor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class DoctorMapperTest {
    @Autowired
    private DoctorMapper doctorMapper;
    private Doctor doctor;

    @Test
    public void insertTest() {
        for (int i = 0; i < 100; i++) {
            doctor = new Doctor();
            doctor.setDoctorNumber("D" + i);
            doctor.setName("医生" + i);
            if (i % 2 == 0) doctor.setGender(1);
            else doctor.setGender(0);
            doctor.setAge(18 + i);
            doctor.setPhone("1234567891" + (i % 10));
            doctor.setEmploymentDate(new Date(System.currentTimeMillis() - (long) i));
            doctor.setSalary(i * 1000);
            doctor.setNotes("医生" + i + "的备注");
            doctor.setDepartmentId(1);
            doctorMapper.insert(doctor);
        }
        System.out.println(doctor.getId());
    }

    @Test
    public void deleteTest() {
        Long id = 31L; // 修改值
        doctorMapper.deleteById(id);
    }

    @Test
    public void updateTest() {
        Long id = 32L; // 修改值
        doctor = new Doctor();
        doctor.setId(id);
        doctor.setDoctorNumber("DX" + id.intValue());
        doctor.setName("医生X" + id.intValue());
        doctor.setGender(0);
        doctor.setAge(17);
        doctor.setPhone("22222222222");
        doctor.setEmploymentDate(new Date(1L));
        doctor.setSalary(100);
        doctor.setNotes("已修改");
        doctor.setDepartmentId(2);
        doctorMapper.updateById(doctor);
    }

    @Test
    public void selectAllTest() {
        DoctorQueryDto doctorQueryDto = new DoctorQueryDto();
        doctorQueryDto.setName("医生");
        doctorQueryDto.setLimit(5);
        doctorQueryDto.setPage(5);
        List<Doctor> doctors = doctorMapper.selectAll(doctorQueryDto);
        for (Doctor resList : doctors) {
            System.out.println(resList);
        }
    }

    @Test
    public void selectByIdTest() {
        Long id = 32L; // 修改值
        doctor = doctorMapper.selectById(id);
        System.out.println(doctor);
    }

    @Test
    public void selectCountTest() {
        System.out.println("total: " + doctorMapper.selectCount(new DoctorQueryDto()));
    }

    @Test
    public void deleteByIdsTest() {
        Long[] ids = {33L, 34L, 35L}; // 修改值
        doctorMapper.deleteByIds(ids);
    }
}