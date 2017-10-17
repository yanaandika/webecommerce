<%-- 
    Document   : Product
    Created on : 17-Oct-2017, 14:46:36
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
        <title>Product Kami</title>
    </head>
    <body class="container">
        <h1 align="center">Product Kami</h1>
        <table class="table table-hover">
            <thead class="thead-inverse">
            <h1>${user.username}</h1>
            <p align="right">Barang : ${user.products.size()}</p>
            <tr>
                <th>Nama</th> <th>Harga</th>
            </tr>
            </thead>
            <c:forEach var="p" items="${prod}">
                <tr>    
                    <td><a href="${p.id}">${p.name}</a></td>
                    <td>${p.harga}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
