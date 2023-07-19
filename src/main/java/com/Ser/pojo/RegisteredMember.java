package com.Ser.pojo;

public class RegisteredMember {
    private String memberName;
    private String taskName;
    private String educationalLevel;
    private String skill;
    private String phoneNum;
    private int taskNo;

    @Override
    public String toString() {
        return "RegisteredMember{" +
                "memberName='" + memberName + '\'' +
                ", taskName='" + taskName + '\'' +
                ", educationalLevel='" + educationalLevel + '\'' +
                ", skill='" + skill + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", taskNo=" + taskNo +
                ", grade=" + grade +
                '}';
    }

    public int getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    private int grade;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
