/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uygulama;

import Kutuphane.DB;
import Kutuphane.KategorilerProperty;
import Kutuphane.KullanicilarProperty;
import Kutuphane.Sorgular;
import Kutuphane.UrunlerProperty;
import Kutuphane.Validator;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UrunYonetimi extends javax.swing.JFrame {

    Sorgular sorgular = new Sorgular();
    Validator vld = new Validator();

    public UrunYonetimi() {
        initComponents();
        kategorilerDoldur();
        urunlerDoldur();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUrun1 = new javax.swing.JTextField();
        txtUrun2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUrun3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        urunCmb1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        btnUrun1 = new javax.swing.JButton();
        btnUrun3 = new javax.swing.JButton();
        btnUrun2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        kategoriCmb = new javax.swing.JComboBox<>();
        txtKategori = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnK1 = new javax.swing.JButton();
        btnK2 = new javax.swing.JButton();
        btnK3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUrun4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürün Yönetimi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setText("Ürün Adı");

        txtUrun1.setToolTipText("'ÜRÜN ADI'");

        txtUrun2.setToolTipText("'ALIŞ FİYATI'");

        jLabel2.setText("Alış Fiyatı");

        txtUrun3.setToolTipText("'SATIŞ FİYATI'");

        jLabel3.setText("Satış Fiyatı");

        jLabel4.setText("Kategorisi");

        urunCmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item", "item1" }));
        urunCmb1.setSelectedIndex(-1);
        urunCmb1.setToolTipText("Kategorisi");

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
        jScrollPane1.setViewportView(dataTable);

        btnUrun1.setText("Ekle");
        btnUrun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrun1ActionPerformed(evt);
            }
        });

        btnUrun3.setText("Sil");
        btnUrun3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrun3ActionPerformed(evt);
            }
        });

        btnUrun2.setText("Güncelle");
        btnUrun2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrun2ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategoriler"));

        txtKategori.setToolTipText("Kategori Adı");

        jLabel7.setText("Kategori Adı");

        btnK1.setText("Ekle");
        btnK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK1ActionPerformed(evt);
            }
        });

        btnK2.setText("Güncelle");
        btnK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK2ActionPerformed(evt);
            }
        });

        btnK3.setText("Sil");
        btnK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kategoriCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKategori))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnK1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnK2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnK3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kategoriCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnK1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnK2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnK3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Stok (adet)");

        txtUrun4.setToolTipText("'STOK'");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUrun3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUrun2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(78, 78, 78)
                                .addComponent(txtUrun1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(urunCmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUrun4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 84, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUrun1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUrun2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUrun3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(urunCmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUrun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btnUrun1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnUrun2)
                    .addComponent(jLabel8)
                    .addComponent(txtUrun4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnUrun3))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<UrunlerProperty> urunler = null;

    private void urunlerDoldur() {
        DefaultTableModel dtm = null;
        urunler = sorgular.urunlerDataGetir();
        dtm = new DefaultTableModel();
        dtm.addColumn("URUN ADI");
        dtm.addColumn("ALIŞ FİYATI(TL)");
        dtm.addColumn("SATIŞ FİYATI(TL)");
        dtm.addColumn("STOK");
        dtm.addColumn("KATEGORİ");

        for (UrunlerProperty item : urunler) {
            String[] dizi = {item.getUrunAdi(), item.getuAlis(), item.getuSatis(), item.getStok(), item.getkAdi()};
            dtm.addRow(dizi);
        }
        dataTable.setModel(dtm);
    }

    ArrayList<KategorilerProperty> kategoriler = null;

    private void kategorilerDoldur() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        DefaultComboBoxModel dcm2 = new DefaultComboBoxModel();
        kategoriler = sorgular.kategorilerDataGetir();
        for (KategorilerProperty item : kategoriler) {
            dcm.addElement(item.getkAdi());
            dcm2.addElement(item.getkAdi());
        }
        urunCmb1.setModel(dcm);
        kategoriCmb.setModel(dcm2);
    }

    private void btnUrun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrun1ActionPerformed

        if (vld.validationJtxt(txtUrun1, txtUrun2, txtUrun3, txtUrun4)) {
            UrunlerProperty up = new UrunlerProperty();
            up.setUrunID("null");
            up.setUrunAdi(txtUrun1.getText().trim());
            up.setuAlis(txtUrun2.getText().trim());
            up.setuSatis(txtUrun3.getText().trim());
            up.setStok(txtUrun4.getText().trim());
            up.setkullaniciID(KullanicilarProperty.oturumID);
            up.setkID(kategoriler.get(urunCmb1.getSelectedIndex()).getkID());
            if (sorgular.urunEkle(up)) {
                JOptionPane.showMessageDialog(this, "Ürün Eklendi");
                urunlerDoldur();
                vld.temizle(txtUrun1, txtUrun2, txtUrun3, txtUrun4);
            } else {
                JOptionPane.showMessageDialog(this, "Zaten Mevcut!");
            }
        }

    }//GEN-LAST:event_btnUrun1ActionPerformed


    private void btnK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK1ActionPerformed
        if (vld.validationJtxt(txtKategori)) {
            KategorilerProperty kp = new KategorilerProperty();
            kp.setkID("null");
            kp.setkAdi(txtKategori.getText().trim());
            if (sorgular.kategoriEkle(kp)) {
                JOptionPane.showMessageDialog(this, "Kategori Eklendi");
                kategorilerDoldur();
                vld.temizle(txtKategori);
            } else {
                JOptionPane.showMessageDialog(this, "Zaten Mevcut!");
            }

        }


    }//GEN-LAST:event_btnK1ActionPerformed
    String id = null;
    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        id = urunler.get(dataTable.getSelectedRow()).getUrunID();
        txtUrun1.setText(urunler.get(dataTable.getSelectedRow()).getUrunAdi());
        txtUrun2.setText(urunler.get(dataTable.getSelectedRow()).getuAlis());
        txtUrun3.setText(urunler.get(dataTable.getSelectedRow()).getuSatis());
        txtUrun4.setText(urunler.get(dataTable.getSelectedRow()).getStok());
        urunCmb1.setSelectedItem(urunler.get(dataTable.getSelectedRow()).getkAdi());

    }//GEN-LAST:event_dataTableMouseClicked

    private void btnUrun3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrun3ActionPerformed
        if (id != null) {
            if (sorgular.urunSil(id) > 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinize emin misiniz?", "Sil", JOptionPane.YES_NO_OPTION) == 0) {
                    JOptionPane.showMessageDialog(this, "Ürün Silindi");
                    id = null;
                    urunlerDoldur();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tablodan seçim yapınız!");
        }

    }//GEN-LAST:event_btnUrun3ActionPerformed

    private void btnK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK3ActionPerformed
        id = String.valueOf(kategoriCmb.getSelectedIndex());
        System.out.println(id);
        if (!id.equals("-1")) {
            id = kategoriler.get(kategoriCmb.getSelectedIndex()).getkID();
            for (UrunlerProperty item : urunler) {//loopsuz olanı için :idler için arraylist oluşturulup contains ile direk aratmada yapılabilir.
                if (item.getkID().equals(id)) {
                    JOptionPane.showMessageDialog(this, "Bu kategoriye bağlı ürünleriniz bulunduğu için silme işlemini gerçekleştiremezsiniz!");
                    id=null;
                    break;
                }
            }
            if (sorgular.kategoriSil(id) > 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinize emin misiniz?", "Sil", JOptionPane.YES_NO_OPTION) == 0) {
                    JOptionPane.showMessageDialog(this, "Kategori Silindi");
                    kategoriCmb.setSelectedIndex(-1);
                    id = null;
                    kategorilerDoldur();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Açılır pencereden seçim yapınız!");
        }
    }//GEN-LAST:event_btnK3ActionPerformed

    private void btnUrun2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrun2ActionPerformed
        if (vld.validationJtxt(txtUrun1, txtUrun2, txtUrun3, txtUrun4)) {
            if (id != null) {
                UrunlerProperty up = new UrunlerProperty();
                up.setUrunID(id);
                up.setUrunAdi(txtUrun1.getText().trim());
                up.setuAlis(txtUrun2.getText().trim());
                up.setuSatis(txtUrun3.getText().trim());
                up.setStok(txtUrun4.getText().trim());
                up.setkullaniciID(KullanicilarProperty.oturumID);
                up.setkID(kategoriler.get(urunCmb1.getSelectedIndex()).getkID());
                if (sorgular.urunGuncelle(up) > 0) {
                    JOptionPane.showMessageDialog(this, "Ürün Güncellendi");
                    id = null;
                    urunlerDoldur();
                    vld.temizle(txtUrun1, txtUrun2, txtUrun3, txtUrun4);
                }

            } else {
                JOptionPane.showMessageDialog(this, "lütfen tablodan seçim yaparak güncelleme yapınız!");
            }
        }
    }//GEN-LAST:event_btnUrun2ActionPerformed

    private void btnK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK2ActionPerformed
        id = String.valueOf(kategoriCmb.getSelectedIndex());
        System.out.println(id);
        if (!id.equals("-1")) {
            KategorilerProperty kp=new KategorilerProperty();
            kp.setkID(kategoriler.get(kategoriCmb.getSelectedIndex()).getkID());
            kp.setkAdi(txtKategori.getText());
            if (sorgular.kategoriGuncelle(kp) > 0) {
                    JOptionPane.showMessageDialog(this, "Kategori güncellendi");
                    kategoriCmb.setSelectedIndex(-1);
                    id = null;
                    kategorilerDoldur();
                    vld.temizle(txtKategori);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Açılır pencereden seçim yapınız!");
        }
    }//GEN-LAST:event_btnK2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MainForm.uydurum=false;
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UrunYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrunYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrunYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrunYonetimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnK1;
    private javax.swing.JButton btnK2;
    private javax.swing.JButton btnK3;
    private javax.swing.JButton btnUrun1;
    private javax.swing.JButton btnUrun2;
    private javax.swing.JButton btnUrun3;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategoriCmb;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtUrun1;
    private javax.swing.JTextField txtUrun2;
    private javax.swing.JTextField txtUrun3;
    private javax.swing.JTextField txtUrun4;
    private javax.swing.JComboBox<String> urunCmb1;
    // End of variables declaration//GEN-END:variables

}
