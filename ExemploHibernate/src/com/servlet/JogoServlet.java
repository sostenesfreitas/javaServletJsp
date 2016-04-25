package com.servlet;

import java.io.IOException;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classeDAO.JogoDAO;
import com.classebasica.Jogo;


/**
 * Servlet implementation class JogoServlet
 */
@WebServlet("/JogoServlet")
public class JogoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public JogoServlet() {
        super();
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JogoDAO d = new JogoDAO();
		List<Jogo> lista = new ArrayList<Jogo>();
		//Recebendo a lista
		lista = d.consultar();
		//enviado a lista para o jsp
		request.setAttribute("jogo", lista);
		request.getRequestDispatcher("/Jogo.jsp").forward(request, response);
		}

}
