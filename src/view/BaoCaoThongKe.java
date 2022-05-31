/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.BaoCaoDoanhThu;
import Model.BaoCaoSanPham;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.ThongKeDAO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author LeCongThanh
 */
public class BaoCaoThongKe extends javax.swing.JFrame {

    /**
     * Creates new form BaoCaoThongKe
     */
    public BaoCaoThongKe() {
        initComponents();
        this.setVisible(true);

        this.setLocationRelativeTo(null);
        this.setLoaiBaoCaoField();
        NgayBatDauField.setDateFormatString("dd/MM/yyyy");
        NgayKetThucField.setDateFormatString("dd/MM/yyyy");
        long millis = System.currentTimeMillis();
        java.sql.Date ngayHienTai = new java.sql.Date(millis);
        NgayBatDauField.setDate(ngayHienTai);
        NgayKetThucField.setDate(ngayHienTai);
        this.veBieuDo("Doanh thu ngày");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LoaiBaoCaoField = new javax.swing.JComboBox<>();
        NgayBatDauField = new com.toedter.calendar.JDateChooser();
        NgayKetThucField = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        XemBieuDo = new javax.swing.JButton();
        InBaoCao = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));

        LoaiBaoCaoField.setBackground(new java.awt.Color(255, 255, 255));
        LoaiBaoCaoField.setForeground(new java.awt.Color(0, 0, 0));

        NgayBatDauField.setBackground(new java.awt.Color(255, 255, 255));
        NgayBatDauField.setForeground(new java.awt.Color(0, 0, 0));

        NgayKetThucField.setBackground(new java.awt.Color(255, 255, 255));
        NgayKetThucField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Loại báo cáo");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Từ ngày");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Đến ngày");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoaiBaoCaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NgayBatDauField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NgayKetThucField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NgayBatDauField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayKetThucField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoaiBaoCaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        XemBieuDo.setBackground(new java.awt.Color(0, 204, 102));
        XemBieuDo.setForeground(new java.awt.Color(255, 255, 255));
        XemBieuDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/eye.png"))); // NOI18N
        XemBieuDo.setText("Xem biểu đồ");
        XemBieuDo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XemBieuDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XemBieuDoActionPerformed(evt);
            }
        });

        InBaoCao.setBackground(new java.awt.Color(0, 204, 102));
        InBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        InBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/printer.png"))); // NOI18N
        InBaoCao.setText("In báo cáo");
        InBaoCao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InBaoCaoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BÁO CÁO THỐNG KÊ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(XemBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(InBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XemBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XemBieuDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemBieuDoActionPerformed
        String loai = (String) LoaiBaoCaoField.getSelectedItem();
        if (NgayBatDauField.getDate() != null && NgayKetThucField.getDate() != null) {
            if ("Doanh thu theo ngày".equals(loai)) {
                this.veBieuDo("Doanh thu ngày");
            } else if ("Sản phẩm bán ra".equals(loai)) {
                this.veBieuDo("Sản phẩm ngày");
            } else if ("Sản phẩm nhập vào".equals(loai)) {
            }
        }
    }//GEN-LAST:event_XemBieuDoActionPerformed

    private void InBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InBaoCaoActionPerformed
        // TODO add your handling code here:
        String loai = (String) LoaiBaoCaoField.getSelectedItem();
        ArrayList<BaoCaoDoanhThu> hd = ThongKeDAO.getInstance().getDoanhThuByHoaDon(new Date(NgayBatDauField.getDate().getTime()), new Date(NgayKetThucField.getDate().getTime()));
        if (NgayBatDauField.getDate() != null && NgayKetThucField.getDate() != null && hd != null) {
            if ("Doanh thu theo ngày".equals(loai)) {
                this.InBaoCaoDoanhThu();
            } else if ("Sản phẩm bán ra".equals(loai)) {
                this.InBaoCaoSanPhamBan();
            } else if ("Sản phẩm nhập vào".equals(loai)) {

            }
        }
    }//GEN-LAST:event_InBaoCaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public void veBieuDo(String tenBieuDo) {

        ArrayList<BaoCaoDoanhThu> hd = ThongKeDAO.getInstance().getDoanhThuByHoaDon(new Date(NgayBatDauField.getDate().getTime()), new Date(NgayKetThucField.getDate().getTime()));
        ArrayList<BaoCaoSanPham> sp1 = ThongKeDAO.getInstance().getSoSanPhamBanRa(new Date(NgayBatDauField.getDate().getTime()), new Date(NgayKetThucField.getDate().getTime()));
      

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayBatDau = dateFormat.format(NgayBatDauField.getDate());
        String ngayKetThuc = dateFormat.format(NgayKetThucField.getDate());

        switch (tenBieuDo) {
            case "Doanh thu ngày" -> {
                if (hd != null) {
                    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                    for (BaoCaoDoanhThu i : hd) {
                        String ngayHoaDon = dateFormat.format(i.getNgayHoaDon());
                        dataset.addValue(i.getDoanhThu(), "Doanh thu", ngayHoaDon);
                    }
                    JFreeChart chart = ChartFactory.createBarChart("THỐNG KÊ DOANH THU TPT SPORT", "Thời gian", "Doanh thu", dataset);
                    CategoryPlot Plot = (CategoryPlot) chart.getPlot();
                    Plot.setBackgroundPaint(Color.WHITE);
                    Plot.setOutlinePaint(null);

                    ChartPanel chartPanel = new ChartPanel(chart);
                    chartPanel.setPreferredSize(new Dimension(Panel1.getWidth(), Panel1.getHeight()));
                    Panel1.removeAll();
                    Panel1.setLayout(new CardLayout());
                    Panel1.add(chartPanel);
                    Panel1.validate();
                    Panel1.repaint();
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Không tồn tại dữ liệu!");
                }
            }
            case "Sản phẩm ngày" -> {
                if (sp1 != null) {
                    DefaultPieDataset dataset = new DefaultPieDataset();
                    for (BaoCaoSanPham i : sp1) {
                        dataset.setValue(i.getTenSanPham(), i.getSoLuong());
                    }
                    JFreeChart chart = ChartFactory.createPieChart("TỈ LỆ SẢN PHẨM BÁN RA TỪ NGÀY " + ngayBatDau + " ĐẾN " + ngayKetThuc,
                            dataset, true, true, true);
                    PiePlot Plot = (PiePlot) chart.getPlot();
                    Plot.setBackgroundPaint(Color.WHITE);
                    Plot.setOutlinePaint(null);
                    ChartPanel chartPanel = new ChartPanel(chart);
                    chartPanel.setSize(new Dimension(Panel1.getWidth(), Panel1.getHeight()));
                    Panel1.removeAll();
                    Panel1.setLayout(new CardLayout());
                    Panel1.add(chartPanel);
                    Panel1.validate();
                    Panel1.repaint();
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Không tồn tại dữ liệu!");
                }

            }            
            case "Lợi nhuận" -> {

            }
            default -> {
            }
        }

    }

    private void InBaoCaoDoanhThu() {
        Document doc = new Document(PageSize.A4);
        DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
        String ngayBatDau = dateFormat.format(NgayBatDauField.getDate());
        String ngayKetThuc = dateFormat.format(NgayKetThucField.getDate());

        String fileName = "BaoCaoDoanhThu" + ngayBatDau + "+" + ngayKetThuc;
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("src/reports/" + fileName + ".pdf"));
            doc.open();
            File fileFontTieuDe = new File("src/resources/fonts/vuArialBold.ttf");
            BaseFont bfTieuDe = BaseFont.createFont(fileFontTieuDe.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontTieuDe1 = new Font(bfTieuDe, 15);
            Font fontTieuDe2 = new Font(bfTieuDe, 13);
            Font fontTieuDe3 = new Font(bfTieuDe, 16);
            File fileFontNoiDung = new File("src/resources/fonts/vuArial.ttf");
            BaseFont bfNoiDung = BaseFont.createFont(fileFontNoiDung.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontNoiDung1 = new Font(bfNoiDung, 13);
            Font fontNoiDung2 = new Font(bfNoiDung, 12);

            Paragraph prgTenCuaHang = new Paragraph("TPT SPORT", fontTieuDe3);
            prgTenCuaHang.setAlignment(Element.ALIGN_CENTER);
            doc.add(prgTenCuaHang);

            Paragraph prgDiaChi = new Paragraph("123 Đường số 4, Phường Linh Trung, Thành phố Thủ Đức, Thành phố Hồ Chí Minh, Việt Nam", fontNoiDung2);
            prgDiaChi.setAlignment(Element.ALIGN_CENTER);
            prgDiaChi.setAlignment(Paragraph.ALIGN_CENTER);
            prgDiaChi.setSpacingBefore(5);
            doc.add(prgDiaChi);

            Paragraph prgTieuDe = new Paragraph("BÁO CÁO DOANH THU", fontTieuDe1);
            prgTieuDe.setAlignment(Element.ALIGN_CENTER);
            prgTieuDe.setSpacingBefore(20);
            doc.add(prgTieuDe);

            Paragraph prgNgay = new Paragraph("Từ ngày " + ngayBatDau + " đến ngày " + ngayKetThuc, fontNoiDung2);
            prgNgay.setAlignment(Element.ALIGN_CENTER);
            prgNgay.setSpacingBefore(4);
            prgNgay.setSpacingAfter(20);
            doc.add(prgNgay);

            Paragraph prgMuc1 = new Paragraph("I. Doanh thu theo ngày:", fontTieuDe2);
            prgMuc1.setAlignment(Element.ALIGN_LEFT);
            prgMuc1.setIndentationLeft(30);
            prgMuc1.setSpacingBefore(20);
            prgMuc1.setSpacingAfter(10);
            doc.add(prgMuc1);

            PdfPTable tableSP = new PdfPTable(4);
            tableSP.setWidthPercentage(85);
            tableSP.setSpacingBefore(10);
            tableSP.setSpacingAfter(20);

            float[] tableSP_colWidths = {50, 150, 150, 150};
            tableSP.setWidths(tableSP_colWidths);
            PdfPCell cellTDSTT = new PdfPCell(new Paragraph("STT", fontTieuDe2));
            cellTDSTT.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDSTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDSTT.setPaddingTop(6);
            cellTDSTT.setPaddingBottom(6);
            tableSP.addCell(cellTDSTT);

            PdfPCell cellTDNgay = new PdfPCell(new Paragraph("Ngày", fontTieuDe2));
            cellTDNgay.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDNgay.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDNgay.setPaddingTop(6);
            cellTDNgay.setPaddingBottom(6);
            tableSP.addCell(cellTDNgay);

            PdfPCell cellTDST = new PdfPCell(new Paragraph("Số tiền", fontTieuDe2));
            cellTDST.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDST.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDST.setPaddingTop(6);
            cellTDST.setPaddingBottom(6);
            tableSP.addCell(cellTDST);

            PdfPCell cellTDTT = new PdfPCell(new Paragraph("Ghi chú", fontTieuDe2));
            cellTDTT.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDTT.setPaddingTop(6);
            cellTDTT.setPaddingBottom(6);
            tableSP.addCell(cellTDTT);

            ArrayList<BaoCaoDoanhThu> bcdt = ThongKeDAO.getInstance().getDoanhThuByHoaDon(new Date(NgayBatDauField.getDate().getTime()), new Date(NgayKetThucField.getDate().getTime()));
            double tongTien = 0;
            int stt = 0;
            for (BaoCaoDoanhThu i : bcdt) {
                String ngayHoaDon = dateFormat.format(i.getNgayHoaDon());

                PdfPCell cellSTT = new PdfPCell(new Paragraph(String.valueOf(stt), fontNoiDung1));
                cellSTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellSTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellSTT.setPaddingTop(6);
                cellSTT.setPaddingBottom(6);
                tableSP.addCell(cellSTT);

                PdfPCell cellNgay = new PdfPCell(new Paragraph(ngayHoaDon, fontNoiDung1));
                cellNgay.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellNgay.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellNgay.setPaddingTop(6);
                cellNgay.setPaddingBottom(6);
                tableSP.addCell(cellNgay);

                PdfPCell cellDT = new PdfPCell(new Paragraph(DinhDangTienTe(i.getDoanhThu()), fontNoiDung1));
                cellDT.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellDT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellDT.setPaddingTop(6);
                cellDT.setPaddingBottom(6);
                tableSP.addCell(cellDT);

                PdfPCell cellTT = new PdfPCell(new Paragraph("", fontNoiDung1));
                cellTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTT.setPaddingTop(6);
                cellTT.setPaddingBottom(6);
                tableSP.addCell(cellTT);

                stt = stt + 1;
                tongTien = tongTien + i.getDoanhThu();
            }

            PdfPCell cellTDTC = new PdfPCell(new Paragraph("Tổng tiền: ", fontTieuDe2));
            cellTDTC.setColspan(2);
            cellTDTC.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDTC.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDTC.setPaddingTop(6);
            cellTDTC.setPaddingBottom(6);
            tableSP.addCell(cellTDTC);

            PdfPCell cellTC = new PdfPCell(new Paragraph(DinhDangTienTe(tongTien), fontNoiDung1));
            cellTC.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTC.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTC.setPaddingTop(6);
            cellTC.setPaddingBottom(6);
            tableSP.addCell(cellTC);

            PdfPCell cellGC = new PdfPCell(new Paragraph("", fontNoiDung1));
            cellGC.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellGC.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellGC.setPaddingTop(6);
            cellGC.setPaddingBottom(6);
            tableSP.addCell(cellGC);
            doc.add(tableSP);

            doc.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void InBaoCaoSanPhamBan() {
        Document doc = new Document(PageSize.A4);
        DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
        String ngayBatDau = dateFormat.format(NgayBatDauField.getDate());
        String ngayKetThuc = dateFormat.format(NgayKetThucField.getDate());

        String fileName = "BaoCaoSanPhamBan" + ngayBatDau + "+" + ngayKetThuc;
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("src/reports/" + fileName + ".pdf"));
            doc.open();
            File fileFontTieuDe = new File("src/resources/fonts/vuArialBold.ttf");
            BaseFont bfTieuDe = BaseFont.createFont(fileFontTieuDe.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontTieuDe1 = new Font(bfTieuDe, 15);
            Font fontTieuDe2 = new Font(bfTieuDe, 13);
            Font fontTieuDe3 = new Font(bfTieuDe, 16);
            File fileFontNoiDung = new File("src/resources/fonts/vuArial.ttf");
            BaseFont bfNoiDung = BaseFont.createFont(fileFontNoiDung.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontNoiDung1 = new Font(bfNoiDung, 13);
            Font fontNoiDung2 = new Font(bfNoiDung, 12);

            Paragraph prgTenCuaHang = new Paragraph("TPT SPORT", fontTieuDe3);
            prgTenCuaHang.setAlignment(Element.ALIGN_CENTER);
            doc.add(prgTenCuaHang);

            Paragraph prgDiaChi = new Paragraph("123 Đường số 4, Phường Linh Trung, Thành phố Thủ Đức, Thành phố Hồ Chí Minh, Việt Nam", fontNoiDung2);
            prgDiaChi.setAlignment(Element.ALIGN_CENTER);
            prgDiaChi.setAlignment(Paragraph.ALIGN_CENTER);
            prgDiaChi.setSpacingBefore(6);
            doc.add(prgDiaChi);

            Paragraph prgTieuDe = new Paragraph("BÁO CÁO LƯỢNG SẢN PHẨM BÁN RA", fontTieuDe1);
            prgTieuDe.setAlignment(Element.ALIGN_CENTER);
            prgTieuDe.setSpacingBefore(20);
            doc.add(prgTieuDe);

            Paragraph prgNgay = new Paragraph("Từ ngày " + ngayBatDau + " đến ngày " + ngayKetThuc, fontNoiDung2);
            prgNgay.setAlignment(Element.ALIGN_CENTER);
            prgNgay.setSpacingBefore(4);
            prgNgay.setSpacingAfter(20);
            doc.add(prgNgay);

            Paragraph prgMuc1 = new Paragraph("I. Số lượng sản phẩm theo ngày:", fontTieuDe2);
            prgMuc1.setAlignment(Element.ALIGN_LEFT);
            prgMuc1.setIndentationLeft(30);
            prgMuc1.setSpacingBefore(20);
            prgMuc1.setSpacingAfter(10);
            doc.add(prgMuc1);

            PdfPTable tableSP = new PdfPTable(4);
            tableSP.setWidthPercentage(85);
            tableSP.setSpacingBefore(10);
            tableSP.setSpacingAfter(20);

            float[] tableSP_colWidths = {50, 200, 100, 200};
            tableSP.setWidths(tableSP_colWidths);
            PdfPCell cellTDSTT = new PdfPCell(new Paragraph("STT", fontTieuDe2));
            cellTDSTT.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDSTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDSTT.setPaddingTop(6);
            cellTDSTT.setPaddingBottom(6);
            tableSP.addCell(cellTDSTT);

            PdfPCell cellTDNgay = new PdfPCell(new Paragraph("Tên sản phẩm", fontTieuDe2));
            cellTDNgay.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDNgay.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDNgay.setPaddingTop(6);
            cellTDNgay.setPaddingBottom(6);
            tableSP.addCell(cellTDNgay);

            PdfPCell cellTDST = new PdfPCell(new Paragraph("Số lượng", fontTieuDe2));
            cellTDST.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDST.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDST.setPaddingTop(6);
            cellTDST.setPaddingBottom(6);
            tableSP.addCell(cellTDST);

            PdfPCell cellTDTT = new PdfPCell(new Paragraph("Ghi chú", fontTieuDe2));
            cellTDTT.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDTT.setPaddingTop(6);
            cellTDTT.setPaddingBottom(6);
            tableSP.addCell(cellTDTT);

            ArrayList<BaoCaoSanPham> bcsp = ThongKeDAO.getInstance().getSoSanPhamBanRa(new Date(NgayBatDauField.getDate().getTime()), new Date(NgayKetThucField.getDate().getTime()));
            int stt = 0;
            for (BaoCaoSanPham i : bcsp) {
                PdfPCell cellSTT = new PdfPCell(new Paragraph(String.valueOf(stt), fontNoiDung1));
                cellSTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellSTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellSTT.setPaddingTop(6);
                cellSTT.setPaddingBottom(6);
                tableSP.addCell(cellSTT);

                PdfPCell cellNgay = new PdfPCell(new Paragraph(i.getTenSanPham(), fontNoiDung1));
                cellNgay.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellNgay.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellNgay.setPaddingTop(6);
                cellNgay.setPaddingBottom(6);
                tableSP.addCell(cellNgay);

                PdfPCell cellDT = new PdfPCell(new Paragraph(String.valueOf(i.getSoLuong()), fontNoiDung1));
                cellDT.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellDT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellDT.setPaddingTop(6);
                cellDT.setPaddingBottom(6);
                tableSP.addCell(cellDT);

                PdfPCell cellTT = new PdfPCell(new Paragraph("", fontNoiDung1));
                cellTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTT.setPaddingTop(6);
                cellTT.setPaddingBottom(6);
                tableSP.addCell(cellTT);

                stt = stt + 1;
            }
            doc.add(tableSP);
            doc.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }        
    public String DinhDangTienTe(double SoTien) {
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        String str = en.format(SoTien);
        return str;
    }

    private void setLoaiBaoCaoField() {
        String[] tenCot = {"Doanh thu theo ngày", "Sản phẩm bán ra", "Lợi nhuận"};
        for (int i = 0; i < tenCot.length; i++) {
            LoaiBaoCaoField.addItem(tenCot[i]);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InBaoCao;
    private javax.swing.JComboBox<String> LoaiBaoCaoField;
    private com.toedter.calendar.JDateChooser NgayBatDauField;
    private com.toedter.calendar.JDateChooser NgayKetThucField;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton XemBieuDo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}