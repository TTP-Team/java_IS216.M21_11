/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;


import Model.LoiNhuanThang;
import Model.PhieuNhap;
import Model.TienLuong;
import dao.NhanVienDAO;
import dao.PhieuNhapDAO;
import dao.ThongKeDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import view.BaoCaoThongKe;
import view.DangNhap_View;
import view.HoaDonBanHang;
import view.LuongNhanVien;
import view.PhieuNhapHang;
import view.QuanLyChamCong;
import view.QuanLyDanhMuc;
import view.QuanLyKhachHang;
import view.QuanLyNhanVien;
import view.QuanLySanPham;
import view.QuanLySuKien;
import view.QuanLyTaiKhoan;


public class DangNhap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        new DangNhap_View();

        
    }

}
