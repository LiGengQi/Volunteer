package com.Ser.service;

import com.Ser.pojo.Message;
import java.util.List;

public interface MessageService {

    /**
     * 写消息 第一步
     */
    int sendMessage(Message message);

    /**
     * 查询本机构发布的所有消息
     */
    List<Message> findAllMessage(String email);
    /**
     * 删除消息
     */
    int deleteMsg(int messageNo);
}
