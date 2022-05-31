
package Model;

import java.sql.Date;

public class HoaDon {
    private String maHoaDon;
    private String maKhachHang;
    private String maNhanVien;
    private String maSuKien;
    private Date ngayHoaDon;
    private double triGia;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKhachHang, String maNhanVien, String maSuKien, Date ngayHoaDon, double triGia) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.maSuKien = maSuKien;
        this.ngayHoaDon = ngayHoaDon;
        this.triGia = triGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaSuKien() {
        return maSuKien;
    }

    public void setMaSuKien(String maSuKien) {
        this.maSuKien = maSuKien;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    
    
    
}
