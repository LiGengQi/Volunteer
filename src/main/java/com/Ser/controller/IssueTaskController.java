package com.Ser.controller;


import com.Ser.pojo.Task;
import com.Ser.service.GradeListService;
import com.Ser.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssueTaskController {
    @Autowired
    @Qualifier("TaskServiceImp")
    private TaskService taskService;

    @Autowired
    @Qualifier("GradeListServiceImp")
    private GradeListService gradeListService;





//    控制是否任务是疫情服务——发布任务
    @RequestMapping(value = "/IssueTask",method = RequestMethod.POST)
    public String IssueTask(Task task){
        if (task.getTaskType().equals("疫情志愿服务")){
            taskService.issueTask(task);
            gradeListService.issueEpidemicTask(task);

        }else {
            taskService.issueTask(task);
        }

        return "success";
    }
}
