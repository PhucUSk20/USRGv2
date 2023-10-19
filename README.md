To install this project, you need to create a new database and set up the SQLConnection.java file settings
Create database PROJECT <if you already have this table, skip this step>
In database PROJECT, execute the query:

    CREATE TABLE Person (
    ID INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(255), 
    FaceVector VARBINARY(MAX), -- Dữ liệu biểu đồ khuôn mặt
    ImageData VARBINARY(MAX) 
    );
    CREATE TABLE Attendance_List (
    ID INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(255) NOT NULL
    );
