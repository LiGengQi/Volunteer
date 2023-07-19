package com.Ser.pojo;

public class ReadMsg {
    private String volName;
    private String  phoneNum;
    private boolean isRead;
    private int messageNo;
    private String taskName;
    private String sendTime;
    private String messageContent;

    @Override
    public String toString() {
        return "ReadMsg{" +
                "volName='" + volName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isRead=" + isRead +
                ", messageNo=" + messageNo +
                ", taskName='" + taskName + '\'' +
                ", sendTime='" + sendTime + '\'' +
                ", messageContent='" + messageContent + '\'' +
                '}';
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
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

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getMessageNo() {
        return messageNo;
    }

    public void setMessageNo(int messageNo) {
        this.messageNo = messageNo;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
