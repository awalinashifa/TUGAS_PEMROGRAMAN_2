/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_4_inheritance;

/**
 *
 * @author cipa
 */
public class main_inheritance {
    public static void main(String[] args) {
        enemy monster = new enemy();
        zombie jumbi = new zombie();
        pocong cong = new pocong();
        burung garuda = new burung();
        
        jumbi.attackPoint = 20;
        jumbi.hp = 75;
        jumbi.name = "Zombie";
        System.out.println( jumbi.name + ", " + jumbi.hp + ", " + jumbi.attackPoint );
        System.out.println("Action :");
        jumbi.attack();
        jumbi.walk();
        System.out.println("--------------------X--------------------");
        
        cong.attackPoint = 45;
        cong.hp = 40;
        cong.name = "Cong";
        System.out.println( cong.name + ", " + cong.hp + "," + cong.attackPoint );
        System.out.println("Action :");
        cong.attack();
        cong.jump();
        System.out.println("--------------------X--------------------");
        
        monster.attackPoint = 80;
        monster.hp = 100;
        monster.name = "Ciro";
        System.out.println( monster.name + ", " + monster.hp + ", " + monster.attackPoint );
        System.out.println("Action :");
        monster.attack();
        System.out.println("--------------------X--------------------");
        
        garuda.attackPoint = 70;
        garuda.hp = 60;
        garuda.name = "Garuda";
        System.out.println( garuda.name + ", " + garuda.hp + ", " + garuda.attackPoint );
        System.out.println("Action :");
        garuda.fly();
        garuda.jump();
        garuda.walk();
        garuda.attack();
        System.out.println("--------------------X--------------------");
    }
}