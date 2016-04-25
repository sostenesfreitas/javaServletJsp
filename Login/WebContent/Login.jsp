<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
    <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
</head>
<body>
    <div class="container">
     <form method="post" action="LoginServlet">
        <div class="login">
            Login:  <input name="nome" type="text"/><br>
            Senha: <input name="senha" type="password"/><br>
            <button name="login" type="submit">Logar</button>
            <a id = "loga" href="cadastro.jsp">
                 Cadastro
            </a>
            <footer>Miojo@</footer>
        </div>
     </form>   
    </div>
</body>
</html>