package view;

import Model.TaiKhoan;
import dao.TaiKhoanDAO;
import database.JDBCUtil;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.CallableStatement;
import java.sql.Connection;

public class DangNhap_View extends javax.swing.JFrame {
    private int soLanDangNhapSai;
    /**
     * Creates new form DangNhap_View
     */
    public DangNhap_View() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.soLanDangNhapSai = 0;
    }

    public void kiemTraDangNhap() {
        String tk = tenDangNhap_Field.getText();
        String mk = matKhau_Field.getText();
        tenDangNhap_Field.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {
                thongBao_Label.setText("");
                matKhau_Field.setText("");
            }

            @Override
            public void keyReleased(KeyEvent event) {
            }

            @Override
            public void keyPressed(KeyEvent event) {
            }
        });
        int tt = TaiKhoanDAO.getInstance().kiemTraTrangThai(tk, mk);
        System.out.println("trạng thái: " + tt);
        String phanQuyen = TaiKhoanDAO.getInstance().kiemTraPhanQuyen(tk, mk).trim();
        System.out.println("Phân quyền: " + phanQuyen);
        switch (tt) {
            case 1 -> {
                this.setCursor(WAIT_CURSOR);
                if ("NVBH".equals(phanQuyen)) {                   
                    new NhanVienBanHang_View(phanQuyen,tk);
                    this.dispose();
                } else if ("QL".equals(phanQuyen)) {
                    new QuanLy_View(phanQuyen,tk);
                    this.dispose();
                } else if ("TK".equals(phanQuyen)) {
                    new ThuKho_View(phanQuyen,tk);
                    this.dispose();
                }
            }
            case 0 -> {
                thongBao_Label.setText("Tên đăng nhập hoặc mật khẩu không đúng");
                if(soLanDangNhapSai == 3){
                    TaiKhoan taiKhoan = new TaiKhoan();
                    taiKhoan.setTenDangNhap(tk);
                    taiKhoan.setTrangThai("Khóa");
                    TaiKhoanDAO.getInstance().update(taiKhoan);
                    thongBao_Label.setText("Tài khoản đã bị khóa");
                    this.soLanDangNhapSai = 0;
                }   this.soLanDangNhapSai += 1;
            }
            default -> thongBao_Label.setText("Tài khoản đang bị khóa");
        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        matKhau_Label = new javax.swing.JLabel();
        tenDangNhap_Label = new javax.swing.JLabel();
        tenDangNhap_Field = new javax.swing.JTextField();
        matKhau_Field = new javax.swing.JPasswordField();
        DangNhap_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        thongBao_Label = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        matKhau_Label.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        matKhau_Label.setForeground(new java.awt.Color(0, 0, 0));
        matKhau_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/padlock.png"))); // NOI18N
        matKhau_Label.setText("Mật khẩu");
        jPanel1.add(matKhau_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        tenDangNhap_Label.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        tenDangNhap_Label.setForeground(new java.awt.Color(0, 0, 0));
        tenDangNhap_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/User-Executive-Red-icon.png"))); // NOI18N
        tenDangNhap_Label.setText("Tên đăng nhập");
        jPanel1.add(tenDangNhap_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        tenDangNhap_Field.setBackground(new java.awt.Color(255, 255, 255));
        tenDangNhap_Field.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tenDangNhap_Field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tenDangNhap_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 200, 35));

        matKhau_Field.setBackground(new java.awt.Color(255, 255, 255));
        matKhau_Field.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        matKhau_Field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(matKhau_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 200, 35));

        DangNhap_Btn.setBackground(new java.awt.Color(0, 204, 102));
        DangNhap_Btn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DangNhap_Btn.setForeground(new java.awt.Color(255, 255, 255));
        DangNhap_Btn.setText("Đăng nhập");
        DangNhap_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DangNhap_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangNhap_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(DangNhap_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 110, -1));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("TPT SPORT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        thongBao_Label.setForeground(new java.awt.Color(0, 0, 0));
        thongBao_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(thongBao_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 270, 20));

        bgLabel.setForeground(new java.awt.Color(0, 0, 0));
        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/bg2.jpg"))); // NOI18N
        jPanel1.add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DangNhap_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangNhap_BtnActionPerformed

        this.kiemTraDangNhap();  
        
    }//GEN-LAST:event_DangNhap_BtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DangNhap_Btn;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField matKhau_Field;
    private javax.swing.JLabel matKhau_Label;
    private javax.swing.JTextField tenDangNhap_Field;
    private javax.swing.JLabel tenDangNhap_Label;
    private javax.swing.JLabel thongBao_Label;
    // End of variables declaration//GEN-END:variables
}
