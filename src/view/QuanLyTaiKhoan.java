/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.TaiKhoan;
import dao.TaiKhoanDAO;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh PC
 */
public class QuanLyTaiKhoan extends javax.swing.JFrame {
    private DefaultTableModel model;
    private String phanQuyen;
    private String tenTaiKhoan;

    /**
     * Creates new form QuanLyTaiKhoan
     */
    public QuanLyTaiKhoan(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setTitle("Quản lý tài khoản");
        this.setLocationRelativeTo(null);
        this.getAllTaiKhoan();  
        this.setTimKiemField();
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maNV;
    }
    
    private void ResetValue(){
        TenDangNhapField.setText("");    
    }
    private void hienThi(ArrayList<TaiKhoan> t) {
        model = (DefaultTableModel) DanhSachTaiKhoan.getModel();
        model.setRowCount(0);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        for (TaiKhoan i : t) {
            String[] dataRow = {i.getTenDangNhap(), i.getPhanQuyen(), i.getTrangThai()};
            model.addRow(dataRow);
        }
    }
    private void getAllTaiKhoan() {
        ArrayList<TaiKhoan> taiKhoan = TaiKhoanDAO.getInstance().getAll();
        this.hienThi(taiKhoan);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DanhSachTaiKhoan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        KhoaBtn = new javax.swing.JToggleButton();
        LamMoiBtn = new javax.swing.JButton();
        QuayLaiBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TenDangNhapLabel = new javax.swing.JLabel();
        TenDangNhapField = new javax.swing.JTextField();
        TrangThaiLabel = new javax.swing.JLabel();
        PhanQuyenField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        TimKiemLabel = new javax.swing.JLabel();
        TimKiemField = new javax.swing.JComboBox<>();
        TuKhoaLabel = new javax.swing.JLabel();
        TimKiemBtn = new javax.swing.JButton();
        TimKiemPanel = new javax.swing.JPanel();
        TuKhoaField = new javax.swing.JTextField();
        TuKhoaCombobox = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 560));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        DanhSachTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        DanhSachTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đăng nhập", "Phân quyền", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DanhSachTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhSachTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DanhSachTaiKhoan);
        if (DanhSachTaiKhoan.getColumnModel().getColumnCount() > 0) {
            DanhSachTaiKhoan.getColumnModel().getColumn(0).setResizable(false);
            DanhSachTaiKhoan.getColumnModel().getColumn(1).setResizable(false);
            DanhSachTaiKhoan.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 35, 0));

        KhoaBtn.setBackground(new java.awt.Color(0, 204, 102));
        KhoaBtn.setForeground(new java.awt.Color(255, 255, 255));
        KhoaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/padlock.png"))); // NOI18N
        KhoaBtn.setText("Khóa");
        KhoaBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/unlocked.png"))); // NOI18N
        KhoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhoaBtnActionPerformed(evt);
            }
        });
        jPanel4.add(KhoaBtn);

        LamMoiBtn.setBackground(new java.awt.Color(0, 204, 102));
        LamMoiBtn.setForeground(new java.awt.Color(255, 255, 255));
        LamMoiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/undo.png"))); // NOI18N
        LamMoiBtn.setText("Làm mới mật khẩu");
        LamMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiBtnActionPerformed(evt);
            }
        });
        jPanel4.add(LamMoiBtn);

        QuayLaiBtn.setBackground(new java.awt.Color(0, 204, 102));
        QuayLaiBtn.setForeground(new java.awt.Color(255, 255, 255));
        QuayLaiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/exit.png"))); // NOI18N
        QuayLaiBtn.setText("Thoát");
        QuayLaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuayLaiBtnActionPerformed(evt);
            }
        });
        jPanel4.add(QuayLaiBtn);

        jPanel7.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(153, 153, 153)));

        TenDangNhapLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TenDangNhapLabel.setForeground(new java.awt.Color(0, 0, 0));
        TenDangNhapLabel.setText("Tên đăng nhập");

        TenDangNhapField.setEditable(false);
        TenDangNhapField.setBackground(new java.awt.Color(255, 255, 255));
        TenDangNhapField.setForeground(new java.awt.Color(0, 0, 0));
        TenDangNhapField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TenDangNhapField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        TrangThaiLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TrangThaiLabel.setForeground(new java.awt.Color(0, 0, 0));
        TrangThaiLabel.setText("Phân quyền");

        PhanQuyenField.setEditable(false);
        PhanQuyenField.setBackground(new java.awt.Color(255, 255, 255));
        PhanQuyenField.setForeground(new java.awt.Color(0, 0, 0));
        PhanQuyenField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PhanQuyenField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrangThaiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PhanQuyenField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenDangNhapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenDangNhapField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TenDangNhapLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TenDangNhapField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TrangThaiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhanQuyenField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TimKiemLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TimKiemLabel.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemLabel.setText("Tìm kiếm theo");

        TimKiemField.setBackground(new java.awt.Color(255, 255, 255));
        TimKiemField.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemField.setBorder(null);
        TimKiemField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TimKiemFieldItemStateChanged(evt);
            }
        });

        TuKhoaLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TuKhoaLabel.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaLabel.setText("Từ khóa");

        TimKiemBtn.setBackground(new java.awt.Color(0, 204, 102));
        TimKiemBtn.setForeground(new java.awt.Color(255, 255, 255));
        TimKiemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/search.png"))); // NOI18N
        TimKiemBtn.setText("Tìm kiếm");
        TimKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtnActionPerformed(evt);
            }
        });

        TimKiemPanel.setBackground(new java.awt.Color(255, 255, 255));

        TuKhoaField.setBackground(new java.awt.Color(255, 255, 255));
        TuKhoaField.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout TimKiemPanelLayout = new javax.swing.GroupLayout(TimKiemPanel);
        TimKiemPanel.setLayout(TimKiemPanelLayout);
        TimKiemPanelLayout.setHorizontalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimKiemPanelLayout.createSequentialGroup()
                .addComponent(TuKhoaField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuKhoaCombobox, 0, 87, Short.MAX_VALUE))
        );
        TimKiemPanelLayout.setVerticalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimKiemPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TuKhoaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TuKhoaCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TimKiemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(TimKiemField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TuKhoaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimKiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(TimKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TimKiemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TuKhoaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(TimKiemBtn)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuayLaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuayLaiBtnActionPerformed
        // TODO add your handling code here:
        new QuanLy_View(phanQuyen, tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_QuayLaiBtnActionPerformed

    private void DanhSachTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhSachTaiKhoanMouseClicked
        // TODO add your handling code here:
        int index = DanhSachTaiKhoan.getSelectedRow();
        TenDangNhapField.setText((String) model.getValueAt(index, 0));
        PhanQuyenField.setText((String) model.getValueAt(index, 1));
        if("Khóa".equals((String) model.getValueAt(index, 2))){
            KhoaBtn.setSelected(true);
            KhoaBtn.setText("Mở khóa");
        }else{
            KhoaBtn.setSelected(false);
            KhoaBtn.setText("Khóa");    
        }
        
    }//GEN-LAST:event_DanhSachTaiKhoanMouseClicked

    private void LamMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiBtnActionPerformed
        // TODO add your handling code here:
        TaiKhoanDAO.getInstance().lamMoiMatKhau(TenDangNhapField.getText());
        this.getAllTaiKhoan();
    }//GEN-LAST:event_LamMoiBtnActionPerformed

    private void KhoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhoaBtnActionPerformed
        // TODO add your handling code here:
        if(KhoaBtn.isSelected()){
            TaiKhoan tk = new TaiKhoan();
            tk.setTenDangNhap(TenDangNhapField.getText());
            tk.setTrangThai("Khóa");
            TaiKhoanDAO.getInstance().update(tk);
            KhoaBtn.setText("Mở khóa");
            JOptionPane.showMessageDialog(rootPane, "Khóa tài khoản thành công");
        }
        else{
            TaiKhoan tk = new TaiKhoan();
            tk.setTenDangNhap(TenDangNhapField.getText());
            tk.setTrangThai("Hoạt Động");
            TaiKhoanDAO.getInstance().update(tk);
            KhoaBtn.setText("Khóa");
            JOptionPane.showMessageDialog(rootPane, "Mở khóa tài khoản thành công");
        }
        this.getAllTaiKhoan();
    }//GEN-LAST:event_KhoaBtnActionPerformed

    private void TimKiemFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TimKiemFieldItemStateChanged
        // TODO add your handling code here:
        if("Tên đăng nhập".equals((String)TimKiemField.getSelectedItem())){            
            TuKhoaField.setPreferredSize(new Dimension(TimKiemPanel.getWidth(), TimKiemPanel.getHeight()));
            TimKiemPanel.removeAll();
            TimKiemPanel.setLayout(new CardLayout());
            TimKiemPanel.add(TuKhoaField);
            TimKiemPanel.validate();
            TimKiemPanel.repaint();
        }
        else{
            TuKhoaCombobox.setPreferredSize(new Dimension(TimKiemPanel.getWidth(), TimKiemPanel.getHeight()));
            TimKiemPanel.removeAll();
            TimKiemPanel.setLayout(new CardLayout());
            TimKiemPanel.add(TuKhoaCombobox);
            TimKiemPanel.validate();
            TimKiemPanel.repaint();  
            TuKhoaCombobox.removeAllItems();
            if("Quyền truy cập".equals((String)TimKiemField.getSelectedItem())){
                String []tenCot ={"Quản lý", "Nhân viên bán hàng", "Thủ kho"}; 
                for(int i = 0; i < tenCot.length; i++)
                    TuKhoaCombobox.addItem(tenCot[i]);
            }
            else{
                String []tenCot ={"Hoạt Động", "Khóa"}; 
                for(int i = 0; i < tenCot.length; i++)
                    TuKhoaCombobox.addItem(tenCot[i]);
            }
            
        }
    }//GEN-LAST:event_TimKiemFieldItemStateChanged

    private void TimKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtnActionPerformed
        // TODO add your handling code here:
        String timKiemTheo = (String) TimKiemField.getSelectedItem();        
        ArrayList<TaiKhoan> taiKhoan = new ArrayList<>();
        if ("Tên đăng nhập".equals(timKiemTheo)){
            if(!"".equals(TuKhoaField.getText())){
                taiKhoan.add(TaiKhoanDAO.getInstance().getById(TuKhoaField.getText()));
            }
        } else if ("Trạng thái".equals(timKiemTheo)) {
            taiKhoan = TaiKhoanDAO.getInstance().getByTrangThai((String) TuKhoaCombobox.getSelectedItem());
        }else if ("Quyền truy cập".equals(timKiemTheo)) {
            taiKhoan = TaiKhoanDAO.getInstance().getByPhanQuyen((String) TuKhoaCombobox.getSelectedItem());
        }else {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy");
        }
    }//GEN-LAST:event_TimKiemBtnActionPerformed
    private void setTimKiemField(){
        String [] tenCot ={"Tên đăng nhập", "Trạng thái", "Quyền truy cập"}; 
        for(int i = 0; i < tenCot.length; i++)
            TimKiemField.addItem(tenCot[i]);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DanhSachTaiKhoan;
    private javax.swing.JToggleButton KhoaBtn;
    private javax.swing.JButton LamMoiBtn;
    private javax.swing.JTextField PhanQuyenField;
    private javax.swing.JButton QuayLaiBtn;
    private javax.swing.JTextField TenDangNhapField;
    private javax.swing.JLabel TenDangNhapLabel;
    private javax.swing.JButton TimKiemBtn;
    private javax.swing.JComboBox<String> TimKiemField;
    private javax.swing.JLabel TimKiemLabel;
    private javax.swing.JPanel TimKiemPanel;
    private javax.swing.JLabel TrangThaiLabel;
    private javax.swing.JComboBox<String> TuKhoaCombobox;
    private javax.swing.JTextField TuKhoaField;
    private javax.swing.JLabel TuKhoaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
