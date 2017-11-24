/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Uzu
 */
public class DTODangKy {
    String tendangnhap,matkhau,email;
    int magiangvien,macanbo,maquyen;

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMagiangvien() {
        return magiangvien;
    }

    public void setMagiangvien(int magiangvien) {
        this.magiangvien = magiangvien;
    }

    public int getMacanbo() {
        return macanbo;
    }

    public void setMacanbo(int macanbo) {
        this.macanbo = macanbo;
    }

    public int getMaquyen() {
        return maquyen;
    }

    public void setMaquyen(int maquyen) {
        this.maquyen = maquyen;
    }

    public DTODangKy(String tendangnhap, String matkhau, String email, int magiangvien, int macanbo, int maquyen) {
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.email = email;
        this.magiangvien = magiangvien;
        this.macanbo = macanbo;
        this.maquyen = maquyen;
    }

  
}
