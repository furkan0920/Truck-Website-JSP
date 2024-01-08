package com.example.javaproject.user.servlet;

import com.example.javaproject.DAO.UserDAOImpl;
import com.example.javaproject.DB.DBconnect;
import com.example.javaproject.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException{

        try {

            String name=req.getParameter("ad");
            String surname=req.getParameter("soyad");
            String email=req.getParameter("email");
            String phno=req.getParameter("telefon");
            String password=req.getParameter("sifre");

            User us = new User();
            us.setAd(name);
            us.setSoyad(surname);
            us.setEmail(email);
            us.setTelefon(phno);
            us.setSifre(password);

            HttpSession session= req.getSession();

                UserDAOImpl dao = new UserDAOImpl(DBconnect.getConn());
                boolean f = dao.userRegister(us);

                if (f = true) {
                    //System.out.println("User register success...");

                    //session.setAttribute("succMsg","Başarıyla Kayıt Olundu");
                    resp.sendRedirect("index.jsp");
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



}
