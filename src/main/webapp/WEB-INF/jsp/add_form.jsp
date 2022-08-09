<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LOKUMCU BABA BAYİLİK FORMU</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>


</head>
<body>
<body>
<c:if test="${success}">
    <div class="alert alert-primary" role="alert">
        This is a primary alert—check it out!
     ${savedForm.name}</div>
</c:if>

<c:url var="path" value="/save"/>
<div class="container">
    <div class="row">
        <h1 class="text-center p-4">LOKUMCU BABA BAYİLİK FORMU</h1>
    <form:form class="form-group" action="${path}" method="post" modelAttribute="form">
        <form:label path="ad_soyad">Ad Soyad: </form:label> <form:input class="form-control" type="text" path="ad_soyad"/>
        <form:label path="mersis_no">Mersis No: </form:label> <form:input class="form-control" type="text" path="mersis_no"/>
        <form:label path="adres">Adres: </form:label> <form:input  class="form-control" type="text" path="adres"/>
        <form:label path="telefon">Telefon: </form:label> <form:input class="form-control" type="text" path="telefon"/>
        <form:label path="e_posta">E-Posta: </form:label> <form:input class="form-control" type="text" path="e_posta"/>
        <form:label path="dogum_tarihi">Doğum Tarihi: </form:label> <form:input class="form-control" type="text" path="dogum_tarihi"/>
        <form:label path="perakende_ticareti">Perakende Ticareti: </form:label> <form:input class="form-control" type="text" path="perakende_ticareti"/>
        <form:label path="tercih_sebebi">Tercih Sebebi: </form:label> <form:input class="form-control" type="text" path="tercih_sebebi"/>
        <form:label path="il_ilce_tercih">İl İlçe: </form:label> <form:input class="form-control" type="text" path="il_ilce_tercih"/>
        <form:label path="yatirim_miktari">Yatırım Miktarı: </form:label> <form:input class="form-control" type="text" path="yatirim_miktari"/>
        <form:label path="eklemek_istenilenler">Ekleyecekleriniz: </form:label> <form:input class="form-control mb-4" type="text" path="eklemek_istenilenler"/>
        <input type="submit" value="submit" class="bg-primary w-100 border-0 mb-5 p-2 border-radius-2 rounded text-white" />
    </form:form>
    </div>
</div>


</body>
</body>
</html>