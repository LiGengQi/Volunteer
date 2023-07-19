package com.Ser.controller;



import com.Ser.pojo.VolTaskList;
import com.Ser.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VolTaskListController {

    @Autowired
    @Qualifier("TaskServiceImp")
    private TaskService taskService;

//    获取志愿者任务
    @RequestMapping(value = "/getMyTask",method = RequestMethod.GET)
    public  @ResponseBody
    List<VolTaskList>
    getVolTask(@RequestParam("phoneNum")String phoneNum){
        List<VolTaskList> list = taskService.findAllVolTask(phoneNum);
        return list;
    }
}
