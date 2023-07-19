package com.Ser.service;

import com.Ser.pojo.OrgEntriedTask;
import com.Ser.pojo.Task;
import com.Ser.pojo.TaskNameAndNo;
import com.Ser.pojo.VolTaskList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskService {

    /**
     * 查询所有发布的任务
     */
    List<Task> findAllTask();
    /**
     * 志愿机构发布任务
     */
    int issueTask(Task task);

    /**
     * 查询机构已发布任务
     */
    List<OrgEntriedTask> findAllIssueTask(String email);

    /**
     * 加入某任务
     * 第二步
     * 更新现有人数
     */
    int updateNowNum(int taskNo);

    /**
     * 获取志愿者的任务
     */
    List<VolTaskList> findAllVolTask(String phoneNum);

    /**
     * 查询本机构发布的所有任务
     */
    List<TaskNameAndNo> findAllTaskNameAndNo(String email);
}
