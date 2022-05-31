package Model;

import java.sql.Date;

public class PhieuNhap {
    private String maPhieuNhap;
    private String maNhanVien;
    private Date ngayNhap;
    private double triGia;

    public PhieuNhap() {
    }

    public PhieuNhap(String maPhieuNhap, String maNhanVien, Date ngayNhap, double triGia) {
        this.maPhieuNhap = maPhieuNhap;
        this.maNhanVien = maNhanVien;
        this.ngayNhap = ngayNhap;
        this.triGia = triGia;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    
}
