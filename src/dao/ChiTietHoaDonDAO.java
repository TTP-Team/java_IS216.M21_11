package dao;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.ChiTietHoaDon;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

public class ChiTietHoaDonDAO {

    public static ChiTietHoaDonDAO getInstance() {
        return new ChiTietHoaDonDAO();
    }

    
    public int insert(ChiTietHoaDon t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call ThemChiTietHoaDon(?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getMaHoaDon());
            cstm.setString(2, t.getMaSanPham());
            cstm.setInt(3, t.getSoLuong());
            int kqua = cstm.executeUpdate();
            System.out.println(sql);
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }
    
    public ArrayList<ChiTietHoaDon> getById(String t) {
        ArrayList<ChiTietHoaDon> ketQua = new ArrayList<>();
        String sql = "{call getAllChiTietHoaDon(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString (1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maSanPham = rs.getString("MASANPHAM");
                int soLuong = rs.getInt("SOLUONG");
                ChiTietHoaDon cthd = new ChiTietHoaDon(t, maSanPham, soLuong);
                ketQua.add(cthd);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
}
