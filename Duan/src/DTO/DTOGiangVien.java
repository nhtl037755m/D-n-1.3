/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author NK
 */
public class DTOGiangVien {
    String maGiangVien, tenGiangVien, soDienThoai, diaChi, chuyenNganh, ngaySinh, hinhAnh;

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    
    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public DTOGiangVien() {
    }

    public DTOGiangVien(String maGiangVien, String tenGiangVien, String soDienThoai, String diaChi, String chuyenNganh, String ngaySinh, String hinhAnh) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.chuyenNganh = chuyenNganh;
        this.ngaySinh = ngaySinh;
        this.hinhAnh = hinhAnh;
    }

    public DTOGiangVien(String tenGiangVien, String soDienThoai, String diaChi, String chuyenNganh, String ngaySinh, String hinhAnh) {
        this.tenGiangVien = tenGiangVien;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.chuyenNganh = chuyenNganh;
        this.ngaySinh = ngaySinh;
        this.hinhAnh = hinhAnh;
    }
    
    
}
