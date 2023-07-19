package com.Ser.dao;

import com.Ser.pojo.OrgEntriedTask;
import com.Ser.pojo.Task;
import com.Ser.pojo.TaskNameAndNo;
import com.Ser.pojo.VolTaskList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskListMapper {

    /**
     * 查询所有任务
     */
    List<Task> findAllTask();

    /**
     * 志愿机构发布任务
     */
    int issueTask(Task task);

    /**
     * 加入某任务
     * 更新现有人数
     */
    int updateNowNum(@Param("taskNo") int taskNo);


    /**
     * 查询机构已发布任务
     */
    List<OrgEntriedTask> findAllIssueTask(@Param("email")String email);

    /**
     * 获取志愿者的任务
     */
    List<VolTaskList> findAllVolTask(@Param("phoneNum")String phoneNum);

    /**
     * 查询本机构发布的所有任务
     */
    List<TaskNameAndNo> findAllTaskNameAndNo(@Param("email")String email);


    /**
     * 查询已报名的任务
     * 第二步：根据taskNo集合查询任务详细信息
     */
    /*List<EntriedTask> findRegisteredTask(List<Integer> taskNo);*/
}
