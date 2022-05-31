/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

public class ChamCong {
    private String maNhanVien;
    private Date ngayLamViec;

    public ChamCong() {
    }

    public ChamCong(String maNhanVien, Date ngayLamViec) {
        this.maNhanVien = maNhanVien;
        this.ngayLamViec = ngayLamViec;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }
    
    
    
    
}
