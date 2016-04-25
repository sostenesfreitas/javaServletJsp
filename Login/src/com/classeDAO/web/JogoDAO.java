package com.classeDAO.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.classebasica.web.Cliente;

public class JogoDAO {
private EntityManager em;
	Cliente cliente = null;
	
	
	public JogoDAO(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("l");
		em = emf.createEntityManager();
	}
	
	public void inserir(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.persist(cliente);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public Cliente consultarPorId(Integer id) {
		return em.find(Cliente.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> consultar(){
        return em.createQuery("FROM " + Cliente.class.getName()).getResultList();

	}
	 public Cliente consultarPorNome(String nome){
		Cliente cliente = null;
		 try{
			cliente = (Cliente) em.createQuery("FROM Cliente WHERE login ='"+nome+"'").getSingleResult();
		}catch(Exception e){
			 e.printStackTrace();
		}
	   return cliente;
	    }
	
	public void remover(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.remove(cliente);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public void alterar(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.merge(cliente);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

}
