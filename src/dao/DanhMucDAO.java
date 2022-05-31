package dao;

import java.util.ArrayList;

import java.sql.Connection;

import Model.DanhMuc;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;


public class DanhMucDAO{

    public static DanhMucDAO getInstance() {
        return new DanhMucDAO();
    }

    public int insert(DanhMuc t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sqlProc = "{call ThemDanhMuc(?)}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.setString(1, t.getTenDanhMuc());
            cstm.executeUpdate();
            con.close();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public int update(DanhMuc t) {
        int ketQua = 0;
        try(Connection con = JDBCUtil.getConnection()) {
            String sqlProc = "{call SuaDanhMuc(?,?)}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.setString(1, t.getMaDanhMuc());
            cstm.setString(2, t.getTenDanhMuc());
            cstm.executeUpdate();
            con.close();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        return ketQua;
    }

    public int delete(String t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sqlProc = "{call XoaDanhMuc(?)}";
            CallableStatement cstm = con.prepareCall(sqlProc);
            cstm.setString(1, t);
            cstm.executeUpdate();
            con.close();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public ArrayList<DanhMuc> getAll() {
        ArrayList<DanhMuc> ketQua = new ArrayList<>();
        String sql = "{call getAllDanhMuc(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maDanhMuc = rs.getString("MADANHMUC");
                String tenDanhMuc = rs.getString("TENDANHMUC");
                DanhMuc danhMuc = new DanhMuc(maDanhMuc, tenDanhMuc);
                ketQua.add(danhMuc);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public DanhMuc getById(String t) {
        DanhMuc danhMuc = null;
        String sql = "{call getDanhMucById(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maDanhMuc = rs.getString("MADANHMUC");
                String tenDanhMuc = rs.getString("TENDANHMUC");
                danhMuc = new DanhMuc(maDanhMuc, tenDanhMuc);
            }
            con.close();
            return danhMuc;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public ArrayList<DanhMuc> getByTen(String t) {
        ArrayList<DanhMuc> ketQua = new ArrayList<>();
        String sql = "{call getDanhMucByTen(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maDanhMuc = rs.getString("MADANHMUC");
                String tenDanhMuc = rs.getString("TENDANHMUC");
                DanhMuc danhMuc = new DanhMuc(maDanhMuc, tenDanhMuc);
                ketQua.add(danhMuc);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
    
}
