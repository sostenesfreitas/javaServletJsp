package com.classeDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.classebasica.Jogo;


public class JogoDAO {
private EntityManager em;
private static final SessionFactory sessionFactory = null;
	
	public JogoDAO(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("l");
		em = emf.createEntityManager();
	}
	
	public void inserir(Jogo jogo) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.persist(jogo);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public Jogo consultarPorId(Integer id) {
		return em.find(Jogo.class, id);
	}
	
	//Metodo usado o resto ta funcionando tbm mais deu pregui de implementar
	@SuppressWarnings("unchecked")
	public List<Jogo> consultar(){
        return em.createQuery("FROM " + Jogo.class.getName()).getResultList();

	}
	 
	
	public Jogo consultarPorNome(String nome){
		 	Session session = sessionFactory.openSession();
	        Transaction tx = null;
	        Jogo jogo = null;
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            Query query = session.createQuery("from Jogo where nome='"+nome+"'");
	            jogo = (Jogo)query.uniqueResult();
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return jogo;
	    }
	
	public void remover(Jogo jogo) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.remove(jogo);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public void alterar(Jogo jogo) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			em.merge(jogo);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

}
