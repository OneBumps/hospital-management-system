package com.edu.xhu.test.zhyTest;


import com.edu.xhu.pojo.entity.Message;
import com.edu.xhu.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class testMessageService {
    @Autowired
    private MessageService messageService;

    @Test
    public void insertMessage(){
        Message message=new Message();
        for(int i=1;i<=100;i++){
            message.setAge(10);
            message.setAllergic("头孢");
            message.setIdNum("510603200205051111");
            message.setMarried(0);
            message.setPhoneNum("15982906658");
            message.setName("魏琦"+i);
            message.setSex(0);
            message.setState("腹泻");

            messageService.insertMessage(message);
        }

    }
    @Test
    public void findAll(){
        List<Message> messageList= messageService.findAll();

        System.out.println(messageList);
    }

    @Test
    public void findMessageById(){

        System.out.println(messageService.findMessageById(1L));

    }

    @Test
    public void deleteMessageById(){

        messageService.deleteMessageById(2L);

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

        messageService.updateMessage(message);

        System.out.println(messageService.findMessageById(1L));
    }

}
