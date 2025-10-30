/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_modifier;

import pertemuan_3.*;

/**
 *
 * @author pc17
 */
public class utama_mod {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa("2455201008", "Awalina Shifa Fi Yahya", 3.15);

        // Menampilkan data mahasiswa dengan keterangan
        m1.tampilData("Mahasiswa ke-1");

        // Menampilkan predikat mahasiswa (dari atribut ipk)
        System.out.println("Predikat: " + m1.Predikat());

        // Update IPK dengan prosedur yang punya parameter
        m1.updateIPK(3.90);
        System.out.println("\nSetelah update IPK:");
        m1.tampilData("Mahasiswa ke-1");

        // Hitung predikat dengan fungsi yang menerima parameter IPK baru
        String predikatBaru = m1.hitungPredikat(3.90);
        System.out.println("Predikat baru: " + predikatBaru);
    }
}                                                                                                                                                                                                                                                         
