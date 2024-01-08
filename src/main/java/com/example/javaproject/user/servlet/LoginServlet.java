package com.example.javaproject.user.servlet;

import com.example.javaproject.DAO.UserDAOImpl;
import com.example.javaproject.DB.DBconnect;
import com.example.javaproject.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try
        {
            UserDAOImpl dao=new UserDAOImpl(DBconnect.getConn());

            HttpSession session=req.getSession();

            String email=req.getParameter("email");
            String password=req.getParameter("sifre");
            if("admin@gmail.com".equals(email) && "admin".equals(password))
            {
                User us=new User();
                us.setAd("Admin");
                session.setAttribute("userobj",us);
                resp.sendRedirect("AddNews.jsp");
            }
            else
            {
                User us=dao.login(email,password);
                if(us!=null)
                {
                    session.setAttribute("userobj",us);

                    resp.sendRedirect("AddTrip.jsp");
                }
                else
                {
                    /*session.setAttribute("failedMsg","Yanlış E mail adresi veya Şifre");*/
                    resp.sendRedirect("SignIn.jsp");
                }

                resp.sendRedirect("home.jsp");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
