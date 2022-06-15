
package Model;

import java.sql.Date;


public class SuKien {
    private String maSuKien;
    private String tenSuKien;
    private float giamGia;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    public SuKien() {
    }

    public SuKien(String maSuKien, String tenSuKien, float giamGia, Date ngayBatDau, Date ngayKetThuc) {
        this.maSuKien = maSuKien;
        this.tenSuKien = tenSuKien;
        this.giamGia = giamGia;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaSuKien() {
        return maSuKien;
    }

    public void setMaSuKien(String maSuKien) {
        this.maSuKien = maSuKien;
    }

    public String getTenSuKien() {
        return tenSuKien;
    }

    public void setTenSuKien(String tenSuKien) {
        this.tenSuKien = tenSuKien;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    
    
    
}
