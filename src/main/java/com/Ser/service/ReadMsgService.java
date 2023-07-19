package com.Ser.service;

import com.Ser.pojo.PhoneNumList;
import com.Ser.pojo.ReadMsg;
import java.util.List;

public interface ReadMsgService {

    /**
     * 查询用户收到的已读信息
     */
    List<ReadMsg> findAllReadMsg(String phoneNum);

    /**
     * 查询用户收到的未读信息
     */
    List<ReadMsg> findAllUnReadMsg(String phoneNum);
    /**
     * 消息已读
     */
    int readed(String phoneNum,int messageNo);

    /**
     * 查询消息状态列表
     */
    List<ReadMsg> findMsgState(int messageNo);

    /**
     * 写消息第三步   建立收信方与消息连接
     */
    int connectMsg(int messageNo,List<PhoneNumList> phoneNum);
}
