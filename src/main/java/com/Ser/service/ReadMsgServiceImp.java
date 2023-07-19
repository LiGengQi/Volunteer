package com.Ser.service;

import com.Ser.dao.ReadMsgMapper;
import com.Ser.pojo.PhoneNumList;
import com.Ser.pojo.ReadMsg;

import java.util.List;

public class ReadMsgServiceImp implements ReadMsgService {
    private ReadMsgMapper readMsgMapper;

    public void setReadMsgMapper(ReadMsgMapper readMsgMapper) {
        this.readMsgMapper = readMsgMapper;
    }

    @Override
    public List<ReadMsg> findAllReadMsg(String phoneNum) {
        return readMsgMapper.findAllReadMsg(phoneNum);
    }

    @Override
    public List<ReadMsg> findAllUnReadMsg(String phoneNum) {
        return readMsgMapper.findAllUnReadMsg(phoneNum);
    }

    @Override
    public int readed(String phoneNum, int messageNo) {
        return readMsgMapper.readed(phoneNum, messageNo);
    }

    @Override
    public List<ReadMsg> findMsgState(int messageNo) {
        return readMsgMapper.findMsgState(messageNo);
    }

    @Override
    public int connectMsg(int messageNo, List<PhoneNumList> phoneNum) {
        return readMsgMapper.connectMsg(messageNo, phoneNum);
    }
}
