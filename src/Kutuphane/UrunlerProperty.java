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
public class UrunlerProperty {

    private String urunID,urunAdi, uAlis, uSatis,stok,kID,kullaniciID,kAdi;
    
    public String getkAdi() {
        return kAdi;
    }

    public void setkAdi(String kAdi) {
        this.kAdi = kAdi;
    }


    public String getUrunID() {
        return urunID;
    }

    public void setUrunID(String urunID) {
        this.urunID = urunID;
    }

    public String getuAlis() {
        return uAlis;
    }

    public void setuAlis(String uAlis) {
        this.uAlis = uAlis;
    }

    public String getuSatis() {
        return uSatis;
    }

    public void setuSatis(String uSatis) {
        this.uSatis = uSatis;
    }

    public String getkID() {
        return kID;
    }

    public void setkID(String kID) {
        this.kID = kID;
    }

    public String getKullaniciID() {
        return kullaniciID;
    }

    public void setkullaniciID(String KullaniciID) {
        this.kullaniciID = KullaniciID;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    
    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

}
