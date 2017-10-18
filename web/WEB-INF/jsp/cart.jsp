<%-- 
    Document   : keranjang
    Created on : Oct 17, 2017, 3:45:58 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
        <title>List Belanjaan Anda</title>
    </head>
    <body class="container">
        <h1 align="center">Isi Keranjang Anda</h1>
        <table class="table table-hover">
                <tr>
                    <th>Nama</th><th>Harga</th><th></th>
                </tr>
            <c:forEach items="${keranjang}" var="c">
                <tr>
                    <td>${c.name}</td>
                    <td>${c.harga}</td>
                    <td><a href="hapus/${c.id}"><button class="btn"> Hapus </button></a></td>
                </tr>
                </c:forEach>
        </table>
        <a href="/E-Commerce/Product/all"><button class="btn btn-info ">Back To Product</button></a>
    </body>
</html>
