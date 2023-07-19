package com.Ser.controller;

import com.Ser.pojo.Message;
import com.Ser.pojo.PhoneNumList;
import com.Ser.pojo.ReadMsg;
import com.Ser.service.GradeListService;
import com.Ser.service.MessageService;
import com.Ser.service.ReadMsgService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 消息后台控制
 */
@RestController
public class MessageController {

    @Autowired
    @Qualifier("MessageServiceImp")
    private MessageService messageService;

    @Autowired
    @Qualifier("ReadMsgServiceImp")
    private ReadMsgService readMsgService;

    @Autowired
    @Qualifier("GradeListServiceImp")
    private GradeListService gradeListService;


    /**
     * 请求消息集合
     * @param email
     * @return 消息集合
     */
    @RequestMapping(value = "/findSendMsg",method = RequestMethod.GET)
    public @ResponseBody
    List<Message> findAllMsgToOrg(@Param("email")String email){
        return messageService.findAllMessage(email);
    }


    /**
     * 发送消息
     * @param message
     * @return 成功
     */
    @RequestMapping(value = "/sendMsg",method = RequestMethod.POST)
    public String sendMsg(Message message){
        messageService.sendMessage(message);
//        List<String> list = new ArrayList<>();
        System.out.println(message);
        List<PhoneNumList> lists = gradeListService.findAllTaskMem(message.getTaskNo());
        readMsgService.connectMsg(message.getMessageNo(),lists);
        return "success";
    }

    /**
     * 删除消息
     * @param messageNo
     * @return 成功
     */
    @RequestMapping(value = "/deleteMsg",method = RequestMethod.GET)
    public String deleteMsg(@Param("messageNo")int messageNo){
        messageService.deleteMsg(messageNo);
        return "success";
    }

    /**
     * 查找用户的消息
     * @param phoneNum
     * @return
     */
    @RequestMapping(value = "/findAllReadMsg",method = RequestMethod.GET)
    public @ResponseBody
    List<ReadMsg> findAllReadMsg(@Param("phoneNum")String phoneNum){
        return readMsgService.findAllReadMsg(phoneNum);
    }

    /**
     * 查找用户的未读消息
     * @param phoneNum
     * @return
     */
    @RequestMapping(value = "/findAllUnReadMsg",method = RequestMethod.GET)
    public @ResponseBody
    List<ReadMsg> findAllUnReadMsg(@Param("phoneNum")String phoneNum){
        return readMsgService.findAllUnReadMsg(phoneNum);
    }

    /**
     * 标记消息已读
     * @param phoneNum
     * @param message
     * @return 成功
     */
    @RequestMapping(value = "/readed",method = RequestMethod.POST)
    public String readed(@Param("phoneNum")String phoneNum,@Param("messageNo")int message){
        readMsgService.readed(phoneNum, message);
        return "success";
    }

    /**
     * 查看消息状态
     * @param messageNo
     * @return List<ReadMsg>
     */
    @RequestMapping(value = "/findMsgState",method = RequestMethod.GET)
    public List<ReadMsg> findMsgState(@Param("messageNo")int messageNo){
        return readMsgService.findMsgState(messageNo);
    }

}
