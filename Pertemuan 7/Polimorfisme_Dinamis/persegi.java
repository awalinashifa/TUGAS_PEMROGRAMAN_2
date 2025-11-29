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
public class persegi extends bangun_datar {
    int sisi;

    public persegi (int sisi){
        this.sisi = sisi;
    }
            
    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling() {
        return this.sisi * 4;
    }
}
