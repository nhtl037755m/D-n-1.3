/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TRIEUVVPK00846
 */
public class DateService {
    //Định nghĩa kiểu ngày tháng năm dd/MM/yyyy hoặc dd-MM-yyyy theo ý bạn
    static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//    
//    //Hàm chuyển kiểu Date thành String (chuỗi) ngày theo định dạng ở trên
//    //Đầu vào của hàm là dữ liệu kiểu Date
//    public static String getDateString(Date date){
//        return dateFormat.format(date); //định dạng và trả về chuỗi ngày 
//    }
//
//    //Hàm chuyển kiểu String (chuỗi) thành kiểu Date 
//    //Đầu vào của hàm là chuỗi ngày đúng đình dạng
//    public static Date getDate(String dateString){
//        try {
//            return dateFormat.parse(dateString); 
//        } catch (ParseException ex) {
//            System.out.println("Ngày không hợp lệ." + ex.getMessage());
//        }
//        return null; //Trả về NULL nếu không chuyển được.
//    }
    
    //Lấy ngày của hệ thống
    public static String GetDateOfToday() {
        Date today = new Date(System.currentTimeMillis());
        return dateFormat.format(today.getTime());
    }
    
    //ĐỊnh dạng kiểu Date dd/MM/yyyy
    public static String FormatDate(String date){
        String ngayNhap = date.replaceAll("-", "/");
        Date ngayChuyen = new Date(ngayNhap);
        return dateFormat.format(ngayChuyen);
    }
}
