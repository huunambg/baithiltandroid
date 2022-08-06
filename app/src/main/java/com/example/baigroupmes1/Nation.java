package com.example.baigroupmes1;

public class Nation {
    int anh;
    private String tenNuoc,thanhPho;

    public Nation(int anh, String tenNuoc, String thanhPho) {
        this.anh = anh;
        this.tenNuoc = tenNuoc;
        this.thanhPho = thanhPho;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }
}
