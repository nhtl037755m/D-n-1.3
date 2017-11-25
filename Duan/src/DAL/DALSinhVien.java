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
public class DALSinhVien {
    public static ResultSet ShowSinhVien(){
        String query = "Select * from SinhVien";
        return duan.Duan.connection.ExcuteQuerySelect(query);
    }
}
