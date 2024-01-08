package com.example.javaproject;



import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "tirServlet", value = "/tir-servlet")
public class TirServlet extends HttpServlet {
    private String message;
    private int fiyat;
    private String il;
    private String ilce;
    private String aracPlaka;



    public void init() {
        il="izmir";
        ilce="Buca";
        message = "10 ton alabilirim";
        aracPlaka="20 AJC 329";
        fiyat=5000;

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f0f0f0; }");
        out.println(".products-container { margin: 20px auto; max-width: 1000px; background-color: white; border-radius: 10px; box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1); display: flex; flex-wrap: wrap; justify-content: space-around; }");
        out.println(".product { width: calc(20% - 20px); background-color: #f9f9f9; border: 1px solid #eee; border-radius: 5px; padding: 15px; margin: 10px; }");
        out.println(".product img { max-width: 100%; height: auto; }");
        out.println("</style>");
        out.println("</head><body>");

        // Ürünlerin listelendiği kısım
        out.println("<div class='products-container'>");
        for (int i=1; i<15; i++) {
            out.println("<div class='product'>");
            out.println("<img src='src/main/webapp/Pictures/Home.png' alt='fotograf'>");
            out.println("<p>"+"IL:"+il+"</p>");
            out.println("<p>"+"ILCE:"+ilce+"</p>");
            out.println("<p class='price'>"+"Fiyat:"+fiyat+"</p>");
            out.println("<p>"+"Açiklama:"+message +"</p>");
            out.println("<p>"+"Araç Plaka:"+aracPlaka +"</p>");
            out.println("</div>");
        }
        out.println("</div>"); // .products-container div kapanışı
        out.println("</body></html>");

    }

}

