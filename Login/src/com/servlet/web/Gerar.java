package com.servlet.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classeDAO.web.JogoDAO;
import com.classebasica.web.Cliente;

/**
 * Servlet implementation class Gerar
 */
@WebServlet("/Gerar")
public class Gerar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//recuperando os atributos do jsp
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		JogoDAO j = new JogoDAO();
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setLogin(login);
		c.setSenha(senha);
		j.inserir(c);
		//redirecinando para outra pagina
		response.sendRedirect("confirma.jsp");
	}

}
