package com.Ser.pojo;

public class Materials {
    private String materials;
    private int num;

    @Override
    public String toString() {
        return "Materials{" +
                "materials='" + materials + '\'' +
                ", num=" + num +
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
}
