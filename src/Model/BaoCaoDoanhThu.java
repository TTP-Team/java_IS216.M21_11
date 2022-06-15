/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Thanh PC
 */
public class BaoCaoDoanhThu {
    private Date ngayHoaDon;
    private double doanhThu;

    public BaoCaoDoanhThu() {
    }

    public BaoCaoDoanhThu(Date ngayHoaDon, double doanhThu) {
        this.ngayHoaDon = ngayHoaDon;
        this.doanhThu = doanhThu;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
