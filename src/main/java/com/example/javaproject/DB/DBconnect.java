package com.example.javaproject.DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBconnect {
    protected static Connection conn=null;
    protected Statement statement = null;
    public static Connection getConn()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=Tircim;trustServerCertificate=true;","myuser","myuser");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        return conn;
    }
}
