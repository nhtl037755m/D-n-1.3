/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.ResultSet;

/**
 *
 * @author Uzu
 */
public class DALDangNhap {
    public static ResultSet selectTaiKhoan(String tendangnhap,String matkhau){
        String caulenh = "Select * from TaiKhoan where Tendangnhap='"+tendangnhap+"' and Matkhau ='"+matkhau+"' ";
        return duan.Duan.connection.ExcuteQuerySelect(caulenh);
    }
}
