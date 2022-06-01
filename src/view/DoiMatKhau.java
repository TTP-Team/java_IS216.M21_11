/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.TaiKhoanDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Thanh PC
 */
public class DoiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form DoiMatKhau
     */
    private String tenTaiKhoan;
    private String phanQuyen;

    public DoiMatKhau(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.tenTaiKhoan = maNV;
        this.phanQuyen = phanQuyen;
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MatKhauCuField = new javax.swing.JPasswordField();
        MatKhauMoiField = new javax.swing.JPasswordField();
        XacNhanMatKhauField = new javax.swing.JPasswordField();
        XacNhanBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mật khẩu cũ");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mật khẩu mới");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Xác nhận mật khẩu");

        MatKhauCuField.setBackground(new java.awt.Color(255, 255, 255));

        MatKhauMoiField.setBackground(new java.awt.Color(255, 255, 255));

        XacNhanMatKhauField.setBackground(new java.awt.Color(255, 255, 255));

        XacNhanBtn.setBackground(new java.awt.Color(0, 204, 102));
        XacNhanBtn.setText("Xác nhận");
        XacNhanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XacNhanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XacNhanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MatKhauCuField, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(MatKhauMoiField)
                            .addComponent(XacNhanMatKhauField)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(XacNhanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MatKhauCuField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MatKhauMoiField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XacNhanMatKhauField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(XacNhanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XacNhanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XacNhanBtnActionPerformed
        // TODO add your handling code here:
        String matKhauCu = MatKhauCuField.getText();
        String matKhauMoi = MatKhauMoiField.getText();
        String xacNhanMatKhau = XacNhanMatKhauField.getText();
        int tt = TaiKhoanDAO.getInstance().kiemTraTrangThai(tenTaiKhoan, matKhauCu);
        if ("".equals(matKhauCu) || "".equals(matKhauMoi) || "".equals(xacNhanMatKhau)) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin");
        } else {
            if (tt != 1) {
                JOptionPane.showMessageDialog(rootPane, "Mật khảu cũ sai");
            } else {
                if (!matKhauMoi.equals(xacNhanMatKhau)) {
                    JOptionPane.showMessageDialog(rootPane, "Xác nhận mật khẩu sai");
                } else {
                    TaiKhoanDAO.getInstance().doiMatKhau(tenTaiKhoan, matKhauMoi);
                    if ("QL".equals(phanQuyen)) {
                        new QuanLy_View(phanQuyen, tenTaiKhoan);
                    } else if ("NVBH".equals(phanQuyen)) {
                        new NhanVienBanHang_View(phanQuyen, tenTaiKhoan);
                    } else if ("TK".equals(phanQuyen)) {
                        new ThuKho_View(phanQuyen, tenTaiKhoan);
                    }
                    this.dispose();
                }
            }
        }

    }//GEN-LAST:event_XacNhanBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField MatKhauCuField;
    private javax.swing.JPasswordField MatKhauMoiField;
    private javax.swing.JButton XacNhanBtn;
    private javax.swing.JPasswordField XacNhanMatKhauField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
