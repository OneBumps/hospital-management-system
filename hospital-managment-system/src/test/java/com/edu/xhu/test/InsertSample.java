package com.edu.xhu.test;

import com.edu.xhu.mapper.*;
import com.edu.xhu.pojo.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-dao.xml")
public class InsertSample {
    private final Bed bed = new Bed();
    private final Department department = new Department();
    private final Doctor doctor = new Doctor();
    private final Instrument instrument = new Instrument();
    private final Management management = new Management();
    private final Message message = new Message();
    private final Patient patient = new Patient();
    private final Room room = new Room();
    private final State state = new State();
    @Autowired
    private BedMapper bedMapper;
    @Autowired
    private DeptMapper departmentMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private InstrumentMapper instrumentMapper;
    @Autowired
    private ManagementMapper managementMapper;
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private StateMapper stateMapper;

    @Test
    public void insertAllSample() {
        // 设置插入的数据
        for (int i = 1; i <= 110; i++) {
            bed.setBedNumber("" + i);
            bed.setRoomNumber("" + i);
            bed.setBedState("" + (i % 2));
            bed.setPutDate(new Date());
            bedMapper.insertBed(bed);
        }
//        for (int i = 1; i <= 110; i++) {
//            department.setDepartmentNum("x3");
//            department.setDepartmentName("诊断部");
//            department.setLocation(i + "楼");
//            department.setPhoneNumber("21261811");
//            department.setEmail("email@qq.com");
//            department.setOpeningHours("8:00-16:00");
//            departmentMapper.insertDept(department);
//        }
        for (int i = 0; i < 100; i++) {
            doctor.setDoctorNumber("D" + i);
            doctor.setName("医生" + i);
            if (i % 2 == 0) doctor.setGender(1);
            else doctor.setGender(0);
            doctor.setAge(18 + i);
            doctor.setPhone("1234567891" + (i % 10));
            doctor.setEmploymentDate(new Date(currentTimeMillis() - (long) i));
            doctor.setSalary(i * 1000);
            doctor.setNotes("医生" + i + "的备注");
            doctor.setDepartmentId(1);
            doctorMapper.insert(doctor);
        }
        for (Integer i = 10; i < 100; i++) {
            instrument.setName("a" + i);
            instrument.setId(i.toString());
            instrument.setModel("h");
            instrument.setPrice((double) 23);
            instrument.setYear(2);
            instrumentMapper.insertSelective(instrument);
        }
        for (Integer i = 10; i < 100; i++) {
            message.setAge(i);
            message.setAllergic("阿莫西林");
            message.setIdNum("510603200205050002");
            message.setMarried(0);
            message.setPhoneNum("18981061817");
            message.setName("张小力");
            message.setSex(1);
            message.setState("肺炎");
            messageMapper.insertMessage(message);
        }
        for (int i = 1; i <= 110; i++) {
            management.setName("王大师" + i);
            if (i % 2 == 0) {
                management.setGrade(1);
                management.setDescription("管理员");
            } else {
                management.setGrade(0);
                management.setDescription("一般员工");
            }
            management.setOpen(1);
            managementMapper.insert(management);
        }
        for (int i = 1; i <= 100; i++) {
            patient.setBed("P004" + i);
            patient.setConditions("肺炎");
            patient.setDoctorName("王雄");
            patient.setName("李四" + i);
            patient.setOffice("胸内科");
            patient.setDoctorNum("D011");
            patient.setRoom("01-202");
            patient.setTime(new Date());
            patientMapper.insertPatient(patient);
        }
        for (int i = 'A'; i <= 'z'; i++) {
            room.setRoomNumber("D202" + i);
            room.setRoomName("胸内科" + i);
            room.setBuildName((char) i + "楼");
            room.setFloor("" + i % 5);
            room.setRoomState("" + i % 2);
            room.setNotes("备注" + i);
            room.setPutDate(new Date(currentTimeMillis() - (long) i * 1000 * 60 * 60 * 24));
            roomMapper.insertRoom(room);
        }
        for (int i = 1; i <= 100; i++) {
            state.setName("王霸天" + i);
            state.setLive("无不良嗜好");
            state.setNow(1);
            state.setSleep("8小时");
            state.setMedication("不服药");
            state.setUnEffect(1);
            stateMapper.insertState(state);
        }
    }
}