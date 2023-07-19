package com.Ser.dao;

import com.Ser.pojo.PhoneNumList;
import com.Ser.pojo.ReadMsg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReadMsgMapper {
    /**
     * 查询用户收到已读的信息
     */
    List<ReadMsg> findAllReadMsg(@Param("phoneNum")String phoneNum);

    /**
     * 查询用户收到的未读消息
     */
    List<ReadMsg> findAllUnReadMsg(@Param("phoneNum")String phoneNum);

    /**
     * 消息已读
     */
    int readed(@Param("phoneNum")String phoneNum,@Param("messageNo")int messageNo);

    /**
     * 查询消息状态列表
     */
    List<ReadMsg> findMsgState(@Param("messageNo")int messageNo);

    /**
     * 写消息第三步   建立收信方与消息连接
     */
    int connectMsg(@Param("messageNo")int messageNo,@Param("phoneNums")List<PhoneNumList> phoneNum);
}
