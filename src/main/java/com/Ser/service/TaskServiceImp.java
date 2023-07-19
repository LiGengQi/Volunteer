package com.Ser.service;

import com.Ser.dao.TaskListMapper;
import com.Ser.pojo.OrgEntriedTask;
import com.Ser.pojo.Task;
import com.Ser.pojo.TaskNameAndNo;
import com.Ser.pojo.VolTaskList;
import com.sun.javafx.image.PixelUtils;

import java.util.List;

public class TaskServiceImp implements TaskService{
    private TaskListMapper taskListMapper;
    public void setTaskListMapper(TaskListMapper taskListMapper){
        this.taskListMapper = taskListMapper;
    }

    @Override
    public List<Task> findAllTask() {
        return taskListMapper.findAllTask();
    }

    @Override
    public int issueTask(Task task) {
        return taskListMapper.issueTask(task);
    }

    @Override
    public int updateNowNum(int taskNo) {
        return taskListMapper.updateNowNum(taskNo);
    }

    @Override
    public List<OrgEntriedTask> findAllIssueTask(String email) {
        return taskListMapper.findAllIssueTask(email);
    }

    @Override
    public List<VolTaskList> findAllVolTask(String phoneNum) {
        return taskListMapper.findAllVolTask(phoneNum);
    }

    @Override
    public List<TaskNameAndNo> findAllTaskNameAndNo(String email) {
        return taskListMapper.findAllTaskNameAndNo(email);
    }
}
