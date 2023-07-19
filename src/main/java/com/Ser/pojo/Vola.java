package com.Ser.pojo;

public class Vola {
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

    @Override
    public String toString() {
        return "Vola{" +
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
}
