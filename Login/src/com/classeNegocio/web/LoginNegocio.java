package com.classeNegocio.web;

import com.classeDAO.web.JogoDAO;
import com.classebasica.web.Cliente;

public class LoginNegocio {
	
	//validando o login nao é a melhor forma mas pra fins academicos ta bom
	public boolean validacao(String nome,String senha){
	  JogoDAO j = new JogoDAO();
	  Cliente cliente = new Cliente();
	  cliente = j.consultarPorNome(nome);
	    if (cliente != null && cliente.getLogin().equals(nome) && cliente.getSenha().equals(senha)){
	    	return true;
	    }
	    else {return false;}
	}
	
}
