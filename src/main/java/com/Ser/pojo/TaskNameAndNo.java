package com.Ser.pojo;

public class TaskNameAndNo {
    private String taskName;
    private int taskNo;

    @Override
    public String toString() {
        return "TaskNameAndNo{" +
                "taskName='" + taskName + '\'' +
                ", taskNo=" + taskNo +
                '}';
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }
}
