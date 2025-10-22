/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_modifier;

/**
 *
 * @author pc18
 */
public class main_modifier {
    public static void main(String[] args) {
        mahasiswa_modifier m1 = new mahasiswa_modifier("2455201008", "Awalina Shifa Fi Yahya", 3.15);

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
