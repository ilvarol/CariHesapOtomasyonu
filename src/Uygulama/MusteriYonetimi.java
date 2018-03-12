/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uygulama;

import Kutuphane.DB;
import Kutuphane.KategorilerProperty;
import Kutuphane.KullanicilarProperty;
import Kutuphane.MusterilerProperty;
import Kutuphane.Sorgular;
import Kutuphane.UrunlerProperty;
import Kutuphane.Validator;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MusteriYonetimi extends javax.swing.JFrame {

    Sorgular sorgular = new Sorgular();
    Validator vld = new Validator();

    public MusteriYonetimi() {
        initComponents();
        musterilerDoldur();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMusteri1 = new javax.swing.JTextField();
        txtMusteri2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMusteri3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtMusteri4 = new javax.swing.JTextField();
        mBtn1 = new javax.swing.JButton();
        mBtn2 = new javax.swing.JButton();
        mBtn3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Yönetimi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setText("Müşteri Adı:");

        txtMusteri1.setToolTipText("'ÜRÜN ADI'");

        txtMusteri2.setToolTipText("'ALIŞ FİYATI'");

        jLabel2.setText("Müşteri Soyadı:");

        txtMusteri3.setToolTipText("'SATIŞ FİYATI'");

        jLabel3.setText("Telefon Numarası:");

        jLabel4.setText("Mail Adresi");

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

        jLabel8.setText("Adres:");

        mBtn1.setText("Ekle");
        mBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn1ActionPerformed(evt);
            }
        });

        mBtn2.setText("Sil");
        mBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn2ActionPerformed(evt);
            }
        });

        mBtn3.setText("Güncelle");
        mBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn3ActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMusteri1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMusteri3)
                                .addComponent(txtMusteri2)
                                .addComponent(jScrollPane2)
                                .addComponent(txtMusteri4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(mBtn1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(mBtn2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(mBtn3))))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMusteri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMusteri2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMusteri3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMusteri4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mBtn3)
                    .addComponent(mBtn2)
                    .addComponent(mBtn1))
                .addContainerGap())
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
    ArrayList<MusterilerProperty> musteriler = null;

    private void musterilerDoldur() {
        DefaultTableModel dtm = null;
        musteriler = sorgular.musterilerDataGetir();
        dtm = new DefaultTableModel();
        dtm.addColumn("MÜŞTERİ ADI");
        dtm.addColumn("MÜŞTERİ SOYADI");
        dtm.addColumn("TELEFON NUMARASI");
        dtm.addColumn("MAİL ADRESİ");
        dtm.addColumn("ADRESİ");

        for (MusterilerProperty item : musteriler) {
            String[] dizi = {item.getmAdi(), item.getmSoyadi(), item.getmTelefon(), item.getmMail(), item.getmAdres()};
            dtm.addRow(dizi);
        }
        dataTable.setModel(dtm);
    }

    String id = null;
    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        id = musteriler.get(dataTable.getSelectedRow()).getmID();
        txtMusteri1.setText(musteriler.get(dataTable.getSelectedRow()).getmAdi());
        txtMusteri2.setText(musteriler.get(dataTable.getSelectedRow()).getmSoyadi());
        txtMusteri3.setText(musteriler.get(dataTable.getSelectedRow()).getmTelefon());
        txtMusteri4.setText(musteriler.get(dataTable.getSelectedRow()).getmMail());
        txtArea.setText(musteriler.get(dataTable.getSelectedRow()).getmAdres());

    }//GEN-LAST:event_dataTableMouseClicked

    private void mBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn1ActionPerformed

        if (vld.validationJtxt(txtMusteri1, txtMusteri2, txtMusteri3, txtMusteri4)) {
            MusterilerProperty mp = new MusterilerProperty();
            mp.setmID("null");
            mp.setmAdi(txtMusteri1.getText().trim());
            mp.setmSoyadi(txtMusteri2.getText().trim());
            mp.setmTelefon(txtMusteri3.getText().trim());
            if (vld.mailMi(txtMusteri4)) {
                mp.setmMail(txtMusteri4.getText().trim());
                mp.setmAdres(txtArea.getText());
                if (sorgular.musteriEkle(mp)) {
                    JOptionPane.showMessageDialog(this, "Müşteri Eklendi");
                    musterilerDoldur();
                    vld.temizle(txtMusteri1, txtMusteri2, txtMusteri3, txtMusteri4, txtArea);
                } else {
                    JOptionPane.showMessageDialog(this, "Zaten Mevcut!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mail adresiniz geçersizdir!");
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_mBtn1ActionPerformed

    private void mBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn2ActionPerformed

        if (id != null) {
            if (sorgular.musteriSil(id) > 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinize emin misiniz?", "Sil", JOptionPane.YES_NO_OPTION) == 0) {
                    JOptionPane.showMessageDialog(this, "Müşteri kaydı silindi");
                    id = null;
                    musterilerDoldur();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tablodan seçim yapınız!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mBtn2ActionPerformed

    private void mBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn3ActionPerformed

        if (vld.validationJtxt(txtMusteri1, txtMusteri2, txtMusteri3, txtMusteri4)) {
            if (id != null) {
                MusterilerProperty mp = new MusterilerProperty();
                mp.setmID(id);
                mp.setmAdi(txtMusteri1.getText().trim());
                mp.setmSoyadi(txtMusteri2.getText().trim());
                mp.setmTelefon(txtMusteri3.getText().trim());
                if (vld.mailMi(txtMusteri4)) {
                    mp.setmMail(txtMusteri4.getText().trim());
                    mp.setmAdres(txtArea.getText().trim());
                    if (sorgular.musteriGuncelle(mp) > 0) {
                        JOptionPane.showMessageDialog(this, "Kayıt Güncellendi");
                        id = null;
                        musterilerDoldur();
                        vld.temizle(txtMusteri1, txtMusteri2, txtMusteri3, txtMusteri4, txtArea);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Mail adresiniz geçersizdir!");
                }

            } else {
                JOptionPane.showMessageDialog(this, "lütfen tablodan seçim yaparak güncelleme yapınız!");
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_mBtn3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MainForm.mpdurum = false;
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
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriYonetimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mBtn1;
    private javax.swing.JButton mBtn2;
    private javax.swing.JButton mBtn3;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtMusteri1;
    private javax.swing.JTextField txtMusteri2;
    private javax.swing.JTextField txtMusteri3;
    private javax.swing.JTextField txtMusteri4;
    // End of variables declaration//GEN-END:variables

}
