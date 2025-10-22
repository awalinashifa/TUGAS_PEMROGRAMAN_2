/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_inheritance;

/**
 *
 * @author pc18
 */
public class burung extends enemy {

    // Constructor
    public burung(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Override method walk
    public void walk() {
        System.out.println("Burung berjalan");
    }

    // Override method jump
    public void jump() {
        System.out.println("Burung loncat-loncat");
    }

    // Method baru untuk terbang
    public void fly() {
        System.out.println("Burung terbang...");
    }
}
