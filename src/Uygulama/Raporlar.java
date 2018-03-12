package Uygulama;

import Kutuphane.DB;
import Kutuphane.KategorilerProperty;
import Kutuphane.KullanicilarProperty;
import Kutuphane.MusterilerProperty;
import Kutuphane.SatisProperty;
import Kutuphane.Sorgular;
import Kutuphane.UrunlerProperty;
import Kutuphane.Validator;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class Raporlar extends javax.swing.JFrame {

    DB db = new DB();

    public Raporlar() {
        initComponents();
        kategorilerDoldur();
        satislarDoldur();

    }
    Sorgular sorgular = new Sorgular();

    Validator vld = new Validator();

    ArrayList<KategorilerProperty> kategoriler = null;

    private void kategorilerDoldur() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        kategoriler = sorgular.kategorilerDataGetir();
        dcm.addElement("");
        for (KategorilerProperty item : kategoriler) {
            dcm.addElement(item.getkAdi());
        }
        cmb1.setModel(dcm);
    }

    ArrayList<SatisProperty> satislar = null;
    double topkar=0;
    private void satislarDoldur() {
        DefaultTableModel dtm = null;
        satislar = sorgular.SatislarFiltrele("", "", "", "", true);
        dtm = new DefaultTableModel();
        dtm.addColumn("MÜŞTERİ ADI");
        dtm.addColumn("MÜŞTERİ SOYADI");
        dtm.addColumn("MÜŞTERİ TELEFON");
        dtm.addColumn("URUN ADI");
        dtm.addColumn("KATEGORİ");
        dtm.addColumn("ADET");
        dtm.addColumn("ADET TUTAR");
        dtm.addColumn("TOPLAM ÖDEME");
        dtm.addColumn("TARİH");

        for (SatisProperty item : satislar) {
            double adet = Integer.valueOf(item.getAdet());
            double adettutar = Double.valueOf(item.getAdetTutar());
            double alisFiyat=Double.valueOf(item.getuAlis());
            double toplam = (adet * adettutar)-(adet*alisFiyat);
            
            topkar+=toplam;
            String[] dizi = {item.getmAdi(), item.getmSoyadi(), item.getmTelefon(), item.getUrunAdi(), item.getkAdi(), item.getAdet(), item.getAdetTutar(), String.valueOf(toplam), item.getTarih()};
            dtm.addRow(dizi);
        }
        dataTable.setModel(dtm);
        lblKarZarar.setText(String.valueOf(topkar)+" TL");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        filtrele = new javax.swing.JToggleButton();
        txtF2 = new javax.swing.JTextField();
        txtF3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtArama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        lblTutar = new javax.swing.JLabel();
        lblTutar1 = new javax.swing.JLabel();
        lblKarZarar = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CariHesap");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Raporlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(635, 600));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("-");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Kategori:");

        filtrele.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        filtrele.setText("Filtrele");
        filtrele.setOpaque(true);
        filtrele.setPreferredSize(new java.awt.Dimension(117, 23));
        filtrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreleActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Tarih Aralığı (yyyy/aa/gg) :");

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAramaKeyPressed(evt);
            }
        });

        jLabel4.setText("Arama Yap:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtF3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(filtrele, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtrele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dataTable);

        lblTutar.setBackground(new java.awt.Color(0, 0, 0));
        lblTutar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTutar.setForeground(new java.awt.Color(255, 102, 0));
        lblTutar.setText("GENEL KAR - ZARAR DURUMU");

        lblTutar1.setBackground(new java.awt.Color(0, 0, 0));
        lblTutar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTutar1.setForeground(new java.awt.Color(255, 102, 0));
        lblTutar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_money_172506.png"))); // NOI18N

        lblKarZarar.setBackground(new java.awt.Color(0, 0, 0));
        lblKarZarar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblKarZarar.setForeground(new java.awt.Color(255, 0, 51));
        lblKarZarar.setText("00TL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTutar1)
                        .addGap(97, 97, 97)
                        .addComponent(lblKarZarar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblTutar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTutar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKarZarar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked

    }//GEN-LAST:event_dataTableMouseClicked

    private void txtAramaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaKeyPressed
        String arama = null;
        DefaultTableModel dtm = null;
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            arama = txtArama.getText();

            if (filtrele.isSelected() == true) {
                satislar = sorgular.SatislarFiltrele(kid, min, max, arama, false);
            } else {
                if (arama.equals("")) {
                    satislar = sorgular.SatislarFiltrele("", "", "", arama, false);
                } else {
                    satislar = sorgular.SatislarFiltrele("", "", "", arama, false);
                }
            }
            dtm = new DefaultTableModel();
            dtm.addColumn("MÜŞTERİ ADI");
            dtm.addColumn("MÜŞTERİ SOYADI");
            dtm.addColumn("MÜŞTERİ TELEFON");
            dtm.addColumn("URUN ADI");
            dtm.addColumn("KATEGORİ");
            dtm.addColumn("ADET");
            dtm.addColumn("ADET TUTAR");
            dtm.addColumn("TOPLAM ÖDEME");
            dtm.addColumn("TARİH");
            for (SatisProperty item : satislar) {
                int adet = Integer.valueOf(item.getAdet());
                int adettutar = Integer.valueOf(item.getAdetTutar());
                int toplam = adet * adettutar;
                String[] dizi = {item.getmAdi(), item.getmSoyadi(), item.getmTelefon(), item.getUrunAdi(), item.getkAdi(), item.getAdet(), item.getAdetTutar(), String.valueOf(toplam), item.getTarih()};
                dtm.addRow(dizi);
            }
            dataTable.setModel(dtm);
        }
    }//GEN-LAST:event_txtAramaKeyPressed

    private void filtreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreleActionPerformed

        if (filtrele.isSelected() == true) {
            DefaultTableModel dtm = null;
            min = txtF2.getText();
            max = txtF3.getText();
            if (cmb1.getSelectedIndex() != 0) {
                kid = kategoriler.get(cmb1.getSelectedIndex() - 1).getkID();
            } else {
                kid = "";
            }
            satislar = sorgular.SatislarFiltrele(kid, min, max, "", false);
            dtm = new DefaultTableModel();
            dtm.addColumn("MÜŞTERİ ADI");
            dtm.addColumn("MÜŞTERİ SOYADI");
            dtm.addColumn("MÜŞTERİ TELEFON");
            dtm.addColumn("URUN ADI");
            dtm.addColumn("KATEGORİ");
            dtm.addColumn("ADET");
            dtm.addColumn("ADET TUTAR");
            dtm.addColumn("TOPLAM ÖDEME");
            dtm.addColumn("TARİH");
            for (SatisProperty item : satislar) {
                int adet = Integer.valueOf(item.getAdet());
                int adettutar = Integer.valueOf(item.getAdetTutar());
                int toplam = adet * adettutar;
                String[] dizi = {item.getmAdi(), item.getmSoyadi(), item.getmTelefon(), item.getUrunAdi(), item.getkAdi(), item.getAdet(), item.getAdetTutar(), String.valueOf(toplam), item.getTarih()};
                dtm.addRow(dizi);
            }
            dataTable.setModel(dtm);
            System.out.println("aktif");
            filtrele.setBackground(Color.red);
            cmb1.setEnabled(false);
            txtF2.setEnabled(false);
            txtF3.setEnabled(false);
        } else {
            System.out.println("pasif");
            filtrele.setBackground(Color.getHSBColor(240, 240, 240));
            satislarDoldur();
            cmb1.setEnabled(true);
            txtF2.setEnabled(true);
            txtF3.setEnabled(true);

        }
    }//GEN-LAST:event_filtreleActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MainForm.rpdurum=false;
    }//GEN-LAST:event_formWindowClosed
    String min = null;
    String max = null;
    String kid = null;
    String id = null;
    String mcep = null;

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Raporlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JTable dataTable;
    private javax.swing.JToggleButton filtrele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblKarZarar;
    private javax.swing.JLabel lblTutar;
    private javax.swing.JLabel lblTutar1;
    private javax.swing.JTextField txtArama;
    private javax.swing.JTextField txtF2;
    private javax.swing.JTextField txtF3;
    // End of variables declaration//GEN-END:variables

}
