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
}
