package com.edu.xhu.test.zhyTest;


import com.edu.xhu.mapper.MessageMapper;
import com.edu.xhu.pojo.dao.dto.MessageQueryDto;
import com.edu.xhu.pojo.entity.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-dao.xml")
public class testMessageMapper {
    @Autowired
    private MessageMapper messageMapper;

    @Test
    public void insertMessage(){
        Message message=new Message();

        message.setAge(35);
        message.setAllergic("阿莫西林");
        message.setIdNum("510603200205050002");
        message.setMarried(0);
        message.setPhoneNum("18981061817");
        message.setName("张小力");
        message.setSex(1);
        message.setState("肺炎");

        messageMapper.insertMessage(message);
    }
    @Test
    public void findAll(){
        List<Message> messageList= messageMapper.findAll();

        System.out.println(messageList);
    }

    @Test
    public void findMessageById(){

        System.out.println(messageMapper.findMessageById(1L));

    }

    @Test
    public void deleteMessageById(){

        messageMapper.deleteMessageById(2L);

    }

    @Test
    public void updateMessage(){
        Message message=new Message();

        message.setId(1L);
        message.setAge(20);
        message.setAllergic("阿莫西林");
        message.setIdNum("510603200205050002");
        message.setMarried(0);
        message.setPhoneNum("18981061817");
        message.setName("张文");
        message.setSex(1);
        message.setState("肺炎");

        messageMapper.updateMessage(message);

        System.out.println(messageMapper.findMessageById(1L));
    }

    @Test
    public void testFind(){
        MessageQueryDto messageQueryDto=new MessageQueryDto();

        messageQueryDto.setName("张");
//        messageQueryDto.setIdNum("510603200205050002");
//        messageQueryDto.setPhoneNum("18981061817");

        System.out.println(messageMapper.findMessageByPage(messageQueryDto));

        System.out.println(messageMapper.findMessageByPageCount(messageQueryDto));

    }
}

