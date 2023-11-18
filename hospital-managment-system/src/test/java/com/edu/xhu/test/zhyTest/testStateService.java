package com.edu.xhu.test.zhyTest;

import com.edu.xhu.pojo.dao.dto.StateQueryDto;
import com.edu.xhu.service.StateService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class testStateService {
    @Autowired
    private StateService stateService;

    @Test
    public void findById(){
        System.out.println(stateService.findStateById(1L));
    }

    @Test
    public void findByPage(){
        StateQueryDto stateQueryDto =new StateQueryDto();
//        stateQueryDto.setName("");
        stateQueryDto.setNow(0);

        System.out.println(stateService.findStateByPage(stateQueryDto));

        System.out.println(stateService.findStateByPageCount(stateQueryDto));


    }
}
