package com.Ser.pojo;

public class VolTaskList {
    private String taskName;
    private String orgName;
    private String startTime;
    private String orgEmail;
    private String particularAddress;
    private String other;

    @Override
    public String toString() {
        return "VolTaskList{" +
                "taskName='" + taskName + '\'' +
                ", orgName='" + orgName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", orgEmail='" + orgEmail + '\'' +
                ", particularAddress='" + particularAddress + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getParticularAddress() {
        return particularAddress;
    }

    public void setParticularAddress(String particularAddress) {
        this.particularAddress = particularAddress;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
