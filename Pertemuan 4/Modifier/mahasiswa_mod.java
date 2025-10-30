/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_4_modifier;

import pertemuan_3.*;

public class mahasiswa_mod {
    String nim = "";
    String nama = "";
    double ipk = 0;
    String predikat = "";

    // Konstruktor
    public mahasiswa_mod(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public void tampilData(String keterangan) {
        System.out.println("\n" + keterangan);
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
    }

    public String Predikat() {
        if (ipk >= 3.5) {
            predikat = "Cumlaude";
        } else if (ipk >= 3.0) {
            predikat = "Sangat Memuaskan";
        } else if (ipk >= 2.5) {
            predikat = "Memuaskan";
        } else {
            predikat = "Cukup";
        }
        return predikat;
    }

    public void updateIPK(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    public String hitungPredikat(double ipkInput) {
        if (ipkInput >= 3.5) {
            return "Cumlaude";
        } else if (ipkInput >= 3.0) {
            return "Sangat Memuaskan";
        } else if (ipkInput >= 2.5) {
            return "Memuaskan";
        } else {
            return "Cukup";
        }
    }
}
