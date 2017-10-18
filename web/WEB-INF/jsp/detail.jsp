<%-- 
    Document   : detail
    Created on : 17-Oct-2017, 15:45:33
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List Barang : ${user.products.size()}</h1>
        <table class="table table-hover">
            <tr>
                <th>Nama</th><th>Harga</th>
            </tr>
            <c:forEach var="p" items="${user.products}">
                <tr>    
                    <td>${p.name}</td>
                    <td>${p.harga}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="tambahkan"><button class="btn">Tambahkan Barang Belanjaan</button></a>   
        
    </body>
</html>
