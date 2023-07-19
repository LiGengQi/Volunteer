package com.Ser.controller;


import com.Ser.pojo.Task;
import com.Ser.pojo.TaskNameAndNo;
import com.Ser.service.TaskServiceImp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TaskListController {

    @Autowired
    @Qualifier("TaskServiceImp")
    public TaskServiceImp taskServiceImp;

//    返回任务列表
    @RequestMapping(value = "/taskList",method = RequestMethod.GET)
    public @ResponseBody
    List<Task> getTaskList(){
        List<Task> list = taskServiceImp.findAllTask();
        return list;
    }

    /**
     * 查询机构发布的所有任务
     * @param email
     * @return NameAndNo集合
     */
    @RequestMapping(value = "/findAllTaskNameAndNo",method = RequestMethod.GET)
    public @ResponseBody
    List<TaskNameAndNo> findAllTaskNameAndNo(@Param("email") String email){
        return taskServiceImp.findAllTaskNameAndNo(email);
    }

}
