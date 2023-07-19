package com.Ser.service;

import org.springframework.web.multipart.MultipartFile;

public interface UserPicService {

    /**
     * 插入用户头像路径
     */
    String  insertPicUrl(MultipartFile file);
    /**
     * 插入用户名
     */
    int updatePhoneNum(String phoneNum,String picUrl);
}
