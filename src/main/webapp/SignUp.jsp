<%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 7.12.2023
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 21.10.2023
  Time: 08:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        /* Temel CSS stilleri */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

        .signup-container {
            max-width: 500px;
            margin: 0 auto;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
            padding: 20px;
            text-align: center;
        }

        .signup-container h2 {
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 20px;
            text-align: left;
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

<div class="signup-container">
    <h2>Üye Ol</h2>
    <form action="register" method="post">
        <div class="form-group">
            <label for="ad"class="form-label">Adınız:</label>
            <input class="form-control" type="text" id="ad" name="ad"  required>
        </div>
        <div class="form-group">
            <label for="soyad" class="form-label">Soyadınız:</label>
            <input class="form-control"type="text" id="soyad" name="soyad" required>
        </div>
        <div class="form-group">
            <label for="email" class="form-label">E-posta Adresiniz:</label>
            <input class="form-control"type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="telefon" class="form-label">Telefon:</label>
            <input class="form-control"type="text" id="telefon" name="telefon" required>
        </div>
        <div class="form-group">
            <label for="sifre"class="form-label">Şifre:</label>
            <input class="form-control" type="password" id="sifre" name="sifre" required>
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-primary" >Üye Ol</button>

        </div>

    </form>
</div>

</body>
</html>
