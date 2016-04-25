<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    
    <title>Cadastro</title>
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
</head>
<body>
    <div>
     <form method="post" action="Gerar">
        <div class="cadastro">
            <label for="">Nome : <input name = "nome"  type="text"></label><br/>
            <label for="">Login: <input name = "login" type="text"></label><br/>
            <label for="">Senha: <input name = "senha" type="password"></label><br/>
            <button type="submit" name="cadastrar">Confirma</button>
            <a href="Login.html">
            <button type="submit" name="cancelar">Cancelar</button>
            </a>
        </div>
      </form>  
    </div>
</body>
</html>