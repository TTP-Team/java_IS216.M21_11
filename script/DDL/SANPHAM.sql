CREATE TABLE SANPHAM(
    MASANPHAM CHAR(20) PRIMARY KEY,
    TENSANPHAM VARCHAR2(50),
    SOLUONG INT,
    KICHTHUOC VARCHAR2(20), 
    HINHANH VARCHAR2(200),
    MOTA VARCHAR2(500),
    HANGSANXUAT VARCHAR2(50),
    MAUSAC VARCHAR2(20),
    DONGIASI DOUBLE PRECISION,
    DONGIALE DOUBLE PRECISION,
    DONVITINH VARCHAR2(10),
    MONTHETHAO VARCHAR2(20),
    MADANHMUC CHAR(20),
    SONGAYBAOHANH INT
);

ALTER TABLE SANPHAM ADD CONSTRAINT FK_SANPHAM FOREIGN KEY(MADANHMUC) REFERENCES DANHMUC(MADANHMUC);