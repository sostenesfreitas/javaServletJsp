<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.classebasica.web.Cliente" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Test</title>
	<link type="text/css" rel="stylesheet" href="css/style.css"/>
</head>
<body>
	<!-- verificando se tem alguem usuario logado se não houver ele redireciona para a pagina de login -->
	<% Cliente cliente = (Cliente) session.getAttribute("cliente");
	   if(cliente == null){
		   response.sendRedirect("Login.jsp");
	   }
	%>
<div>	
	<div  class="nav">
		<nav>
			<ul>
                <a id="link" href="https://telegram.me/canalDoMiojo"><li>Telegram</li></a>
                <a id="link" href="https://www.facebook.com/miojodroid"><li>Facebook</li></a>
                <a id="link" href=https://github.com/sostenesfreitas/javaServletJsp.git><li>Github</li></a>
                
			</ul>
		</nav>
	</div>
	<div class="texto">
	    
		<p><strong>MIOJO</strong></p>
		<ul>
		    <li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Maiores molestias ducimus, minima eum itaque sit qui repudiandae odit tempore sapiente illum quae ad quos officia quam at eius atque nobis.</li>
		    <li>Harum, perspiciatis earum. Commodi repellendus eaque, nihil accusantium eos aperiam veritatis accusamus, saepe eius tenetur, dignissimos. Nisi nemo, voluptatem provident debitis accusamus magnam. Adipisci minima obcaecati voluptatum repellat dolor quod.</li>
		    <li>Nisi accusantium aliquam mollitia esse architecto adipisci pariatur eaque praesentium modi ad quaerat, dicta fuga magni, ipsa illo consequuntur aperiam. Omnis similique facilis hic, at praesentium quam fugit, consequatur dolores!</li>
		    <li>Reprehenderit corrupti praesentium veritatis. Ab quam labore animi alias rem, excepturi architecto quaerat odio voluptas facilis, inventore perferendis consectetur dolorum quis eos error quia, recusandae. Molestias natus suscipit, perspiciatis esse.</li>
		    
		</ul>
		
	</div>
	<footer>Miojo@</footer>
</div>
</body>
</html>
