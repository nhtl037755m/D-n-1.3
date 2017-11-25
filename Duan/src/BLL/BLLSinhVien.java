/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Uzu
 */
public class BLLSinhVien {
    public static void SelectSinhVien(DefaultTableModel tableModel1){
        Object[] item = new Object[20];
        tableModel1.setRowCount(0);
        try {
            ResultSet rs = DAL.DALSinhVien.ShowSinhVien();
            while(rs.next()){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date = new Date();
                int Row = tableModel1.getRowCount();
                item[0] = Row + 1;
                item[1] = rs.getString("Masinhvien");
                item[2] = rs.getString("Tensinhvien");
                item [3] = BLL.DateService.FormatDate(rs.getString("Ngaysinh"));
                item[4] = rs.getString("Diachi");
                item[5] = rs.getString("SoCMND");
                item[6] = rs.getString("Sodienthoai");
                String GT = rs.getString("Gioitinh");
                if(GT.equals("0")){
                    item[7] = "Nam";
                } else {
                    item[7] = "Nữ";
                }
                item[8] = rs.getString("Phuhuynh");
                
                item[9] = rs.getString("Nganhhoc");
                item[10] = rs.getString("Chuyennganh");
                item[11] = BLL.DateService.FormatDate(rs.getString("Ngaynhaphoc"));
                item[12] = rs.getString("Tinhtranghoc");
                item[13] = rs.getString("Cacmondaqua");
                item[14] = rs.getString("Cacmonconno");
                item[15] = rs.getString("Cacmonhoclai");
                item[16] = rs.getString("Somonqua");
                item[17] = rs.getString("Somonno");
                item[18] = rs.getString("Somoncon");
                item[19] = rs.getString("Hinhanh");
                tableModel1.addRow(item);
            }
        } catch (Exception e) {
        }
    }
}
