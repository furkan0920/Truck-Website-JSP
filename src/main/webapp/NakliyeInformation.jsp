<%@ page import="com.example.javaproject.DAO.TripDAOImpl" %>
<%@ page import="com.example.javaproject.entity.Nakliye" %><%--
  Created by IntelliJ IDEA.
  User: ayakdas
  Date: 7.12.2023
  Time: 22:06
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
    <script src="js/konum.js"></script>

</head>
<body>
<header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image: url(Pictures/Home.png)">
    <div class="overlay"></div>
    <div class="gtco-container">
        <div class="row">
            <div class="col-md-12 col-md-offset-0 text-left">
                <div class="row row-mt-15em">
                    <div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
                        <h1>Nakliye icin arac mi ariyorsunuz?</h1>
                    </div>
                    <div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
                        <div class="form-wrap">
                            <div class="tab">
                                <div class="tab-content">
                                    <div class="tab-content-inner active" data-content="signup">
                                        <h3>Nakliye Bilgileri</h3>
                                        <form action="GetTrip" method="post">
                                            <div class="row form-group">
                                                <div class="col-md-12">
                                                    <label for="activities">Yuk Cesitleri</label>
                                                    <select name="#" id="activities" class="form-control">
                                                        <option value="">Seciniz</option>
                                                        <option value="Hassas ve Kirilabilir Yukler">Hassas ve Kirilabilir Yukler</option>
                                                        <option value="Sicaklik Kontrollu Yukler">Sicaklik Kontrollu Yukler</option>
                                                        <option value="Dokme Yukler">Dokme Yukler</option>
                                                        <option value="Agir Yukler">Agir Yukler</option>
                                                        <option value="Standart Yukler">Standart Yukler</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col-md-12">
                                                    <label for="departureCity" >Kalkış Şehri:</label>
                                                    <select id="departureCity" class="form-control">
                                                        <option value="" class="form-control" disabled selected>İl Seçin</option>
                                                    </select>
                                                    <label for="departureDistrict">Kalkış İlçe:</label>
                                                    <select id="departureDistrict" class="form-control" disabled>
                                                        <option value="" class="form-control"  disabled selected>İlçe Seçin</option>
                                                    </select>
                                                    <script src="js/konum.js"></script>
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col-md-12">
                                                    <label for="destinationCity" >Varış Şehri:</label>
                                                    <select id="destinationCity" class="form-control">
                                                        <option value="" class="form-control" disabled selected>İl Seçin</option>
                                                    </select>
                                                    <label for="destinationDistrict">Varış İlçe:</label>
                                                    <select id="destinationDistrict" class="form-control" disabled>
                                                        <option value="" class="form-control"  disabled selected>İlçe Seçin</option>
                                                    </select>
                                                   <%-- <input type="hidden" id="selectedDestinationCity" name="selectedDestinationCity">
                                                    <input type="hidden" id="selectedDestinationDistrict" name="selectedDestinationDistrict">--%>
                                                    <script src="js/konum.js"></script>
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col-md-12">
                                                    <label for="NakliyeZamani">Nakliye Zamani</label>
                                                    <input type="text" id="NakliyeZamani" class="form-control">
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col-md-12">
                                                    <input type="submit" class="btn btn-primary btn-block" value="Ara">
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
</body>
</html>
