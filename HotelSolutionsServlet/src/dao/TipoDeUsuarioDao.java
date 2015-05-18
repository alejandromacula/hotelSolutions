package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.TipoDeUsuario;
import datos.Usuario;
public class TipoDeUsuarioDao {
	
	
	
	
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

	public List<TipoDeUsuario> traerListaTiposDeUsuarios() throws HibernateException {
	List<TipoDeUsuario> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from TipoDeUsuario  l inner join fetch l.privilegio").list();  //corregir la consulta

		} finally {
			session.close();

	}

		return lista;

	}
	
	
	public TipoDeUsuario traerTipoUsuario(int idTipoUsuario) throws HibernateException {
		
		TipoDeUsuario tipoUsuario = null; //cambiar localidad por tipo de usuario
		
		try {
			iniciaOperacion();
			tipoUsuario = (TipoDeUsuario) session.createQuery("select u from TipoDeUsuario u where u.idTipoDeUsuario =:id").setParameter("id", idTipoUsuario ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return tipoUsuario;

	}
	
	



}





