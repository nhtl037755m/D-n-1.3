/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.ResultSet;

/**
 *
 * @author NK
 */
public class DALGiangVien {
    //Lấy tất cả thông tin bảng Giảng viên
    public static ResultSet GetAllGiangVien(){
        String query = "SELECT * FROM dbo.GiangVien";
        return duan.Duan.connection.ExcuteQuerySelect(query);
    }
    
    //Tìm kiếm bằng mã
    public static ResultSet TimKiemBangMa(String TuKhoa){
        String query = "SELECT * FROM dbo.Giangvien WHERE Magiangvien like N'%" + TuKhoa + "%'";
        return duan.Duan.connection.ExcuteQuerySelect(query);
    }
    
    //Tìm kiếm bằng tên
    public static ResultSet TimKiemBangTen(String TuKhoa){
        String query = "SELECT * FROM dbo.Giangvien WHERE Tengiangvien like N'%" + TuKhoa + "%'";
        return duan.Duan.connection.ExcuteQuerySelect(query);
    }
    
    //Tìm kiếm bằng chuyên ngành
    public static ResultSet TimKiemBangChuyenNganh(String TuKhoa){
        String query = "SELECT * FROM dbo.Giangvien WHERE Chuyennganh like N'%" + TuKhoa + "%'";
        return duan.Duan.connection.ExcuteQuerySelect(query);
    }
}
