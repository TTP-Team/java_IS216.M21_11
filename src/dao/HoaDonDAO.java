/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.HoaDon;
import java.util.ArrayList;

import java.sql.Connection;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;
import oracle.jdbc.OracleTypes;

public class HoaDonDAO{
    
    public static HoaDonDAO getInstance() {
        return new HoaDonDAO();
    }
    
    public int insert(HoaDon t) {
        String sqlProc = "{call ThemHoaDon(?,?,?,?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.setString(1, t.getMaHoaDon());
            cstm.setString(2, t.getMaKhachHang());
            cstm.setString(3, t.getMaNhanVien());
            cstm.setString(4, t.getMaSuKien());
            cstm.setDate(5, t.getNgayHoaDon());
            int kqua = cstm.executeUpdate();
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public int delete(String t) {
        String sqlProc = "{call XoaHoaDon(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.setString(1, t);
            int kqua = cstm.executeUpdate();
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public ArrayList<HoaDon> getAll() {
        ArrayList<HoaDon> ketQua = new ArrayList<>();
        String sql = "{call getAllHoaDon(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maHoaDon= rs.getString("MAHOADON");
                String maKhachHang = rs.getString("MAKHACHHANG");
                String maNhanVien = rs.getString("MANHANVIEN");
                String maSuKien = rs.getString("MASUKIEN");
                Date ngayHoaDon = rs.getDate("NGAYHOADON");
                Double triGia = rs.getDouble("TRIGIA");
                HoaDon hoaDon = new HoaDon(maHoaDon, maKhachHang, maNhanVien, maSuKien, ngayHoaDon, triGia);
                ketQua.add(hoaDon);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public HoaDon getById(String t) {
        HoaDon hoaDon= null;
        String sql = "{call getHoaDonById(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maHoaDon= rs.getString("MAHOADON");
                String maKhachHang = rs.getString("MAKHACHHANG");
                String maNhanVien = rs.getString("MANHANVIEN");
                String maSuKien = rs.getString("MASUKIEN");
                Date ngayHoaDon = rs.getDate("NGAYHOADON");
                Double triGia = rs.getDouble("TRIGIA");
                hoaDon = new HoaDon(maHoaDon, maKhachHang, maNhanVien, maSuKien, ngayHoaDon, triGia);
            }
            con.close();
            return hoaDon;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<HoaDon> getByMaNhanVien(String t) {
        ArrayList<HoaDon> ketQua = new ArrayList<>();
        String sql = "{call getHoaDonByMaNhanVien(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maHoaDon= rs.getString("MAHOADON");
                String maKhachHang = rs.getString("MAKHACHHANG");
                String maNhanVien = rs.getString("MANHANVIEN");
                String maSuKien = rs.getString("MASUKIEN");
                Date ngayHoaDon = rs.getDate("NGAYHOADON");
                Double triGia = rs.getDouble("TRIGIA");
                HoaDon hoaDon = new HoaDon(maHoaDon, maKhachHang, maNhanVien, maSuKien, ngayHoaDon, triGia);
                ketQua.add(hoaDon);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            return null;
        }
    }
    public ArrayList<HoaDon> getByMaKhachHang(String t) {
        ArrayList<HoaDon> ketQua = new ArrayList<>();
        String sql = "{call getHoaDonByMaKhachHang(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maHoaDon= rs.getString("MAHOADON");
                String maKhachHang = rs.getString("MAKHACHHANG");
                String maNhanVien = rs.getString("MANHANVIEN");
                String maSuKien = rs.getString("MASUKIEN");
                Date ngayHoaDon = rs.getDate("NGAYHOADON");
                Double triGia = rs.getDouble("TRIGIA");
                HoaDon hoaDon = new HoaDon(maHoaDon, maKhachHang, maNhanVien, maSuKien, ngayHoaDon, triGia);
                ketQua.add(hoaDon);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            return null;
        }
    }
    public ArrayList<HoaDon> getByNgayHoaDon(Date t) {
        ArrayList<HoaDon> ketQua = new ArrayList<>();
        String sql = "{call getHoaDonByNgayHoaDon(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setDate(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maHoaDon= rs.getString("MAHOADON");
                String maKhachHang = rs.getString("MAKHACHHANG");
                String maNhanVien = rs.getString("MANHANVIEN");
                String maSuKien = rs.getString("MASUKIEN");
                Date ngayHoaDon = rs.getDate("NGAYHOADON");
                Double triGia = rs.getDouble("TRIGIA");
                HoaDon hoaDon = new HoaDon(maHoaDon, maKhachHang, maNhanVien, maSuKien, ngayHoaDon, triGia);
                ketQua.add(hoaDon);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            return null;
        }
    }
    public String getSoThuTu(){
        try ( Connection con = JDBCUtil.getConnection()) {
            String tt;
            String sqlProc = "{? = call getThuTuHoaDon}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.registerOutParameter(1,java.sql.Types.INTEGER);              
            cstm.executeUpdate();
            tt = "HD" + cstm.getInt(1);
            con.close();
            return tt;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return "";
        }
            
    }
    
    public double tienGiamGia(String t){
        try ( Connection con = JDBCUtil.getConnection()) {
            String sqlProc = "{? = call tinhGiamGia(?)}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.registerOutParameter(1,java.sql.Types.DOUBLE);     
            cstm.setString(2, t);
            cstm.execute();
            double gg = cstm.getDouble(1);
            con.close();
            return gg;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
            
    }
    public double tienThanhToan(String t){
        try ( Connection con = JDBCUtil.getConnection()) {
            String sqlProc = "{? = call tinhTongTien(?)}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.registerOutParameter(1,java.sql.Types.DOUBLE);     
            cstm.setString(2, t);
            cstm.execute();
            double tg = cstm.getDouble(1);
            con.close();
            return tg;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
            
    }
}
