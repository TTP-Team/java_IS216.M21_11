
package Model;

import java.sql.Date;


public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private long CCCD;
    private String gioiTinh;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private String chucVu;
    private double luong;
    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String diaChi, String soDienThoai, String email, long CCCD, String gioiTinh, Date ngaySinh, Date ngayVaoLam, String chucVu, double luong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.CCCD = CCCD;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }


    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCCCD() {
        return CCCD;
    }

    public void setCCCD(long CCCD) {
        this.CCCD = CCCD;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    
}
