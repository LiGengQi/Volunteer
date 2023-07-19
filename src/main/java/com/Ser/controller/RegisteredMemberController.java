package com.Ser.controller;



import com.Ser.pojo.RegisteredMember;
import com.Ser.service.RegisteredTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegisteredMemberController {

    @Autowired
    @Qualifier("RegisteredTaskServiceImp")
    private RegisteredTaskService registeredTaskService;

//    查询已报名成员
    @RequestMapping(value = "SelectRegisteredMember",method = RequestMethod.GET)
    public @ResponseBody
    List<RegisteredMember> postRegisteredMemberList(@RequestParam("email") String email){
//        List<RegisteredMember> list = registeredMemberSql.SelectRegisteredMember(email);
        List<RegisteredMember> list = registeredTaskService.findAllRegMember(email);
        return list;
    }
    //    通过已报名成员审核
    @RequestMapping(value = "/passVerification",method = RequestMethod.POST)
    public String PassVerification(@RequestParam(value = "taskNo")int taskNo, @RequestParam(value = "phoneNum")String phoneNum){
        registeredTaskService.passMemVerification(taskNo,phoneNum);
        return "success";
    }
}
