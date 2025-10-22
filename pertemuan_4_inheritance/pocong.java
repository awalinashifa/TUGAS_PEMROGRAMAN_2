/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_inheritance;

/**
 *
 * @author pc18
 */
public class pocong extends enemy {

    // Constructor
    public pocong(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Override method jump
    public void jump() {
        System.out.println("Loncat-loncat");
    }
}
