/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_7_interface;

/**
 *
 * @author macbook
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        phone Redmi3Pro = new xiaomi();

        phone_user syifa = new phone_user(Redmi3Pro);

        syifa.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi = null;

        while (true) {
            System.out.println("====== APLIKASI INTERFACE ======");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.print("Pilih Aksi: ");

            aksi = input.nextLine();

            if (aksi.equals("1")) {
                syifa.turnOnThePhone();

            } else if (aksi.equals("2")) {
                syifa.turnOffThePhone();

            } else if (aksi.equals("3")) {
                syifa.makePhoneLouder();

            } else if (aksi.equals("4")) {
                syifa.makePhoneSilent();

            } else if (aksi.equals("0")) {
                System.exit(0);
            }
        }
    }
}
