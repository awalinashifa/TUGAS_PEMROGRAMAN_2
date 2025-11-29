/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_7_polimorfisme_dinamis;

/**
 *
 * @author macbook
 */
public class main_utama {

    public static void main(String[] args) {

        bangun_datar bangunD = new bangun_datar();
        persegi persegi = new persegi(5);
        segitiga segitiga = new segitiga(5, 10);
        lingkaran lingkaran = new lingkaran(10);

        // panggil method luas dan keliling
        bangunD.luas();
        bangunD.keliling();

        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());

        System.out.println("Luas Segitiga : " + segitiga.luas());

        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }
}

