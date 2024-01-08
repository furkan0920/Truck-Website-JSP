package com.example.javaproject.DAO;

import com.example.javaproject.DB.DBconnect;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserInformation extends DBconnect {
    public  boolean kullaniciKontrol(String kullaniciAdi,String sifre){
        if (conn==null){
            System.out.println("veritabani bagli degil baglaniyorum");
            getConn();
        }
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs= stmt.executeQuery("select sifre from kullanicilar where isim='"+kullaniciAdi+"'");
            rs.next();
            return sifre.equals(rs.getString(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
