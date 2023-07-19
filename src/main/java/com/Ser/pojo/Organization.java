package com.Ser.pojo;

public class Organization {
    private String email;
    private String orgName;
    private String address;
    private String particularAddress;
    private String organizationType;
    private String orgPassword;
    private String orgOther;
    private String beVolunteer;
//    是否登录成功
    private Boolean isLogRight = false;

    public void setLogRight(boolean logRight){
        this.isLogRight = logRight;
    }

    public Boolean getLogRight() {
        return isLogRight;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "email='" + email + '\'' +
                ", orgName='" + orgName + '\'' +
                ", address='" + address + '\'' +
                ", particularAddress='" + particularAddress + '\'' +
                ", organizationType='" + organizationType + '\'' +
                ", orgPassword='" + orgPassword + '\'' +
                ", orgOther='" + orgOther + '\'' +
                ", beVolunteer='" + beVolunteer + '\'' +
                ", isLogRight=" + isLogRight +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParticularAddress() {
        return particularAddress;
    }

    public void setParticularAddress(String particularAddress) {
        this.particularAddress = particularAddress;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrgPassword() {
        return orgPassword;
    }

    public void setOrgPassword(String orgPassword) {
        this.orgPassword = orgPassword;
    }

    public String getOrgOther() {
        return orgOther;
    }

    public void setOrgOther(String orgOther) {
        this.orgOther = orgOther;
    }

    public String getBeVolunteer() {
        return beVolunteer;
    }

    public void setBeVolunteer(String beVolunteer) {
        this.beVolunteer = beVolunteer;
    }
}
