<%--<%@ page import="com.example.javaproject.DAO.AddNakliye" %>--%>
<%@ page import="com.example.javaproject.entity.Nakliye" %><%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 16.12.2023
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
        }

        .login-container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: white;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        .login-container h2 {
            margin-bottom: 20px;
        }

        .form-group {
            text-align: left;
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            font-weight: bold;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .form-group button {
            background-color: #333;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
    <script src="js/konum.js"></script>
</head>
<body>
<c:if test="${empty userobj }">
    <c:redirect url="/SignIn.jsp"/>
</c:if>
<h2>id numarasi${userobj.id}</h2>
<div class="login-container">
    <h2>Yeni Sefer Ekle</h2>
    <form action="trip" method="post">
        <input type="hidden" value="${userobj.id}" name="id">
        <label for="departureCity">Kalkış Şehri:</label>
        <select id="departureCity" name="selectedDepartureCity">
            <option value="" disabled selected>İl Seçin</option>
        </select>
        <br>
        <label for="departureDistrict">Kalkış İlçe:</label>
        <select id="departureDistrict" name="selectedDepartureDistrict" disabled>
            <option value="" disabled selected>İlçe Seçin</option>
        </select>
        <br>
        <label for="destinationCity">Varış Şehri:</label>
        <select id="destinationCity" name="selectedDestinationCity">
            <option value="" disabled selected>İl Seçin</option>
        </select>
        <br>
        <label for="destinationDistrict">Varış İlçe:</label>
        <select id="destinationDistrict" name="selectedDestinationDistrict" disabled>
            <option value="" disabled selected>İlçe Seçin</option>
        </select>
        <br>
        <script src="js/konum.js"></script>
        <br>
        <label for="yukTuru">Yük Türü</label>
        <select  id="yukTuru" name="yukTuru" class="form-control" >
            <option>seciniz</option>
            <option value="Hassas ve Kirilabilir Yukler">Hassas ve Kirilabilir Yukler</option>
            <option value="Sicaklik Kontrollu Yukler">Sicaklik Kontrollu Yukler</option>
            <option value="Dokme Yukler">Dokme Yukler</option>
            <option value="Agir Yukler">Agir Yukler</option>
            <option value="Standart Yukler">Standart Yukler</option>
        </select>
        <div class="form-group">
            <label class="form-label" for="kalkisTarihi">Kalkış Tarihi:</label>
            <input type="date" id="kalkisTarihi" name="kalkisTarihi" required><br>
        </div>
        <div class="form-group">
            <label for="kapasite">Kapasite:</label>
            <input type="number" id="kapasite" name="kapasite" required><br>
        </div>
        <button type="submit" class="btn btn-primary">Seferi Ekle</button>

    </form>
    <form action="UserTripInformation.jsp">
        <input type="hidden" value="${userobj.id}" name="id">
        <button class="btn btn-primary" type="submit">Seferlerim</button>
    </form>

</div>
</body>
</html>
