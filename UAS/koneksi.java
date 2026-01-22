/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pemrograman2;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author ASUS
 */
public class koneksi {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost/valerie_fashion";
            String user = "root";
            String pass = "";
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        Connection c = getConnection();
    }

}
