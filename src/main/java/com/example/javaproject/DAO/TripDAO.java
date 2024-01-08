package com.example.javaproject.DAO;

import com.example.javaproject.entity.Nakliye;

import java.util.List;

public interface TripDAO {
    public boolean addTrip(Nakliye b);
    public List<Nakliye> GetTripInformation(int id);
    public List<Nakliye> GetAllTripInformation();
    public boolean deleteTrip(int id);
    public  Nakliye getTripById(int id);

   /* public  Nakliye SearchGetTrip(String KalkisSehri,String KalkisIlce,String VarisSehri,String VarisIlce,String Yukturu);*/
    public  Nakliye SearchGetTrip();

}
