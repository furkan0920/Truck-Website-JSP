<%@ page import="com.example.javaproject.DAO.TripDAO" %>
<%@ page import="com.example.javaproject.DAO.TripDAOImpl" %>
<%@ page import="com.example.javaproject.DB.DBconnect" %>
<%@ page import="com.example.javaproject.entity.Nakliye" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 22.12.2023
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f0f0f0; }
        .products-container { margin: 20px auto; max-width: 1000px; background-color: white; border-radius: 10px; box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1); display: flex; flex-wrap: wrap; justify-content: space-around; }
        .product { width: calc(20% - 20px); background-color: #f9f9f9; border: 1px solid #eee; border-radius: 5px; padding: 15px; margin: 10px; }
        .product img { max-width: 100%; height: auto; }
    </style>
</head>
<body>
<c:if test="${empty userobj }">
    <c:redirect url="/AddTrip.jsp"/>
</c:if>
<%--<input type="text"   value="${userobj.id}">--%>
<%
%>
    <%
        int id= Integer.parseInt(request.getParameter("id"));
        TripDAOImpl dao=new TripDAOImpl(DBconnect.getConn());
        List<Nakliye> list  = dao.GetTripInformation(id);
        for(Nakliye n:list)
        {%>
    <div class="products-container">
        <div class="product">
            <img src="Pictures/Tircim.png" alt="Image" class="img-responsive">
            <p>Kapasite:<%=n.getKalkisTarihi()%></p>
            <p>Kalkis il:<%=n.getSelectedDepartureCity()%></p>
            <p>Kalkis ilce:<%=n.getSelectedDepartureDistrict()%></p>
            <p>Varis il:<%=n.getSelectedDestinationCity()%></p>
            <p>Varis ilce:<%=n.getSelectedDestinationDistrict()%></p>
            <p>Yuk Turu:<%=n.getYukTuru()%></p>
            <p>Kapasite:<%=n.getKapasite()%></p>
   <%--  <a href="edit_books.jsp?id=<%=n.getId()%>" class="btn btn-sm btn-primary">
                <i class="fas fa-edit"></i> Düzenle</a>--%>
        </div>
    </div>
    <%
        }
    %>
</body>
</html>
