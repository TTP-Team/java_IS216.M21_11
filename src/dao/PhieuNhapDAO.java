/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.PhieuNhap;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JTextField;
import oracle.jdbc.OracleTypes;

public class PhieuNhapDAO{
    
    public static PhieuNhapDAO getInstance() {
        return new PhieuNhapDAO();
    }
    
    public int insert(PhieuNhap t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call ThemPhieuNhap(?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getMaPhieuNhap());
            cstm.setDate(2, t.getNgayNhap());
            cstm.setString(3, t.getMaNhanVien());
            int kqua = cstm.executeUpdate();
            System.out.println(sql);
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }   
    public int delete(String t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call XoaPhieuNhap(?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            int kqua = cstm.executeUpdate();
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    
    public ArrayList<PhieuNhap> getAll() {
        ArrayList<PhieuNhap> ketQua = new ArrayList<>();
        String sql = "{call getAllPhieuNhap(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maPhieuNhap = rs.getString("MAPHIEUNHAP");
                Date ngayNhap = rs.getDate("NGAYNHAP");
                String maNhanVien = rs.getString("MANHANVIEN");
                double triGia = rs.getDouble("TRIGIA");
                PhieuNhap phieuNhap= new PhieuNhap(maPhieuNhap, maNhanVien, ngayNhap, triGia);
                ketQua.add(phieuNhap);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    
    public PhieuNhap getById(String t) {
        PhieuNhap phieuNhap = null;
        String sql = "{call getPhieuNhapById(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {         
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maPhieuNhap = rs.getString("MAPHIEUNHAP");
                Date ngayNhap = rs.getDate("NGAYNHAP");
                String maNhanVien = rs.getString("MANHANVIEN");
                double triGia = rs.getDouble("TRIGIA");
                phieuNhap = new PhieuNhap(maPhieuNhap, maNhanVien, ngayNhap, triGia);
            }
            con.close();
            return phieuNhap;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<PhieuNhap> getByMaNhanVien(String t) {
        ArrayList<PhieuNhap> ketQua = new ArrayList<>();
        String sql = "{call getHoaDonByMaNhanVien(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maPhieuNhap = rs.getString("MAPHIEUNHAP");
                Date ngayNhap = rs.getDate("NGAYNHAP");
                String maNhanVien = rs.getString("MANHANVIEN");
                double triGia = rs.getDouble("TRIGIA");
                PhieuNhap phieuNhap = new PhieuNhap(maPhieuNhap, maNhanVien, ngayNhap, triGia);
                ketQua.add(phieuNhap);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public ArrayList<PhieuNhap> getByNgay(Date t) {
        ArrayList<PhieuNhap> ketQua = new ArrayList<>();
        String sql = "{call getPhieuNhapByNgay(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setDate(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maPhieuNhap = rs.getString("MAPHIEUNHAP");
                Date ngayNhap = rs.getDate("NGAYNHAP");
                String maNhanVien = rs.getString("MANHANVIEN");
                double triGia = rs.getDouble("TRIGIA");
                PhieuNhap phieuNhap = new PhieuNhap(maPhieuNhap, maNhanVien, ngayNhap, triGia);
                ketQua.add(phieuNhap);
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
            String sqlProc = "{? = call getThuTuPhieuNhap}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.registerOutParameter(1,java.sql.Types.INTEGER);              
            cstm.executeUpdate();
            tt = "PN" + cstm.getInt(1);
            con.close();
            return tt;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return "";
        }
            
    }

    
}
