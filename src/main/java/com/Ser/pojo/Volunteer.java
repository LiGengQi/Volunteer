package com.Ser.pojo;

/**
 * 志愿者实体类
 */

public class Volunteer {

    private String volName;
    private String certificateType;
    private String certificateNum;
    private String birthday;
    private String sex;
    private String educationalLevel;
    private String phoneNum;
    private String volPassword;
    private String skill;
    private String other;
    private String presentAddress;

    //    是否选择了自动志愿者服务
    private boolean voluntarily;
//    是否登录成功
    public boolean isLogRight = false;

    public void isLogin(){
        this.isLogRight = true;
    }


    @Override
    public String toString() {
        return "Volunteer{" +
                "volName='" + volName + '\'' +
                ", certificateType='" + certificateType + '\'' +
                ", certificateNum='" + certificateNum + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", educationalLevel='" + educationalLevel + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", volPassword='" + volPassword + '\'' +
                ", skill='" + skill + '\'' +
                ", other='" + other + '\'' +
                ", presentAddress='" + presentAddress + '\'' +
                ", voluntarily=" + voluntarily +
                '}';
    }

    public String getVolName() {
        return volName;
    }

    public void setVolName(String volName) {
        this.volName = volName;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getVolPassword() {
        return volPassword;
    }

    public void setVolPassword(String volPassword) {
        this.volPassword = volPassword;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public boolean isVoluntarily() {
        return voluntarily;
    }

    public void setVoluntarily(boolean voluntarily) {
        this.voluntarily = voluntarily;
    }
}
