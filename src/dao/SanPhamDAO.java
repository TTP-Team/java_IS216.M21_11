/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.SanPham;
import java.util.ArrayList;
import java.sql.Connection;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

public class SanPhamDAO {

    public static SanPhamDAO getInstance() {
        return new SanPhamDAO();
    }

    public int insert(SanPham t) {
        try (Connection con = JDBCUtil.getConnection()) {
            String sql = "{call ThemSanPham(?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getTenSanPham());
            cstm.setString(2, t.getKichThuoc());
            cstm.setString(3, t.getHinhAnh());
            cstm.setString(4, t.getMoTa());
            cstm.setString(5, t.getHangSanXuat());
            cstm.setString(6, t.getMauSac());
            cstm.setDouble(7, t.getDonGiaSi());
            cstm.setDouble(8, t.getDonGiaLe());
            cstm.setString(9, t.getMonTheThao());
            cstm.setString(10, t.getMaDanhMuc());
            cstm.setInt(11, t.getSoNgayBaoHanh());
            cstm.executeUpdate();
            con.close();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }
    
    public int update(SanPham t) {
        int ketQua = 0;
        try(Connection con = JDBCUtil.getConnection()) {
            String sql = "{call SuaSanPham(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getMaSanPham());
            cstm.setString(2, t.getTenSanPham());
            cstm.setInt(3, t.getSoLuong());
            cstm.setString(4, t.getKichThuoc());
            cstm.setString(5, t.getHinhAnh());
            cstm.setString(6, t.getMoTa());
            cstm.setString(7, t.getHangSanXuat());
            cstm.setString(8, t.getMauSac());
            cstm.setDouble(9, t.getDonGiaSi());
            cstm.setDouble(10, t.getDonGiaLe());
            cstm.setString(11, t.getMonTheThao());
            cstm.setString(12, t.getMaDanhMuc());
            cstm.setInt(13, t.getSoNgayBaoHanh());
            ketQua = cstm.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        return ketQua;
    }

    public int delete(String t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call XoaSanPham(?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public ArrayList<SanPham> getAll() {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        String sql = "{call getAllSanPham(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                String kichThuoc = rs.getString("KICHTHUOC");
                String hinhAnh = rs.getString("HINHANH");
                String moTa = rs.getString("MOTA");
                String hangSanXuat = rs.getString("HANGSANXUAT");
                String mauSac = rs.getString("MAUSAC");
                double donGiaSi = rs.getDouble("DONGIASI");
                double donGiaLe = rs.getDouble("DONGIALE");
                String monTheThao = rs.getString("MONTHETHAO");
                String maDanhMuc = rs.getString("MADANHMUC");
                int soNgayBaoHanh = rs.getInt("SONGAYBAOHANH");
                SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, kichThuoc, hinhAnh, moTa, hangSanXuat, mauSac, donGiaSi, donGiaLe, monTheThao, maDanhMuc, soNgayBaoHanh);
                ketQua.add(sanPham);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
    public SanPham getById(String t) {
        SanPham sanPham = null;
        String sql = "{call getSanPhamById(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                String kichThuoc = rs.getString("KICHTHUOC");
                String hinhAnh = rs.getString("HINHANH");
                String moTa = rs.getString("MOTA");
                String hangSanXuat = rs.getString("HANGSANXUAT");
                String mauSac = rs.getString("MAUSAC");
                double donGiaSi = rs.getDouble("DONGIASI");
                double donGiaLe = rs.getDouble("DONGIALE");
                String monTheThao = rs.getString("MONTHETHAO");
                String maDanhMuc = rs.getString("MADANHMUC");
                int soNgayBaoHanh = rs.getInt("SONGAYBAOHANH");
                sanPham = new SanPham(maSanPham, tenSanPham, soLuong, kichThuoc, hinhAnh, moTa, hangSanXuat, mauSac, donGiaSi, donGiaLe, monTheThao, maDanhMuc, soNgayBaoHanh);
            }
            con.close();
            return sanPham;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<SanPham> getByTen(String t) {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        String sql = "{call getSanPhamByTen(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                String kichThuoc = rs.getString("KICHTHUOC");
                String hinhAnh = rs.getString("HINHANH");
                String moTa = rs.getString("MOTA");
                String hangSanXuat = rs.getString("HANGSANXUAT");
                String mauSac = rs.getString("MAUSAC");
                double donGiaSi = rs.getDouble("DONGIASI");
                double donGiaLe = rs.getDouble("DONGIALE");
                String monTheThao = rs.getString("MONTHETHAO");
                String maDanhMuc = rs.getString("MADANHMUC");
                int soNgayBaoHanh = rs.getInt("SONGAYBAOHANH");
                SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, kichThuoc, hinhAnh, moTa, hangSanXuat, mauSac, donGiaSi, donGiaLe, monTheThao, maDanhMuc, soNgayBaoHanh);
                ketQua.add(sanPham);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public ArrayList<SanPham> getByHangSanXuat(String t) {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        String sql = "{call getSanPhamByHangSanXuat(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                String kichThuoc = rs.getString("KICHTHUOC");
                String hinhAnh = rs.getString("HINHANH");
                String moTa = rs.getString("MOTA");
                String hangSanXuat = rs.getString("HANGSANXUAT");
                String mauSac = rs.getString("MAUSAC");
                double donGiaSi = rs.getDouble("DONGIASI");
                double donGiaLe = rs.getDouble("DONGIALE");
                String monTheThao = rs.getString("MONTHETHAO");
                String maDanhMuc = rs.getString("MADANHMUC");
                int soNgayBaoHanh = rs.getInt("SONGAYBAOHANH");
                SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, kichThuoc, hinhAnh, moTa, hangSanXuat, mauSac, donGiaSi, donGiaLe, monTheThao, maDanhMuc, soNgayBaoHanh);
                ketQua.add(sanPham);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public ArrayList<SanPham> getByMauSac(String t) {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        String sql = "{call getSanPhamByMauSac(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                String kichThuoc = rs.getString("KICHTHUOC");
                String hinhAnh = rs.getString("HINHANH");
                String moTa = rs.getString("MOTA");
                String hangSanXuat = rs.getString("HANGSANXUAT");
                String mauSac = rs.getString("MAUSAC");
                double donGiaSi = rs.getDouble("DONGIASI");
                double donGiaLe = rs.getDouble("DONGIALE");
                String monTheThao = rs.getString("MONTHETHAO");
                String maDanhMuc = rs.getString("MADANHMUC");
                int soNgayBaoHanh = rs.getInt("SONGAYBAOHANH");
                SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, kichThuoc, hinhAnh, moTa, hangSanXuat, mauSac, donGiaSi, donGiaLe, monTheThao, maDanhMuc, soNgayBaoHanh);
                ketQua.add(sanPham);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public ArrayList<SanPham> getByMonTheThao(String t) {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        String sql = "{call getSanPhamByMonTheThao(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                String kichThuoc = rs.getString("KICHTHUOC");
                String hinhAnh = rs.getString("HINHANH");
                String moTa = rs.getString("MOTA");
                String hangSanXuat = rs.getString("HANGSANXUAT");
                String mauSac = rs.getString("MAUSAC");
                double donGiaSi = rs.getDouble("DONGIASI");
                double donGiaLe = rs.getDouble("DONGIALE");
                String monTheThao = rs.getString("MONTHETHAO");
                String maDanhMuc = rs.getString("MADANHMUC");
                int soNgayBaoHanh = rs.getInt("SONGAYBAOHANH");
                SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, kichThuoc, hinhAnh, moTa, hangSanXuat, mauSac, donGiaSi, donGiaLe, monTheThao, maDanhMuc, soNgayBaoHanh);
                ketQua.add(sanPham);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public ArrayList<SanPham> getByMaDanhMuc(String t) {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        String sql = "{call getSanPhamByMaDanhMuc(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                String kichThuoc = rs.getString("KICHTHUOC");
                String hinhAnh = rs.getString("HINHANH");
                String moTa = rs.getString("MOTA");
                String hangSanXuat = rs.getString("HANGSANXUAT");
                String mauSac = rs.getString("MAUSAC");
                double donGiaSi = rs.getDouble("DONGIASI");
                double donGiaLe = rs.getDouble("DONGIALE");
                String monTheThao = rs.getString("MONTHETHAO");
                String maDanhMuc = rs.getString("MADANHMUC");
                int soNgayBaoHanh = rs.getInt("SONGAYBAOHANH");
                SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, kichThuoc, hinhAnh, moTa, hangSanXuat, mauSac, donGiaSi, donGiaLe, monTheThao, maDanhMuc, soNgayBaoHanh);
                ketQua.add(sanPham);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
