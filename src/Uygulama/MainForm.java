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
import javax.swing.table.DefaultTableModel;

public class MainForm extends javax.swing.JFrame {

    DB db = new DB();

    public MainForm() {
        initComponents();
        kategorilerDoldur();
        urunlerDoldur();
        kullaniciLbl.setText("oturum açan kullanıcı:\n" + KullanicilarProperty.oturumAdi);

    }
    Sorgular sorgular = new Sorgular();

    Validator vld = new Validator();

    ArrayList<KategorilerProperty> kategoriler = null;

    private void kategorilerDoldur() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        kategoriler = sorgular.kategorilerDataGetir();
        for (KategorilerProperty item : kategoriler) {
            dcm.addElement(item.getkAdi());
        }
        cmb1.setModel(dcm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cikisBtn = new javax.swing.JButton();
        kullaniciLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtF2 = new javax.swing.JTextField();
        txtF1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        filtrele = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        txtArama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSatis2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSatis3 = new javax.swing.JTextField();
        txtSatis4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        sBtn1 = new javax.swing.JButton();
        lblTutar = new javax.swing.JLabel();
        lblUrunAdi = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        mTxt1 = new javax.swing.JTextField();
        mTxt2 = new javax.swing.JTextField();
        mTxt3 = new javax.swing.JTextField();
        mTxt4 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        mAdresArea = new javax.swing.JTextArea();
        mBtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CariHesap");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 600));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_product_2639894.png"))); // NOI18N
        btn1.setText("ÜRÜN YÖNETİMİ");
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn1.setPreferredSize(new java.awt.Dimension(146, 96));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_group_half_103577.png"))); // NOI18N
        btn2.setText("MÜŞTERİ YÖNETİMİ");
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn2.setPreferredSize(new java.awt.Dimension(146, 96));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_files-folders-29_808622.png"))); // NOI18N
        btn3.setText("RAPORLAR");
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn3.setPreferredSize(new java.awt.Dimension(146, 96));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_icons_user2_1564535.png"))); // NOI18N
        btn4.setText("KULLANICI YÖNETİMİ");
        btn4.setToolTipText("");
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn4.setPreferredSize(new java.awt.Dimension(146, 96));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        cikisBtn.setBackground(new java.awt.Color(255, 255, 255));
        cikisBtn.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        cikisBtn.setText("ÇIKIŞ YAP");

        kullaniciLbl.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        kullaniciLbl.setText("Oturum açan kullanıcı :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(kullaniciLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cikisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kullaniciLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(cikisBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Satış Ekranı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(635, 600));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("-");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Fiyat Aralığı:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addComponent(txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtrele, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(filtrele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAramaActionPerformed(evt);
            }
        });
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
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtArama, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Seçilen Ürün:");

        txtSatis2.setToolTipText("'MUSTERİ CEP'");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Adet:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Musteri Cep :");

        txtSatis3.setToolTipText("'ADET'");

        txtSatis4.setToolTipText("'TUTAR'");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Tutar (adet) :");

        sBtn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sBtn1.setText("Satışı Onayla");
        sBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBtn1ActionPerformed(evt);
            }
        });

        lblTutar.setBackground(new java.awt.Color(0, 0, 0));
        lblTutar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTutar.setForeground(new java.awt.Color(255, 102, 0));
        lblTutar.setText("Toplam Tutar:");

        lblUrunAdi.setBackground(new java.awt.Color(0, 0, 0));
        lblUrunAdi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUrunAdi.setForeground(new java.awt.Color(255, 102, 0));
        lblUrunAdi.setText("Seçilen Ürün Adı");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sBtn1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSatis2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUrunAdi)
                                    .addComponent(txtSatis3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTutar)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSatis4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblUrunAdi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSatis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSatis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSatis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sBtn1)
                .addGap(29, 29, 29))
        );

        jLabel12.setText("Ürün Seçimi :");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri - Hızlı ekle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        mTxt1.setToolTipText("'AD'");

        mTxt2.setToolTipText("'SOYAD'");

        mTxt3.setToolTipText("'CEP'");

        mTxt4.setToolTipText("Mail");

        mAdresArea.setColumns(20);
        mAdresArea.setRows(5);
        jScrollPane3.setViewportView(mAdresArea);

        mBtn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mBtn1.setText("Kaydet");
        mBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Ad :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Soyad :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Cep :");
        jLabel9.setToolTipText("CEP");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Mail :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Adres :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mTxt4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(mTxt3)
                            .addComponent(mTxt2)
                            .addComponent(mTxt1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mBtn1)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mBtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String min = null;
    String max = null;
    String kid = null;
    private void filtreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreleActionPerformed

        if (filtrele.isSelected() == true) {
            DefaultTableModel dtm = null;
            min = txtF1.getText();
            max = txtF2.getText();
            kid = kategoriler.get(cmb1.getSelectedIndex()).getkID();
            urunler = sorgular.filtrele(kid, min, max, "");
            dtm = new DefaultTableModel();
            dtm.addColumn("URUN ADI");
            dtm.addColumn("SATIŞ FİYATI(TL)");
            dtm.addColumn("STOK");
            dtm.addColumn("KATEGORİ");
            for (UrunlerProperty item : urunler) {
                String[] dizi = {item.getUrunAdi(), item.getuSatis(), item.getStok(), item.getkAdi()};
                dtm.addRow(dizi);
            }
            dataTable.setModel(dtm);
            System.out.println("aktif");
            filtrele.setBackground(Color.red);
            cmb1.setEnabled(false);
            txtF1.setEnabled(false);
            txtF2.setEnabled(false);

        } else {
            System.out.println("pasif");
            filtrele.setBackground(Color.getHSBColor(240, 240, 240));
            urunlerDoldur();
            cmb1.setEnabled(true);
            txtF1.setEnabled(true);
            txtF2.setEnabled(true);

        }

    }//GEN-LAST:event_filtreleActionPerformed

    private void txtAramaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaKeyPressed
        String arama = null;
        DefaultTableModel dtm = null;
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            arama = txtArama.getText();

            if (filtrele.isSelected() == true) {
                urunler = sorgular.filtrele(kid, min, max, arama);
            } else {
                urunler = sorgular.filtrele("", "", "", arama);
            }
            dtm = new DefaultTableModel();
            dtm.addColumn("URUN ADI");
            dtm.addColumn("SATIŞ FİYATI(TL)");
            dtm.addColumn("STOK");
            dtm.addColumn("KATEGORİ");
            for (UrunlerProperty item : urunler) {
                String[] dizi = {item.getUrunAdi(), item.getuSatis(), item.getStok(), item.getkAdi()};
                dtm.addRow(dizi);
            }
            if (txtArama.getText().equals("")) {
                arama = null;
            }
            dataTable.setModel(dtm);
        }
    }//GEN-LAST:event_txtAramaKeyPressed
    String id = null;
    int seciliUrun = 0;
    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked

        id = urunler.get(dataTable.getSelectedRow()).getUrunID();
        lblUrunAdi.setText(urunler.get(dataTable.getSelectedRow()).getUrunAdi());
        seciliUrun = dataTable.getSelectedRow();
    }//GEN-LAST:event_dataTableMouseClicked

    private void mBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn1ActionPerformed

        if (vld.validationJtxt(mTxt1, mTxt2, mTxt3, mTxt4)) {
            MusterilerProperty mp = new MusterilerProperty();
            mp.setmID("null");
            mp.setmAdi(mTxt1.getText().trim());
            mp.setmSoyadi(mTxt2.getText().trim());
            mp.setmTelefon(mTxt3.getText().trim());
            if (vld.mailMi(mTxt4)) {
                mp.setmMail(mTxt4.getText().trim());
                mp.setmAdres(mAdresArea.getText());
                if (sorgular.musteriEkle(mp)) {
                    JOptionPane.showMessageDialog(this, "Müşteri Eklendi");

                } else {
                    JOptionPane.showMessageDialog(this, "Zaten Mevcut!");
                }
                vld.temizle(mTxt1, mTxt2, mTxt3, mTxt4, mAdresArea);
            } else {
                JOptionPane.showMessageDialog(this, "Mail adresiniz geçersizdir!");
            }

        }
    }//GEN-LAST:event_mBtn1ActionPerformed

    private void sBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBtn1ActionPerformed
        SatisProperty sp = new SatisProperty();
        if (id != null) {
            sp.setsID("null");
            sp.setuID(id);
            if (vld.validationJtxt(txtSatis2, txtSatis3, txtSatis4)) {
                if (vld.sayiMi(txtSatis3.getText().trim()) && vld.sayiMi(txtSatis4.getText().trim())) {
                    String tel = txtSatis2.getText().trim();
                    try {
                        ResultSet rs = db.baglan().executeQuery("select * from Musteriler where mTelefon='" + tel + "'");
                        if (rs.next()) {
                            sp.setmID(rs.getString("mID"));
                            double adet = Double.valueOf(txtSatis3.getText().trim());
                            double tutar = Double.valueOf(txtSatis4.getText().trim());
                            tutar *= adet;
                            sp.setAdet(txtSatis3.getText().trim());
                            sp.setAdetTutar(String.valueOf(tutar));
                            Date simdikiZaman = new Date();
                            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                            sp.setTarih(df.format(simdikiZaman));
                            db.kapat();
                            double stok = Double.valueOf(urunler.get(seciliUrun).getStok());
                            double stokDüs = Double.valueOf(sp.getAdet());
                            stok -= stokDüs;
                            System.out.println(stok);
                            if (stok > -1) {
                                if (sorgular.satisEkle(sp)) {
                                    JOptionPane.showMessageDialog(this, "Satış Onaylandı.");
                                    lblTutar.setText("Toplam Tutar:" + String.valueOf(tutar));
                                    String s = String.valueOf(stok);
                                    sorgular.stokGuncelle(id, s);
                                    urunlerDoldur();
                                    vld.temizle(txtSatis2, txtSatis3, txtSatis4);

                                } else {
                                    JOptionPane.showMessageDialog(this, "Satış Başarısız!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Stok '0' olduğu için güncelleme yapmadan satış yapamazsınız!");
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Müşteri kaydı bulunamadı!");
                        }

                    } catch (SQLException ex) {
                        System.out.println("hata :" + ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "adet ve tutar bilgisi sayı içermelidir!");
                }

            }

        } else {
            JOptionPane.showMessageDialog(this, "Tablodan seçim yapınız!");
        }


        /*if (vld.validationJtxt(txtSatis1, txtSatis2, txtSatis3, txtSatis4)) {

            sp.setAdet(txtSatis3.getText().trim());
            sp.setTutar(txtSatis4.getText().trim());

            
        }*/
    }//GEN-LAST:event_sBtn1ActionPerformed

    private void txtAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAramaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtAramaActionPerformed

    static boolean uydurum = false;
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        if (!uydurum) {
            UrunYonetimi uy = new UrunYonetimi();
            uy.setVisible(true);
            uydurum = true;
        }

    }//GEN-LAST:event_btn1ActionPerformed
    static boolean mpdurum = false;
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        if (!mpdurum) {
            MusteriYonetimi mp = new MusteriYonetimi();
            mp.setVisible(true);
            mpdurum = true;
        }
    }//GEN-LAST:event_btn2ActionPerformed
    static boolean rpdurum = false;
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        if (!rpdurum) {
            Raporlar rp = new Raporlar();
            rp.setVisible(true);
            rpdurum = true;
        }

    }//GEN-LAST:event_btn3ActionPerformed
    static boolean kydurum = false;
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        if (!kydurum) {
            KullaniciYönetimi ky = new KullaniciYönetimi();
            ky.setVisible(true);
            kydurum = true;
        }


    }//GEN-LAST:event_btn4ActionPerformed

    ArrayList<UrunlerProperty> urunler = null;

    public void urunlerDoldur() {
        DefaultTableModel dtm = null;
        urunler = sorgular.urunlerDataGetir();
        dtm = new DefaultTableModel();
        dtm.addColumn("URUN ADI");
        dtm.addColumn("SATIŞ FİYATI(TL)");
        dtm.addColumn("STOK");
        dtm.addColumn("KATEGORİ");

        for (UrunlerProperty item : urunler) {
            String[] dizi = {item.getUrunAdi(), item.getuSatis(), item.getStok(), item.getkAdi()};
            dtm.addRow(dizi);
        }
        dataTable.setModel(dtm);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton cikisBtn;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JTable dataTable;
    private javax.swing.JToggleButton filtrele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kullaniciLbl;
    private javax.swing.JLabel lblTutar;
    private javax.swing.JLabel lblUrunAdi;
    private javax.swing.JTextArea mAdresArea;
    private javax.swing.JButton mBtn1;
    private javax.swing.JTextField mTxt1;
    private javax.swing.JTextField mTxt2;
    private javax.swing.JTextField mTxt3;
    private javax.swing.JTextField mTxt4;
    private javax.swing.JButton sBtn1;
    private javax.swing.JTextField txtArama;
    private javax.swing.JTextField txtF1;
    private javax.swing.JTextField txtF2;
    private javax.swing.JTextField txtSatis2;
    private javax.swing.JTextField txtSatis3;
    private javax.swing.JTextField txtSatis4;
    // End of variables declaration//GEN-END:variables

}
