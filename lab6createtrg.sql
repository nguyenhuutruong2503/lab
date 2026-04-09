-- Bài 1

CREATE TRIGGER trg_Insert_NhanVien_Check
ON NHANVIEN
FOR INSERT
AS
BEGIN
    IF EXISTS (
        SELECT * FROM inserted WHERE LUONG <= 15000
    )
    BEGIN
        PRINT N'Lương phải > 15000'
        rollback transaction
        RETURN
    END

    IF EXISTS (
        SELECT * FROM inserted 
        WHERE datediff(year, NGSINH, getdate()) < 18 
           OR datediff(year, NGSINH, getdate()) > 65
    )
    BEGIN
        PRINT N'Tuổi phải từ 18 đến 65'
        rollback transaction
        RETURN
    END
END
GO

CREATE TRIGGER trg_Update_NhanVien_TPHCM
ON NHANVIEN
FOR UPDATE
AS
BEGIN
    IF EXISTS (
        SELECT * FROM deleted 
        WHERE DCHI LIKE N'%TP HCM%'
    )
    BEGIN
        PRINT N'Không được cập nhật nhân viên ở TP HCM'
        rollback transaction
    END
END
GO


-- Bài 2

CREATE TRIGGER trg_After_Insert_NV_CountGender
ON NHANVIEN
AFTER INSERT
AS
BEGIN
    DECLARE @Nam INT, @Nu INT

    SELECT 
        @Nam = count(CASE WHEN PHAI = N'Nam' THEN 1 END),
        @Nu  = count(CASE WHEN PHAI = N'Nữ' THEN 1 END)
    FROM NHANVIEN

    PRINT N'Tổng NV Nam: ' + cast(@Nam AS NVARCHAR)
    PRINT N'Tổng NV Nữ: ' + cast(@Nu AS NVARCHAR)
END
GO

CREATE TRIGGER trg_After_Update_Gender
ON NHANVIEN
AFTER UPDATE
AS
BEGIN
    IF update(PHAI)
    BEGIN
        DECLARE @Nam INT, @Nu INT

        SELECT 
            @Nam = count(CASE WHEN PHAI = N'Nam' THEN 1 END),
            @Nu  = count(CASE WHEN PHAI = N'Nữ' THEN 1 END)
        FROM NHANVIEN

        PRINT N'Tổng NV Nam: ' + cast(@Nam AS NVARCHAR)
        PRINT N'Tổng NV Nữ: ' + cast(@Nu AS NVARCHAR)
    END
END
GO

CREATE TRIGGER trg_After_Delete_DEAN
ON DEAN
AFTER DELETE
AS
BEGIN
    SELECT MA_NVIEN, count(*) AS SoDeAn
    FROM PHANCONG
    GROUP BY MA_NVIEN
END
GO


-- Bài 3

CREATE TRIGGER trg_Instead_Delete_NV
ON NHANVIEN
INSTEAD OF DELETE
AS
BEGIN
    DELETE FROM THANHNHAN
    WHERE MA_NVIEN IN (SELECT MANV FROM deleted)

    DELETE FROM NHANVIEN
    WHERE MANV IN (SELECT MANV FROM deleted)
END
GO

CREATE TRIGGER trg_Instead_Insert_NV
ON NHANVIEN
INSTEAD OF INSERT
AS
BEGIN
    INSERT INTO NHANVIEN
    SELECT * FROM inserted

    INSERT INTO PHANCONG (MA_NVIEN, MADA, THOIGIAN)
    SELECT MANV, 1, 0
    FROM inserted
END
GO