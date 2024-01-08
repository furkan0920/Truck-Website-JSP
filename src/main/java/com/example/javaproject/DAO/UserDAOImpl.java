package com.example.javaproject.DAO;

import com.example.javaproject.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {
        private Connection conn;

        public UserDAOImpl(Connection conn) {
            this.conn=conn;
        }

    /*public void UserDA0lmpl(Connection conn) {
        this.conn = conn;
    }*/


    public boolean userRegister(User us) {
            boolean f=false;
            try {

                String sql="insert into kullanicilar(isim,soyisim,email,telefon,sifre) values(?,?,?,?,?)";

                PreparedStatement ps=conn.prepareStatement(sql);

                ps.setString(1,us.getAd());
                ps.setString(2,us.getSoyad());
                ps.setString(3,us.getEmail());
                ps.setString(4,us.getTelefon());
                ps.setString(5,us.getSifre());


                int i=ps.executeUpdate();

                if(i==1)
                {
                    f=true;
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            return f;
        }

    @Override
    public User login(String email, String password) {
        User us=null;

        try
        {

            String sql="select *from kullanicilar where email=? and sifre=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2,password);

            ResultSet rs=ps.executeQuery();

            while (rs.next())
            {
                us=new User();
                us.setId(rs.getInt(1));
                us.setAd(rs.getString(2));
                us.setSoyad(rs.getString(3));
                us.setEmail(rs.getString(4));
                us.setTelefon(rs.getString(5));
                us.setSifre(rs.getString(6));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return us;
    }


}


