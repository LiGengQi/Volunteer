package com.Ser.pojo;

import java.util.List;

public class DemandMaterials {
    private String personNo;
    private String receivingAddress;
    private String phoneNum;
    private String other;
//    private List<Materials> material;
    private List<String > materials;
    private List<Integer> num;

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public void setMaterials(List<String> materials) {
        this.materials = materials;
    }

    public List<Integer> getNum() {
        return num;
    }

    public void setNum(List<Integer> num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DemandMaterials{" +
                "personNo='" + personNo + '\'' +
                ", receivingAddress='" + receivingAddress + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", other='" + other + '\'' +
                ", materials=" + materials +
                ", num=" + num +
                '}';
    }
}
