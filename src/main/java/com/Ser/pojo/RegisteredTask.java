package com.Ser.pojo;

public class RegisteredTask {
    private String phoneNum;
    private int taskNo;
    private int isPass;

    @Override
    public String toString() {
        return "RegisteredTask{" +
                "phoneNum='" + phoneNum + '\'' +
                ", taskNo=" + taskNo +
                ", isPass=" + isPass +
                '}';
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }

    public int getIsPass() {
        return isPass;
    }

    public void setIsPass(int isPass) {
        this.isPass = isPass;
    }
}
