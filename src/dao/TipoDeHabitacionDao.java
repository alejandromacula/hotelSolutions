package dao;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.TipoDeHabitacion;
public class TipoDeHabitacionDao {
	
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

	public List<TipoDeHabitacion> traerListaTipoDeHabitacion() throws HibernateException {
	List<TipoDeHabitacion> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from TipoDeHabitacion t").list(); //Preguntar que va después del punto

		} finally {
			session.close();

	}

		return lista;

	}

	public TipoDeHabitacion traerTipoHabitacion(int idTipoHabitacion) throws HibernateException {
		
		TipoDeHabitacion tipohabitacion = null; //cambiar localidad por tipo de usuario
		
		try {
			iniciaOperacion();
			tipohabitacion = (TipoDeHabitacion) session.createQuery("select t from TipoDeHabitacion t where t.idTipoDeHabitacion =:id").setParameter("id", idTipoHabitacion ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return tipohabitacion;

	}
	
	
	public long altaTipoHabitacion(TipoDeHabitacion tipohabitacion) {
		long idTipoHabitacion=0;
		try {
		iniciaOperacion();
		idTipoHabitacion = Long.parseLong(session.save(tipohabitacion).toString());
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return idTipoHabitacion;
		}
	
	
	
	public void modificarTipoHabitacion(TipoDeHabitacion tipohabitacion) {
		try {
		iniciaOperacion();
		session.update(tipohabitacion);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}
	



}



