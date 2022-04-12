CREATE TABLE NHANVIEN(
    MANHANVIEN CHAR(10) PRIMARY KEY,
    TENNHANVIEN VARCHAR2(40),
    TENDANGNHAP VARCHAR2(40),
    DIACHI VARCHAR2(100),
    SODIENTHOAI VARCHAR2(20),
    EMAIL VARCHAR2(50),
    CCCD LONG,
    GIOITINH CHAR(5),
    NGAYSINH DATE,
    NGAYVAOLAM DATE,
    SONGAYNGHI INT,
    CHUCVU VARCHAR2(20)

);

ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NHANVIEN FOREIGN KEY(TENDANGNHAP) REFERENCES TAIKHOAN(TENDANGNHAP);

INSERT INTO NHANVIEN VALUES('NV01','Hồ Việt Trung','hoviettrung','Số 9 Ðào Duy Anh, huyện Ðống Ða','0319523512',
'hoviettrung@gmail.com','0296578964325','nam','01/06/1986','3000000','2500000','09/07/2015','5','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV02','Lê Quang Ðạt','lequangdat','Số 3 Bạch Mai, quận Hai Bà Trung','0645892616','lequangdat@gmail.com',
'3165749632462','nam','30/05/1975','3100000','2600000','26/04/2016','3','Quản lý');
INSERT INTO NHANVIEN VALUES('NV03','Lý Huy Hoàng','lyhuyhoang','523 Hồng Bàng, quận 9, TP HCM','0945736210','lyhuyhoang@gmail.com',
'6542315641654','nam','20/10/1976','3200000','2700000','29/03/2015','4','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV04','Trần Thảo Nhi','tranthaonhi','1B Suong Nguyệt Anh, đường Bến Thành','0645983651','tranthaonhi@gmail.com',
'8543524654564','nữ','10/05/1989','3500000','3000000','11/04/2014','6','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV05','Trần Hoài Nhung','tranhoainhung','50/13/6 Nguyễn Quý, quận 9','0645932678',
'tranhoainhung@gmail.com','5749845646574','nữ','05/06/1990','4500000','4000000','03/05/2016','6','Nhân viên kho');
INSERT INTO NHANVIEN VALUES('NV06','Lê Thị Hoa','lethihoa','50/13/6 Nguyễn Quý, quận 9','0645932678',
'lethihoa@gmail.com','3461579862316','nữ','10/06/1980','3700000','3000000','01/05/2018','7','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV07','Lê Văn Đạt','levandat','Quận l số 14, đường Tân An','0316589632',
'levandat@gmail.com','9687486428752','nam','15/07/1981','3800000','3100000','02/06/2017','5','Nhân viên kho');
INSERT INTO NHANVIEN VALUES('NV08','Lê Thị Bé','lethibe','Số 1 đường Tô Ngọc Vân, Linh Tay','0315564893',
'lethibe@gmail.com', '5218945464564','nữ','14/01/1987','3700000','3200000','05/01/2016','6','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV09','Lê Thị Hương','lethihuong','số 2 đường Duy Tân, Linh Trung','0315564893',
'lethihuong@gmail.com','5646542165475','nữ','22/02/1982','3800000','3000000','01/01/2017','6','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV10','Thái Bảo Nhi','thaibaonhi','Phú Vinh, Chương Mỹ, Hội An','0345621987',
'thaibaonhi@gmail.com','7854854864586','nữ','16/08/1982','4000000','3500000','02/05/2017','5','Nhân viên kho');
INSERT INTO NHANVIEN VALUES('NV11','Nguyễn Bá Luân','nguyenbaluan','193 Bạch Mai, Thanh Nhàn','0465891367',
'nguyenbaluan@gmail.com','6485316795124','nam','14/07/1981','3900000','3100000','03/06/2018','5','Nhân viên kho');
INSERT INTO NHANVIEN VALUES('NV12','Võ Hoàng Phúc','vohoangphuc','184 Phúc Tân, Cai Lạy','0772190920',
'vohoangphuc@gmail.com','6541232412965','nam','31/07/1979','3700000','3000000','04/06/2017','3','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV13','Lê Công Thành','lecongthanh','135/17/60 Nguyễn Hữu Chinh','0316795493',
'lecongthanh@gmail.com','6542326546546','nam','16/01/1978','3800000','3200000','04/06/2017','4','Nhân viên kho');
INSERT INTO NHANVIEN VALUES('NV14','Nguyễn Hữu Thắng','nguyenhuuthang','4A Hoàng Văn Thụ, Pleiku','0756314952',
'nguyenhuuthang@gmail.com','9632541653126','nam','01/12/1977','3900000','3600000','04/06/2017','4','Nhân viên bán hàng');
INSERT INTO NHANVIEN VALUES('NV15','Lê Hữu Huy','lehuuhuy','482/2/31 Đinh Bộ Lĩnh','0165495236',
'lehuuhuy@gmail.com','3654563286912','nam','05/11/1977','3100000','2600000','05/01/2018','5','Nhân viên kho');