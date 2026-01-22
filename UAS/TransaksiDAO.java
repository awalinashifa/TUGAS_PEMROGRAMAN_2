/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pemrograman2;

/**
 *
 * @author x260
 */
import java.util.List;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TransaksiDAO {

    // INSERT
    public static void insertTransaksi(
            String namaPembeli,
            int idProduk,
            int jumlah,
            int totalHarga
    ) {
        String sql = "INSERT INTO transaksi (nama_pembeli, id_produk, jumlah, total_harga) VALUES (?,?,?,?)";
        try (Connection c = koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, namaPembeli);
            ps.setInt(2, idProduk);
            ps.setInt(3, jumlah);
            ps.setInt(4, totalHarga);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // SELECT (UNTUK ADMIN)
    public static void loadTransaksi(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        String sql = "SELECT t.kode_transaksi, t.nama_pembeli, p.nama_produk, t.jumlah, t.tanggal_transaksi "
                + "FROM transaksi t JOIN produk p ON t.id_produk = p.id_produk";

        try (Connection c = koneksi.getConnection();
                Statement s = c.createStatement();
                ResultSet r = s.executeQuery(sql)) {

            while (r.next()) {
                model.addRow(new Object[]{
                    r.getInt("kode_transaksi"),
                    r.getString("nama_pembeli"),
                    r.getString("nama_produk"),
                    r.getInt("jumlah"),
                    r.getTimestamp("tanggal_transaksi")
                });
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // DELETE
    public static void deleteTransaksi(int kode) {
        String sql = "DELETE FROM transaksi WHERE kode_transaksi=?";
        try (Connection c = koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, kode);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateNamaPembeli(int kodeTransaksi, String namaPembeli) {
        String sql = "UPDATE transaksi SET nama_pembeli=? WHERE kode_transaksi=?";

        try (Connection c = koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, namaPembeli);
            ps.setInt(2, kodeTransaksi);

            int hasil = ps.executeUpdate();
            if (hasil > 0) {
                JOptionPane.showMessageDialog(null, "Nama pembeli berhasil diubah");
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal update: " + e.getMessage());
        }
    }

    // UPDATE
    public static void updateTransaksi(
            int kode,
            String namaPembeli,
            int jumlah
    ) {
        String sql = "UPDATE transaksi SET nama_pembeli=? WHERE kode_transaksi=?";
        try (Connection c = koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, namaPembeli);
            ps.setInt(2, jumlah);
            ps.setInt(3, kode);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void loadHistorisPembelian(
            JTable table,
            String namaPembeli
    ) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        String sql = "SELECT p.nama_produk, t.jumlah, t.total_harga, t.tanggal_transaksi "
                + "FROM transaksi t JOIN produk p ON t.id_produk = p.id_produk "
                + "WHERE t.nama_pembeli = ? "
                + "ORDER BY t.tanggal_transaksi DESC";

        try (Connection c = koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, namaPembeli);
            ResultSet r = ps.executeQuery();

            int no = 1;
            while (r.next()) {
                model.addRow(new Object[]{
                    no++,
                    r.getString("nama_produk"),
                    r.getInt("jumlah"),
                    r.getInt("total_harga"),
                    r.getTimestamp("tanggal_transaksi")
                });
            }

        } catch (Exception e) {
            System.out.println("Load historis gagal: " + e.getMessage());
        }
    }

    public static void loadTransaksiAdmin(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        String sql = "SELECT t.nama_pembeli, p.nama_produk, t.jumlah, "
                + "t.tanggal_transaksi, t.kode_transaksi "
                + "FROM transaksi t "
                + "JOIN produk p ON t.id_produk = p.id_produk "
                + "ORDER BY t.tanggal_transaksi DESC";

        try (Connection c = koneksi.getConnection();
                Statement s = c.createStatement();
                ResultSet r = s.executeQuery(sql)) {

            while (r.next()) {
                model.addRow(new Object[]{
                    r.getString("nama_pembeli"),
                    r.getString("nama_produk"),
                    r.getInt("jumlah"),
                    r.getTimestamp("tanggal_transaksi"),
                    r.getInt("kode_transaksi")
                });
            }

        } catch (Exception e) {
            System.out.println("Gagal load transaksi admin: " + e.getMessage());
        }
    }

    public static void updateProdukById(int idProduk, String namaProduk, int harga) {
        try {
            String sql = "UPDATE produk SET nama_produk = ?, harga = ? WHERE id_produk = ?";
            Connection conn = koneksi.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, namaProduk);
            pst.setInt(2, harga);
            pst.setInt(3, idProduk);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data produk berhasil diperbarui");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal update: " + e.getMessage());
        }
    }

    public static int getHargaProdukById(int idProduk) {
        int harga = 0;
        String sql = "SELECT harga FROM produk WHERE id_produk = ?";

        try (Connection c = koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idProduk);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                harga = rs.getInt("harga");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return harga;
    }

    public static List<Product> getAllProduk() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT id_produk, nama_produk, harga FROM produk";

        try (Connection c = koneksi.getConnection();
                Statement s = c.createStatement();
                ResultSet r = s.executeQuery(sql)) {

            while (r.next()) {
                list.add(new Product(
                        r.getInt("id_produk"),
                        r.getString("nama_produk"),
                        r.getInt("harga")
                ));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return list;
    }

}
