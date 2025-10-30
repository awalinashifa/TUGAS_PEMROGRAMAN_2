/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan_2;

/**
 *
 * @author pc14
 */
public class BiodataMahasiswa {
    public static void main(String[] args) {
        MahasiswaAktif mhs = new MahasiswaAktif();
        mhs.nama = "Awalina Shifa Fi Yahya";
        mhs.nim = "2455201008";
        mhs.jurusan = "Ilmu Komputer";

        System.out.println("=== Data Mahasiswa ===");
        mhs.tampilkanData();
        mhs.tampilkanJurusan();
    }
}
