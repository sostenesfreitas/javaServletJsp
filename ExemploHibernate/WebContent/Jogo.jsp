<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
 <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
  <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/s.css" />
  <script src="./resources/bootstrap/js/bootstrap.min.js"></script>
<link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id=b>
     <table class ="table">
          <thead>
               <tr>
                    <td>ID</td>
                    <td>Nome</td>
                    <td>Tipo</td>
                    <td>Plataforma</td>
               </tr>
          </thead>
          <!-- listando os elementos -->
          <c:forEach items="${jogo}" var="jogo">
               <tr>
                    <td>${jogo.id}</td>
                    <td>${jogo.nome}</td>
                    <td>${jogo.tipo}</td>
                    <td>${jogo.plataforma}</td>
               </tr>
          </c:forEach>
     </table>
     </div>
</body>
</html>