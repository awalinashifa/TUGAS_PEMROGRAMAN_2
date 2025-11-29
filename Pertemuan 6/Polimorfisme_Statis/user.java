/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_6_polimorfisme_statis;

/**
 *
 * @author macbook
 */
public class user {

    // overloading 1
    public void info() {
        System.out.println("User tanpa nama");
    }

    // overloading 2
    public void info(String nama) {
        System.out.println("Nama: " + nama);
    }
}

