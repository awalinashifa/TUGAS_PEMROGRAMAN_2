/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_6_setter_getter;

/**
 *
 * @author macbook
 */
public class main {
    public static void main(String[] args) {
// Kode ini ditulis di dalam method main

// membuat objek dari class User
user syifa = new user();

// menggunakan method setter
syifa.setUsername("syifa");
syifa.setPassword("kopiJava");

// menggunakan method getter
System.out.println("Username: " + syifa.getUsername());
System.out.println("Password: " + syifa.getPassword());

    }
}