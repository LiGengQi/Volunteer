package com.Ser.service;

import com.Ser.dao.MessageMapper;
import com.Ser.pojo.Message;

import javax.sound.midi.VoiceStatus;
import java.util.List;

public class MessageServiceImp implements MessageService {
    private MessageMapper messageMapper;

    public void setMessageMapper(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @Override
    public int sendMessage(Message message) {
        return messageMapper.sendMessage(message);
    }

    @Override
    public List<Message> findAllMessage(String email) {
        return messageMapper.findAllMessage(email);
    }

    @Override
    public int deleteMsg(int messageNo) {
        return messageMapper.deleteMsg(messageNo);
    }
}
