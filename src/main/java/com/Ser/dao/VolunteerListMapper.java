package com.Ser.dao;


import com.Ser.pojo.MaxGradeUser;
import com.Ser.pojo.Vola;
import com.Ser.pojo.Volunteer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteerListMapper {

    /**
     * 查询所有志愿者
     */
    List<Vola> getAllVolunteer();

    /**
     * 志愿者登录
     */
     Volunteer VolLogin(@Param("phoneNum") String phoneNum,@Param("password")String password);

    /**
     * 志愿者注册
     */
    int volRegister(Volunteer volunteer);

    /**
     * 查询分数最高的前三名
     */
    List<MaxGradeUser> findMaxGradeUser();
}
