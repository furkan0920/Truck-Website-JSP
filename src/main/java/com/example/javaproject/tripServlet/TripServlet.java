package com.example.javaproject.tripServlet;

import com.example.javaproject.DAO.TripDAOImpl;
import com.example.javaproject.DAO.UserDAOImpl;
import com.example.javaproject.DB.DBconnect;
import com.example.javaproject.entity.Nakliye;
import com.example.javaproject.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;


@WebServlet("/trip")
public class TripServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String Id=req.getParameter("id");
            String SoforId=req.getParameter("id");
            String KalkisSehri=req.getParameter("selectedDepartureCity");
            String KalkisIlce=req.getParameter("selectedDepartureDistrict");
            String VarisSehri=req.getParameter("selectedDestinationCity");
            String VarisIlce=req.getParameter("selectedDestinationDistrict");
            String YukTuru=req.getParameter("yukTuru");
            String KalkisTarihi=req.getParameter("kalkisTarihi");
            String Kapasite=req.getParameter("kapasite");


            Nakliye us=new Nakliye();
            us.setId(Integer.parseInt(Id));
            us.setSoforId(Integer.parseInt(SoforId));
            us.setSelectedDepartureCity(KalkisSehri);
            us.setSelectedDepartureDistrict(KalkisIlce);
            us.setSelectedDestinationCity(VarisSehri);
            us.setSelectedDestinationDistrict(VarisIlce);
            us.setYukTuru(YukTuru);
            us.setKalkisTarihi(KalkisTarihi);
            us.setKapasite(Integer.parseInt(Kapasite));


            HttpSession session= req.getSession();

            TripDAOImpl dao = new TripDAOImpl(DBconnect.getConn());
            boolean f = dao.addTrip(us);
            session.setAttribute("tripobj",us);



            if (f = true) {
                //System.out.println("User register success...");

                //session.setAttribute("succMsg","Başarıyla Kayıt Olundu");
                resp.sendRedirect("AddTrip.jsp");
            } else {
                //System.out.println("Something went wrong on server...");
                //session.setAttribute("failedMsg","Bir şeyler ters gitti");
                resp.sendRedirect("SignUp.jsp");
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public  static void main (String args[])
    {
        /*Nakliye nk=new Nakliye();
        System.out.println("Sofor ID:"+nk.getSoforId());*/
       /* TripDAOImpl dao=new TripDAOImpl(DBconnect.getConn());
        List<Nakliye> list  =dao.GetTripInformation(42);
        for(Nakliye nakliye:list){
            System.out.println(nakliye.getKapasite());
        }*/
    }
}
