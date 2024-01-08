package com.example.javaproject.tripServlet;

import com.example.javaproject.DAO.TripDAOImpl;
import com.example.javaproject.DB.DBconnect;
import com.example.javaproject.entity.Nakliye;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet("/GetTrip")
public class GetTripServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            TripDAOImpl dao=new TripDAOImpl(DBconnect.getConn());
            HttpSession session=req.getSession();
            String Id=req.getParameter("id");
            String SoforId=req.getParameter("id");
            String KalkisSehri=req.getParameter("selectedDepartureCity");
            String KalkisIlce=req.getParameter("selectedDepartureDistrict");
            String VarisSehri=req.getParameter("selectedDestinationCity");
            String VarisIlce=req.getParameter("selectedDestinationDistrict");
            String YukTuru=req.getParameter("yukTuru");
            String KalkisTarihi=req.getParameter("kalkisTarihi");
            String Kapasite=req.getParameter("kapasite");

            /*Nakliye us=dao.SearchGetTrip(KalkisSehri,KalkisIlce,VarisSehri,VarisIlce,YukTuru);*/
            Nakliye us=dao.SearchGetTrip();
            if(us!=null)
            {
                session.setAttribute("tripobj",us);

                resp.sendRedirect("SearchTrip.jsp");
            }
            else
            {
                /*session.setAttribute("failedMsg","Yanlış E mail adresi veya Şifre");*/
                resp.sendRedirect("index.jsp");
            }



        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
