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
public class main {
    public static void main(String[] args) {

        user u = new user();
        user_parameter up = new user_parameter("Awalina");

        u.info();               // tanpa parameter
        u.info(up.nama);        // dengan parameter
    }
}

