package com.example.chamsocvalamdep.Model;

public class danhMucAll {


    public int getIdDanhMuc() {
        return idDanhMuc;
    }

    public void setIdDanhMuc(int idDanhMuc) {
        this.idDanhMuc = idDanhMuc;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
    private int idDanhMuc;
    private int hinhAnh;

    public danhMucAll(int idDanhMuc, int hinhAnh, String tenDanhMuc) {
        this.idDanhMuc = idDanhMuc;
        this.hinhAnh = hinhAnh;
        this.tenDanhMuc = tenDanhMuc;
    }

    private String tenDanhMuc;
}
