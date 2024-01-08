package com.example.javaproject.user.servlet;

import com.example.javaproject.DAO.EpostaDAOImpl;
import com.example.javaproject.DAO.UserDAOImpl;
import com.example.javaproject.DB.DBconnect;
import com.example.javaproject.entity.Eposta;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/eposta")
public class EpostaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String Epostas=req.getParameter("eposta");

            Eposta epost=new Eposta();
            epost.setEposta(Epostas);

            HttpSession session= req.getSession();

            EpostaDAOImpl dao = new EpostaDAOImpl(DBconnect.getConn());
            boolean f = dao.epostaRegister(epost);
            if (f = true) {
                //System.out.println("User register success...");

                //session.setAttribute("succMsg","Size ozel kampanyalardan haberdar olacaksınız");
                resp.sendRedirect("index.jsp");
            } else {
                //System.out.println("Something went wrong on server...");
                //session.setAttribute("failedMsg","Bir şeyler ters gitti");
                /*resp.sendRedirect("SignUp.jsp");*/
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
