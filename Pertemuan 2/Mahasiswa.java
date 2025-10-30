/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author pc14
 */

class Mahasiswa {
    String nama;
    String nim;

    void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }
}

// Class turunan
class MahasiswaAktif extends Mahasiswa {
    String jurusan;

    void tampilkanJurusan() {
        System.out.println("Jurusan : " + jurusan);
    }
}