package com.Ser.service;

import com.Ser.dao.UserPicMapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UserPicServiceImp implements UserPicService {
    private UserPicMapper userPicMapper;

    public void setUserPicMapper(UserPicMapper userPicMapper){
        this.userPicMapper = userPicMapper;
    }


    @Override
    public String insertPicUrl(MultipartFile file) {

        System.out.println(file);
        //获取上传文件的原始名称
        String originalFilename = file.getOriginalFilename();
        //设置上传文件的保存地址目录
        String dirPath = "/usr/local/Tomcat8.5/webapps/ROOT/userpic/";
        File filePath = new File(dirPath);
        //如果保存的地址不存在,就先创建目录
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        //获取当前文件的后缀
        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        //使用UUID重新命名上传的文件名称(UUID(唯一识别码)+原始文件名称后缀)
        String newFileName = UUID.randomUUID() + "." + suffix;
        try {
            //创建可能会有错误,强制添加异常
            file.transferTo(new File(dirPath + newFileName));
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
        userPicMapper.insertPicUrl(newFileName);
        return newFileName;
    }

    @Override
    public int updatePhoneNum(String phoneNum, String picUrl) {
        return userPicMapper.updatePhoneNum(phoneNum, picUrl);
    }
}
