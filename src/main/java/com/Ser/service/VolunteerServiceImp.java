package com.Ser.service;


import com.Ser.dao.VolunteerListMapper;
import com.Ser.pojo.MaxGradeUser;
import com.Ser.pojo.Vola;
import com.Ser.pojo.Volunteer;


import java.util.List;


public class VolunteerServiceImp implements VolunteerService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private VolunteerListMapper volunteerListMapper;

    public void setVolunteerListMapper(VolunteerListMapper volunteerListMapper){
        this.volunteerListMapper = volunteerListMapper;
    }

    @Override
    public List<Vola> findAll() {
        return volunteerListMapper.getAllVolunteer();
    }

    /**
     * 志愿者登录
     */
    @Override
    public Volunteer VolLogin(String phoneNum,String password) {
        return volunteerListMapper.VolLogin(phoneNum, password);
    }

    /**
     * 志愿者注册
     */
    @Override
    public int volRegister(Volunteer volunteer) {
        return volunteerListMapper.volRegister(volunteer);
    }

    @Override
    public List<MaxGradeUser> findMaxGradeUser() {
        return volunteerListMapper.findMaxGradeUser();
    }
}
