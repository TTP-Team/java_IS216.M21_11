/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.ChiTietPhieuNhap;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

public class ChiTietPhieuNhapDAO {
    
    public static ChiTietPhieuNhapDAO getInstance() {
        return new ChiTietPhieuNhapDAO();
    }
    
    public int insert(ChiTietPhieuNhap t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call ThemChiTietPhieuNhap(?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getMaPhieuNhap());
            cstm.setString(2, t.getMaSanPham());
            cstm.setDouble(3, t.getDonGiaNhap());
            cstm.setInt(4, t.getSoLuong());
            int kqua = cstm.executeUpdate();
            System.out.println(sql);
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }
    
    
    
    public ArrayList<ChiTietPhieuNhap> getById(String t) {
        ArrayList<ChiTietPhieuNhap> ketQua = new ArrayList<>();
        String sql = "{call getAllChiTietPhieuNhap(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString (1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                double donGia = rs.getDouble("DONGIANHAP");
                ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(t, maSanPham, donGia, soLuong);
                ketQua.add(ctpn);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
}
