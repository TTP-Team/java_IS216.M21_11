/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.KhachHang;
import Model.SuKien;
import com.toedter.calendar.JDateChooser;
import dao.KhachHangDAO;
import dao.SuKienDAO;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thanh PC
 */
public class QuanLySuKien extends javax.swing.JFrame {

    private DefaultTableModel model;
    private String phanQuyen;
    private String tenTaiKhoan;
    private String chucNang;

    /**
     * Creates new form QuanLySuKien
     */
    public QuanLySuKien(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setTitle("Quản lý sản phẩm");
        this.setLocationRelativeTo(null);
        this.getAllSuKien();
        VoHieuHoaBtn(false);
        NgayBatDauField.setDateFormatString("dd/MM/yyyy");
        NgayKetThucField.setDateFormatString("dd/MM/yyyy");
        this.setTimKiemField();
        TuKhoaDate.setDateFormatString("dd/MM/yyyy");
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maNV;
        if (phanQuyen != "QL") {
            this.ThemBtn.setVisible(false);
            this.XoaBtn.setVisible(false);
            this.SuaBtn.setVisible(false);
            this.BoQuaBtn.setVisible(false);
            this.LuuBtn.setVisible(false);

        }

    }

    private void VoHieuHoaBtn(boolean val) {
        this.ThemBtn.setEnabled(!val);
        this.XoaBtn.setEnabled(!val);
        this.SuaBtn.setEnabled(!val);
        this.BoQuaBtn.setEnabled(val);
        this.LuuBtn.setEnabled(val);
        this.TenSuKienField.setEnabled(val);
        this.NgayBatDauField.setEnabled(val);
        this.NgayKetThucField.setEnabled(val);
        this.PhanTramGiamGiaField.setEnabled(val);
    }

    private void ResetValue() {
        MaSuKienField.setText("");
        TenSuKienField.setText("");
        NgayBatDauField.setDate(null);
        NgayKetThucField.setDate(null);
        PhanTramGiamGiaField.setText("");
    }

    private void hienThi(ArrayList<SuKien> t) {
        model = (DefaultTableModel) DanhSachSuKien.getModel();
        model.setRowCount(0);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (SuKien i : t) {
            String ngayBatDau = dateFormat.format(i.getNgayBatDau());
            String ngayKetThuc = dateFormat.format(i.getNgayKetThuc());
            String[] dataRow = {i.getMaSuKien(), i.getTenSuKien(), String.valueOf(i.getGiamGia()), ngayBatDau, ngayKetThuc};
            model.addRow(dataRow);
        }
    }

    private void getAllSuKien() {
        ArrayList<SuKien> suKien = SuKienDAO.getInstance().getAll();
        this.hienThi(suKien);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DanhSachSuKien = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        ThemBtn = new javax.swing.JButton();
        XoaBtn = new javax.swing.JButton();
        SuaBtn = new javax.swing.JButton();
        LuuBtn = new javax.swing.JButton();
        BoQuaBtn = new javax.swing.JButton();
        QuayLaiBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        MaSuKienLabel = new javax.swing.JLabel();
        MaSuKienField = new javax.swing.JTextField();
        TenSuKienLabel = new javax.swing.JLabel();
        TenSuKienField = new javax.swing.JTextField();
        PhanTramGiamGiaLabel = new javax.swing.JLabel();
        PhanTramGiamGiaField = new javax.swing.JTextField();
        NgayBatDauLabel = new javax.swing.JLabel();
        NgayKetThucLabel = new javax.swing.JLabel();
        NgayBatDauField = new com.toedter.calendar.JDateChooser();
        NgayKetThucField = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        TimKiemLabel = new javax.swing.JLabel();
        TimKiemField = new javax.swing.JComboBox<>();
        TuKhoaLabel = new javax.swing.JLabel();
        TimKiemPanel = new javax.swing.JPanel();
        TuKhoaField = new javax.swing.JTextField();
        TuKhoaDate = new com.toedter.calendar.JDateChooser();
        TimKiemBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 204));

        DanhSachSuKien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sự kiện", "Tên sự kiện", "Phần trăm giảm giá", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DanhSachSuKien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhSachSuKienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DanhSachSuKien);
        if (DanhSachSuKien.getColumnModel().getColumnCount() > 0) {
            DanhSachSuKien.getColumnModel().getColumn(0).setResizable(false);
            DanhSachSuKien.getColumnModel().getColumn(1).setResizable(false);
            DanhSachSuKien.getColumnModel().getColumn(2).setResizable(false);
            DanhSachSuKien.getColumnModel().getColumn(3).setResizable(false);
            DanhSachSuKien.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        ThemBtn.setBackground(new java.awt.Color(0, 204, 102));
        ThemBtn.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        ThemBtn.setForeground(new java.awt.Color(255, 255, 255));
        ThemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/add.png"))); // NOI18N
        ThemBtn.setText("Thêm");
        ThemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ThemBtn);

        XoaBtn.setBackground(new java.awt.Color(0, 204, 102));
        XoaBtn.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        XoaBtn.setForeground(new java.awt.Color(255, 255, 255));
        XoaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/delete-button.png"))); // NOI18N
        XoaBtn.setText("Xóa");
        XoaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaBtnActionPerformed(evt);
            }
        });
        jPanel4.add(XoaBtn);

        SuaBtn.setBackground(new java.awt.Color(0, 204, 102));
        SuaBtn.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        SuaBtn.setForeground(new java.awt.Color(255, 255, 255));
        SuaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/edit.png"))); // NOI18N
        SuaBtn.setText("Sửa");
        SuaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SuaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaBtnActionPerformed(evt);
            }
        });
        jPanel4.add(SuaBtn);

        LuuBtn.setBackground(new java.awt.Color(0, 204, 102));
        LuuBtn.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        LuuBtn.setForeground(new java.awt.Color(255, 255, 255));
        LuuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/save.png"))); // NOI18N
        LuuBtn.setText("Lưu");
        LuuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LuuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuBtnActionPerformed(evt);
            }
        });
        jPanel4.add(LuuBtn);

        BoQuaBtn.setBackground(new java.awt.Color(0, 204, 102));
        BoQuaBtn.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        BoQuaBtn.setForeground(new java.awt.Color(255, 255, 255));
        BoQuaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/cancel.png"))); // NOI18N
        BoQuaBtn.setText("Hủy");
        BoQuaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BoQuaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoQuaBtnActionPerformed(evt);
            }
        });
        jPanel4.add(BoQuaBtn);

        QuayLaiBtn.setBackground(new java.awt.Color(0, 204, 102));
        QuayLaiBtn.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        QuayLaiBtn.setForeground(new java.awt.Color(255, 255, 255));
        QuayLaiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/exit.png"))); // NOI18N
        QuayLaiBtn.setText("Thoát");
        QuayLaiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QuayLaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuayLaiBtnActionPerformed(evt);
            }
        });
        jPanel4.add(QuayLaiBtn);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        MaSuKienLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        MaSuKienLabel.setForeground(new java.awt.Color(0, 0, 0));
        MaSuKienLabel.setText("Mã sự kiện");

        MaSuKienField.setEditable(false);
        MaSuKienField.setBackground(new java.awt.Color(255, 255, 255));
        MaSuKienField.setForeground(new java.awt.Color(0, 0, 0));
        MaSuKienField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        MaSuKienField.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        TenSuKienLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TenSuKienLabel.setForeground(new java.awt.Color(0, 0, 0));
        TenSuKienLabel.setText("Tên sự kiện");

        TenSuKienField.setBackground(new java.awt.Color(255, 255, 255));
        TenSuKienField.setForeground(new java.awt.Color(0, 0, 0));
        TenSuKienField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), null));
        TenSuKienField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        PhanTramGiamGiaLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        PhanTramGiamGiaLabel.setForeground(new java.awt.Color(0, 0, 0));
        PhanTramGiamGiaLabel.setText("Phần trăm giảm giá");

        PhanTramGiamGiaField.setBackground(new java.awt.Color(255, 255, 255));
        PhanTramGiamGiaField.setForeground(new java.awt.Color(0, 0, 0));
        PhanTramGiamGiaField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), null));
        PhanTramGiamGiaField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        NgayBatDauLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        NgayBatDauLabel.setForeground(new java.awt.Color(0, 0, 0));
        NgayBatDauLabel.setText("Ngày bắt đầu");

        NgayKetThucLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        NgayKetThucLabel.setForeground(new java.awt.Color(0, 0, 0));
        NgayKetThucLabel.setText("Ngày kết thúc");

        NgayBatDauField.setBackground(new java.awt.Color(255, 255, 255));
        NgayBatDauField.setForeground(new java.awt.Color(0, 0, 0));

        NgayKetThucField.setBackground(new java.awt.Color(255, 255, 255));
        NgayKetThucField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaSuKienField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NgayBatDauField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhanTramGiamGiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NgayBatDauLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhanTramGiamGiaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TenSuKienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TenSuKienField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NgayKetThucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NgayKetThucField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(MaSuKienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TenSuKienLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TenSuKienField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MaSuKienLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaSuKienField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgayBatDauLabel)
                    .addComponent(NgayKetThucLabel))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NgayBatDauField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(NgayKetThucField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(PhanTramGiamGiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhanTramGiamGiaField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(153, 153, 153)));

        TimKiemLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TimKiemLabel.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemLabel.setText("Tìm kiếm theo");

        TimKiemField.setBackground(new java.awt.Color(255, 255, 255));
        TimKiemField.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TimKiemFieldItemStateChanged(evt);
            }
        });

        TuKhoaLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TuKhoaLabel.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaLabel.setText("Từ khóa");

        TuKhoaField.setBackground(new java.awt.Color(255, 255, 255));
        TuKhoaField.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), null));

        javax.swing.GroupLayout TimKiemPanelLayout = new javax.swing.GroupLayout(TimKiemPanel);
        TimKiemPanel.setLayout(TimKiemPanelLayout);
        TimKiemPanelLayout.setHorizontalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimKiemPanelLayout.createSequentialGroup()
                .addComponent(TuKhoaField, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuKhoaDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TimKiemPanelLayout.setVerticalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimKiemPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TuKhoaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TuKhoaDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TimKiemBtn.setBackground(new java.awt.Color(0, 204, 102));
        TimKiemBtn.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        TimKiemBtn.setForeground(new java.awt.Color(255, 255, 255));
        TimKiemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/search.png"))); // NOI18N
        TimKiemBtn.setText("Tìm kiếm");
        TimKiemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TimKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TuKhoaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimKiemPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TimKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(TimKiemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TuKhoaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TimKiemBtn)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 204, 102));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ SỰ KIỆN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(268, 268, 268))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ThemSuKien() throws ParseException {
        Date ngayBatDau = new Date(NgayBatDauField.getDate().getTime());
        Date ngayKetThuc = new Date(NgayKetThucField.getDate().getTime());
        SuKien sk = new SuKien("", TenSuKienField.getText(), Float.parseFloat(PhanTramGiamGiaField.getText()), ngayBatDau, ngayKetThuc);
        SuKienDAO.getInstance().insert(sk);
        ResetValue();
        this.getAllSuKien();
    }
    private void ThemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBtnActionPerformed
        // TODO add your handling code here:
        this.ResetValue();
        VoHieuHoaBtn(true);
        this.TenSuKienField.requestFocus();
        this.chucNang = "Them";
    }//GEN-LAST:event_ThemBtnActionPerformed

    private void BoQuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoQuaBtnActionPerformed
        // TODO add your handling code here:
        this.VoHieuHoaBtn(false);
        this.ResetValue();
    }//GEN-LAST:event_BoQuaBtnActionPerformed

    private void XoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBtnActionPerformed
        // TODO add your handling code here:
        int index = DanhSachSuKien.getSelectedRow();

        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chọn dòng cần xóa");
        } else {
            if (SuKienDAO.getInstance().delete((String) model.getValueAt(index, 0)) == 0) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi. Không thể xóa!");
            } else {
                this.ResetValue();
                this.getAllSuKien();
            }
        }
    }//GEN-LAST:event_XoaBtnActionPerformed

    private void LuuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuBtnActionPerformed
        // TODO add your handling code here:
        if (!"".equals(TenSuKienField.getText())) {
            if ("Them".equals(this.chucNang))
                try {
                ThemSuKien();
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            } else if ("Sua".equals(this.chucNang)) {
                Date ngayBatDau = new Date(NgayBatDauField.getDate().getTime());
                Date ngayKetThuc = new Date(NgayKetThucField.getDate().getTime());
                SuKien sk = new SuKien(MaSuKienField.getText(), TenSuKienField.getText(), Float.parseFloat(PhanTramGiamGiaField.getText()), ngayBatDau, ngayKetThuc);
                SuKienDAO.getInstance().update(sk);
            }
            this.VoHieuHoaBtn(false);
            this.getAllSuKien();
            this.ResetValue();

        } else
            JOptionPane.showMessageDialog(rootPane, "Tên sự kiện còn trống!");
    }//GEN-LAST:event_LuuBtnActionPerformed

    private void SuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaBtnActionPerformed
        // TODO add your handling code here:
        VoHieuHoaBtn(true);
        this.chucNang = "Sua";
    }//GEN-LAST:event_SuaBtnActionPerformed

    private void DanhSachSuKienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhSachSuKienMouseClicked
        // TODO add your handling code here:
        int index = DanhSachSuKien.getSelectedRow();
        VoHieuHoaBtn(false);
        MaSuKienField.setText((String) model.getValueAt(index, 0));
        TenSuKienField.setText((String) model.getValueAt(index, 1));
        PhanTramGiamGiaField.setText((String) model.getValueAt(index, 2));

        try {
            java.util.Date ngayBatDau = new SimpleDateFormat("dd/MM/yyyy").parse((String) model.getValueAt(index, 3));
            NgayBatDauField.setDate(ngayBatDau);
            java.util.Date ngayKetThuc = new SimpleDateFormat("dd/MM/yyyy").parse((String) model.getValueAt(index, 4));
            NgayKetThucField.setDate(ngayKetThuc);
        } catch (ParseException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_DanhSachSuKienMouseClicked

    private void TimKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtnActionPerformed
        // TODO add your handling code here:
        String timKiemTheo = (String) TimKiemField.getSelectedItem();
        ArrayList<SuKien> suKien = new ArrayList<>();
        if (!"".equals(TuKhoaField.getText()) || TuKhoaDate.getDate() != null) {
            if ("Mã sự kiện".equals(timKiemTheo)) {
                suKien.add(SuKienDAO.getInstance().getById(TuKhoaField.getText()));
            } else if ("Tên sự kiện".equals(timKiemTheo)) {
                suKien = SuKienDAO.getInstance().getByTen(TuKhoaField.getText());
            } else if ("Ngày sự kiện".equals(timKiemTheo)) {
                suKien = SuKienDAO.getInstance().getByNgay(new Date(TuKhoaDate.getDate().getTime()));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!");
            }
            this.hienThi(suKien);
        } else
            this.getAllSuKien();
    }//GEN-LAST:event_TimKiemBtnActionPerformed

    private void TimKiemFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TimKiemFieldItemStateChanged
        // TODO add your handling code here:
        if ("Ngày sự kiện".equals((String) TimKiemField.getSelectedItem())) {
            TuKhoaDate.setPreferredSize(new Dimension(TimKiemPanel.getWidth(), TimKiemPanel.getHeight()));
            TimKiemPanel.removeAll();
            TimKiemPanel.setLayout(new CardLayout());
            TimKiemPanel.add(TuKhoaDate);
            TimKiemPanel.validate();
            TimKiemPanel.repaint();
        } else {
            TuKhoaField.setPreferredSize(new Dimension(TimKiemPanel.getWidth(), TimKiemPanel.getHeight()));
            TimKiemPanel.removeAll();
            TimKiemPanel.setLayout(new CardLayout());
            TimKiemPanel.add(TuKhoaField);
            TimKiemPanel.validate();
            TimKiemPanel.repaint();
        }
    }//GEN-LAST:event_TimKiemFieldItemStateChanged

    private void QuayLaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuayLaiBtnActionPerformed
        // TODO add your handling code here:
        if ("QL".equals(phanQuyen)) {
            new QuanLy_View(phanQuyen, tenTaiKhoan);
        } else if ("NVBH".equals(phanQuyen)) {
            new NhanVienBanHang_View(phanQuyen, tenTaiKhoan);
        } else if ("TK".equals(phanQuyen)) {
            new ThuKho_View(phanQuyen, tenTaiKhoan);
        }
        this.dispose();
    }//GEN-LAST:event_QuayLaiBtnActionPerformed
    private void setTimKiemField() {
        String[] tenCot = {"Mã sự kiện", "Tên sự kiện", "Ngày sự kiện"};
        for (int i = 0; i < tenCot.length; i++) {
            TimKiemField.addItem(tenCot[i]);
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoQuaBtn;
    private javax.swing.JTable DanhSachSuKien;
    private javax.swing.JButton LuuBtn;
    private javax.swing.JTextField MaSuKienField;
    private javax.swing.JLabel MaSuKienLabel;
    private com.toedter.calendar.JDateChooser NgayBatDauField;
    private javax.swing.JLabel NgayBatDauLabel;
    private com.toedter.calendar.JDateChooser NgayKetThucField;
    private javax.swing.JLabel NgayKetThucLabel;
    private javax.swing.JTextField PhanTramGiamGiaField;
    private javax.swing.JLabel PhanTramGiamGiaLabel;
    private javax.swing.JButton QuayLaiBtn;
    private javax.swing.JButton SuaBtn;
    private javax.swing.JTextField TenSuKienField;
    private javax.swing.JLabel TenSuKienLabel;
    private javax.swing.JButton ThemBtn;
    private javax.swing.JButton TimKiemBtn;
    private javax.swing.JComboBox<String> TimKiemField;
    private javax.swing.JLabel TimKiemLabel;
    private javax.swing.JPanel TimKiemPanel;
    private com.toedter.calendar.JDateChooser TuKhoaDate;
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
