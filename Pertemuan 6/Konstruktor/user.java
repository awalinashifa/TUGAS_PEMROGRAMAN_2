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
public class user {
    String nama;

    public user() {
        nama = "User Default";
    }

    public void info() {
        System.out.println("Nama: " + nama);
    }
}
