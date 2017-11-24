/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.ResultSet;
import DAL.DALDangNhap;
import duan.Duan;
import static duan.Duan.frmMain;
import static duan.Duan.frmDN;
import duan.frmDangNhap;
import javax.swing.JOptionPane;

/**
 *
 * @author Uzu
 */
public class BLLDangNhap {
    public static void DangNhap(String tendangnhap,String matkhau){
        ResultSet rs = DAL.DALDangNhap.selectTaiKhoan(tendangnhap,matkhau);
         try {
            if(rs.next()){
                Duan.ThongBao("Đăng Nhập Thành Công", "Thông Báo");
                frmMain.setVisible(true);
                frmDN.setVisible(false);
                if (frmDangNhap.chbGhiNho1.isSelected()) {
                } 
                else {
                frmDangNhap.pwfMK.setText("");
                }
            }
            else{
                Duan.ThongBao("Tên Đăng Nhập Hoặc Mật Khẩu Không Hợp Lệ", "Thông Báo" + JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
        }
    }
}
