package com.Ser.controller;


import com.Ser.pojo.MaxGradeUser;
import com.Ser.pojo.Volunteer;
import com.Ser.service.UserPicService;
import com.Ser.service.VolunteerServiceImp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
public class VolunteerController {

    @Autowired
    @Qualifier("VolunteerServiceImp")
    public VolunteerServiceImp volunteerServiceImp;

    @Autowired
    @Qualifier("UserPicServiceImp")
    public UserPicService userPicService;


//    志愿者登录
    @RequestMapping(value = "/volLogin",method = RequestMethod.GET)
    public @ResponseBody
    Volunteer VolunteerLogin(@RequestParam("id") String id, @RequestParam("pw") String pw){
//
        Volunteer volunteer = volunteerServiceImp.VolLogin(id, pw);
        if (volunteer.getPhoneNum() == null){
            return volunteer;
        }else {
            volunteer.isLogin();
            System.out.println(volunteer);
            return volunteer;
        }
    }

    //    志愿者注册
    @RequestMapping(value = "/VolRegister",method = RequestMethod.POST)
    public String VolRegister(Volunteer volunteer){
        volunteerServiceImp.volRegister(volunteer);
        return "success";
    }

    /**
     * 连接头像路径和用户名
     * @param phoneNum
     * @param picUrl
     */
    @RequestMapping(value = "/conPhoneNumAndUrl",method = RequestMethod.POST)
    public void conPhoneNumAndUrl(@RequestParam("phoneNum")String phoneNum,@RequestParam("picUrl")String picUrl){
        userPicService.updatePhoneNum(phoneNum, picUrl);
    }
    /**
     * 上传头像
     * @param file
     * @return
     */
    @RequestMapping(value = "/imgPost",method = RequestMethod.POST)
    public String imgPost(@RequestParam("file")MultipartFile file){
        //判断所上传文件是否存在
        if (file.isEmpty()) {
            return "上传错误";
        }
        return userPicService.insertPicUrl(file);
    }

    /**
     * 获取前三名信息
     */
    @RequestMapping(value = "/getMaxUserMessage",method = RequestMethod.GET)
    List<MaxGradeUser> getMaxUserMessage(){
        return volunteerServiceImp.findMaxGradeUser();
    }



}
