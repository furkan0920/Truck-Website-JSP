package com.example.javaproject.DAO;

import com.example.javaproject.entity.Nakliye;
import com.example.javaproject.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class TripDAOImpl implements  TripDAO{
    private Connection conn;

    public TripDAOImpl(Connection conn) {
        this.conn = conn;
    }
    @Override
    public boolean addTrip(Nakliye b) {
        boolean f=false;
        try
        {
            String sql="insert into NakliyeZamanlari(SoforId,KalkisSehri,KalkisIlce,VarisSehri,VarisIlce,YukTuru,KalkisTarihi,Kapasite)values(?,?,?,?,?,?,?,?) ";
            PreparedStatement ps=conn.prepareStatement(sql);
            /*ps.setInt(1,b.getId());*/
            ps.setInt(1,b.getSoforId());
            ps.setString(2,b.getSelectedDepartureCity());
            ps.setString(3,b.getSelectedDepartureDistrict());
            ps.setString(4,b.getSelectedDestinationCity());
            ps.setString(5,b.getSelectedDestinationDistrict());
            ps.setString(6,b.getYukTuru());
            ps.setString(7,b.getKalkisTarihi());
            ps.setInt(8,b.getKapasite());

            int i=ps.executeUpdate();

            if(i==1)
            {
                f=true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
    @Override
    public List<Nakliye> GetTripInformation(int id) {
        List<Nakliye> list=new ArrayList<Nakliye>();
        Nakliye us=null;
        try
        {

            String sql="select *from NakliyeZamanlari where SoforId=? ";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs=ps.executeQuery();

            while (rs.next())
            {
                us=new Nakliye();
                us.setId(rs.getInt(1));
                us.setSoforId(rs.getInt(2));
                us.setSelectedDepartureCity(rs.getString(3));
                us.setSelectedDepartureDistrict(rs.getString(4));
                us.setSelectedDestinationCity(rs.getString(5));
                us.setSelectedDestinationDistrict(rs.getString(6));
                us.setYukTuru(rs.getString(7));
                us.setKalkisTarihi(rs.getString(8));
                us.setKapasite(rs.getInt(9));
                list.add(us);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;
    }
    @Override
    public List<Nakliye> GetAllTripInformation() {
        List<Nakliye> list=new ArrayList<Nakliye>();
        Nakliye us=null;
        try
        {

            /*String sql="select *from NakliyeZamanlari where SoforId=? ";*/
            String sql="select * from NakliyeZamanlari";
            PreparedStatement ps=conn.prepareStatement(sql);
            /*ps.setInt(1,id);*/

            ResultSet rs=ps.executeQuery();

            while (rs.next())
            {
              us=new Nakliye();
              us.setId(rs.getInt(1));
              us.setSoforId(rs.getInt(2));
              us.setSelectedDepartureCity(rs.getString(3));
              us.setSelectedDepartureDistrict(rs.getString(4));
              us.setSelectedDestinationCity(rs.getString(5));
              us.setSelectedDestinationDistrict(rs.getString(6));
              us.setYukTuru(rs.getString(7));
              us.setKalkisTarihi(rs.getString(8));
              us.setKapasite(rs.getInt(9));
              list.add(us);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public boolean deleteTrip(int id) {
        boolean f=false;
        try {
                String query="delete from NakliyeZamanlari where id=?";
                PreparedStatement ps=conn.prepareStatement(query);
                ps.setInt(1,id);
                int i=ps.executeUpdate();
                if (i==1){
                    f=true;
                }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return f;
    }

    @Override
    public Nakliye getTripById(int id) {
        Nakliye b=null;

        try
        {
            String sql="Select * from NakliyeZamanlari where Id=?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs=ps.executeQuery();

            while (rs.next())
            {
                b=new Nakliye();
                b.setId(rs.getInt(1));
                b.setSoforId(rs.getInt(2));
                b.setSelectedDepartureCity(rs.getString(3));
                b.setSelectedDepartureDistrict(rs.getString(4));
                b.setSelectedDestinationCity(rs.getString(5));
                b.setSelectedDestinationDistrict(rs.getString(6));
                b.setYukTuru(rs.getString(7));
                b.setKalkisTarihi(rs.getString(8));
                b.setKapasite(rs.getInt(9));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    /*public Nakliye SearchGetTrip(String KalkisSehri, String KalkisIlce, String VarisSehri, String VarisIlce, String Yukturu) {*/
    public Nakliye SearchGetTrip() {
        Nakliye us=null;
        try {
            /*String query="select * from NakliyeZamanlari where KalkisSehri=? and KalkisIlce=? and VarisSehri=? and VarisIlce=? and Yukturu=?";*/
            String query="select * from NakliyeZamanlari";
            PreparedStatement ps=conn.prepareStatement(query);
/*            ps.setString(1,KalkisSehri);
            ps.setString(2,KalkisIlce);
            ps.setString(3,VarisSehri);
            ps.setString(4,VarisIlce);
            ps.setString(5,Yukturu);*/

            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                us=new Nakliye();
                us.setId(rs.getInt(1));
                us.setSoforId(rs.getInt(2));
                us.setSelectedDepartureCity(rs.getString(3));
                us.setSelectedDepartureDistrict(rs.getString(4));
                us.setSelectedDestinationCity(rs.getString(5));
                us.setSelectedDestinationDistrict(rs.getString(6));
                us.setYukTuru(rs.getString(7));
                us.setKalkisTarihi(rs.getString(8));
                us.setKapasite(rs.getInt(9));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return us;
    }
}
