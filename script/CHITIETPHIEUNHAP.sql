CREATE TABLE CHITIETPHIEUNHAP(
    MAPHIEUNHAP CHAR(10),
    MASANPHAM CHAR(10),
    DONGIANHAP DOUBLE PRECISION,
    SOLUONG INT,

    CONSTRAINT PK_CTPN PRIMARY KEY(MAPHIEUNHAP,MASANPHAM) 
);


ALTER TABLE CHITIETPHIEUNHAP ADD CONSTRAINT FK01_CTPN FOREIGN KEY(MASANPHAM) REFERENCES SANPHAM(MASANPHAM);
ALTER TABLE CHITIETPHIEUNHAP ADD CONSTRAINT FK02_MAPHIEUNHAP FOREIGN KEY(MAPHIEUNHAP) REFERENCES PHIEUNHAP(MAPHIEUNHAP);

INSERT INTO CHITIETPHIEUNHAP VALUES('MPN01','SP001','500000','30');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN02','SP002','470000','15');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN03','SP003','450000','25');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN04','SP004','500000','20');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN05','SP005','420000','25');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN06','SP006','300000','20');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN07','SP007','500000','25');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN08','SP008','400000','30');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN09','SP009','400000','30');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN10','SP010','300000','25');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN11','SP011','300000','35');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN12','SP012','350000','40');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN13','SP013','450000','30');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN14','SP014','350000','25');
INSERT INTO CHITIETPHIEUNHAP VALUES('MPN15','SP015','400000','35');
