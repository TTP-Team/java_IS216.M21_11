/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.TaiKhoan;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

public class TaiKhoanDAO {

    public static TaiKhoanDAO getInstance() {
        return new TaiKhoanDAO();
    }
    
    public int update(TaiKhoan t) {
        int ketQua = 0;
        try(Connection con = JDBCUtil.getConnection()) {
            String sql = "{call SuaTaiKhoan(?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getTenDangNhap());
            cstm.setString(2, t.getTrangThai());
            ketQua = cstm.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return ketQua;
    }

    public ArrayList<TaiKhoan> getAll() {
        ArrayList<TaiKhoan> ketQua = new ArrayList<>();
        String sql = "{call getAllTaiKhoan(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String tenDangNhap = rs.getString("TENDANGNHAP");
                String phanQuyen = rs.getString("PHANQUYEN");
                String trangThai = rs.getString("TRANGTHAI");               
                TaiKhoan taiKhoan = new TaiKhoan(tenDangNhap, "", phanQuyen, trangThai);
                ketQua.add(taiKhoan);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }


    public TaiKhoan getById(String t) {
        TaiKhoan taiKhoan = null;
        String sql = "{call getTaiKhoanByTenDangNhap(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
           CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String tenDangNhap = rs.getString("TENDANGNHAP");
                String phanQuyen = rs.getString("PHANQUYEN");
                String trangThai = rs.getString("TRANGTHAI");               
                taiKhoan = new TaiKhoan(tenDangNhap, "", phanQuyen, trangThai);
            }
            con.close();
            return taiKhoan;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<TaiKhoan> getByTrangThai(String t) {
        ArrayList<TaiKhoan> ketQua = new ArrayList<>();
        String sql = "{call getTaiKhoanByTrangThai(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String tenDangNhap = rs.getString("TENDANGNHAP");
                String phanQuyen = rs.getString("PHANQUYEN");
                String trangThai = rs.getString("TRANGTHAI");               
                TaiKhoan taiKhoan = new TaiKhoan(tenDangNhap, "", phanQuyen, trangThai);
                ketQua.add(taiKhoan);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public ArrayList<TaiKhoan> getByPhanQuyen(String t) {
        ArrayList<TaiKhoan> ketQua = new ArrayList<>();
        String sql = "{call getTaiKhoanByPhanQuyen(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String tenDangNhap = rs.getString("TENDANGNHAP");
                String phanQuyen = rs.getString("PHANQUYEN");
                String trangThai = rs.getString("TRANGTHAI");               
                TaiKhoan taiKhoan = new TaiKhoan(tenDangNhap, "", phanQuyen, trangThai);
                ketQua.add(taiKhoan);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public void lamMoiMatKhau(String t) {
        ArrayList<TaiKhoan> ketQua = new ArrayList<>();
        String sql = "{call lamMoiMatKhau(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    public int kiemTraTrangThai(String tk, String mk){
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call kiemTraTaiKhoan(?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, tk);
            cstm.setString(2, mk);
            cstm.registerOutParameter(3, java.sql.Types.INTEGER);
            cstm.registerOutParameter(4, java.sql.Types.VARCHAR);
            cstm.executeUpdate();
            int tt = cstm.getInt(3);
            con.close();
            cstm.close();
            return tt;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return -1;
        }
    }
    public String kiemTraPhanQuyen(String tk, String mk){
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call kiemTraTaiKhoan(?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, tk);
            cstm.setString(2, mk);
            cstm.registerOutParameter(3, java.sql.Types.INTEGER);
            cstm.registerOutParameter(4, java.sql.Types.VARCHAR);
            cstm.executeUpdate();
            String pq = cstm.getString(4);
            con.close();
            cstm.close();
            return pq;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return "";
        }
    }
    
}
