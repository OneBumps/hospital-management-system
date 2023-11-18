package com.edu.xhu.service;



import com.edu.xhu.pojo.dao.dto.MessageQueryDto;
import com.edu.xhu.pojo.entity.Message;

import java.util.List;

public interface MessageService {
    /**
     * 插入病人信息
     * @param message
     * @return
     */
    int insertMessage (Message message);

    /**
     * 按id查找病人信息
     * @param id
     * @return
     */
    Message findMessageById (Long id);

    /**
     * 查找全部病人信息
     * @return
     */
    List<Message> findAll();

    /**
     * 删除病人信息
     * @param id
     * @return
     */
    int deleteMessageById(Long id);

    /**
     * 更新病人信息
     * @param message
     * @return
     */
    int updateMessage(Message message);

    List<Message> findMessageByPage(MessageQueryDto messageQueryDto);

    Long findMessageByPageCount(MessageQueryDto messageQueryDto);


}
