package com.edu.xhu.service.impl;

import com.edu.xhu.mapper.MessageMapper;
import com.edu.xhu.pojo.dao.dto.MessageQueryDto;
import com.edu.xhu.pojo.entity.Message;
import com.edu.xhu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImp implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public int insertMessage(Message message) {
        return messageMapper.insertMessage(message);
    }

    @Override
    public Message findMessageById(Long id) {
        return messageMapper.findMessageById(id);
    }

    @Override
    public List<Message> findAll() {
        return messageMapper.findAll();
    }

    @Override
    public int deleteMessageById(Long id) {
        return messageMapper.deleteMessageById(id);
    }

    @Override
    public int updateMessage(Message message) {
        return messageMapper.updateMessage(message);
    }

    @Override
    public List<Message> findMessageByPage(MessageQueryDto messageQueryDto) {
        return messageMapper.findMessageByPage(messageQueryDto);
    }

    @Override
    public Long findMessageByPageCount(MessageQueryDto messageQueryDto) {
        return messageMapper.findMessageByPageCount(messageQueryDto);
    }
}
