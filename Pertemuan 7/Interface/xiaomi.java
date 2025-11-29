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
public class xiaomi implements phone {

    private int volume;
    private boolean isPowerOn;

    public xiaomi() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone Menyala.....");
        System.out.println("Selamat Datang di XIAOMI PHONE");
        System.out.println("Android Version 100");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone Mati.....");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume Sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Dulu HP-nya Bro......!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume Sudah Mentok Paling Rendah");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume Sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Dulu HP-nya Bro......!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}