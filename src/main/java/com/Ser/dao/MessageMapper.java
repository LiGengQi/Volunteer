package com.Ser.dao;

import com.Ser.pojo.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {

    /**
     * 写消息 第一步
     */
    int sendMessage(Message message);

    /**
     * 查询本机构发布的所有消息
     */
    List<Message> findAllMessage(@Param("email")String email);
    /**
     * 删除消息
     */
    int deleteMsg(@Param("messageNo") int messageNo);
}
