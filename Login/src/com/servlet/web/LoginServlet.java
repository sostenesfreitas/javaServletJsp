package com.servlet.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classeDAO.web.JogoDAO;
import com.classeNegocio.web.LoginNegocio;
import com.classebasica.web.Cliente;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginNegocio ln = new LoginNegocio();
	JogoDAO jd = new JogoDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		//puxando metodo da validação
		boolean valida = ln.validacao(nome,senha);
		Cliente cliente = jd.consultarPorNome(nome); 
		if(valida == true){
			//setando a session do usuario
			request.getSession().setAttribute("cliente", cliente);	
			//redirecinando para o index
		    response.sendRedirect("Index.jsp");
		}
		else{
			response.sendRedirect("erro.jsp");
		}
	}

}
