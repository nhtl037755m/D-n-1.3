/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author CUONGNP
 * 1. Lớp cấu hình để kết nối CSDL
 * 2. Hai hàm thực thi dữ liệu
 *   - Thực thi câu lệnh SELECT
 *   - Thực thi 3 câu lệnh INSERT, UPDATE, DELETE
 */
public class DBConnection {
    //Tạo chuỗi kết nối
    String connectionString = "jdbc:sqlserver://ADMIN-PC:1433;DatabaseName=DuAn;"
            + "user=sa; password=123456";
    //Tạo biến kết nối
    Connection conn;
    
    public DBConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionString);
            if(conn != null){
                System.out.println("Kết nối CSDL thành công");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi JDBC: " + ex.getMessage() );
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối CSDL: " + ex.getMessage());
        }                     
    }
    
    //Hàm thực thi câu lệnh SELECT
    public ResultSet ExcuteQuerySelect(String query){
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query); // Thực thi truy vấn SELECT
            return rs;  //Trả về ResultSet
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn. " + ex.getMessage());
        }
        return null; //Trả về null nếu lỗi
    }
    //Hàm thực thi câu INSERT, DELETE, UDPATE
    public int ExcuteNonQuery(String query){
        try {
            Statement stmt = conn.createStatement();
            int kq = stmt.executeUpdate(query); //Thực thi câu truy vấn và trả về kết quả
            return kq; 
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn: " + ex.getMessage());
        }
        return -1;
    }
}
