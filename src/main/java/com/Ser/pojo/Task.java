package com.Ser.pojo;

/**
 * 任务实体类
 */

public class Task {
    private int taskNo;
    private String taskName;
    private String taskType;
    private String taskAddress;
    private String particularAddress;
    private String startTime;
    private String endTime;
    private String skill;
    private String educationalLevel;
    private int personNum;
    private int personMaxnum;
    private String other;
    private String orgEmail;

    @Override
    public String toString() {
        return "Task{" +
                "taskNo=" + taskNo +
                ", taskName='" + taskName + '\'' +
                ", taskType='" + taskType + '\'' +
                ", address='" + taskAddress + '\'' +
                ", particularAddress='" + particularAddress + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", skill='" + skill + '\'' +
                ", educationalLevel='" + educationalLevel + '\'' +
                ", personNum=" + personNum +
                ", personMaxnum=" + personMaxnum +
                ", other='" + other + '\'' +
                ", orgEmail='" + orgEmail + '\'' +
                '}';
    }

    public int getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(String taskAddress) {
        this.taskAddress = taskAddress;
    }

    public String getParticularAddress() {
        return particularAddress;
    }

    public void setParticularAddress(String particularAddress) {
        this.particularAddress = particularAddress;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public int getPersonNum() {
        return personNum;
    }

    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    public int getPersonMaxnum() {
        return personMaxnum;
    }

    public void setPersonMaxnum(int personMaxnum) {
        this.personMaxnum = personMaxnum;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }
}
