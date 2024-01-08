<%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 28.12.2023
  Time: 07:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Haber Ekle</title>
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
</head>
<body>


<div class="login-container">
    <h2>Haber Ekle</h2>
    <form action="news" method="post" >
        <div class="form-group">
            <label for="HaberBasligi">Haber Basliği</label>
            <input type="text" id="HaberBasligi" name="HaberBasligi" >
        </div>
        <div class="form-group">
            <label for="HaberAyrintilar">Haber Ayrintilari</label>
            <input type="text" id="HaberAyrintilar" name="HaberAyrintilari" >
        </div>
        <div class="form-group">
        <label for="HaberGorsel">Haber Görsel</label>
        <input type="text" id="HaberGorsel" name="HaberGorsel" >
        </div>
        <div class="form-group">
            <label class="form-label" for="HaberTarihi">Haber Tarihi:</label>
            <input type="date" id="HaberTarihi" name="HaberTarihi" required><br>
        </div>
        <div class="form-group">
            <button type="submit">Haber Ekle</button>
        </div>
    </form>

    <a href="EditNews.jsp">Haber Silme</a>
    <a href="UserAllTrip.jsp">Sefer Silme</a>
</div>


</body>
</html>
