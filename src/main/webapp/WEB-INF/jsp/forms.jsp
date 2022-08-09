<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Animals</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>


</head>
<body>
<a href="/add" class="btn btn-primary">Add</a>

<table>
    <thead>
    <tr>
        <th>Ad Soyad</th>
        <th>Mersis No</th>
        <th>Adres</th>
        <th>Telefon</th>
        <th>E-Posta</th>
        <th>Doğum Tarihi</th>
        <th>Perakende Ticareti</th>
        <th>Tercih Sebebi</th>
        <th>İl İlçe Tercihi</th>
        <th>Yatırım Miktarı</th>
        <th>Eklemek İstenilenler</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${items}" var="form">
        <tr>
            <td>${form.ad_soyad}</td>
            <td>${form.mersis_no}</td>
            <td>${form.adres}</td>
            <td>${form.telefon}</td>
            <td>${form.e_posta}</td>
            <td>${form.dogum_tarihi}</td>
            <td>${form.perakende_ticareti}</td>
            <td>${form.tercih_sebebi}</td>
            <td>${form.il_ilce_tercih}</td>
            <td>${form.yatirim_miktari}</td>
            <td>${form.eklemek_istenilenler}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
