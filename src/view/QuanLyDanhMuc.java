/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.DanhMuc;
import java.util.ArrayList;
import dao.DanhMucDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyDanhMuc extends javax.swing.JFrame {

    private String phanQuyen;
    private String tenTaiKhoan;
    private DefaultTableModel model;
    private String chucNang;

    /**
     * Creates new form QuanLyDanhMuc
     */
    public QuanLyDanhMuc(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getAllDanhMuc();
        this.BoQuaBtn.setVisible(false);
        this.TenDanhMucField.setEnabled(false);
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maNV;
        if (!"QL".equals(phanQuyen)) {
            this.ThemBtn.setVisible(false);
            this.XoaBtn.setVisible(false);
            this.SuaBtn.setVisible(false);
            this.BoQuaBtn.setVisible(false);
        }
        DanhSachDanhMuc.setRowHeight(25);
        VoHieuHoaBtn(false);

    }

    public void VoHieuHoaBtn(boolean val) {
        this.XoaBtn.setVisible(!val);
        this.ThemBtn.setVisible(!val);
        this.SuaBtn.setVisible(!val);
        this.ThoatBtn.setVisible(!val);
        this.LuuBtn.setVisible(val);
        this.BoQuaBtn.setVisible(val);
        this.TenDanhMucField.setEnabled(val);
    }

    public void themDanhMuc() {
        DanhMuc dm = new DanhMuc();
        dm.setTenDanhMuc(TenDanhMucField.getText());
        if (DanhMucDAO.getInstance().insert(dm) == 1) {
            JOptionPane.showMessageDialog(null,
                    "Thêm thành công",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Không thể thêm!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        };
        
        VoHieuHoaBtn(false);
        this.getAllDanhMuc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DanhSachDanhMuc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        ThemBtn = new javax.swing.JButton();
        SuaBtn = new javax.swing.JButton();
        XoaBtn = new javax.swing.JButton();
        ThoatBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ModifyPane = new javax.swing.JPanel();
        MaDanhMucLabel = new javax.swing.JLabel();
        MaDanhMucField = new javax.swing.JTextField();
        TenDanhMucLabel = new javax.swing.JLabel();
        TenDanhMucField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        LuuBtn = new javax.swing.JButton();
        BoQuaBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TimKiemLabel = new javax.swing.JLabel();
        TuKhoaLabel = new javax.swing.JLabel();
        TuKhoaField = new javax.swing.JTextField();
        TimKiemField = new javax.swing.JComboBox<>();
        TimKiemBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        DanhSachDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        DanhSachDanhMuc.setForeground(new java.awt.Color(0, 0, 0));
        DanhSachDanhMuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã danh mục", "Tên danh mục"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DanhSachDanhMuc.setGridColor(new java.awt.Color(102, 102, 102));
        DanhSachDanhMuc.setSelectionBackground(new java.awt.Color(153, 255, 153));
        DanhSachDanhMuc.setSelectionForeground(new java.awt.Color(0, 0, 0));
        DanhSachDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhSachDanhMucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DanhSachDanhMuc);
        if (DanhSachDanhMuc.getColumnModel().getColumnCount() > 0) {
            DanhSachDanhMuc.getColumnModel().getColumn(0).setResizable(false);
            DanhSachDanhMuc.getColumnModel().getColumn(0).setPreferredWidth(50);
            DanhSachDanhMuc.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 22, 0));

        ThemBtn.setBackground(new java.awt.Color(0, 204, 102));
        ThemBtn.setForeground(new java.awt.Color(255, 255, 255));
        ThemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/add.png"))); // NOI18N
        ThemBtn.setText("Thêm");
        ThemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ThemBtn);

        SuaBtn.setBackground(new java.awt.Color(0, 204, 102));
        SuaBtn.setForeground(new java.awt.Color(255, 255, 255));
        SuaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/edit.png"))); // NOI18N
        SuaBtn.setText("Sửa");
        SuaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SuaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SuaBtn);

        XoaBtn.setBackground(new java.awt.Color(0, 204, 102));
        XoaBtn.setForeground(new java.awt.Color(255, 255, 255));
        XoaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/delete-button.png"))); // NOI18N
        XoaBtn.setText("Xóa");
        XoaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaBtnActionPerformed(evt);
            }
        });
        jPanel3.add(XoaBtn);

        ThoatBtn.setBackground(new java.awt.Color(0, 204, 102));
        ThoatBtn.setForeground(new java.awt.Color(255, 255, 255));
        ThoatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/exit.png"))); // NOI18N
        ThoatBtn.setText("Thoát");
        ThoatBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThoatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ThoatBtn);

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setBackground(new java.awt.Color(255, 131, 2));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ DANH MỤC");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));

        ModifyPane.setBackground(new java.awt.Color(255, 255, 255));

        MaDanhMucLabel.setBackground(new java.awt.Color(255, 0, 102));
        MaDanhMucLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        MaDanhMucLabel.setForeground(new java.awt.Color(0, 0, 0));
        MaDanhMucLabel.setText("Mã danh mục");

        MaDanhMucField.setEditable(false);
        MaDanhMucField.setBackground(new java.awt.Color(255, 255, 255));
        MaDanhMucField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MaDanhMucField.setForeground(new java.awt.Color(0, 0, 0));
        MaDanhMucField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        MaDanhMucField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MaDanhMucField.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        TenDanhMucLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TenDanhMucLabel.setForeground(new java.awt.Color(51, 51, 51));
        TenDanhMucLabel.setText("Tên danh mục");

        TenDanhMucField.setBackground(new java.awt.Color(255, 255, 255));
        TenDanhMucField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TenDanhMucField.setForeground(new java.awt.Color(0, 0, 0));
        TenDanhMucField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TenDanhMucField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        LuuBtn.setBackground(new java.awt.Color(0, 204, 102));
        LuuBtn.setForeground(new java.awt.Color(255, 255, 255));
        LuuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/save.png"))); // NOI18N
        LuuBtn.setText("Lưu");
        LuuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LuuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuBtnActionPerformed(evt);
            }
        });
        jPanel6.add(LuuBtn);

        BoQuaBtn.setBackground(new java.awt.Color(0, 204, 102));
        BoQuaBtn.setForeground(new java.awt.Color(255, 255, 255));
        BoQuaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/cancel.png"))); // NOI18N
        BoQuaBtn.setText("Hủy");
        BoQuaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BoQuaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoQuaBtnActionPerformed(evt);
            }
        });
        jPanel6.add(BoQuaBtn);

        javax.swing.GroupLayout ModifyPaneLayout = new javax.swing.GroupLayout(ModifyPane);
        ModifyPane.setLayout(ModifyPaneLayout);
        ModifyPaneLayout.setHorizontalGroup(
            ModifyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyPaneLayout.createSequentialGroup()
                .addGroup(ModifyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModifyPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(ModifyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MaDanhMucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenDanhMucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenDanhMucField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(MaDanhMucField)))
                    .addGroup(ModifyPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ModifyPaneLayout.setVerticalGroup(
            ModifyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(MaDanhMucLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaDanhMucField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TenDanhMucLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TenDanhMucField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(153, 153, 153)));

        TimKiemLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TimKiemLabel.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemLabel.setText("Tìm kiếm theo");

        TuKhoaLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TuKhoaLabel.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaLabel.setText("Từ khóa");

        TuKhoaField.setBackground(new java.awt.Color(255, 255, 255));
        TuKhoaField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TuKhoaField.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TuKhoaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TuKhoaFieldKeyReleased(evt);
            }
        });

        TimKiemField.setBackground(new java.awt.Color(255, 255, 255));
        TimKiemField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TimKiemField.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã danh mục", "Tên danh mục" }));
        TimKiemField.setBorder(null);

        TimKiemBtn.setBackground(new java.awt.Color(0, 204, 102));
        TimKiemBtn.setForeground(new java.awt.Color(255, 255, 255));
        TimKiemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/search.png"))); // NOI18N
        TimKiemBtn.setText("Tìm kiếm");
        TimKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TuKhoaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TuKhoaField)
                    .addComponent(TimKiemField, 0, 208, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TimKiemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TuKhoaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuKhoaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TimKiemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModifyPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ModifyPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtnActionPerformed
        // TODO add your handling code here:
        String timKiemTheo = (String) TimKiemField.getSelectedItem();
        ArrayList<DanhMuc> danhMuc = new ArrayList<>();
        if (!"".equals(TuKhoaField.getText())) {
            if ("Mã danh mục".equals(timKiemTheo)) {
                danhMuc.add(DanhMucDAO.getInstance().getById(TuKhoaField.getText()));
            } else if ("Tên danh mục".equals(timKiemTheo)) {
                danhMuc = DanhMucDAO.getInstance().getByTen(TuKhoaField.getText());
            } else {
                JOptionPane.showMessageDialog(null,
                        "Không tìm thấy",
                        "",
                        JOptionPane.ERROR_MESSAGE);
            }
            this.hienThi(danhMuc);
        } else {
            this.getAllDanhMuc();
        }
    }//GEN-LAST:event_TimKiemBtnActionPerformed

    private void ThoatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatBtnActionPerformed
        // TODO add your handling code here:
        if ("QL".equals(phanQuyen)) {
            new QuanLy_View(phanQuyen, tenTaiKhoan);
        } else if ("NVBH".equals(phanQuyen)) {
            new NhanVienBanHang_View(phanQuyen, tenTaiKhoan);
        } else if ("TK".equals(phanQuyen)) {
            new ThuKho_View(phanQuyen, tenTaiKhoan);
        }
        this.dispose();

    }//GEN-LAST:event_ThoatBtnActionPerformed

    private void BoQuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoQuaBtnActionPerformed
        // TODO add your handling code here:
        this.VoHieuHoaBtn(false);
        this.ThemBtn.setVisible(true);
        this.SuaBtn.setVisible(true);
        TenDanhMucField.setText("");
    }//GEN-LAST:event_BoQuaBtnActionPerformed

    private void SuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaBtnActionPerformed
        // TODO add your handling code here:
        VoHieuHoaBtn(true);
        chucNang = "Sua";
        this.ThemBtn.setVisible(false);
    }//GEN-LAST:event_SuaBtnActionPerformed

    private void XoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBtnActionPerformed
        // TODO add your handling code here:
        int index = DanhSachDanhMuc.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null,
                    "Chọn dòng cần xóa",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(null,
                    "Bạn muốn xóa danh mục này ?",
                    "Xác nhận",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {

                int kq = DanhMucDAO.getInstance().delete((String) model.getValueAt(index, 0));
                if (kq == 1) {
                    MaDanhMucField.setText("");
                    TenDanhMucField.setText("");
                    this.getAllDanhMuc();
                    JOptionPane.showMessageDialog(null,
                            "Xóa thành công",
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Không thể xóa",
                            "",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                return;
            }
        }

    }//GEN-LAST:event_XoaBtnActionPerformed

    private void ThemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBtnActionPerformed
        // TODO add your handling code here:
        chucNang = "Them";
        TenDanhMucField.setText("");
        MaDanhMucField.setText("");
        this.SuaBtn.setVisible(false);
        VoHieuHoaBtn(true);
        this.TenDanhMucField.requestFocus();
    }//GEN-LAST:event_ThemBtnActionPerformed

    private void DanhSachDanhMucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhSachDanhMucMouseClicked
        // TODO add your handling code here:
        int index = DanhSachDanhMuc.getSelectedRow();
        MaDanhMucField.setText((String) model.getValueAt(index, 0));
        TenDanhMucField.setText((String) model.getValueAt(index, 1));
    }//GEN-LAST:event_DanhSachDanhMucMouseClicked

    private void LuuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuBtnActionPerformed
        // TODO add your handling code here:
        if (!"".equals(TenDanhMucField.getText())) {
            if (this.chucNang == "Them") {
                themDanhMuc();
            } else if (this.chucNang == "Sua") {
                DanhMuc dm = new DanhMuc(MaDanhMucField.getText(), TenDanhMucField.getText());
                int result = JOptionPane.showConfirmDialog(null,
                        "Bạn muốn sửa thông tin này ?",
                        "Xác nhận",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    if (DanhMucDAO.getInstance().update(dm) == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Sửa thành công",
                                "",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Không thể sửa!",
                                "",
                                JOptionPane.ERROR_MESSAGE);
                    };

                }
            }
            this.ThemBtn.setEnabled(true);
            this.XoaBtn.setEnabled(true);
            this.SuaBtn.setEnabled(true);
            this.BoQuaBtn.setEnabled(false);
            this.LuuBtn.setEnabled(false);
            this.TenDanhMucField.setEnabled(false);
            this.getAllDanhMuc();
            this.MaDanhMucField.setText("");
            this.TenDanhMucField.setText("");
        } else
            JOptionPane.showMessageDialog(null,
                    "Vui lòng điền đầy đủ thông tin",
                    "",
                    JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_LuuBtnActionPerformed

    private void TuKhoaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TuKhoaFieldKeyReleased
        // TODO add your handling code here:
        String timKiemTheo = (String) TimKiemField.getSelectedItem();
        ArrayList<DanhMuc> danhMuc = new ArrayList<>();
        if (!"".equals(TuKhoaField.getText())) {
            if ("Mã danh mục".equals(timKiemTheo)) {
                danhMuc = DanhMucDAO.getInstance().getByMaDanhMuc(TuKhoaField.getText());
            } else if ("Tên danh mục".equals(timKiemTheo)) {
                danhMuc = DanhMucDAO.getInstance().getByTen(TuKhoaField.getText());
            } 
            if(danhMuc != null)
                this.hienThi(danhMuc);
        }
        else{
            this.getAllDanhMuc();
        }
    }//GEN-LAST:event_TuKhoaFieldKeyReleased

    private void hienThi(ArrayList<DanhMuc> t) {
        model = (DefaultTableModel) DanhSachDanhMuc.getModel();
        model.setRowCount(0);
        for (DanhMuc i : t) {
            String[] dataRow = {i.getMaDanhMuc(), i.getTenDanhMuc()};
            model.addRow(dataRow);
        }
    }

    private void getAllDanhMuc() {
        ArrayList<DanhMuc> danhMuc = DanhMucDAO.getInstance().getAll();
        this.hienThi(danhMuc);
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoQuaBtn;
    private javax.swing.JTable DanhSachDanhMuc;
    private javax.swing.JButton LuuBtn;
    private javax.swing.JTextField MaDanhMucField;
    private javax.swing.JLabel MaDanhMucLabel;
    private javax.swing.JPanel ModifyPane;
    private javax.swing.JButton SuaBtn;
    private javax.swing.JTextField TenDanhMucField;
    private javax.swing.JLabel TenDanhMucLabel;
    private javax.swing.JButton ThemBtn;
    private javax.swing.JButton ThoatBtn;
    private javax.swing.JButton TimKiemBtn;
    private javax.swing.JComboBox<String> TimKiemField;
    private javax.swing.JLabel TimKiemLabel;
    private javax.swing.JTextField TuKhoaField;
    private javax.swing.JLabel TuKhoaLabel;
    private javax.swing.JButton XoaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
