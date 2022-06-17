/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Thanh PC
 */
public class LoiNhuanThang {
    private double tienLuong;
    private double hoaDon;
    private double nhapHang;
    private double loi;

    public LoiNhuanThang() {
    }

    public LoiNhuanThang(double tienLuong, double hoaDon, double nhapHang, double loi) {
        this.tienLuong = tienLuong;
        this.hoaDon = hoaDon;
        this.nhapHang = nhapHang;
        this.loi = loi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public double getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(double hoaDon) {
        this.hoaDon = hoaDon;
    }

    public double getNhapHang() {
        return nhapHang;
    }

    public void setNhapHang(double nhapHang) {
        this.nhapHang = nhapHang;
    }

    public double getLoi() {
        return loi;
    }

    public void setLoi(double loi) {
        this.loi = loi;
    }
    
}
