package com.Ser.service;

import com.Ser.pojo.EntriedTask;
import com.Ser.pojo.RegisteredMember;
import com.Ser.pojo.RegisteredTask;
import com.Ser.pojo.TaskEntry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisteredTaskService {

    /**
     * 报名任务
     */
    int registeredTask(TaskEntry taskEntry, List<Integer> list);


    /**
     * 查询已报名的任务
     */
    List<EntriedTask> findEntriedTask(String phoneNum);

    /**
     * 移除已经报名的任务
     */
    int removeEntriedTask(String taskName,String phoneNum);

    /**
     * 查询已报名成员
     */
    List<RegisteredMember> findAllRegMember(String email);

    /**
     * 通过已报名成员审核
     */
    int passMemVerification(int taskNo,String phoneNum);

    /**
     * 加入某任务
     * 第三步
     * 移除已报名任务的数据
     */
    int removeResMsg(int taskNo,String phoneNum);

    /**
     * 查询已经报名的任务
     * 第一步：根据phoneNum查询已经报名的taskNo集合
     */
    /*List<Integer> findRegisteredTaskNoList(String phoneNum);*/
}
