package com.Ser.pojo;

public class RemoveEntiedTask {
    private String phoneNum;
    private String  taskName;

    @Override
    public String toString() {
        return "RemoveEntiedTask{" +
                "phoneNum='" + phoneNum + '\'' +
                ", taskName='" + taskName + '\'' +
                '}';
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
