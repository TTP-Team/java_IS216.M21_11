
package Model;

public class ChiTietPhieuNhap {
    private String maPhieuNhap;
    private String maSanPham;
    private double donGiaNhap;
    private int soLuong;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String maPhieuNhap, String maSanPham, double donGiaNhap, int soLuong) {
        this.maPhieuNhap = maPhieuNhap;
        this.maSanPham = maSanPham;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getDonGiaNhap() {
        return donGiaNhap;
    }

    public void setDonGiaNhap(double donGiaNhap) {
        this.donGiaNhap = donGiaNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
    
}
