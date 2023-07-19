package com.Ser.dao;

import com.Ser.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisteredTaskMapper {

    /**
     * 报名任务
     */
    int registeredTask(@Param("taskEntry") TaskEntry taskEntry, @Param("taskNo")List<Integer> taskNo);

    /**
     * 查询已经报名的任务
     * 第一步：根据phoneNum查询已经报名的taskNo集合
     */
    /*List<Integer> findRegisteredTaskNoList(@Param("phoneNum") String phoneNum);*/

    /**
     * 查询已经报名的任务
     */
    List<EntriedTask> findEntriedTask(@Param("phoneNum") String phoneNum);

    /**
     * 移除已经报名的任务
     */
    int removeEntriedTask(@Param("taskName")String taskName,@Param("phoneNum")String phoneNum);

    /**
     * 加入某任务
     */
    int joinTask(@Param("taskNo")String taskNo,@Param("phoneNum")String phoneNum);

    /**
     * 查询已报名成员
     */
    List<RegisteredMember> findAllRegMember(@Param("email") String email);

    /**
     * 通过已报名成员审核
     */
    int passMemVerification(@Param("taskNo")int taskNo,@Param("phoneNum")String phoneNum);

    /**
     * 加入某任务
     * 第三步
     * 移除已报名任务的数据
     */
    int removeResMsg(@Param("taskNo")int taskNo,@Param("phoneNum") String phoneNum);
}
