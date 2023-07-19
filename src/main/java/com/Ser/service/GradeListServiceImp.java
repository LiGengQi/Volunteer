package com.Ser.service;

import com.Ser.dao.GradeListMapper;
import com.Ser.pojo.EntryMember;
import com.Ser.pojo.PhoneNumList;
import com.Ser.pojo.Task;

import java.util.List;

public class GradeListServiceImp implements GradeListService {
    private GradeListMapper gradeListMapper;

    public void setGradeListMapper(GradeListMapper gradeListMapper) {
        this.gradeListMapper = gradeListMapper;
    }

    @Override
    public List<EntryMember> findAllMember(String email) {
        return gradeListMapper.findAllMember(email);
    }

    @Override
    public int gradeToMember(EntryMember entryMember) {
        return gradeListMapper.gradeToMember(entryMember);
    }

    @Override
    public int issueEpidemicTask(Task task) {
        return gradeListMapper.issueEpidemicTask(task);
    }

    @Override
    public int insertMember(int taskNo, String phoneNum) {
        return gradeListMapper.insertMember(taskNo, phoneNum);
    }

    @Override
    public List<PhoneNumList> findAllTaskMem(int taskNo) {
        return gradeListMapper.findAllTaskMem(taskNo);
    }
}
