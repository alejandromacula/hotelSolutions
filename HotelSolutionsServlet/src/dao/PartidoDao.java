package dao;

import java.util.List;




import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.Localidad;
import datos.Partido;
public class PartidoDao {
	
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

	public List<Partido> traerListaPartidos() throws HibernateException {
	List<Partido> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from Partido").list(); 

		} finally {
			session.close();

	}

		return lista;

	}

	public Partido traerPartido(int idPartido) throws HibernateException {
		
		Partido partido = null; 
		
		try {
			iniciaOperacion();
			partido = (Partido) session.createQuery("select p from Partido p where p.id =:id").setParameter("id", idPartido ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return partido;

	}
	
	
	public long altaPartido(Partido partido) {
		long idPartido=0;
		try {
		iniciaOperacion();
		idPartido = Long.parseLong(session.save(partido).toString());
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return idPartido;
		}
	
	
	
	public void modificarPartido(Partido partido) {
		try {
		iniciaOperacion();
		session.update(partido);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}
	



}

