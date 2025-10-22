/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_inheritance;

/**
 *
 * @author pc18
 */
public class main_inheritance {
    public static void main(String[] args) {
        // Membuat objek dari kelas-kelas turunan
        enemy monster = new enemy("Monster", 100, 20);
        zombie zombie = new zombie("Zombie", 80, 15);
        pocong pocong = new pocong("Pocong", 60, 10);
        burung burung = new burung("Burung", 50, 5);

        // Menggunakan method dari objek
        System.out.println(monster.name + ":");
        monster.attack();

        System.out.println(zombie.name + ":");
        zombie.walk();
        zombie.attack();

        System.out.println(pocong.name + ":");
        pocong.jump();
        pocong.attack();

        System.out.println(burung.name + ":");
        burung.walk();
        burung.jump();
        burung.fly();
        burung.attack();
    }
}
