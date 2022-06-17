/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.BaoCaoDoanhThu;
import Model.BaoCaoSanPham;
import Model.LoiNhuanThang;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Thanh PC
 */
public class ThongKeDAO {
    
    public static ThongKeDAO getInstance() {
        return new ThongKeDAO();
    }
    public ArrayList<BaoCaoDoanhThu> getDoanhThuByHoaDon(Date ngBD, Date ngKT){
        ArrayList<BaoCaoDoanhThu> ketQua = new ArrayList<>();
        String sql = "{call getAllDoanhThuTheoNgay(?,?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
           CallableStatement cstm = con.prepareCall(sql);
            cstm.setDate(1, ngBD);
            cstm.setDate(2, ngKT);
            cstm.registerOutParameter(3, OracleTypes.CURSOR);
            cstm.execute();
             ResultSet rs = (ResultSet) cstm.getObject(3);
            while (rs.next()) {
                Date ngayHoaDon = rs.getDate("NGAYHOADON");
                Double doanhThu = rs.getDouble("DOANHTHU");
                BaoCaoDoanhThu hd = new BaoCaoDoanhThu(ngayHoaDon, doanhThu);
                ketQua.add(hd);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
    public ArrayList<BaoCaoSanPham> getSoSanPhamBanRa(Date ngBD, Date ngKT){
        ArrayList<BaoCaoSanPham> ketQua = new ArrayList<>();
        String sql = "{call getSoSanPhamBanRa(?,?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
           CallableStatement cstm = con.prepareCall(sql);
            cstm.setDate(1, ngBD);
            cstm.setDate(2, ngKT);
            cstm.registerOutParameter(3, OracleTypes.CURSOR);
            cstm.execute();
             ResultSet rs = (ResultSet) cstm.getObject(3);
            while (rs.next()) {
                String tenSanPham = rs.getString("TENSANPHAM");
                int soLuong = rs.getInt("SLUONG");
                BaoCaoSanPham bcsp = new BaoCaoSanPham(tenSanPham, soLuong);
                ketQua.add(bcsp);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
     public LoiNhuanThang getByLoiNhuanThang(int thang, int nam) {
        String sql = "{call getLoiNhuanThang(?,?,?,?,?,?)}";
        try (Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setInt(1, thang);
            cstm.setInt(2, nam);
            cstm.registerOutParameter(3, OracleTypes.DOUBLE);
            cstm.registerOutParameter(4, OracleTypes.DOUBLE);
            cstm.registerOutParameter(5, OracleTypes.DOUBLE);
            cstm.registerOutParameter(6, OracleTypes.DOUBLE);
            cstm.execute();
            double luong = cstm.getDouble(3);
            double hoaDon = cstm.getDouble(4);
            double nhapHang = cstm.getDouble(5);
            double loi = cstm.getDouble(6);   
            LoiNhuanThang loiNhuan = new LoiNhuanThang(luong,hoaDon, nhapHang, loi);
            con.close();
            return loiNhuan;
        } catch (SQLException e) {
            System.out.println("no data");
            return null;
        }
    }
    
}
