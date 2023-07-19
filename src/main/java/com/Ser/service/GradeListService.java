package com.Ser.service;

import com.Ser.pojo.EntryMember;
import com.Ser.pojo.PhoneNumList;
import com.Ser.pojo.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeListService {

    /**
     * 获取机构内所有成员
     */
    List<EntryMember> findAllMember(String email);


    /**
     * 给成员评分
     */
    int gradeToMember(EntryMember entryMember);

    /**
     * 发布疫情志愿者服务
     * 后续操作
     */
    int issueEpidemicTask(Task task);

    /**
     * 加入某任务
     * 第一步
     * 插入加入情况
     */
    int insertMember(int taskNo, String phoneNum);

    /**
     * 写消息
     * 第二步
     * 查找任务内成员
     */
    List<PhoneNumList> findAllTaskMem(int taskNo);


}
