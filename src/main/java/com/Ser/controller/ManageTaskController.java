package com.Ser.controller;


import com.Ser.pojo.EntriedTask;
import com.Ser.pojo.TaskEntry;
import com.Ser.service.GradeListService;
import com.Ser.service.RegisteredTaskService;
import com.Ser.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ManageTaskController {

    @Autowired
    @Qualifier("RegisteredTaskServiceImp")
    private RegisteredTaskService registeredTaskService;

    @Autowired
    @Qualifier("GradeListServiceImp")
    private GradeListService gradeListService;

    @Autowired
    @Qualifier("TaskServiceImp")
    private TaskService taskService;




//    提交报名表
    @RequestMapping(value = "/submitEntryForm",method = RequestMethod.POST)
    public void submitEntry(TaskEntry taskEntry){
        registeredTaskService.registeredTask(taskEntry,taskEntry.getTaskNo());

    }


//    查询已报名表
    @RequestMapping(value = "/entriedTable",method = RequestMethod.GET)
    public @ResponseBody
    List<EntriedTask> selectEntried(@RequestParam(value = "phoneNum") String phoneNum){
        List<EntriedTask> list = registeredTaskService.findEntriedTask(phoneNum);
        return list;
    }

//    移除某一报名任务
    @RequestMapping(value = "removeEntriedTask",method = RequestMethod.POST)
    public String removeTask(@RequestParam("taskName") String taskName, @RequestParam("phoneNum")String phoneNum){
        registeredTaskService.removeEntriedTask(taskName, phoneNum);
        return "success";
    }

//    加入某任务
    @RequestMapping(value = "/joinTask",method = RequestMethod.POST)
    public String joinTask(@RequestParam("taskno")int taskNo, @RequestParam("phoneNum")String phoneNum){
        gradeListService.insertMember(taskNo, phoneNum);
        taskService.updateNowNum(taskNo);
        registeredTaskService.removeResMsg(taskNo, phoneNum);
        return "success";
    }



}
