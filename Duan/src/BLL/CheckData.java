/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NK
 */
public class CheckData {
    //Định nghĩa kiểu ngày tháng năm dd/MM/yyyy hoặc dd-MM-yyyy theo ý bạn
    static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
    
    //Kiểm tra ngày tháng năm có hợp lệ hay không
    public static boolean CheckDate(String dateString){
        try {
            dateFormat.parse(dateString.replaceAll("-", "/"));
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
    
    //Kiểm tra Email có hợp lệ hay không
    public static boolean CheckEmail(String emailString){
        Pattern regex = Pattern.compile(emailPattern);
        Matcher matcher = regex.matcher(emailString);
        return matcher.find();
    }
    
    //Kiểm tra Số điện thoại có hợp lệ hay không
    public static boolean CheckPhoneNumber(String phoneString){
        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher matcher = pattern.matcher(phoneString);
        if (!matcher.matches()) {
            return false;
        } else
        if (phoneString.length() == 10 || phoneString.length() == 11) {
            if (phoneString.length() == 10) {
                if (phoneString.substring(0, 2).equals("09")) {
                    return true;
                } else {
                    return false;
                }
            } else
            if (phoneString.substring(0, 2).equals("01")) {
                return true;
            } else {
               return false;
            }
        } else {
            return false;
        }
    }
    
    //Kiểm tra CMND có hợp lệ hay không
    public static boolean CheckCMND(String CMNDString){
        if (CMNDString.trim().length() == 9 || CMNDString.trim().length() == 12) {
            try {
                Long.parseLong(CMNDString);
                return true;
            } catch (Exception e) {
                return false;
            }
        } else return false;
    }
}
