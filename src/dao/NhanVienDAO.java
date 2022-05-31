
package dao;

import Model.NhanVien;
import database.JDBCUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

public class NhanVienDAO {
    
     public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }
    

    public int insert(NhanVien t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call ThemNhanVien(?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getTenNhanVien());
            cstm.setString(2, t.getDiaChi());
            cstm.setString(3, t.getSoDienThoai());
            cstm.setString(4, t.getEmail());
            cstm.setLong(5, t.getCCCD());
            cstm.setString(6, t.getGioiTinh());
            cstm.setDate(7, t.getNgaySinh());
            cstm.setDate(8, t.getNgayVaoLam());
            cstm.setString(9, t.getChucVu());
            int kqua = cstm.executeUpdate();
            System.out.println(sql);
            con.close();
            return kqua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }


    public int update(NhanVien t) {
        int ketQua = 0;
        try(Connection con = JDBCUtil.getConnection()) {
            String sql = "{call SuaNhanVien(?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t.getMaNhanVien());
            cstm.setString(2, t.getTenNhanVien());
            cstm.setString(3, t.getDiaChi());
            cstm.setString(4, t.getSoDienThoai());
            cstm.setString(5, t.getEmail());
            cstm.setLong(6, t.getCCCD());
            cstm.setString(7, t.getGioiTinh());
            cstm.setDate(8, t.getNgaySinh());
            cstm.setDate(9, t.getNgayVaoLam());
            cstm.setString(10, t.getChucVu());
            cstm.setDouble(11, t.getLuong());
            ketQua = cstm.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return ketQua;
    }


    public int delete(String t) {
        try ( Connection con = JDBCUtil.getConnection()) {
            String sql = "{call XoaNhanVien(?)}";
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


    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> ketQua = new ArrayList<>();
        String sql = "{call getAllNhanVien(?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(1);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                String tenNhanVien = rs.getString("TENNHANVIEN");
                String diaChi = rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayVaoLam = rs.getDate("NGAYVAOLAM");
                String chucVu = rs.getString("CHUCVU");
                double luong = rs.getDouble("LUONG");
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayVaoLam, chucVu, luong);
                ketQua.add(nhanVien);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
    }


    public NhanVien getById(String t) {
        NhanVien nhanVien = null;
        String sql = "{call getNhanVienById(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                String tenNhanVien = rs.getString("TENNHANVIEN");
                String diaChi = rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayVaoLam = rs.getDate("NGAYVAOLAM");
                String chucVu = rs.getString("CHUCVU");                
                double luong = rs.getDouble("LUONG");
                nhanVien = new NhanVien(maNhanVien, tenNhanVien, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayVaoLam, chucVu, luong);
            }
            con.close();
            return nhanVien;
        } catch (SQLException e) {
            return null;
        }
    }
    public ArrayList<NhanVien> getByTen(String t) {
        ArrayList<NhanVien> ketQua = new ArrayList<>();
        String sql = "{call getNhanVienByTen(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                String tenNhanVien = rs.getString("TENNHANVIEN");
                String diaChi = rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayVaoLam = rs.getDate("NGAYVAOLAM");
                String chucVu = rs.getString("CHUCVU");                
                double luong = rs.getDouble("LUONG");
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayVaoLam, chucVu, luong);
                ketQua.add(nhanVien);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            return null;
        }
    }
    public ArrayList<NhanVien> getByGioiTinh(String t) {
        ArrayList<NhanVien> ketQua = new ArrayList<>();
        String sql = "{call getNhanVienByGioiTinh(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                String tenNhanVien = rs.getString("TENNHANVIEN");
                String diaChi = rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayVaoLam = rs.getDate("NGAYVAOLAM");
                String chucVu = rs.getString("CHUCVU");                
                double luong = rs.getDouble("LUONG");
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayVaoLam, chucVu, luong);
                ketQua.add(nhanVien);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            return null;
        }
    }
    public ArrayList<NhanVien> getByChucVu(String t) {
        ArrayList<NhanVien> ketQua = new ArrayList<>();
        String sql = "{call getNhanVienByChucVu(?,?)}";
        try ( Connection con = JDBCUtil.getConnection()) {
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setString(1, t);
            cstm.registerOutParameter(2, OracleTypes.CURSOR);
            cstm.execute();
            ResultSet rs = (ResultSet) cstm.getObject(2);
            while (rs.next()) {
                String maNhanVien = rs.getString("MANHANVIEN");
                String tenNhanVien = rs.getString("TENNHANVIEN");
                String diaChi = rs.getString("DIACHI");
                String soDienThoai = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                long CCCD = rs.getLong("CCCD");
                String gioiTinh = rs.getString("GIOITINH");
                Date ngaySinh = rs.getDate("NGAYSINH");
                Date ngayVaoLam = rs.getDate("NGAYVAOLAM");
                String chucVu = rs.getString("CHUCVU");                
                double luong = rs.getDouble("LUONG");
                NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, diaChi, soDienThoai, email, CCCD, gioiTinh, ngaySinh, ngayVaoLam, chucVu, luong);
                ketQua.add(nhanVien);
            }
            con.close();
            return ketQua;
        } catch (SQLException e) {
            return null;
        }
    }
    
    
}
