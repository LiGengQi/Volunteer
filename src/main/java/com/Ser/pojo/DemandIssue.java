package com.Ser.pojo;

import java.util.Arrays;

/*materials: "呜呜呜"
        num: 1
        other: "无"
        personNo: "1224832393@qq.com"
        phoneNum: "180"
        receivingAddress: "北京"*/
public class DemandIssue {
    private String materials;
    private int num;
    private String receivingAddress;
    private String other;
    private String phoneNum;
    private String personNo;

    @Override
    public String toString() {
        return "DemandIssue{" +
                "materials='" + materials + '\'' +
                ", Num=" + num +
                ", receivingAddress='" + receivingAddress + '\'' +
                ", other='" + other + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", personNo='" + personNo + '\'' +
                '}';
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }
}
