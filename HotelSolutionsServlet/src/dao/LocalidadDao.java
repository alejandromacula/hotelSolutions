package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.Localidad;
import datos.Usuario;
public class LocalidadDao {
	
	
	
	
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
	session = HibernateUtil.getSessionFactory().openSession();
	tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {

		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public List<Localidad> traerListaLocalidades() throws HibernateException {
	List<Localidad> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from Localidad ").list();

		} finally {
			session.close();

	}

		return lista;

	}
	
	
	public Localidad traerLocalidad(int idLocalidad) throws HibernateException {
		
		Localidad localidad = null; //cambiar localidad por tipo de usuario

		try {
			iniciaOperacion();
			localidad = (Localidad) session.createQuery("select u from Localidad u where u.id =:id").setParameter("id", idLocalidad ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return localidad;

	}
	
	



}





