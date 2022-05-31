
package dao;


import Model.KhachHang;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import oracle.jdbc.OracleTypes;

public class KhachHangDAO{
    
    public static KhachHangDAO getInstance() {
        return new KhachHangDAO();
    }        
    public int insert(KhachHang t) {
        String sql = "{call ThemKhachHang(?,?,?,?,?,?,?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getHoTen());
            cstm.setString(2, t.getDiaChi());
            cstm.setString(3, t.getSoDienThoai());
            cstm.setString(4, t.getEmail());
            cstm.setLong(5, t.getCCCD());
            cstm.setString(6, t.getGioiTinh());
            cstm.setDate(7, t.getNgaySinh());
            cstm.setDate(8, t.getNgayDangKy());
            int kqua = cstm.executeUpdate();
            System.out.println(sql);
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }  
    public int update(KhachHang t) {
        int ketQua = 0;
        String sql = "{call SuaKhachHang(?,?,?,?,?,?,?,?,?,?)}";
        try(Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getMaKhachHang());
            cstm.setString(2, t.getHoTen());
            cstm.setString(3, t.getDiaChi());
            cstm.setString(4, t.getSoDienThoai());
            cstm.setString(5, t.getEmail());
            cstm.setLong(6, t.getCCCD());
            cstm.setString(7, t.getGioiTinh());
            cstm.setDate(8, t.getNgaySinh());
            cstm.setDate(9, t.getNgayDangKy());
            cstm.setDouble(10, t.getDoanhSo());
            ketQua = cstm.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return ketQua;
    }

    public int delete(String t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call XoaKhachHang(?)}";
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

    public ArrayList<KhachHang> getAll() {
        ArrayList<KhachHang> ketQua = new ArrayList<>();
        String sql = "{call getAllKhachHang(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maKhachHang= rs.getString("MAKHACHHANG");
                String tenKhachHang = rs.getString("HOTEN");
                String diaChi= rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayDangKi = rs.getDate("NGAYDANGKI");
                Double doanhSo = rs.getDouble("DOANHSO");
                
                KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayDangKi, doanhSo);
                ketQua.add(khachHang);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public KhachHang getById(String t) {
        KhachHang khachHang = null;
        String sql = "{call getKhachHangById(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {            
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maKhachHang= rs.getString("MAKHACHHANG");
                String tenKhachHang = rs.getString("HOTEN");
                String diaChi= rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayDangKi = rs.getDate("NGAYDANGKI");
                Double doanhSo = rs.getDouble("DOANHSO");
                khachHang = new KhachHang(maKhachHang, tenKhachHang, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayDangKi, doanhSo);
            }
            con.close();
            
        } catch (SQLException e) {
            
        }
        return khachHang;
    }

    public ArrayList<KhachHang> getByTen(String t) {
        ArrayList<KhachHang> ketQua = new ArrayList<>();
        String sql = "{call getKhachHangByTen(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maKhachHang= rs.getString("MAKHACHHANG");
                String tenKhachHang = rs.getString("HOTEN");
                String diaChi= rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayDangKi = rs.getDate("NGAYDANGKI");
                Double doanhSo = rs.getDouble("DOANHSO");
                KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayDangKi, doanhSo);
                ketQua.add(khachHang);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    public ArrayList<KhachHang> getByGioiTinh(String t) {
        ArrayList<KhachHang> ketQua = new ArrayList<>();
        String sql = "{call getKhachHangByGioiTinh(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maKhachHang= rs.getString("MAKHACHHANG");
                String tenKhachHang = rs.getString("HOTEN");
                String diaChi= rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayDangKi = rs.getDate("NGAYDANGKI");
                Double doanhSo = rs.getDouble("DOANHSO");
                KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayDangKi, doanhSo);
                ketQua.add(khachHang);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
    
}
