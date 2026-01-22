/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_9;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author macbook
 */
public class insert {
    
    koneksi konek = new koneksi();
   

    public void insert(String nim, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            //String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "insert into dataMahasiswa values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    } 
    
    public static void main(String[] args) {
        insert tambah = new insert ();
        tambah.insert("1008", "Awalina Shifa Fi Yahya", "Ds. Menjangan Kalung, Desa Slorok, Kecamatan Garum, Kabupaten Blitar", "F");
    }
}
