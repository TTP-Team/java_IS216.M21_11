/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.ChamCong;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import oracle.jdbc.OracleTypes;

public class ChamCongDAO {

    public static ChamCongDAO getInstance() {
        return new ChamCongDAO();
    }

    public ArrayList<ChamCong> getAll() {
        ArrayList<ChamCong> ketQua = new ArrayList<>();
        String sql = "{call getAllChamCong(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                Date ngayLamViec = rs.getDate("NGAYLAMVIEC");
                ChamCong chamCong = new ChamCong(maNhanVien, ngayLamViec);
                ketQua.add(chamCong);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public ArrayList<ChamCong> getByMaNhanVien(String t) {
        ArrayList<ChamCong> ketQua = new ArrayList<>();
        String sql = "{call getChamCongByMaNhanVien(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                Date ngayLamViec = rs.getDate("NGAYLAMVIEC");
                ChamCong chamCong = new ChamCong(maNhanVien, ngayLamViec);
                ketQua.add(chamCong);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public ArrayList<ChamCong> getByTenNhanVien(String t) {
        ArrayList<ChamCong> ketQua = new ArrayList<>();
        String sql = "{call getChamCongByTenNhanVien(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                Date ngayLamViec = rs.getDate("NGAYLAMVIEC");
                ChamCong chamCong = new ChamCong(maNhanVien, ngayLamViec);
                ketQua.add(chamCong);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public ArrayList<ChamCong> getByNgayLamViec(Date t) {
        ArrayList<ChamCong> ketQua = new ArrayList<>();
        String sql = "{call getChamCongByNgayLamViec(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setDate(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                Date ngayLamViec = rs.getDate("NGAYLAMVIEC");
                ChamCong chamCong = new ChamCong(maNhanVien, ngayLamViec);
                ketQua.add(chamCong);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public int getSoNgayLamViecThang(String t) {
        String sql = "{call ?:=getSoNgayLamViec(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(2, t);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.execute();
            int soNgay = cstm.getInt(1);
            con.close();
            cstm.close();
            return soNgay;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }
}
