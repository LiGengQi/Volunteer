package com.Ser.pojo;

public class DemandList {
//    志愿机构名称
    private String orgName;
    private String materials;
    private int nowNum;
    private int Num;
    private String receivingAddress;
    private String other;
    private int demandNo;
    private String phoneNum;

    @Override
    public String toString() {
        return "DemandList{" +
                "OrgName='" + orgName + '\'' +
                ", materials='" + materials + '\'' +
                ", nowNum=" + nowNum +
                ", Num=" + Num +
                ", receivingAddress='" + receivingAddress + '\'' +
                ", other='" + other + '\'' +
                ", demandNo=" + demandNo +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public int getNowNum() {
        return nowNum;
    }

    public void setNowNum(int nowNum) {
        this.nowNum = nowNum;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
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

    public int getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(int demandNo) {
        this.demandNo = demandNo;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
