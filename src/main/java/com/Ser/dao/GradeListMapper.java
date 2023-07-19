package com.Ser.dao;

import com.Ser.pojo.EntryMember;
import com.Ser.pojo.PhoneNumList;
import com.Ser.pojo.Task;
import com.Ser.pojo.TaskNameAndNo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeListMapper {

    /**
     * 获取机构内所有成员
     */
    List<EntryMember> findAllMember(@Param("email") String email);

    /**
     * 给成员评分
     */
    int gradeToMember(EntryMember entryMember);

    /**
     * 发布疫情志愿者任务
     */
    int issueEpidemicTask(Task task);

    /**
     * 加入某任务
     * 第一步
     * 插入加入情况
     */
    int insertMember(@Param("taskNo")int taskNo,@Param("phoneNum")String phoneNum);

    /**
     * 写消息第二步，查询任务中的成员
     */
    List<PhoneNumList> findAllTaskMem(@Param("taskNo")int taskNo);



}
