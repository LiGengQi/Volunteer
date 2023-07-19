package com.Ser.pojo;
/**
 * 任务成员*/
public class EntryMember {
    private String taskName;
    private String volName;
    private String phoneNum;
    private int isGrade;


    @Override
    public String toString() {
        return "EntryMember{" +
                "taskName='" + taskName + '\'' +
                ", memberName='" + volName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isGrade=" + isGrade +
                '}';
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getVolName() {
        return volName;
    }

    public void setVolName(String volName) {
        this.volName = volName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getIsGrade() {
        return isGrade;
    }

    public void setIsGrade(int isGrade) {
        this.isGrade = isGrade;
    }
}
