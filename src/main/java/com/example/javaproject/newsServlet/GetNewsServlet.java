package com.example.javaproject.newsServlet;

import com.example.javaproject.DAO.NewsDAOImpl;
import com.example.javaproject.DAO.TripDAOImpl;
import com.example.javaproject.DB.DBconnect;
import com.example.javaproject.entity.Nakliye;
import com.example.javaproject.entity.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet("/GetNews")
public class GetNewsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String HbrBasligi=req.getParameter("haberBasligi");
            String HbrAyrintilari=req.getParameter("haberAyrintilari");
            String HbrGorsel=req.getParameter("haberGorsel");
            String HbrTarihi=req.getParameter("haberTarihi");

            News us=new News();
            us.setHaberBasligi(HbrBasligi);
            us.setHaberAyrintilari(HbrAyrintilari);
            us.setHaberTarihi((HbrTarihi));
            us.setHaberGorsel(HbrGorsel);

            HttpSession session= req.getSession();

            NewsDAOImpl dao = new NewsDAOImpl(DBconnect.getConn());
            List<News> blist=dao.GetInformationNews();
            if (blist.isEmpty()){
                /*session.setAttribute("failedMsg2","Sepetinizde hiç ürün yok lütfen ürün ekleyip bir daha deneyiniz!!!");*/
                resp.sendRedirect("News.jsp");
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
