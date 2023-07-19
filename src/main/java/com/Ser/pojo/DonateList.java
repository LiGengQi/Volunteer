package com.Ser.pojo;

public class DonateList {
    private String personName;
    private String expressName;
    private int Num;
    private String Number;
    private int donateNo;
    private String phoneNum;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "DonateList{" +
                "personName='" + personName + '\'' +
                ", expressName='" + expressName + '\'' +
                ", Num=" + Num +
                ", Number='" + Number + '\'' +
                ", donateNo=" + donateNo +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public int getDonateNo() {
        return donateNo;
    }

    public void setDonateNo(int donateNo) {
        this.donateNo = donateNo;
    }
}
