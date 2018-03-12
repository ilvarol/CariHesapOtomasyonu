/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kutuphane;

/**
 *
 * @author ilyas
 */
public class KullanicilarProperty {

    private String kAdi, kParola,kID;
    public static String oturumID= null;
    public static String oturumAdi=null;
    public static String oturumParola=null;

    public String getkID() {
        return kID;
    }

    public void setkID(String kID) {
        this.kID = kID;
    }

    public String getkAdi() {
        return kAdi;
    }

    public void setkAdi(String kAdi) {
        this.kAdi = kAdi;
    }

    public String getkParola() {
        return kParola;
    }

    public void setkParola(char[] p) {
        String parola = String.valueOf(p);
        this.kParola = parola;
    }

}
