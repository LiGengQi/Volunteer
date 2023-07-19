package com.Ser.pojo;


import java.util.List;

public class TaskEntry {
    private List<Integer> taskNo;
    private String phoneNum;

    @Override
    public String toString() {
        return "TaskEntry{" +
                "taskNo=" + taskNo +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public List<Integer> getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(List<Integer> taskNo) {
        this.taskNo = taskNo;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
