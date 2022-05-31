/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.SuKien;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import oracle.jdbc.OracleTypes;

public class SuKienDAO {
    public static SuKienDAO getInstance() {
        return new SuKienDAO();
    }
    
    public int insert(SuKien t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call ThemSuKien(?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getTenSuKien());
            cstm.setFloat(2, t.getGiamGia());
            cstm.setDate(3, t.getNgayBatDau());
            cstm.setDate(4, t.getNgayKetThuc());
            int kqua = cstm.executeUpdate();
            System.out.println(sql);
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

   
    public int update(SuKien t) {
        int ketQua = 0;
        try(Connection con = JDBCUtil.getConnection()) {
            String sql = "{call SuaSuKien(?,?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getMaSuKien());
            cstm.setString(2, t.getTenSuKien());
            cstm.setFloat(3, t.getGiamGia());
            cstm.setDate(4, t.getNgayBatDau());
            cstm.setDate(5, t.getNgayKetThuc());
            ketQua = cstm.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        return ketQua;
    }

    
    public int delete(String t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call XoaSuKien(?)}";
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
    
    public ArrayList<SuKien> getAll() {
        ArrayList<SuKien> ketQua = new ArrayList<>();
        String sql = "{call getAllSuKien(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maSuKien = rs.getString("MASUKIEN");
                String tenSuKien = rs.getString("TENSUKIEN");
                float giamGia = rs.getFloat("PHANTRAMGIAMGIA");
                Date ngayBatDau = rs.getDate("NGAYBATDAU");
                Date ngayKetThuc = rs.getDate("NGAYKETTHUC");
                SuKien suKien = new SuKien(maSuKien, tenSuKien, giamGia, ngayBatDau, ngayKetThuc);
                ketQua.add(suKien);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
    public SuKien getById(String t) {
        SuKien suKien = null;
        String sql = "{call getSuKienById(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSuKien = rs.getString("MASUKIEN");
                String tenSuKien = rs.getString("TENSUKIEN");
                float giamGia = rs.getFloat("PHANTRAMGIAMGIA");
                Date ngayBatDau = rs.getDate("NGAYBATDAU");
                Date ngayKetThuc = rs.getDate("NGAYKETTHUC");
                suKien = new SuKien(maSuKien, tenSuKien, giamGia, ngayBatDau, ngayKetThuc);
            }
            con.close();
            return suKien;
        } catch (SQLException e) {
            return null;
        }
    }
  
    public ArrayList<SuKien> getByTen(String t) {
        ArrayList<SuKien> ketQua = new ArrayList<>();
        String sql = "{call getSuKienByTen(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSuKien = rs.getString("MASUKIEN");
                String tenSuKien = rs.getString("TENSUKIEN");
                float giamGia = rs.getFloat("PHANTRAMGIAMGIA");
                Date ngayBatDau = rs.getDate("NGAYBATDAU");
                Date ngayKetThuc = rs.getDate("NGAYKETTHUC");
                SuKien suKien = new SuKien(maSuKien, tenSuKien, giamGia, ngayBatDau, ngayKetThuc);
                ketQua.add(suKien);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public ArrayList<SuKien> getByNgay(Date t) {
        ArrayList<SuKien> ketQua = new ArrayList<>();
        String sql = "{call getSuKienByNgay(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setDate(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSuKien = rs.getString("MASUKIEN");
                String tenSuKien = rs.getString("TENSUKIEN");
                float giamGia = rs.getFloat("PHANTRAMGIAMGIA");
                Date ngayBatDau = rs.getDate("NGAYBATDAU");
                Date ngayKetThuc = rs.getDate("NGAYKETTHUC");
                SuKien suKien = new SuKien(maSuKien, tenSuKien, giamGia, ngayBatDau, ngayKetThuc);
                ketQua.add(suKien);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public String getMaSuKien(Date t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sqlProc = "{? = call getMaSuKien(?)}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.registerOutParameter(1, java.sql.Types.VARCHAR);  
            cstm.setDate(2, t);
            cstm.executeUpdate();
            String kq = cstm.getString(1);          
            con.close();
            return kq;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return "";
        }
    }
        
}
