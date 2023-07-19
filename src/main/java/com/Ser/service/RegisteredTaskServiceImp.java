package com.Ser.service;

import com.Ser.dao.RegisteredTaskMapper;
import com.Ser.pojo.EntriedTask;
import com.Ser.pojo.RegisteredMember;
import com.Ser.pojo.TaskEntry;

import java.util.List;

public class RegisteredTaskServiceImp implements RegisteredTaskService {
    private RegisteredTaskMapper registeredTaskMapper;

    public void setRegisteredTaskMapper(RegisteredTaskMapper registeredTaskMapper) {
        this.registeredTaskMapper = registeredTaskMapper;
    }

    @Override
    public int registeredTask(TaskEntry taskEntry, List<Integer> list) {
        return registeredTaskMapper.registeredTask(taskEntry,list);
    }

    @Override
    public List<EntriedTask> findEntriedTask(String phoneNum) {
        return registeredTaskMapper.findEntriedTask(phoneNum);
    }

    @Override
    public int removeEntriedTask(String taskName, String phoneNum) {
        return registeredTaskMapper.removeEntriedTask(taskName, phoneNum);
    }

    @Override
    public List<RegisteredMember> findAllRegMember(String email) {
        return registeredTaskMapper.findAllRegMember(email);
    }

    @Override
    public int passMemVerification(int taskNo, String phoneNum) {
        return registeredTaskMapper.passMemVerification(taskNo, phoneNum);
    }

    @Override
    public int removeResMsg(int taskNo, String phoneNum) {
        return registeredTaskMapper.removeResMsg(taskNo, phoneNum);
    }

    /*@Override
    public List<Integer> findRegisteredTaskNoList(String phoneNum) {
        return registeredTaskMapper.findRegisteredTaskNoList(phoneNum);
    }*/
}
