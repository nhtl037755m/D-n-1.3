/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.MyCombobox;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Administrator
 */
public class Combobox {
    //Đổ dữ liệu vào JCombobox
    public static void FillDataToCombobox(JComboBox cbb,ResultSet rs){
        try {
            DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
            while(rs.next()){
                MyCombobox item = new MyCombobox(
                        rs.getString(1),  //Giá trị hiển thị (Text)
                        rs.getString(2)); //Giá trị thao tác với CSDL (value - thường là mã) 
                cbbModel.addElement(item);
            }
            cbb.setModel(cbbModel);
        } catch (SQLException ex) {
            System.out.println("Lỗi xảy ra: " + ex.getMessage());
        }
    }
    
    // SetCbbQuyen
    public static void SetCbbClicked(String TenSet, JComboBox CbbSet){
        for(int i = 0; i < CbbSet.getItemCount(); i++){
            Object obj = CbbSet.getItemAt(i);
            MyCombobox cbb = (MyCombobox)obj;
            if(cbb.Text.equals(TenSet)){
                CbbSet.setSelectedIndex(i);
            }
        }
    }
}
