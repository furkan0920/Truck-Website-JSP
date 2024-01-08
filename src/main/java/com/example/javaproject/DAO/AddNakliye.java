package com.example.javaproject.DAO;

import com.example.javaproject.DB.DBconnect;

import java.sql.ResultSet;
import java.sql.Statement;

public class AddNakliye extends DBconnect {

   /* public  void NakliyeEkle(int soforId,String kalkisSehri, String kalkisIlce, String varisSehri, String varisIlce, String yukTuru, String kalkisTarihi, int kapasite){
        if (conn==null){
            System.out.println("veritabani bagli degil baglaniyorum");
            getConn();
        }
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs= stmt.executeQuery("insert into NakliyeZamanlari(SoforId,KalkisSehri,KalkisIlce,VarisSehri,VarisIlce,YukTuru,KalkisTarihi,Kapasite) values("
                    + "'" + soforId+ "',"
                    + "'" + kalkisSehri+ "',"
                    + "'" + kalkisIlce + "',"
                    + "'" +varisSehri + "',"
                    + "'" + varisIlce + "',"
                    + "'" + yukTuru + "',"
                    + "'" + kalkisTarihi + "',"
                    + "'" + kapasite+ "'"
                    + ")");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
