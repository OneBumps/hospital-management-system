package com.edu.xhu.test.management;

import com.edu.xhu.mapper.ManagementMapper;
import com.edu.xhu.pojo.entity.Management;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class ManagementMapperTest {
    @Autowired
    private ManagementMapper managementMapper;
    private Management management;

    @Test
    public void insertTest(){
        management = new Management();
        management.setName("test");
        management.setGrade(1);
        management.setDescription("dfdfdf");
        management.setOpen(1);
        System.out.println(managementMapper.insert(management));
    }
}