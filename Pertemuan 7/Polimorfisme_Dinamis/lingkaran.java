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
public class lingkaran extends bangun_datar {
    int r;

    public lingkaran (int r){
        this.r = r;
    }
    
    @Override
    public float luas() {
        return (float) Math.PI * r * r;
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

