/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_inheritance;

/**
 *
 * @author pc18
 */
public class enemy {
    String name;
    int hp;
    int attackPoint;

    // Constructor
    public enemy(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    // Method untuk menyerang
    public void attack() {
        System.out.println("Serang!");
    }
}
