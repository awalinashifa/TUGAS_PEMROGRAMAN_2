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
public class phone_user {

    private phone phone;

    public phone_user(phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        phone.powerOn();
    }

    void turnOffThePhone() {
        phone.powerOff();
    }

    void makePhoneLouder() {
        phone.volumeUp();
    }

    void makePhoneSilent() {
        phone.volumeDown();
    }
}
