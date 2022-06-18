package view;

import Model.TaiKhoan;
import dao.NhanVienDAO;
import dao.TaiKhoanDAO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class DangNhap_View extends javax.swing.JFrame {

    private int soLanDangNhapSai;
    private String regEmail;
    private JPasswordField matKhau_Field;
    private JTextField email_Field;

    /**
     * Creates new form DangNhap_View
     */
    public DangNhap_View() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.soLanDangNhapSai = 0;
        regEmail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        this.HuyBtn.setVisible(false);
        this.taomkField();

    }

    private void taomkField() {
        matKhau_Field = new JPasswordField();
        mkPanel.removeAll();
        mkPanel.setLayout(new CardLayout());
        mkPanel.add(matKhau_Field);
        mkPanel.validate();
        mkPanel.repaint();
        Border blackline = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black);
        matKhau_Field.setBorder(blackline);
        matKhau_Field.setFont(new Font("Dialog", Font.PLAIN, 14));
    }

    public void kiemTraDangNhap() {
        String tk = tenDangNhap_Field.getText();
        String mk = matKhau_Field.getText();
        tenDangNhap_Field.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {
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
        String phanQuyen = TaiKhoanDAO.getInstance().kiemTraPhanQuyen(tk, mk);
        switch (tt) {
            case 1 -> {
                this.setCursor(WAIT_CURSOR);
                if ("NVBH".equals(phanQuyen)) {
                    JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công dưới quyền NHÂN VIÊN BÁN HÀNG!","Thành công",JOptionPane.INFORMATION_MESSAGE);
                    new NhanVienBanHang_View(phanQuyen, tk);
                    this.dispose();
                } else if ("QL".equals(phanQuyen)) {
                    JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công dưới quyền QUẢN LÝ!","Thành công",JOptionPane.INFORMATION_MESSAGE);
                    new QuanLy_View(phanQuyen, tk);
                    this.dispose();
                } else if ("TK".equals(phanQuyen)) {
                    JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công dưới quyền THỦ KHO!","Thành công",JOptionPane.INFORMATION_MESSAGE);
                    new ThuKho_View(phanQuyen, tk);
                    this.dispose();
                }
            }
            case 0 -> {
                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc mật khẩu không đúng!","Thất bại",JOptionPane.INFORMATION_MESSAGE);
                if (soLanDangNhapSai == 3) {
                    TaiKhoan taiKhoan = new TaiKhoan();
                    taiKhoan.setTenDangNhap(tk);
                    taiKhoan.setTrangThai("Khóa");
                    TaiKhoanDAO.getInstance().update(taiKhoan);
                    JOptionPane.showMessageDialog(rootPane, "Tài khoản đã bị khóa","Thất bại",JOptionPane.INFORMATION_MESSAGE);
                    this.soLanDangNhapSai = 0;
                }
                this.soLanDangNhapSai += 1;
            }
            default ->
                JOptionPane.showMessageDialog(rootPane, "Tài khoản đang bị khóa","Thất bại",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        matKhau_Label = new javax.swing.JLabel();
        tenDangNhap_Label = new javax.swing.JLabel();
        tenDangNhap_Field = new javax.swing.JTextField();
        DangNhap_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quenMK = new javax.swing.JLabel();
        HuyBtn = new javax.swing.JButton();
        mkPanel = new javax.swing.JPanel();
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
        jPanel1.add(matKhau_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        tenDangNhap_Label.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        tenDangNhap_Label.setForeground(new java.awt.Color(0, 0, 0));
        tenDangNhap_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/User-Executive-Red-icon.png"))); // NOI18N
        tenDangNhap_Label.setText("Tên đăng nhập");
        jPanel1.add(tenDangNhap_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        tenDangNhap_Field.setBackground(new java.awt.Color(255, 255, 255));
        tenDangNhap_Field.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tenDangNhap_Field.setForeground(new java.awt.Color(0, 0, 0));
        tenDangNhap_Field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tenDangNhap_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenDangNhap_FieldActionPerformed(evt);
            }
        });
        jPanel1.add(tenDangNhap_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 240, 30));

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
        jPanel1.add(DangNhap_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 110, 40));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("TPT SPORT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        quenMK.setBackground(new java.awt.Color(255, 255, 255));
        quenMK.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        quenMK.setForeground(new java.awt.Color(0, 0, 255));
        quenMK.setText("Quên mật khẩu ?");
        quenMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quenMKMouseClicked(evt);
            }
        });
        jPanel1.add(quenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 100, -1));

        HuyBtn.setBackground(new java.awt.Color(255, 51, 102));
        HuyBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        HuyBtn.setForeground(new java.awt.Color(255, 255, 255));
        HuyBtn.setText("Hủy");
        HuyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HuyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HuyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 110, 40));

        mkPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 240, 30));

        bgLabel.setForeground(new java.awt.Color(0, 0, 0));
        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/bg2.jpg"))); // NOI18N
        jPanel1.add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DangNhap_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangNhap_BtnActionPerformed

        if ("Đăng nhập".equals(DangNhap_Btn.getText())) {
            this.kiemTraDangNhap();
        } else {
            if (!"".equals(tenDangNhap_Field.getText()) && !"".equals(email_Field.getText())) {
                HuyBtn.setVisible(false);
                String mk = TaiKhoanDAO.getInstance().layLaiMatKhau(tenDangNhap_Field.getText());

                if (!email_Field.getText().matches(regEmail)) {
                    JOptionPane.showMessageDialog(null,
                            "Định dạng email không đúng",
                            "",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    if (kiemTraEmail(tenDangNhap_Field.getText(), email_Field.getText()) == 1) {
                        final String username = "tptsport22@gmail.com";
                        final String password = "xchxgoxctsljinhi   ";

                        Properties prop = new Properties();
                        prop.put("mail.smtp.host", "smtp.gmail.com");
                        prop.put("mail.smtp.port", "587");
                        prop.put("mail.smtp.auth", "true");
                        prop.put("mail.smtp.starttls.enable", "true"); //TLS

                        Session session = Session.getInstance(prop,
                                new javax.mail.Authenticator() {
                            @Override
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username, password);
                            }
                        });

                        try {
                            Message message = new MimeMessage(session);
                            message.setFrom(new InternetAddress("tptsport22@gmail.com"));
                            message.setRecipients(
                                    Message.RecipientType.TO,
                                    InternetAddress.parse(email_Field.getText())
                            );
                            message.setSubject("TPT Sport verify password");
                            message.setText(mk + " is your TPTSPORT verification code. Please login and change your password!");

                            Transport.send(message);
                            System.out.println("Done");

                        } catch (MessagingException e) {
                            e.printStackTrace();
                        }
                       
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Email không đúng với tài khoản",
                                "",
                                JOptionPane.ERROR_MESSAGE);
                        
                    }
                     matKhau_Label.setText("Mật khẩu");
                        DangNhap_Btn.setText("Đăng nhập");
                        matKhau_Label.setVisible(true);
                        matKhau_Field.setVisible(true);
                        quenMK.setVisible(true);
                        HuyBtn.setVisible(false);
                        this.taomkField();
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Vui lòng nhập đầy đủ thông tin",
                        "",
                        JOptionPane.ERROR_MESSAGE);

            }

        }

    }//GEN-LAST:event_DangNhap_BtnActionPerformed

    private void HuyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyBtnActionPerformed
        // TODO add your handling code here:
        matKhau_Label.setText("Mật khẩu");
        DangNhap_Btn.setText("Đăng nhập");
        matKhau_Label.setVisible(true);
        matKhau_Field.setVisible(true);
        quenMK.setVisible(true);
        HuyBtn.setVisible(false);
        this.taomkField();
    }//GEN-LAST:event_HuyBtnActionPerformed

    private void quenMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quenMKMouseClicked
        // TODO add your handling code here:
        matKhau_Label.setText("Email");
        DangNhap_Btn.setText("Xác nhận");
        quenMK.setVisible(false);
        HuyBtn.setVisible(true);
        email_Field = new JTextField();
        mkPanel.removeAll();
        mkPanel.setLayout(new CardLayout());
        mkPanel.add(email_Field);
        mkPanel.validate();
        mkPanel.repaint();
        Border blackline = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black);
        email_Field.setBorder(blackline);
        email_Field.setFont(new Font("Dialog", Font.PLAIN, 14));
    }//GEN-LAST:event_quenMKMouseClicked

    private void tenDangNhap_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenDangNhap_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenDangNhap_FieldActionPerformed

    private int kiemTraEmail(String tdn, String mail) {
        String m = NhanVienDAO.getInstance().getById(tdn).getEmail();
        if (m.equals(mail)) {
            return 1;
        } else {            
            return 0;
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DangNhap_Btn;
    private javax.swing.JButton HuyBtn;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel matKhau_Label;
    private javax.swing.JPanel mkPanel;
    private javax.swing.JLabel quenMK;
    private javax.swing.JTextField tenDangNhap_Field;
    private javax.swing.JLabel tenDangNhap_Label;
    // End of variables declaration//GEN-END:variables
}
