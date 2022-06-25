/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.DanhMuc;
import Model.SanPham;
import dao.DanhMucDAO;
import java.io.File;
import dao.SanPhamDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;

/**
 *
 * @author Thanh PC
 */
public class QuanLySanPham extends javax.swing.JFrame {

    private DefaultTableModel model;
    private String chucNang;
    private String phanQuyen;
    private String tenTaiKhoan;
    private String hinhAnh;

    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLySanPham(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setTitle("Quản lý sản phẩm");
        this.setLocationRelativeTo(null);
        this.getAllSanPham();
        VoHieuHoaBtn(false);
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maNV;
        this.HienThiDanhMuc();
        this.setTimKiemField();
        if (!"QL".equals(phanQuyen)) {
            this.ThemBtn.setVisible(false);
            this.XoaBtn.setVisible(false);
            this.SuaBtn.setVisible(false);
            this.BoQuaBtn.setVisible(false);
            this.LuuBtn.setVisible(false);
            this.HinhAnhBtn.setVisible(false);
        }
        MaDanhMucField.setRenderer(new DefaultListCellRenderer() {
            @Override
            public void paint(Graphics g) {
                setForeground(Color.BLACK);
                setBackground(Color.WHITE);
                super.paint(g);
            }
        });
        DanhSachSanPham.setRowHeight(25);
    }

    private void VoHieuHoaBtn(boolean val) {
        this.ThemBtn.setVisible(!val);
        this.XoaBtn.setVisible(!val);
        this.SuaBtn.setVisible(!val);
        this.BoQuaBtn.setVisible(val);
        this.QuayLaiBtn.setVisible(!val);
        this.LuuBtn.setVisible(val);
        this.TenSanPhamField.setEnabled(val);
        this.KichThuocField.setEnabled(val);
        this.MauSacField.setEnabled(val);
        this.HangSanXuatField.setEnabled(val);
        this.MonTheThaoField.setEnabled(val);
        this.MaDanhMucField.setEnabled(val);
        this.SoNgayBaoHanhField.setEnabled(val);
        this.DonGiaSiField.setEnabled(val);
        this.DonGiaLeField.setEnabled(val);
        this.MoTaField.setEnabled(val);
        this.HinhAnhBtn.setVisible(val);

    }

    private void ResetValue() {
        MaSanPhamField.setText("");
        TenSanPhamField.setText("");
        SoLuongField.setText("0");
        KichThuocField.setText("");
        MoTaField.setText("");
        HangSanXuatField.setText("");
        MauSacField.setText("");
        DonGiaSiField.setText("");
        DonGiaLeField.setText("");
        MonTheThaoField.setText("");
        MaDanhMucField.setSelectedItem("");
        SoNgayBaoHanhField.setText("");
        AnhLabel.setIcon(null);
    }

    public void ThemSanPham() {

        SanPham sp = new SanPham("", TenSanPhamField.getText(), Integer.parseInt(SoLuongField.getText()), KichThuocField.getText(), hinhAnh, MoTaField.getText(), HangSanXuatField.getText(), MauSacField.getText(), Double.parseDouble(DonGiaSiField.getText()), Double.parseDouble(DonGiaLeField.getText()), MonTheThaoField.getText(), MaDanhMucField.getSelectedItem().toString(), Integer.parseInt(SoNgayBaoHanhField.getText()));

        if (SanPhamDAO.getInstance().insert(sp) == 1) {
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
        ResetValue();
        this.getAllSanPham();

        SanPham sp = new SanPham("", TenSanPhamField.getText(), Integer.parseInt(SoLuongField.getText()), KichThuocField.getText(), HinhAnhField.getText(), MoTaField.getText(), HangSanXuatField.getText(), MauSacField.getText(), Double.parseDouble(DonGiaSiField.getText()), Double.parseDouble(DonGiaLeField.getText()), MonTheThaoField.getText(), MaDanhMucField.getSelectedItem().toString(), Integer.parseInt(SoNgayBaoHanhField.getText()));
        
        {
            SanPhamDAO.getInstance().insert(sp);
            ResetValue();
            this.getAllSanPham();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DanhSachSanPham = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        MaSanPhamLabel = new javax.swing.JLabel();
        MaSanPhamField = new javax.swing.JTextField();
        TenSanPhamLabel = new javax.swing.JLabel();
        TenSanPhamField = new javax.swing.JTextField();
        SoLuongField = new javax.swing.JTextField();
        SoLuongLabel = new javax.swing.JLabel();
        KichThuocLabel = new javax.swing.JLabel();
        KichThuocField = new javax.swing.JTextField();
        MoTaLabel = new javax.swing.JLabel();
        HangSanXuatField = new javax.swing.JTextField();
        HangSanXuatLabel = new javax.swing.JLabel();
        MauSacField = new javax.swing.JTextField();
        MauSacLabel = new javax.swing.JLabel();
        DonGiaSiField = new javax.swing.JTextField();
        DonGiaSiLabel = new javax.swing.JLabel();
        DonGiaLeLabel = new javax.swing.JLabel();
        DonGiaLeField = new javax.swing.JTextField();
        MonTheThaoField = new javax.swing.JTextField();
        MonTheThaoLabel = new javax.swing.JLabel();
        MaDanhMucLabel = new javax.swing.JLabel();
        SoNgayBaoHanhLabel = new javax.swing.JLabel();
        SoNgayBaoHanhField = new javax.swing.JTextField();
        HinhAnhPanel = new javax.swing.JPanel();
        AnhLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MoTaField = new javax.swing.JTextArea();
        HinhAnhBtn = new javax.swing.JButton();
        MaDanhMucField = new javax.swing.JComboBox<>();
        TenDanhMucLabel = new javax.swing.JLabel();
        TenDanhMucField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        LuuBtn = new javax.swing.JButton();
        BoQuaBtn = new javax.swing.JButton();
        TimKiemPanel = new javax.swing.JPanel();
        TimKiemField = new javax.swing.JComboBox<>();
        TuKhoaField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TimKiemBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        XoaBtn = new javax.swing.JButton();
        ThemBtn = new javax.swing.JButton();
        QuayLaiBtn = new javax.swing.JButton();
        SuaBtn = new javax.swing.JButton();
        TimKiemLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(1450, 820));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        DanhSachSanPham.setBackground(new java.awt.Color(255, 255, 255));
        DanhSachSanPham.setForeground(new java.awt.Color(0, 0, 0));
        DanhSachSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Kích thước", "Hình ảnh", "Mô tả", "Hãng sản xuất", "Màu sắc", "Đơn giá sỉ ", "Đơn giá lẻ", "Môn thể thao", "Mã danh mục", "Số ngày bảo hành"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DanhSachSanPham.setGridColor(new java.awt.Color(102, 102, 102));
        DanhSachSanPham.setPreferredSize(new java.awt.Dimension(1400, 800));
        DanhSachSanPham.setSelectionBackground(new java.awt.Color(153, 255, 153));
        DanhSachSanPham.setSelectionForeground(new java.awt.Color(0, 0, 0));
        DanhSachSanPham.getTableHeader().setReorderingAllowed(false);
        DanhSachSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhSachSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DanhSachSanPham);
        if (DanhSachSanPham.getColumnModel().getColumnCount() > 0) {
            DanhSachSanPham.getColumnModel().getColumn(0).setResizable(false);
            DanhSachSanPham.getColumnModel().getColumn(2).setResizable(false);
            DanhSachSanPham.getColumnModel().getColumn(3).setResizable(false);
            DanhSachSanPham.getColumnModel().getColumn(4).setResizable(false);
            DanhSachSanPham.getColumnModel().getColumn(7).setResizable(false);
            DanhSachSanPham.getColumnModel().getColumn(11).setResizable(false);
            DanhSachSanPham.getColumnModel().getColumn(12).setResizable(false);
        }

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(153, 153, 153)));

        MaSanPhamLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        MaSanPhamLabel.setForeground(new java.awt.Color(0, 0, 0));
        MaSanPhamLabel.setText("Mã sản phẩm");

        MaSanPhamField.setEditable(false);
        MaSanPhamField.setBackground(new java.awt.Color(255, 255, 255));
        MaSanPhamField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MaSanPhamField.setForeground(new java.awt.Color(0, 0, 0));
        MaSanPhamField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        MaSanPhamField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MaSanPhamField.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        MaSanPhamField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        TenSanPhamLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TenSanPhamLabel.setForeground(new java.awt.Color(0, 0, 0));
        TenSanPhamLabel.setText("Tên sản phẩm");

        TenSanPhamField.setBackground(new java.awt.Color(255, 255, 255));
        TenSanPhamField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TenSanPhamField.setForeground(new java.awt.Color(0, 0, 0));
        TenSanPhamField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TenSanPhamField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        SoLuongField.setEditable(false);
        SoLuongField.setBackground(new java.awt.Color(255, 255, 255));
        SoLuongField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SoLuongField.setForeground(new java.awt.Color(0, 0, 0));
        SoLuongField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SoLuongField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        SoLuongLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        SoLuongLabel.setForeground(new java.awt.Color(0, 0, 0));
        SoLuongLabel.setText("Số lượng");

        KichThuocLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        KichThuocLabel.setForeground(new java.awt.Color(0, 0, 0));
        KichThuocLabel.setText("Kích thước");

        KichThuocField.setBackground(new java.awt.Color(255, 255, 255));
        KichThuocField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        KichThuocField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        KichThuocField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        MoTaLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        MoTaLabel.setForeground(new java.awt.Color(0, 0, 0));
        MoTaLabel.setText("Mô tả");

        HangSanXuatField.setBackground(new java.awt.Color(255, 255, 255));
        HangSanXuatField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        HangSanXuatField.setForeground(new java.awt.Color(0, 0, 0));
        HangSanXuatField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        HangSanXuatField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        HangSanXuatLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        HangSanXuatLabel.setForeground(new java.awt.Color(0, 0, 0));
        HangSanXuatLabel.setText("Hãng sản xuất");

        MauSacField.setBackground(new java.awt.Color(255, 255, 255));
        MauSacField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MauSacField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        MauSacField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        MauSacLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        MauSacLabel.setForeground(new java.awt.Color(0, 0, 0));
        MauSacLabel.setText("Màu sắc");

        DonGiaSiField.setBackground(new java.awt.Color(255, 255, 255));
        DonGiaSiField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DonGiaSiField.setForeground(new java.awt.Color(0, 0, 0));
        DonGiaSiField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        DonGiaSiField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        DonGiaSiLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        DonGiaSiLabel.setForeground(new java.awt.Color(0, 0, 0));
        DonGiaSiLabel.setText("Đơn giá sỉ");

        DonGiaLeLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        DonGiaLeLabel.setForeground(new java.awt.Color(0, 0, 0));
        DonGiaLeLabel.setText("Đơn giá lẻ");

        DonGiaLeField.setBackground(new java.awt.Color(255, 255, 255));
        DonGiaLeField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DonGiaLeField.setForeground(new java.awt.Color(0, 0, 0));
        DonGiaLeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        DonGiaLeField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        MonTheThaoField.setBackground(new java.awt.Color(255, 255, 255));
        MonTheThaoField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MonTheThaoField.setForeground(new java.awt.Color(0, 0, 0));
        MonTheThaoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        MonTheThaoField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        MonTheThaoLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        MonTheThaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        MonTheThaoLabel.setText("Môn thể thao");

        MaDanhMucLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        MaDanhMucLabel.setForeground(new java.awt.Color(0, 0, 0));
        MaDanhMucLabel.setText("Mã danh mục");

        SoNgayBaoHanhLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        SoNgayBaoHanhLabel.setForeground(new java.awt.Color(0, 0, 0));
        SoNgayBaoHanhLabel.setText("Số ngày bảo hành");

        SoNgayBaoHanhField.setBackground(new java.awt.Color(255, 255, 255));
        SoNgayBaoHanhField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SoNgayBaoHanhField.setForeground(new java.awt.Color(0, 0, 0));
        SoNgayBaoHanhField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SoNgayBaoHanhField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        HinhAnhPanel.setBackground(new java.awt.Color(255, 255, 255));
        HinhAnhPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        HinhAnhPanel.setPreferredSize(new java.awt.Dimension(175, 90));

        AnhLabel.setBackground(new java.awt.Color(255, 255, 255));
        AnhLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout HinhAnhPanelLayout = new javax.swing.GroupLayout(HinhAnhPanel);
        HinhAnhPanel.setLayout(HinhAnhPanelLayout);
        HinhAnhPanelLayout.setHorizontalGroup(
            HinhAnhPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HinhAnhPanelLayout.setVerticalGroup(
            HinhAnhPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnhLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );

        MoTaField.setBackground(new java.awt.Color(255, 255, 255));
        MoTaField.setColumns(20);
        MoTaField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MoTaField.setForeground(new java.awt.Color(0, 0, 0));
        MoTaField.setRows(5);
        MoTaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        MoTaField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(MoTaField);

        HinhAnhBtn.setBackground(new java.awt.Color(0, 204, 102));
        HinhAnhBtn.setForeground(new java.awt.Color(255, 255, 255));
        HinhAnhBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/folder.png"))); // NOI18N
        HinhAnhBtn.setText("Mở tệp");
        HinhAnhBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HinhAnhBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HinhAnhBtnActionPerformed(evt);
            }
        });

        MaDanhMucField.setBackground(new java.awt.Color(255, 255, 255));
        MaDanhMucField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MaDanhMucField.setForeground(new java.awt.Color(0, 0, 0));
        MaDanhMucField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MaDanhMucFieldItemStateChanged(evt);
            }
        });

        TenDanhMucLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TenDanhMucLabel.setForeground(new java.awt.Color(0, 0, 0));
        TenDanhMucLabel.setText("Tên danh mục");

        TenDanhMucField.setEditable(false);
        TenDanhMucField.setBackground(new java.awt.Color(255, 255, 255));
        TenDanhMucField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TenDanhMucField.setForeground(new java.awt.Color(0, 0, 0));
        TenDanhMucField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TenDanhMucField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoNgayBaoHanhField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoNgayBaoHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DonGiaLeField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DonGiaLeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaSanPhamField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KichThuocField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoTaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaSanPhamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KichThuocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MauSacField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenSanPhamField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenSanPhamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MauSacLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MaDanhMucField, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                .addComponent(SoLuongLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SoLuongField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MonTheThaoField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HangSanXuatLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MonTheThaoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HangSanXuatField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DonGiaSiField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaDanhMucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TenDanhMucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TenDanhMucField)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(HinhAnhPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(HinhAnhBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(DonGiaSiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaSanPhamLabel)
                            .addComponent(TenSanPhamLabel)
                            .addComponent(SoLuongLabel))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TenSanPhamField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MaSanPhamField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SoLuongField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KichThuocLabel)
                                    .addComponent(HangSanXuatLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(KichThuocField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MauSacField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HangSanXuatField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(MauSacLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoTaLabel)
                            .addComponent(MonTheThaoLabel)))
                    .addComponent(HinhAnhPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MonTheThaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HinhAnhBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaDanhMucLabel)
                            .addComponent(TenDanhMucLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaDanhMucField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenDanhMucField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SoNgayBaoHanhLabel)
                        .addComponent(DonGiaLeLabel))
                    .addComponent(DonGiaSiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DonGiaSiField, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(DonGiaLeField, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(SoNgayBaoHanhField, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        TimKiemPanel.setBackground(new java.awt.Color(255, 255, 255));
        TimKiemPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        TimKiemField.setBackground(new java.awt.Color(255, 255, 255));
        TimKiemField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TimKiemField.setForeground(new java.awt.Color(0, 0, 0));

        TuKhoaField.setBackground(new java.awt.Color(255, 255, 255));
        TuKhoaField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TuKhoaField.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TuKhoaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TuKhoaFieldKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Từ khóa:");

        TimKiemBtn.setBackground(new java.awt.Color(0, 204, 102));
        TimKiemBtn.setForeground(new java.awt.Color(255, 255, 255));
        TimKiemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/search.png"))); // NOI18N
        TimKiemBtn.setText("Tìm kiếm");
        TimKiemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TimKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TimKiemPanelLayout = new javax.swing.GroupLayout(TimKiemPanel);
        TimKiemPanel.setLayout(TimKiemPanelLayout);
        TimKiemPanelLayout.setHorizontalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimKiemPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TuKhoaField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimKiemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TimKiemPanelLayout.setVerticalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimKiemPanelLayout.createSequentialGroup()
                .addComponent(TimKiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuKhoaField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TimKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        QuayLaiBtn.setBackground(new java.awt.Color(0, 204, 102));
        QuayLaiBtn.setForeground(new java.awt.Color(255, 255, 255));
        QuayLaiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/exit.png"))); // NOI18N
        QuayLaiBtn.setText("Thoát");
        QuayLaiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QuayLaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuayLaiBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SuaBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuayLaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuayLaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TimKiemLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TimKiemLabel.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemLabel.setText("Tìm kiếm theo:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TimKiemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, Short.MAX_VALUE))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(TimKiemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TimKiemLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimKiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void QuayLaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuayLaiBtnActionPerformed
        if ("QL".equals(phanQuyen)) {
            new QuanLy_View(phanQuyen, tenTaiKhoan);
        } else if ("NVBH".equals(phanQuyen)) {
            new NhanVienBanHang_View(phanQuyen, tenTaiKhoan);
        } else if ("TK".equals(phanQuyen)) {
            new ThuKho_View(phanQuyen, tenTaiKhoan);
        }
        this.dispose();

    }//GEN-LAST:event_QuayLaiBtnActionPerformed

    private void ThemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBtnActionPerformed
        // TODO add your handling code here:
        this.ResetValue();
        VoHieuHoaBtn(true);
        this.TenSanPhamField.requestFocus();
        this.chucNang = "Them";

    }//GEN-LAST:event_ThemBtnActionPerformed

    private void XoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBtnActionPerformed
        // TODO add your handling code here:

        int index = DanhSachSanPham.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null,
                    "Chọn dòng cần xóa",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(null,
                    "Bạn muốn xóa thông tin sản phẩm này ?",
                    "Xác nhận",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                if (SanPhamDAO.getInstance().delete((String) model.getValueAt(index, 0)) == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Không thể xóa",
                            "",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Xóa thành công",
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.ResetValue();
                    this.getAllSanPham();
                }
            }

       int index = DanhSachSanPham.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chọn dòng cần xóa");
        } else {   
            if(SanPhamDAO.getInstance().delete((String) model.getValueAt(index, 0)) == 0)
                JOptionPane.showMessageDialog(rootPane, "Lỗi! Không thể xóa.");
            else{
                this.ResetValue();
                JOptionPane.showMessageDialog(rootPane, "Xóa sản phẩm thành công!","Thành công",JOptionPane.INFORMATION_MESSAGE);
                this.getAllSanPham();
            }    

        }
    }//GEN-LAST:event_XoaBtnActionPerformed

    private void DanhSachSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhSachSanPhamMouseClicked
        // TODO add your handling code here:
        int index = DanhSachSanPham.getSelectedRow();
        AnhLabel.setIcon(new ImageIcon(new ImageIcon((String) model.getValueAt(index, 4)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        MaSanPhamField.setText((String) model.getValueAt(index, 0));
        TenSanPhamField.setText((String) model.getValueAt(index, 1));
        SoLuongField.setText((String) model.getValueAt(index, 2));
        KichThuocField.setText((String) model.getValueAt(index, 3));
        MoTaField.setText((String) model.getValueAt(index, 5));
        HangSanXuatField.setText((String) model.getValueAt(index, 6));
        MauSacField.setText((String) model.getValueAt(index, 7));
        DonGiaSiField.setText((String) model.getValueAt(index, 8));
        DonGiaLeField.setText((String) model.getValueAt(index, 9));
        MonTheThaoField.setText((String) model.getValueAt(index, 10));
        MaDanhMucField.setSelectedItem((String) model.getValueAt(index, 11));
        SoNgayBaoHanhField.setText((String) model.getValueAt(index, 12));
        TenDanhMucField.setText(DanhMucDAO.getInstance().getById((String) model.getValueAt(index, 11)).getTenDanhMuc());
    }//GEN-LAST:event_DanhSachSanPhamMouseClicked

    private void SuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaBtnActionPerformed
        // TODO add your handling code here:
        this.chucNang = "Sua";
        this.VoHieuHoaBtn(true);
        this.TenSanPhamField.requestFocus();

    }//GEN-LAST:event_SuaBtnActionPerformed

    private void LuuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuBtnActionPerformed

        // TODO add your handling code here: 
        int soNgayBaoHanh;
        double donGiaSi, donGiaLe;
        try {
            soNgayBaoHanh = Integer.parseInt(SoNgayBaoHanhField.getText());
            if (soNgayBaoHanh < 0) {
                throw new ArithmeticException("");
            }
            try {
                donGiaLe = Integer.parseInt(DonGiaLeField.getText());
                if (donGiaLe < 0) {
                    throw new ArithmeticException("");
                }
                try {
                    donGiaSi = Integer.parseInt(DonGiaSiField.getText());
                    if (donGiaSi < 0) {
                        throw new ArithmeticException("");
                    }
                    if (!"".equals(TenSanPhamField.getText()) && !"".equals(KichThuocField.getText()) && !"".equals(MauSacField.getText()) && !"".equals(HangSanXuatField.getText()) && !"".equals(MonTheThaoField.getText()) && !"".equals(MoTaField.getText()) && !"".equals(DonGiaLeField.getText()) && !"".equals(DonGiaSiField.getText())) {
                        if (this.chucNang == "Them") {
                            ThemSanPham();
                        } else if (this.chucNang == "Sua") {
                            SanPham sp = new SanPham(MaSanPhamField.getText(), TenSanPhamField.getText(), Integer.parseInt(SoLuongField.getText()), KichThuocField.getText(), hinhAnh, MoTaField.getText(), HangSanXuatField.getText(), MauSacField.getText(), donGiaSi, donGiaLe, MonTheThaoField.getText(), MaDanhMucField.getSelectedItem().toString(), soNgayBaoHanh);
                            int result = JOptionPane.showConfirmDialog(null,
                                    "Bạn muốn sửa thông tin này ?",
                                    "Xác nhận",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE);
                            if (result == JOptionPane.YES_OPTION) {
                                if (SanPhamDAO.getInstance().update(sp) == 1) {
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
                        this.VoHieuHoaBtn(false);
                        this.getAllSanPham();
                        this.ResetValue();

                    } else {
                        JOptionPane.showMessageDialog(null,
                    "Vui lòng điền đầy đủ thông tin!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "Đơn giá sỉ là chữ số lớn hơn 0",
                            "",
                            JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Đơn giá lẻ là chữ số lớn hơn 0",
                        "",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Số ngày bảo hành là chữ số nguyên dương",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        }


        // TODO add your handling code here:       
        if (!"".equals(TenSanPhamField.getText())) {
            if(this.chucNang == "Them")
            {
                if (TenSanPhamField.getText().equals("")||SoLuongField.getText().equals("")||
                KichThuocField.getText().equals("")|| HinhAnhField.getText().equals("")|| MoTaField.getText().equals("")||
                HangSanXuatField.getText().equals("")|| MauSacField.getText().equals("")|| 
                DonGiaSiField.getText().equals("") || DonGiaLeField.getText().equals("")||
                MonTheThaoField.getText().equals("") || MaDanhMucField.getSelectedItem().equals("") || SoNgayBaoHanhField.getText().equals(""))
                JOptionPane.showMessageDialog(rootPane, "Định dạng thông tin nhập sai hoặc nhập thiếu thông tin!","Thất bại",JOptionPane.INFORMATION_MESSAGE);
            else
            {
                ThemSanPham();
                JOptionPane.showMessageDialog(rootPane, "Thêm sản phẩm thành công!","Thành công",JOptionPane.INFORMATION_MESSAGE);
            }
            }
            else if(this.chucNang == "Sua")
            {
                JOptionPane.showMessageDialog(rootPane, "Sửa thông tin sản phẩm thành công!","Thành công",JOptionPane.INFORMATION_MESSAGE);
                SanPham sp = new SanPham(MaSanPhamField.getText(), TenSanPhamField.getText(), Integer.parseInt(SoLuongField.getText()), KichThuocField.getText(), HinhAnhField.getText(), MoTaField.getText(), HangSanXuatField.getText(), MauSacField.getText(), Double.parseDouble(DonGiaSiField.getText()), Double.parseDouble(DonGiaLeField.getText()), MonTheThaoField.getText(), MaDanhMucField.getSelectedItem().toString(), Integer.parseInt(SoNgayBaoHanhField.getText()));
                SanPhamDAO.getInstance().update(sp);
            }
            this.VoHieuHoaBtn(false);
            this.getAllSanPham();
            this.ResetValue();
            
        } else
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin!","Thất bại",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_LuuBtnActionPerformed

    private void BoQuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoQuaBtnActionPerformed
        // TODO add your handling code here:
        this.ResetValue();
        this.VoHieuHoaBtn(false);
    }//GEN-LAST:event_BoQuaBtnActionPerformed

    private void HinhAnhBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HinhAnhBtnActionPerformed
        // TODO add your handling code here:
        AnhLabel.setSize(150, 150);

        JFileChooser f = new JFileChooser();
        f.setCurrentDirectory(new File("."));
        int result = f.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String name = f.getSelectedFile().getPath();
            AnhLabel.setIcon(new ImageIcon(new ImageIcon(name).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
            hinhAnh = name;
        }
    }//GEN-LAST:event_HinhAnhBtnActionPerformed

    private void MaDanhMucFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MaDanhMucFieldItemStateChanged
        // TODO add your handling code here:
        TenDanhMucField.setText(DanhMucDAO.getInstance().getById(MaDanhMucField.getSelectedItem().toString()).getTenDanhMuc());
    }//GEN-LAST:event_MaDanhMucFieldItemStateChanged

    private void TimKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtnActionPerformed
        // TODO add your handling code here:
        String timKiemTheo = (String) TimKiemField.getSelectedItem();
        ArrayList<SanPham> sanPham = null;
        if (!"".equals(TuKhoaField.getText())) {
            if ("Mã sản phẩm".equals(timKiemTheo)) {
                sanPham.add(SanPhamDAO.getInstance().getById(TuKhoaField.getText()));
            } else if ("Tên sản phẩm".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByTen(TuKhoaField.getText());
            } else if ("Màu sắc".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByMauSac(TuKhoaField.getText());
            } else if ("Hãng sản xuất".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByHangSanXuat(TuKhoaField.getText());
            } else if ("Môn thể thao".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByMonTheThao(TuKhoaField.getText());
            } else if ("Mã danh mục".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByMaDanhMuc(TuKhoaField.getText());
            } 
            if (sanPham == null || TuKhoaField.getText().contains("%")) {
                JOptionPane.showMessageDialog(null,
                        "Không tìm thấy",
                        "",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                this.hienThi(sanPham);
            }
        } else
            this.getAllSanPham();
    }//GEN-LAST:event_TimKiemBtnActionPerformed

    private void TuKhoaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TuKhoaFieldKeyReleased
        // TODO add your handling code here:
        String timKiemTheo = (String) TimKiemField.getSelectedItem();
        ArrayList<SanPham> sanPham = new ArrayList<>();
        if (!"".equals(TuKhoaField.getText())) {
            if ("Mã sản phẩm".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByMaSanPham(TuKhoaField.getText());
            } else if ("Tên sản phẩm".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByTen(TuKhoaField.getText());
            } else if ("Màu sắc".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByMauSac(TuKhoaField.getText());
            } else if ("Hãng sản xuất".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByHangSanXuat(TuKhoaField.getText());
            } else if ("Môn thể thao".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByMonTheThao(TuKhoaField.getText());
            } else if ("Mã danh mục".equals(timKiemTheo)) {
                sanPham = SanPhamDAO.getInstance().getByMaDanhMuc(TuKhoaField.getText());
            }
            if(sanPham != null && !TuKhoaField.getText().contains("%"))
                this.hienThi(sanPham);
        }
        else
            this.getAllSanPham();
        

    }//GEN-LAST:event_TuKhoaFieldKeyReleased

    private void hienThi(ArrayList<SanPham> t) {
        model = (DefaultTableModel) DanhSachSanPham.getModel();
        model.setRowCount(0);
        for (SanPham i : t) {
            Double donGiaLe = i.getDonGiaLe();
            Double donGiaSi = i.getDonGiaSi();
            Locale locale = new Locale("en", "EN");
            String pattern = "###,###.##";
            DecimalFormat dcf = (DecimalFormat) NumberFormat.getNumberInstance(locale);
            dcf.applyPattern(pattern);
            String dl = String.valueOf(dcf.format(donGiaLe));
            String ds = String.valueOf(dcf.format(donGiaSi));
            String[] dataRow = {i.getMaSanPham(), i.getTenSanPham(), String.valueOf(i.getSoLuong()), i.getKichThuoc(), i.getHinhAnh(), i.getMoTa(), i.getHangSanXuat(), i.getMauSac(), ds, dl, i.getMonTheThao(), i.getMaDanhMuc(), String.valueOf(i.getSoNgayBaoHanh())};
            model.addRow(dataRow);
        }
    }

    private void getAllSanPham() {
        ArrayList<SanPham> sanPham = SanPhamDAO.getInstance().getAll();
        this.hienThi(sanPham);
    }

    private void HienThiDanhMuc() {
        ArrayList<DanhMuc> danhMuc = DanhMucDAO.getInstance().getAll();
        for (DanhMuc i : danhMuc) {
            MaDanhMucField.addItem(i.toString());
        }
    }

    private void setTimKiemField() {
        String[] tenCot = {"Mã sản phẩm", "Tên sản phẩm", "Màu sắc", "Hãng sản xuất", "Môn thể thao", "Mã danh mục"};
        for (int i = 0; i < tenCot.length; i++) {
            TimKiemField.addItem(tenCot[i]);
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnhLabel;
    private javax.swing.JButton BoQuaBtn;
    private javax.swing.JTable DanhSachSanPham;
    private javax.swing.JTextField DonGiaLeField;
    private javax.swing.JLabel DonGiaLeLabel;
    private javax.swing.JTextField DonGiaSiField;
    private javax.swing.JLabel DonGiaSiLabel;
    private javax.swing.JTextField HangSanXuatField;
    private javax.swing.JLabel HangSanXuatLabel;
    private javax.swing.JButton HinhAnhBtn;
    private javax.swing.JPanel HinhAnhPanel;
    private javax.swing.JTextField KichThuocField;
    private javax.swing.JLabel KichThuocLabel;
    private javax.swing.JButton LuuBtn;
    private javax.swing.JComboBox<String> MaDanhMucField;
    private javax.swing.JLabel MaDanhMucLabel;
    private javax.swing.JTextField MaSanPhamField;
    private javax.swing.JLabel MaSanPhamLabel;
    private javax.swing.JTextField MauSacField;
    private javax.swing.JLabel MauSacLabel;
    private javax.swing.JTextArea MoTaField;
    private javax.swing.JLabel MoTaLabel;
    private javax.swing.JTextField MonTheThaoField;
    private javax.swing.JLabel MonTheThaoLabel;
    private javax.swing.JButton QuayLaiBtn;
    private javax.swing.JTextField SoLuongField;
    private javax.swing.JLabel SoLuongLabel;
    private javax.swing.JTextField SoNgayBaoHanhField;
    private javax.swing.JLabel SoNgayBaoHanhLabel;
    private javax.swing.JButton SuaBtn;
    private javax.swing.JTextField TenDanhMucField;
    private javax.swing.JLabel TenDanhMucLabel;
    private javax.swing.JTextField TenSanPhamField;
    private javax.swing.JLabel TenSanPhamLabel;
    private javax.swing.JButton ThemBtn;
    private javax.swing.JButton TimKiemBtn;
    private javax.swing.JComboBox<String> TimKiemField;
    private javax.swing.JLabel TimKiemLabel;
    private javax.swing.JPanel TimKiemPanel;
    private javax.swing.JTextField TuKhoaField;
    private javax.swing.JButton XoaBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
