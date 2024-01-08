package com.example.javaproject.user.servlet;

import com.example.javaproject.DAO.TripDAOImpl;
import com.example.javaproject.DB.DBconnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteTripServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            int id=Integer.parseInt(req.getParameter("id"));

            TripDAOImpl dao=new TripDAOImpl(DBconnect.getConn());
            boolean f=dao.deleteTrip(id);

            HttpSession session=req.getSession();
            if(f)
            {
                /* session.setAttribute("succMsg","Kitap Başarıyla Silindi");*/
                resp.sendRedirect("UserAllTrip.jsp");
            }
            else
            {
                /*session.setAttribute("failedMsg","Bir şeyler ters gitti");*/
                resp.sendRedirect("index.jsp");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
