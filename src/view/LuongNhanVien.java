/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.NhanVienDAO;
import Model.TienLuong;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh PC
 */
public class LuongNhanVien extends javax.swing.JFrame {
    private String phanQuyen;
    private String tenTaiKhoan;
    /**
     * Creates new form LuongNhanVien
     */
    public LuongNhanVien(String phanQuyen, String maQL) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maQL;
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
        DanhSachLuong = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ThoatBtn = new javax.swing.JButton();
        thangField = new com.toedter.calendar.JMonthChooser();
        namField = new com.toedter.calendar.JYearChooser();
        xemBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DanhSachLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số ngày làm việc", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DanhSachLuong);

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BẢNG LƯƠNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        thangField.setForeground(new java.awt.Color(0, 0, 0));
        thangField.setOpaque(false);

        namField.setBackground(new java.awt.Color(255, 255, 255));

        xemBtn.setBackground(new java.awt.Color(0, 204, 102));
        xemBtn.setForeground(new java.awt.Color(255, 255, 255));
        xemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/eye.png"))); // NOI18N
        xemBtn.setText("Xem");
        xemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(thangField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ThoatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ThoatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(xemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(thangField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
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

    private void ThoatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatBtnActionPerformed
        // TODO add your handling code here:
        new QuanLy_View(phanQuyen, tenTaiKhoan);
        this.dispose();

    }//GEN-LAST:event_ThoatBtnActionPerformed

    private void xemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemBtnActionPerformed
        // TODO add your handling code here:      
        int thang = thangField.getMonth() + 1;
        int nam = namField.getYear();
         ArrayList<TienLuong> tienLuong = NhanVienDAO.getInstance().getDanhSachLuong(thang, nam);
        DefaultTableModel model = (DefaultTableModel) DanhSachLuong.getModel();
        model.setRowCount(0);
        Locale locale = new Locale("en", "EN");
            String pattern = "###,###.##";
            DecimalFormat dcf = (DecimalFormat) NumberFormat.getNumberInstance(locale);
            dcf.applyPattern(pattern);
        for (TienLuong i : tienLuong) {                
            String l = String.valueOf(dcf.format(i.getLuong()));
            String tenNV = NhanVienDAO.getInstance().getById(i.getMaNhanVien()).getTenNhanVien();
            String[] dataRow = {i.getMaNhanVien(), tenNV, String.valueOf(i.getSoNgayLam()), l};
            model.addRow(dataRow);
        }
    }//GEN-LAST:event_xemBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DanhSachLuong;
    private javax.swing.JButton ThoatBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JYearChooser namField;
    private com.toedter.calendar.JMonthChooser thangField;
    private javax.swing.JButton xemBtn;
    // End of variables declaration//GEN-END:variables
}
