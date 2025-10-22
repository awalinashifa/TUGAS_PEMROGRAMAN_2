/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_modifier;

/**
 *
 * @author pc18
 */
 class mahasiswa_modifier{
 
    private String nim = "";
    private String nama = "";
    private double ipk = 0;
    private String predikat = "";

    // Konstruktor
    public mahasiswa_modifier ( String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    // Prosedur dengan parameter: tampilkan data + keterangan
    public void tampilData(String keterangan) {
        System.out.println("\n" + keterangan);
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
    }

    // Fungsi tanpa parameter: mengembalikan predikat berdasar ipk atribut
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

    //  Prosedur dengan parameter: update IPK mahasiswa
    public void updateIPK(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    //  Fungsi dengan parameter: hitung predikat berdasarkan IPK yang diberikan
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
