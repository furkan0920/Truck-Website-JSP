<%@ page import="com.example.javaproject.DAO.TripDAOImpl" %>
<%@ page import="com.example.javaproject.DB.DBconnect" %>
<%@ page import="com.example.javaproject.entity.Nakliye" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 1.01.2024
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
                <h2>Tum Sonuclar</h2>
            </div>
        </div>
        <div class="row">
            <%
                TripDAOImpl dao=new TripDAOImpl(DBconnect.getConn());
                List<Nakliye> list  =dao.GetAllTripInformation();
                for(Nakliye b:list)

                {%>

            <div class="col-lg-4 col-md-4 col-sm-6">
                <a href="Pictures/img_1.jpg" class="fh5co-card-item image-popup">
                    <figure>
                        <div class="overlay"><i class="ti-plus"></i></div>
                        <img src="Pictures/Tircim.png" alt="Image" class="img-responsive">
                    </figure>
                    <div class="fh5co-text">
                        <p><%=b.getSelectedDepartureCity()%>,<%=b.getSelectedDepartureDistrict()%></p>
                        <p><%=b.getSelectedDestinationCity()%>,<%=b.getSelectedDestinationDistrict()%></p>
                        <p><%=b.getKalkisTarihi()%></p>
                        <p>Yuk Turu:<%=b.getYukTuru()%></p>
                        <p>Kapasite:<%=b.getKapasite()%></p>
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
