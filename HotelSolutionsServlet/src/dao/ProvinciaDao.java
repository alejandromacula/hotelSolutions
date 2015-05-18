package dao;

import java.util.List;





import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.Localidad;
import datos.Provincia;
public class ProvinciaDao {
	
	//private ObservableList<Usuario> personData = FXCollections.observableArrayList();
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

	public List<Provincia> traerListaProvincias() throws HibernateException {
	List<Provincia> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from Provincia").list();

		} finally {
			session.close();

	}

		return lista;

	}

	public Provincia traerProvincia(int idProvincia) throws HibernateException {
		
		Provincia provincia = null;
		
		try {
			iniciaOperacion();
			provincia = (Provincia) session.createQuery("select pr from Provincia pr where pr.idProvincia =:id").setParameter("id", idProvincia ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return provincia;

	}
	
	
	public long altaProvincia(Provincia provincia) {
		long idProvincia=0;
		try {
		iniciaOperacion();
		idProvincia = Long.parseLong(session.save(provincia).toString());
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return idProvincia;
		}
	
	
	
	public void modificarProvincia(Provincia provincia) {
		try {
		iniciaOperacion();
		session.update(provincia);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}
	



}