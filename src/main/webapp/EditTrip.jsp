<%@ page import="com.example.javaproject.DAO.TripDAOImpl" %>
<%@ page import="com.example.javaproject.DB.DBconnect" %>
<%@ page import="com.example.javaproject.entity.Nakliye" %><%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 29.12.2023
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int id=Integer.parseInt( request.getParameter("id"));
    TripDAOImpl dao=new TripDAOImpl(DBconnect.getConn());
    Nakliye b =dao.getTripById(id);

%>
<form action="edittrip" method="post">

    <input type="hidden" name="id" value="<%=b.getId()%>">
    <div class="form-group">
        <label for="kapasite">Kitap Adı(*):</label>
        <input name="kapasite" type="text" class="form-control"
               id="kapasite"  value="<%=b.getKapasite()%>">
    </div>
    <div class="form-group">
        <label for="yukTuru">Yazar Adı(*):</label>
        <input name="yukTuru" type="text" class="form-control"
               id="yukTuru"
               value="<%=b.getYukTuru()%>">
    </div>
  <%--  <div class="form-group">
        <label for="exampleInputPassword1">Fiyat(*):</label>
        <input name="price" type="number" class="form-control"
               id="exampleInputPassword1" value="<%=b.getPrice()%>">
    </div>
    <div class="form-group">
        <label for="inputState">Durum:</label>
        <select name="status"  class="form-control"
                id="inputState" >
            <%if("Active".equals(b.getStatus())){%>
            <option value="Active">Aktif</option>
            <option value="Inactive">İnaktif</option>
            <%}else{%>
            <option value="Inactive">İnaktif</option>
            <option value="Active">Aktif</option>
            <%}%>
        </select>
    </div>--%>
    <button type="submit" class="btn btn-primary" style="margin-top: 10px">Güncelle</button>
</form>
</body>
</html>
