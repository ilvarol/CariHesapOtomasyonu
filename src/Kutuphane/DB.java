package Kutuphane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    private final String url = "org.sqlite.JDBC";
    private String db = "jdbc:sqlite:db/";
    private String dbName = "carihesapDB.db";
    private Connection conn = null;
    private Statement st = null;

    public DB() {

    }

    public DB(String dbName) {
        this.dbName = dbName;
    }

    public Statement baglan() {
        try {
            Class.forName(url);//kütüphaneyi çalıştırdık.
            conn = DriverManager.getConnection(db+dbName);
            st = conn.createStatement();
            System.out.println("Bağlantı Başarılı");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Bağlantı Hatası: " + e);
        }
        return st;

    }

    public void kapat() {
        try {
            if (st != null && conn != null) {  
                st.close();
                conn.close();
                System.out.println("Bağlantı Kapatıldı");
            }
        } catch (SQLException e) {
            System.out.println("Kapatma Hatası" + e);
        }
    }

}
