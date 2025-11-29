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
public class segitiga extends bangun_datar {
    int alas;
    int tinggi;

    public segitiga (int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
           
    @Override
    public float luas() {
        return (1 / 2 * this.alas) * this.tinggi;
    }
}

