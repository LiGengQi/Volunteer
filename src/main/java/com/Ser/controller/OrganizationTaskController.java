package com.Ser.controller;


import com.Ser.pojo.EntryMember;
import com.Ser.pojo.OrgEntriedTask;
import com.Ser.service.GradeListService;
import com.Ser.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganizationTaskController {

//    OrganizationTaskSql organizationTaskSql = new OrganizationTaskSql();

    @Autowired
    @Qualifier("GradeListServiceImp")
    private GradeListService gradeListService;

    @Autowired
    @Qualifier("TaskServiceImp")
    private TaskService taskService;



//    获取机构内所有成员
    @RequestMapping(value = "/gradeList",method = RequestMethod.GET)
    public @ResponseBody
    List<EntryMember> GetGradeList (@RequestParam(value = "email")String email){
        List<EntryMember> list = gradeListService.findAllMember(email);
        return list;
    }



//    给成员评分
    @RequestMapping(value = "/Graded",method = RequestMethod.POST)
    public String GradedRate(EntryMember entryMember){
        gradeListService.gradeToMember(entryMember);
        return "success";
    }

//    查询所有已发布任务

    @RequestMapping(value = "/SelectOrgEntriedTask",method = RequestMethod.GET)
    public @ResponseBody
    List<OrgEntriedTask> selectOrgEntriedTask(@RequestParam(value = "email")String email){
        List<OrgEntriedTask> list = taskService.findAllIssueTask(email);
        return list;
    }


}
