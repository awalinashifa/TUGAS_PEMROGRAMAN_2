/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_inheritance;

/**
 *
 * @author pc18
 */
public class zombie extends enemy {

    // Constructor
    public zombie(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Override method walk
    public void walk() {
        System.out.println("Zombie jalan-jalan");
    }
}

