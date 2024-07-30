package TLForm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TLForm.*;
import doan.JDBCConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public class TLForm extends javax.swing.JFrame {

    
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form FormNCC
     */
    public TLForm() {
        initComponents();
        KetNoiCSDL();
        TheLoai_Load();
    }

    public JPanel getJPN() {
        return jpnTL;
    }

    public void KetNoiCSDL() { 
        try {
            conn = JDBCConnection.getJDBCConnection();
            if (conn != null) {
                System.out.print("Kết nối thành công");
            } else {
                System.out.print("Kết nối thất bại");
            }
        } catch (Exception ex) {
            Logger.getLogger(TLForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void TheLoai_Load() {
        try {
            ps = conn.prepareStatement("SELECT * FROM TheLoai");
            rs = ps.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            int c = rsd.getColumnCount();

            DefaultTableModel model = (DefaultTableModel) listTL.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Vector v1 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v1.add(rs.getString("MaTL"));
                    v1.add(rs.getString("TenTL"));
                    v1.add(rs.getString("MoTaTL"));
                }
                model.addRow(v1);
                listTL.setModel(model);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TLForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LamMoi() {
        txtMaTL.setText("");
        txtTenTL.setText("");
        txtMoTaTL.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTL = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTL = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelBoderFrm1 = new PanelBoder.PanelBoderFrm();
        jLabel8 = new javax.swing.JLabel();
        panelBoderFrm2 = new PanelBoder.PanelBoderFrm();
        TimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaTL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenTL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTaTL = new javax.swing.JTextArea();
        panelBoderFrm3 = new PanelBoder.PanelBoderFrm();
        jLabel7 = new javax.swing.JLabel();
        Them = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        CapNhat = new javax.swing.JButton();
        ReSet = new javax.swing.JButton();
        panelBoderFrm4 = new PanelBoder.PanelBoderFrm();
        panelBoderFrm5 = new PanelBoder.PanelBoderFrm();
        panelBoderFrm6 = new PanelBoder.PanelBoderFrm();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnTL.setBackground(new java.awt.Color(0, 51, 102));

        listTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã thể loại", "Tên thể loại", "Mô tả thể loại"
            }
        ));
        listTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTLMouseClicked(evt);
            }
        });
        listTL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listTLKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listTL);

        jPanel2.setBackground(new java.awt.Color(253, 240, 205));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN LÝ THỂ LOẠI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(15, 15, 15))
        );

        panelBoderFrm1.setBackground(new java.awt.Color(253, 240, 205));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DANH SÁCH THỂ LOẠI");

        javax.swing.GroupLayout panelBoderFrm1Layout = new javax.swing.GroupLayout(panelBoderFrm1);
        panelBoderFrm1.setLayout(panelBoderFrm1Layout);
        panelBoderFrm1Layout.setHorizontalGroup(
            panelBoderFrm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoderFrm1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBoderFrm1Layout.setVerticalGroup(
            panelBoderFrm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoderFrm1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBoderFrm2.setBackground(new java.awt.Color(253, 240, 205));

        TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier.png"))); // NOI18N
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã thể loại");

        txtMaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTLActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên thể loại");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mô tả thể loại");

        txtMoTaTL.setColumns(20);
        txtMoTaTL.setRows(5);
        jScrollPane2.setViewportView(txtMoTaTL);

        panelBoderFrm3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel7.setBackground(new java.awt.Color(253, 240, 205));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(253, 240, 205));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("THÔNG TIN THỂ LOẠI");

        javax.swing.GroupLayout panelBoderFrm3Layout = new javax.swing.GroupLayout(panelBoderFrm3);
        panelBoderFrm3.setLayout(panelBoderFrm3Layout);
        panelBoderFrm3Layout.setHorizontalGroup(
            panelBoderFrm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoderFrm3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(97, 97, 97))
        );
        panelBoderFrm3Layout.setVerticalGroup(
            panelBoderFrm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoderFrm3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        Them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/more.png"))); // NOI18N
        Them.setText("Thêm");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        Xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        Xoa.setText("Xóa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        CapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maintenance.png"))); // NOI18N
        CapNhat.setText("Sửa");
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });

        ReSet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/broom.png"))); // NOI18N
        ReSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBoderFrm2Layout = new javax.swing.GroupLayout(panelBoderFrm2);
        panelBoderFrm2.setLayout(panelBoderFrm2Layout);
        panelBoderFrm2Layout.setHorizontalGroup(
            panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBoderFrm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoderFrm2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenTL))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoderFrm2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaTL)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Them, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ReSet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBoderFrm2Layout.setVerticalGroup(
            panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoderFrm2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBoderFrm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Them, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ReSet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout panelBoderFrm4Layout = new javax.swing.GroupLayout(panelBoderFrm4);
        panelBoderFrm4.setLayout(panelBoderFrm4Layout);
        panelBoderFrm4Layout.setHorizontalGroup(
            panelBoderFrm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelBoderFrm4Layout.setVerticalGroup(
            panelBoderFrm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBoderFrm5Layout = new javax.swing.GroupLayout(panelBoderFrm5);
        panelBoderFrm5.setLayout(panelBoderFrm5Layout);
        panelBoderFrm5Layout.setHorizontalGroup(
            panelBoderFrm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelBoderFrm5Layout.setVerticalGroup(
            panelBoderFrm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBoderFrm6Layout = new javax.swing.GroupLayout(panelBoderFrm6);
        panelBoderFrm6.setLayout(panelBoderFrm6Layout);
        panelBoderFrm6Layout.setHorizontalGroup(
            panelBoderFrm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBoderFrm6Layout.setVerticalGroup(
            panelBoderFrm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnTLLayout = new javax.swing.GroupLayout(jpnTL);
        jpnTL.setLayout(jpnTLLayout);
        jpnTLLayout.setHorizontalGroup(
            jpnTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnTLLayout.createSequentialGroup()
                        .addGroup(jpnTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnTLLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(panelBoderFrm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jpnTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(panelBoderFrm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(panelBoderFrm6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnTLLayout.createSequentialGroup()
                                .addComponent(panelBoderFrm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelBoderFrm5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jpnTLLayout.setVerticalGroup(
            jpnTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTLLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBoderFrm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBoderFrm5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnTLLayout.createSequentialGroup()
                        .addComponent(panelBoderFrm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBoderFrm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBoderFrm6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpnTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jpnTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTLActionPerformed

    private void ReSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReSetActionPerformed
        // TODO add your handling code here:
        LamMoi();
        try {
            ps = conn.prepareStatement("SELECT * FROM TheLoai ");
            rs = ps.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            int c = rsd.getColumnCount();
          
            DefaultTableModel model = (DefaultTableModel) listTL.getModel();
            model.setRowCount(0);
            
            while (rs.next()){
                Vector v1 = new Vector();
                for(int i=1;i<=c;i++){
                    v1.add(rs.getString("MaTL"));
                    v1.add(rs.getString("TenTL"));
                    v1.add(rs.getString("MoTaTL"));
                    
              }
                model.addRow(v1);
               listTL.setModel(model);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TLForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_ReSetActionPerformed

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaTL.getText().equals("")){
            sb.append("Mã thể loại không được để trống!!!");
            txtMaTL.setBackground(Color.red);
        } else {
             txtMaTL.setBackground(Color.white);
        }
        if (sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try{  
          
        tacvuTL tv = new tacvuTL();
        TheLoai TL = tv.find(txtMaTL.getText());
        
        if (TL != null){
        // Xuất thông tin
        int selectedIndex = listTL.getSelectedRow();
        
        txtMaTL.setText(TL.getMaTL());
        txtTenTL.setText(TL.getTenTL());
        txtMoTaTL.setText(TL.getMoTaTL());
       
       } else 
       
        JOptionPane.showMessageDialog(this, "Thể loại tìm kiếm không tồn tại!");
      } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
          e.printStackTrace();
      }
    }//GEN-LAST:event_TimKiemActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaTL.getText().equals("")){
            sb.append("Mã thể loại không được để trống!!!");
            txtMaTL.setBackground(Color.yellow);
        } else {
             txtMaTL.setBackground(Color.white);
        }
        if (sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
      try{  
        TheLoai TL = new TheLoai();
        
        TL.setMaTL(txtMaTL.getText());
        TL.setTenTL(txtTenTL.getText());
        TL.setMoTaTL(txtMoTaTL.getText());
        
        tacvuTL dao = new tacvuTL();
        dao.update(TL);    
        JOptionPane.showMessageDialog(this, "Thể loại được cập nhật thành công!");
        
      } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
          e.printStackTrace();
      }  
    }//GEN-LAST:event_CapNhatActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaTL.getText().equals("")){
            sb.append("Mã thể loại không được để trống!!!");
            txtMaTL.setBackground(Color.yellow);
        } else {
             txtMaTL.setBackground(Color.white);
        }
        if (sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
      try{  
        
        tacvuTL dao = new tacvuTL();
        int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn xóa thể loại này?","Xác nhận", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
         dao.delete(txtMaTL.getText());
        JOptionPane.showMessageDialog(this, "Thể loại đã xóa thành công!");
        } else {
        JOptionPane.showMessageDialog(this, "Thể loại chưa được xóa!");
        }
      } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
          e.printStackTrace();
      }
    }//GEN-LAST:event_XoaActionPerformed

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaTL.getText().equals("")){
            sb.append("Mã thể loại không được để trống!!!");
            txtMaTL.setBackground(Color.yellow);
        } else {
             txtMaTL.setBackground(Color.white);
        }
        if (sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try{  
        TheLoai NCC = new TheLoai();
        NCC.setMaTL(txtMaTL.getText());
        NCC.setTenTL(txtTenTL.getText()); 
        NCC.setMoTaTL(txtMoTaTL.getText());
        
        tacvuTL dao = new tacvuTL();
        dao.insert(NCC);    
        JOptionPane.showMessageDialog(this, "Thể loại được thêm vào thành công!");
      } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
          
      }   
    }//GEN-LAST:event_ThemActionPerformed

    private void listTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTLMouseClicked
         // TODO add your handling code here:
        LamMoi();
        try{
        int selectedIndex = listTL.getSelectedRow();
        listTL.setColumnSelectionInterval(0,2);
        txtMaTL.setText(listTL.getValueAt(selectedIndex, 0).toString());
        txtTenTL.setText(listTL.getValueAt(selectedIndex, 1).toString());
        txtMoTaTL.setText(listTL.getValueAt(selectedIndex, 2).toString());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_listTLMouseClicked

    private void listTLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listTLKeyReleased
        // TODO add your handling code here:
        LamMoi();
        
       if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
           int selectedIndex = listTL.getSelectedRow();
        listTL.setColumnSelectionInterval(0,4);
        txtMaTL.setText(listTL.getValueAt(selectedIndex, 0).toString());
        txtTenTL.setText(listTL.getValueAt(selectedIndex, 1).toString());
        txtMoTaTL.setText(listTL.getValueAt(selectedIndex, 2).toString());
        
       }
    }//GEN-LAST:event_listTLKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TLForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CapNhat;
    private javax.swing.JButton ReSet;
    private javax.swing.JButton Them;
    private javax.swing.JButton TimKiem;
    private javax.swing.JButton Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnTL;
    private javax.swing.JTable listTL;
    private PanelBoder.PanelBoderFrm panelBoderFrm1;
    private PanelBoder.PanelBoderFrm panelBoderFrm2;
    private PanelBoder.PanelBoderFrm panelBoderFrm3;
    private PanelBoder.PanelBoderFrm panelBoderFrm4;
    private PanelBoder.PanelBoderFrm panelBoderFrm5;
    private PanelBoder.PanelBoderFrm panelBoderFrm6;
    private javax.swing.JTextField txtMaTL;
    private javax.swing.JTextArea txtMoTaTL;
    private javax.swing.JTextField txtTenTL;
    // End of variables declaration//GEN-END:variables
}