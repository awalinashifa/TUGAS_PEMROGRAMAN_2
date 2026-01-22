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
public class delete {
    
    koneksi konek = new koneksi();
   

    public void delete(int nim) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

              String sql = "delete from dataMahasiswa where nim = '" + nim + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public static void main(String[] args) {
        delete hps = new delete();
        hps.delete(1001);
    }
    
}
