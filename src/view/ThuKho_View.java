/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ChamCongDAO;
import dao.NhanVienDAO;

/**
 *
 * @author Thanh PC
 */
public class ThuKho_View extends javax.swing.JFrame {

    /**
     * Creates new form ThuKho_View
     */
    private String phanQuyen;
    private String tenTaiKhoan;
    public ThuKho_View(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maNV;
        MaNhanVienField.setText(maNV);
        TenNhanVienField.setText(NhanVienDAO.getInstance().getById(maNV).getTenNhanVien());
        SoNgayField.setText(String.valueOf(ChamCongDAO.getInstance().getSoNgayLamViecThang(maNV)));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        MaNhanVienField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        TenNhanVienField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        SoNgayField = new javax.swing.JTextField();
        PhiepHangBtn = new javax.swing.JButton();
        DanhMucBtn = new javax.swing.JButton();
        MatKhauBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THỦ KHO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel32.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Mã nhân viên");

        MaNhanVienField.setEditable(false);
        MaNhanVienField.setBackground(new java.awt.Color(255, 255, 255));
        MaNhanVienField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MaNhanVienField.setForeground(new java.awt.Color(102, 102, 102));
        MaNhanVienField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaNhanVienField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        MaNhanVienField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel33.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Tên nhân viên");

        TenNhanVienField.setEditable(false);
        TenNhanVienField.setBackground(new java.awt.Color(255, 255, 255));
        TenNhanVienField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TenNhanVienField.setForeground(new java.awt.Color(102, 102, 102));
        TenNhanVienField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TenNhanVienField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TenNhanVienField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Số ngày làm việc trong tháng");

        SoNgayField.setEditable(false);
        SoNgayField.setBackground(new java.awt.Color(255, 255, 255));
        SoNgayField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SoNgayField.setForeground(new java.awt.Color(102, 102, 102));
        SoNgayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SoNgayField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        SoNgayField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaNhanVienField)
                    .addComponent(TenNhanVienField)
                    .addComponent(SoNgayField, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaNhanVienField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TenNhanVienField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoNgayField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PhiepHangBtn.setBackground(new java.awt.Color(0, 204, 102));
        PhiepHangBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        PhiepHangBtn.setForeground(new java.awt.Color(255, 255, 255));
        PhiepHangBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/input.png"))); // NOI18N
        PhiepHangBtn.setText("Phiếu nhập hàng");
        PhiepHangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhiepHangBtnActionPerformed(evt);
            }
        });

        DanhMucBtn.setBackground(new java.awt.Color(0, 204, 102));
        DanhMucBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        DanhMucBtn.setForeground(new java.awt.Color(255, 255, 255));
        DanhMucBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/categories.png"))); // NOI18N
        DanhMucBtn.setText("Tra cứu danh mục");
        DanhMucBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanhMucBtnActionPerformed(evt);
            }
        });

        MatKhauBtn.setBackground(new java.awt.Color(0, 204, 102));
        MatKhauBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        MatKhauBtn.setForeground(new java.awt.Color(255, 255, 255));
        MatKhauBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/password.png"))); // NOI18N
        MatKhauBtn.setText("Đổi mật khẩu");
        MatKhauBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatKhauBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/product.png"))); // NOI18N
        jButton1.setText("Tra cứu sản phẩm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(PhiepHangBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DanhMucBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MatKhauBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhiepHangBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DanhMucBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MatKhauBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void PhiepHangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhiepHangBtnActionPerformed
        // TODO add your handling code here:
        new HoaDonBanHang(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_PhiepHangBtnActionPerformed

    private void DanhMucBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhMucBtnActionPerformed
        // TODO add your handling code here:
        new QuanLyDanhMuc(this.phanQuyen,this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_DanhMucBtnActionPerformed

    private void MatKhauBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatKhauBtnActionPerformed
        // TODO add your handling code here:
        new DoiMatKhau(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_MatKhauBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new QuanLySanPham(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DanhMucBtn;
    private javax.swing.JTextField MaNhanVienField;
    private javax.swing.JButton MatKhauBtn;
    private javax.swing.JButton PhiepHangBtn;
    private javax.swing.JTextField SoNgayField;
    private javax.swing.JTextField TenNhanVienField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
