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
public class demo_konstruktor {
    public static void main(String[] args) {

        user u1 = new user();
        u1.info();

        user_parameter u2 = new user_parameter("Awalina");
        u2.info();
    }
}

