package com.Ser.pojo;

/**
 * 志愿机构已发布的任务
 * */
public class OrgEntriedTask {
    private String taskName;
    private String startTime;
    private String particularAddress;
    private int personNum;
    private String other;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getParticularAddress() {
        return particularAddress;
    }

    public void setParticularAddress(String particularAddress) {
        this.particularAddress = particularAddress;
    }

    public int getPersonNum() {
        return personNum;
    }

    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "OrgEntriedTask{" +
                "taskName='" + taskName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", particularAddress='" + particularAddress + '\'' +
                ", personNum=" + personNum +
                ", other='" + other + '\'' +
                '}';
    }
}
