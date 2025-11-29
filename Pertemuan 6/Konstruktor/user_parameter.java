/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_6_konstruktor;

/**
 *
 * @author macbook
 */
public class user_parameter {
    String nama;

    public user_parameter(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama: " + nama);
    }
}

