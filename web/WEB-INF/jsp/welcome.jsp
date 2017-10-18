<%-- 
    Document   : welcome
    Created on : Oct 17, 2017, 9:17:59 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
        <title>welcome page</title>
    </head>
    <body>
        <h1 align="center">Selamat Datang Di Toko Kami </h1> 
        <h1 align="center">Anda Puas, Harga Puas </h1> 
        <p align="right">${user.username}</p></br>
        <p align="right"><a href="isiKeranjang"isiKeranjang">List Barang</a> ${keranjang.size()}</p></br>
        <p><a href="Product/all">Lihat Semua Product</a></p>
              
        </table>
    </body>
</html>