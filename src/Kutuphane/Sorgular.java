package Kutuphane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sorgular {

    DB db = new DB();
    Validator vld = new Validator();

    public boolean urunEkle(UrunlerProperty up) {

        try {
            String query = "insert into Urunler values(" + up.getUrunID() + ",'" + up.getUrunAdi() + "','" + up.getuAlis() + "','" + up.getuSatis() + "','" + up.getStok() + "','" + up.getkID() + "','" + up.getKullaniciID() + "')";
            int yazsonuc = db.baglan().executeUpdate(query);
            if (yazsonuc > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("sorgu hatası: " + ex);
        } finally {
            db.kapat();
        }
        return false;
    }

    public ArrayList<UrunlerProperty> urunlerDataGetir() {
        ArrayList<UrunlerProperty> urunler = new ArrayList<>();
        try {
            String query = "select * from Urunler inner join Kategoriler where Urunler.kID=Kategoriler.kID";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                UrunlerProperty up = new UrunlerProperty();
                up.setUrunID(rs.getString("urunID"));
                up.setUrunAdi(rs.getString("urunAdi"));
                up.setuAlis(rs.getString("uAlis"));
                up.setuSatis(rs.getString("uSatis"));
                up.setStok(rs.getString("stok"));
                up.setkID(rs.getString("kID"));
                up.setkullaniciID(rs.getString("kullaniciID"));
                up.setkAdi(rs.getString("kAdi"));
                urunler.add(up);
            }
        } catch (SQLException e) {
            System.err.println("sorgu hatası:" + e);
        } finally {
            db.kapat();
        }
        return urunler;
    }

    public ArrayList<KategorilerProperty> kategorilerDataGetir() {
        ArrayList<KategorilerProperty> kategoriler = new ArrayList<>();
        try {
            String query = "select * from Kategoriler";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                KategorilerProperty kp = new KategorilerProperty();
                kp.setkID(rs.getString("kID"));
                kp.setkAdi(rs.getString("kAdi"));
                kategoriler.add(kp);
            }
        } catch (SQLException e) {
            System.err.println("sorgu hatası:" + e);
        } finally {
            db.kapat();

        }
        return kategoriler;
    }

    public boolean kategoriEkle(KategorilerProperty kp) {

        try {
            String query = "insert into Kategoriler values(" + kp.getkID() + ",'" + kp.getkAdi() + "')";
            int yazsonuc = db.baglan().executeUpdate(query);
            if (yazsonuc > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("sorgu hatası: " + ex);
        } finally {
            db.kapat();
        }
        return false;
    }

    public int urunSil(String id) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("delete from Urunler where UrunID='" + id + "'");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public int kategoriSil(String id) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("delete from Kategoriler where kID='" + id + "'");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public int urunGuncelle(UrunlerProperty up) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("update Urunler set UrunAdi='" + up.getUrunAdi() + "',uAlis='" + up.getuAlis() + "',uSatis='" + up.getuSatis() + "',stok='" + up.getStok() + "',kID='" + up.getkID() + "',KullaniciID='" + up.getKullaniciID() + "' where UrunID='" + up.getUrunID() + "'");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public int stokGuncelle(String urunid, String stok) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("update Urunler set stok='" + stok + "' where UrunID='" + urunid + "'");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public int kategoriGuncelle(KategorilerProperty kp) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("update Kategoriler set kAdi='" + kp.getkAdi() + "' where kID='" + kp.getkID() + "'");
        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public ArrayList<UrunlerProperty> filtrele(String kid, String min, String max, String arama) {
        ArrayList<UrunlerProperty> urunler = new ArrayList<>();
        try {
            String query = "select * from Urunler inner join Kategoriler on Urunler.kID=Kategoriler.kID where";
            if (!arama.equals("")) {
                query += " UrunAdi like '%" + arama + "%'";
                if (!kid.equals("") || (!min.equals("") && !max.equals(""))) {
                    query += " and ";
                }
            }
            if (!kid.equals("")) {
                query += " Urunler.kID='" + kid + "'";

            }
            if (!min.equals("") && !max.equals("")) {
                query += " and (uSatis between '" + min + "' and '" + max + "')";
            }
            System.out.println(query);
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                UrunlerProperty up = new UrunlerProperty();
                up.setUrunID(rs.getString("urunID"));
                up.setUrunAdi(rs.getString("urunAdi"));
                up.setuAlis(rs.getString("uAlis"));
                up.setuSatis(rs.getString("uSatis"));
                up.setStok(rs.getString("stok"));
                up.setkID(rs.getString("kID"));
                up.setkullaniciID(rs.getString("kullaniciID"));
                up.setkAdi(rs.getString("kAdi"));
                urunler.add(up);
            }
        } catch (SQLException e) {
            System.err.println("sorgu hatası:" + e);
        } finally {
            db.kapat();

        }
        return urunler;
    }

    public ArrayList<MusterilerProperty> musterilerDataGetir() {
        ArrayList<MusterilerProperty> musteriler = new ArrayList<>();
        try {
            String query = "select * from Musteriler";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                MusterilerProperty mp = new MusterilerProperty();
                mp.setmID(rs.getString("mID"));
                mp.setmAdi(rs.getString("mAdi"));
                mp.setmSoyadi(rs.getString("mSoyadi"));
                mp.setmTelefon(rs.getString("mTelefon"));
                mp.setmMail(rs.getString("mMail"));
                mp.setmAdres(rs.getString("mAdres"));
                musteriler.add(mp);
            }
        } catch (SQLException e) {
            System.err.println("sorgu hatası:" + e);
        } finally {
            db.kapat();
        }
        return musteriler;
    }

    public boolean musteriEkle(MusterilerProperty mp) {

        try {
            String query = "insert into Musteriler values( null,'" + mp.getmAdi() + "','" + mp.getmSoyadi() + "','" + mp.getmTelefon() + "','" + mp.getmMail() + "','" + mp.getmAdres() + "')";
            int yazsonuc = db.baglan().executeUpdate(query);
            if (yazsonuc > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("sorgu hatası: " + ex);
        } finally {
            db.kapat();
        }
        return false;
    }

    public boolean satisEkle(SatisProperty sp) {
        try {
            String query = "insert into Satis values( null,'" + sp.getmID() + "','" + sp.getuID() + "','" + sp.getAdet() + "','" + sp.getAdetTutar() + "','" + sp.getTarih() + "')";
            int yazsonuc = db.baglan().executeUpdate(query);
            if (yazsonuc > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("sorgu hatası: " + ex);
        } finally {
            db.kapat();
        }
        return false;
    }

    public int musteriSil(String id) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("delete from Musteriler where mID='" + id + "'");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public int musteriGuncelle(MusterilerProperty mp) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("update Musteriler set mAdi='" + mp.getmAdi() + "',mSoyadi='" + mp.getmSoyadi() + "',mTelefon='" + mp.getmTelefon() + "',mMail='" + mp.getmMail() + "',mAdres='" + mp.getmAdres() + "' where mID='" + mp.getmID() + "'");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public int parolaGuncelle(KullanicilarProperty kp) {
        int i = 0;
        try {
            i = db.baglan().executeUpdate("update Kullanicilar set kParola='" + kp.getkParola() + "' where kullaniciID='" + kp.getkID() + "'");
        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.kapat();
        }
        return i;
    }

    public boolean KullaniciEkle(KullanicilarProperty kp) {

        try {
            String query = "insert into Kullanicilar values( null,'" + kp.getkAdi() + "','" + kp.getkParola() + "')";
            int yazsonuc = db.baglan().executeUpdate(query);
            if (yazsonuc > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("sorgu hatası: " + ex);
        } finally {
            db.kapat();
        }
        return false;
    }

    public ArrayList<SatisProperty> SatislarFiltrele(String kid, String min, String max, String arama, boolean tümünügetir) {
        ArrayList<SatisProperty> satislar = new ArrayList<>();
        try {
            String query = "select * from Satis inner join Musteriler  on Satis.mID=Musteriler.mID inner join Urunler on  Satis.uID=Urunler.UrunID inner join Kategoriler on Kategoriler.kID=Urunler.kID";
            if (!tümünügetir) {
                query += " where";
                if (!arama.equals("")) {
                    query += " (Musteriler.mAdi like '%" + arama + "%' or Musteriler.mSoyadi like '%" + arama + "%' or Musteriler.mTelefon like '%" + arama + "%' or Urunler.urunAdi like '%" + arama + "%' or Satis.tarih like '%" + arama + "%')";
                    if (!kid.equals("") || (!min.equals("") && !max.equals(""))) {
                        query += " and ";
                    }
                }
                if (!kid.equals("")) {
                    query += " (Kategoriler.kID='" + kid + "')";
                }
                if (!min.equals("") && !max.equals("")) {
                    if (!kid.equals("")) {
                        query += " and (Satis.tarih between '" + min + "' and '" + max + "') order by  Satis.tarih";
                    } else {
                        query += " (Satis.tarih between '" + min + "' and '" + max + "') order by  Satis.tarih";
                    }
                }
            }else
                query+=" order by  Satis.tarih";
            System.out.println(query);
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                SatisProperty sp = new SatisProperty();
                sp.setmAdi(rs.getString("mAdi"));
                sp.setmSoyadi(rs.getString("mSoyadi"));
                sp.setmTelefon(rs.getString("mTelefon"));
                sp.setUrunAdi(rs.getString("urunAdi"));
                sp.setAdet(rs.getString("adet"));
                sp.setAdetTutar(rs.getString("adetTutar"));
                sp.setkAdi(rs.getString("kAdi"));
                sp.setTarih(rs.getString("tarih"));
                sp.setuAlis(rs.getString("uAlis"));
                satislar.add(sp);
            }
        } catch (SQLException e) {
            System.err.println("sorgu hatası:" + e);
        } finally {
            db.kapat();

        }
        return satislar;
    }
}
