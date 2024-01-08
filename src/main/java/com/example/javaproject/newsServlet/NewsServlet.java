package com.example.javaproject.newsServlet;

import com.example.javaproject.DAO.EpostaDAOImpl;
import com.example.javaproject.DAO.NewsDAOImpl;
import com.example.javaproject.DB.DBconnect;
import com.example.javaproject.entity.Eposta;
import com.example.javaproject.entity.Nakliye;
import com.example.javaproject.entity.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            String HbrBasligi=req.getParameter("HaberBasligi");
            String HbrAyrintilari=req.getParameter("HaberAyrintilari");
            String HbrGorsel=req.getParameter("HaberGorsel");
            String HbrTarihi=req.getParameter("HaberTarihi");

            News news=new News();
            news.setHaberBasligi(HbrBasligi);
            news.setHaberAyrintilari(HbrAyrintilari);
            news.setHaberGorsel(HbrGorsel);
            news.setHaberTarihi(HbrTarihi);


            HttpSession session= req.getSession();

            NewsDAOImpl dao = new NewsDAOImpl(DBconnect.getConn());
            boolean f = dao.AddNews(news);
            if (f = true) {
                //System.out.println("User register success...");

                //session.setAttribute("succMsg","Başarıyla Kayıt Olundu");
                 resp.sendRedirect("AddNews.jsp");
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
