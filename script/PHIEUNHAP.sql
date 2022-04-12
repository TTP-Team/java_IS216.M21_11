CREATE TABLE PHIEUNHAP(
    MAPHIEUNHAP CHAR(10) PRIMARY KEY,
    NGAYNHAP DATE,
    MANHANVIEN CHAR(10)
);

ALTER TABLE PHIEUNHAP ADD CONSTRAINT FK_PHIEUNHAP FOREIGN KEY(MANHANVIEN) REFERENCES NHANVIEN(MANHANVIEN);

INSERT INTO PHIEUNHAP VALUES('MPN01','01/01/2021','NV01');
INSERT INTO PHIEUNHAP VALUES('MPN02','05/05/2021','NV01');
INSERT INTO PHIEUNHAP VALUES('MPN03','12/11/2021','NV01');
INSERT INTO PHIEUNHAP VALUES('MPN04','10/02/2021','NV03');
INSERT INTO PHIEUNHAP VALUES('MPN05','10/10/2021','NV03');
INSERT INTO PHIEUNHAP VALUES('MPN06','24/05/2021','NV03');
INSERT INTO PHIEUNHAP VALUES('MPN07','18/09/2021','NV04');
INSERT INTO PHIEUNHAP VALUES('MPN08','28/02/2021','NV04');
INSERT INTO PHIEUNHAP VALUES('MPN09','08/03/2021','NV06');
INSERT INTO PHIEUNHAP VALUES('MPN10','13/04/2021','NV06');
INSERT INTO PHIEUNHAP VALUES('MPN11','23/02/2021','NV06');
INSERT INTO PHIEUNHAP VALUES('MPN12','03/02/2021','NV08');
INSERT INTO PHIEUNHAP VALUES('MPN13','01/05/2021','NV08');
INSERT INTO PHIEUNHAP VALUES('MPN14','13/09/2021','NV09');
INSERT INTO PHIEUNHAP VALUES('MPN15','21/11/2021','NV09');