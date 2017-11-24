/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan;

import DAL.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import duan.frmMain;

/**
 *
 * @author Admin
 */

public class Duan {
     public static DBConnection connection = new DBConnection();
    /**
     * @param args the command line arguments
     */
    public static frmDangNhap frmDN = new frmDangNhap();
    public static frmMain frmMain = new frmMain(); 
    public static void main(String[] args) {
        frmMain.setVisible(true);
//          frmDangNhap frDN = new frmDangNhap();
//          frDN.setVisible(true);
    }
    public static void ThongBao(String tieuDe, String noiDung){
        JOptionPane.showMessageDialog(new JFrame(), tieuDe, noiDung, 0);
    }
}
