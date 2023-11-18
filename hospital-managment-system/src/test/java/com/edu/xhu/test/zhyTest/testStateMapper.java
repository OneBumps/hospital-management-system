package com.edu.xhu.test.zhyTest;


import com.edu.xhu.mapper.StateMapper;
import com.edu.xhu.pojo.entity.State;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-dao.xml")
public class testStateMapper {
    @Autowired
    private StateMapper stateMapper;
    @Test
    public void insertState(){
        State state =new State();

        for(int i=1;i<=100;i++){
            state.setName("王霸天"+i);
            state.setLive("无不良嗜好");
            state.setNow(1);
            state.setSleep("8小时");
            state.setMedication("不服药");
            state.setUnEffect(1);

            stateMapper.insertState(state);
        }
    }
    @Test
    public void findById(){
        System.out.println(stateMapper.findStateById(1L));
    }

    @Test
    public void updateState(){
        State state =new State();

        state.setId(3L);
        state.setName("王霸天");
        state.setLive("抽烟");
        state.setNow(1);
        state.setSleep("8小时");
        state.setMedication("规律服药");
        state.setUnEffect(0);

        stateMapper.updateState(state);
    }
}
