<%@ page import="com.example.javaproject.DAO.NewsDAOImpl" %>
<%@ page import="com.example.javaproject.newsServlet.GetNewsServlet" %>
<%@ page import="com.example.javaproject.entity.News" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 7.12.2023
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content="" />
    <meta name="twitter:image" content="" />
    <meta name="twitter:url" content="" />
    <meta name="twitter:card" content="" />
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/themify-icons.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/modernizr-2.6.2.min.js"></script>
    <script src="js/respond.min.js"></script>

</head>
<body>
<div class="gtco-section">
    <div class="gtco-container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2 text-center gtco-heading">
                <h2>Haberler</h2>
                <p>Son Dakika</p>
            </div>
        </div>
        <div class="row">
        <%
            NewsDAOImpl dao=new NewsDAOImpl(DBconnect.getConn());
            List<News> list  =dao.GetInformationNews();
            for(News b:list)

            {%>

            <div class="col-lg-4 col-md-4 col-sm-6">
                <a href="Pictures/img_1.jpg" class="fh5co-card-item image-popup">
                    <figure>
                        <div class="overlay"><i class="ti-plus"></i></div>
                        <img src="Pictures/Tircim.png" alt="Image" class="img-responsive">
                    </figure>
                    <div class="fh5co-text">
                        <h2><%=b.getHaberBasligi()%></h2>
                        <p><%=b.getHaberAyrintilari()%></p>
                        <p><span class="btn btn-primary">Ayrintilar icin</span></p>
                    </div>
                </a>
            </div>
            <%
                }
            %>
        </div>
    </div>
</div>
</body>
</html>
