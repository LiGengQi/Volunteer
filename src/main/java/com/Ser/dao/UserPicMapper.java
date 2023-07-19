package com.Ser.dao;

import org.apache.ibatis.annotations.Param;

public interface UserPicMapper {

    /**
     * 插入用户头像路径
     */
    int insertPicUrl(@Param("picUrl")String picUrl);
    /**
     * 插入用户名
     */
    int updatePhoneNum(@Param("phoneNum")String phoneNum,@Param("picUrl")String picUrl);
}
