package com.Ser.service;

import com.Ser.pojo.MaxGradeUser;
import com.Ser.pojo.Vola;
import com.Ser.pojo.Volunteer;

import java.util.List;

public interface VolunteerService {
    List<Vola> findAll();

    /**
     * 志愿者登录
     */
    Volunteer VolLogin(String phoneNum,String password);

    /**
     * 志愿者注册
     */
    int volRegister(Volunteer volunteer);

    /**
     * 查询分数最高的前三名
     */
    List<MaxGradeUser> findMaxGradeUser();
}
