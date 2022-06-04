/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Model.ChamCong;
import Model.SuKien;
import com.sun.management.VMOption;
import dao.PhieuNhapDAO;
import dao.SuKienDAO;
import java.io.File;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.BaoCaoThongKe;
import view.DangNhap_View;
import view.HoaDonBanHang;
import view.NhanVienBanHang_View;
import view.PhieuNhapHang;
import view.QuanLyChamCong;
import view.QuanLyDanhMuc;
import view.QuanLyKhachHang;
import view.QuanLyNhanVien;
import view.QuanLySanPham;
import view.QuanLySuKien;
import view.QuanLyTaiKhoan;
import view.ThuKho_View;
import dao.ChamCongDAO;
import dao.DanhMucDAO;

public class DangNhap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DangNhap_View();
//
    }
}
