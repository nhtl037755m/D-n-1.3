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
}
