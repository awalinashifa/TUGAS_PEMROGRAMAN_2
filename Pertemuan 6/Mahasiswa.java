/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_6;

/**
 *
 * @author macbook
 */
public class Mahasiswa {

    String nama;
    String nim;

    // Constructor memakai this
    public Mahasiswa(String nama, String nim) {
        this.nama = nama; // this membedakan variabel class dan parameter
        this.nim = nim;
    }

    // Method memakai this
    public void tampilkan() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM : " + this.nim);
    }
}
