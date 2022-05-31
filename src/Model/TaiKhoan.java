package Model;


public class TaiKhoan {
    private String tenDangNhap;
    private String matKhau;
    private String phanQuyen;
    private String trangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenDangNhap, String matKhau, String phanQuyen, String trangThai) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.phanQuyen = phanQuyen;
        this.trangThai = trangThai;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getPhanQuyen() {
        return phanQuyen;
    }

    public void setPhanQuyen(String phanQuyen) {
        this.phanQuyen = phanQuyen;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
    
}
