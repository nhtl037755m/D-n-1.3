/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NK
 */
public class BLLGiangVien {
    // Đổ dữ liệu vào table
    public static void LoadData(DefaultTableModel tableModel){
        Object[] item = new Object[7];
        tableModel.setRowCount(0);
        try {
            ResultSet rs = DAL.DALGiangVien.GetAllGiangVien();
            while(rs.next()){
                int soDong = tableModel.getRowCount();
                item [0] = soDong +1;
                item [1] = rs.getString("Magiangvien");
                item [2] = rs.getString("Tengiangvien");
                item [3] = rs.getString("Diachi");
                item [4] = BLL.DateService.FormatDate(rs.getString("Ngaysinh"));
                item [5] = rs.getString("Sodienthoai");
                item [6] = rs.getString("Chuyennganh");

                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn " + ex.getMessage());
        }
    }
    
    
    //Đổ dữ liệu tìm kiếm bằng Mã
    public static void LoadDataTimKiemBangMa(DefaultTableModel tableModel, ResultSet rsTimBangMa){
        Object[] item = new Object[7];
        tableModel.setRowCount(0);
        try {
            while(rsTimBangMa.next()){
                int soDong = tableModel.getRowCount();
                item [0] = soDong +1;
                item [1] = rsTimBangMa.getString("Magiangvien");
                item [2] = rsTimBangMa.getString("Tengiangvien");
                item [3] = rsTimBangMa.getString("Diachi");
                item [4] = BLL.DateService.FormatDate(rsTimBangMa.getString("Ngaysinh"));
                item [5] = rsTimBangMa.getString("Sodienthoai");
                item [6] = rsTimBangMa.getString("Chuyennganh");

                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn " + ex.getMessage());
        }
    }
    public static ResultSet TimKiemBangMa(String TuKhoa){
        ResultSet rsTimBangMa = DAL.DALGiangVien.TimKiemBangMa(TuKhoa);
        return rsTimBangMa;
    }
    
    //Đổ dữ liệu tìm kiếm bằng tên
    public static void LoadDataTimKiemBangTen(DefaultTableModel tableModel, ResultSet rsTimBangTen){
        Object[] item = new Object[7];
        tableModel.setRowCount(0);
        try {
            while(rsTimBangTen.next()){
                int soDong = tableModel.getRowCount();
                item [0] = soDong +1;
                item [1] = rsTimBangTen.getString("Magiangvien");
                item [2] = rsTimBangTen.getString("Tengiangvien");
                item [3] = rsTimBangTen.getString("Diachi");
                item [4] = BLL.DateService.FormatDate(rsTimBangTen.getString("Ngaysinh"));
                item [5] = rsTimBangTen.getString("Sodienthoai");
                item [6] = rsTimBangTen.getString("Chuyennganh");

                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn " + ex.getMessage());
        }
    }
    public static ResultSet TimKiemBangTen(String TuKhoa){
        ResultSet rsTimBangTen = DAL.DALGiangVien.TimKiemBangTen(TuKhoa);
        return rsTimBangTen;
    }
    
    //Đổ dữ liệu tìm kiếm bằng tên
    public static void LoadDataTimKiemBangChuyenNganh(DefaultTableModel tableModel, ResultSet rsTimBangChuyenNganh){
        Object[] item = new Object[7];
        tableModel.setRowCount(0);
        try {
            while(rsTimBangChuyenNganh.next()){
                int soDong = tableModel.getRowCount();
                item [0] = soDong +1;
                item [1] = rsTimBangChuyenNganh.getString("Magiangvien");
                item [2] = rsTimBangChuyenNganh.getString("Tengiangvien");
                item [3] = rsTimBangChuyenNganh.getString("Diachi");
                item [4] = BLL.DateService.FormatDate(rsTimBangChuyenNganh.getString("Ngaysinh"));
                item [5] = rsTimBangChuyenNganh.getString("Sodienthoai");
                item [6] = rsTimBangChuyenNganh.getString("Chuyennganh");

                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn " + ex.getMessage());
        }
    }
    public static ResultSet TimKiemBangChuyenNganh(String TuKhoa){
        ResultSet rsTimBangChuyenNganh = DAL.DALGiangVien.TimKiemBangChuyenNganh(TuKhoa);
        return rsTimBangChuyenNganh;
    }
}
