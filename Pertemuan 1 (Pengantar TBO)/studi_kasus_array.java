/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan_1_pengantar_PBO;

/**
 *
 * @author pc14
 */
import java.util.Scanner;

public class studi_kasus_array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        int total = 0;
        double rataRata;
        String kategori;

        System.out.println("Masukkan nilai untuk 5 mata pelajaran:");

        // Input nilai & hitung total dengan perulangan
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai mata pelajaran ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        // Hitung rata-rata
        rataRata = (double) total / nilai.length;

        // Tentukan kategori dengan percabangan
        if (rataRata >= 85) {
            kategori = "Sangat Baik";
        } else if (rataRata >= 70) {
            kategori = "Baik";
        } else if (rataRata >= 50) {
            kategori = "Cukup";
        } else {
            kategori = "Kurang";
        }

        // Output hasil
        System.out.println("\n=== Hasil Penilaian ===");
        System.out.print("Nilai: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        System.out.println("\nRata-rata: " + rataRata);
        System.out.println("Kategori: " + kategori);

        input.close();
    }
}
