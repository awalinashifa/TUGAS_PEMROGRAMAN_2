/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pemrograman2;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author x260
 */
public class TransaksiHelpe {
    // Saat gambar produk diklik

    public static void setProduk(
            Product produk,
            JTextField txtNamaProduk,
            JLabel txtHargaProduk,
            JTextField txtJumlahPembelian
    ) {
        txtNamaProduk.setText(produk.getNama());
        txtHargaProduk.setText(String.valueOf(produk.getHarga()));
        txtJumlahPembelian.setText(""); // user isi sendiri
    }

    // Hitung total otomatis
    public static void hitungTotal(
            JTextField txtHargaProduk,
            JTextField txtJumlahPembelian,
            JTextField txtTotalHarga
    ) {
        if (txtJumlahPembelian.getText().isEmpty()) {
            txtTotalHarga.setText("");
            return;
        }

        int harga = Integer.parseInt(txtHargaProduk.getText());
        int jumlah = Integer.parseInt(txtJumlahPembelian.getText());

        int total = harga * jumlah;
        txtTotalHarga.setText(String.valueOf(total));
    }
}
