package com.example.javaproject.DAO;

import com.example.javaproject.DB.DBconnect;

import java.sql.ResultSet;
import java.sql.Statement;

public class AddUser extends DBconnect {


    /*public  boolean kullaniciVarmi(String kullaniciAdi,String soyadi,String telefon){
        if (conn==null){
            System.out.println("veritabani bagli degil baglaniyorum");
            getConn();
        }
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs= stmt.executeQuery("select isim,soyisim,telefon from kullanicilar where "
                    + "'" + kullaniciAdi + "',"
                    +"'" + soyadi + "',"
                    + "'" + telefon+ "'"
                    + ")");

            return equals(rs.next());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }*/
/*
    public  void kullaniciEkle(String Ad,String Soyad,String Email,String Telefon,String Sifre){
        if (conn==null){
            System.out.println("veritabani bagli degil baglaniyorum");
            getConn();
        }
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs= stmt.executeQuery("insert into kullanicilar(isim,soyisim,email,telefon,sifre) values("
                    + "'" + Ad+ "',"
                    + "'" + Soyad + "',"
                    + "'" + Email + "',"
                    + "'" + Telefon + "',"
                    + "'" + Sifre+ "'"
                    + ")");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/

}
