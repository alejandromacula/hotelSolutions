package dao;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.Habitacion;
public class HabitacionDao {
	
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

	public List<Habitacion> traerListaHabitacion() throws HibernateException {
	List<Habitacion> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from Habitacion h inner join fetch h.????????").list(); //Preguntar que va después del punto

		} finally {
			session.close();

	}

		return lista;

	}

	public Habitacion traerHabitacion(int idHabitacion) throws HibernateException {
		
		Habitacion habitacion = null; //cambiar localidad por tipo de usuario
		
		try {
			iniciaOperacion();
			habitacion = (Habitacion) session.createQuery("select h from Habitacion h where h.idHabitacion =:id").setParameter("id", idHabitacion ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return habitacion;

	}
	
	
	public long altaHabitacion(Habitacion habitacion) {
		long idHabitacion=0;
		try {
		iniciaOperacion();
		idHabitacion = Long.parseLong(session.save(habitacion).toString());
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return idHabitacion;
		}
	
	
	
	public void modificarHabitacion(Habitacion habitacion) {
		try {
		iniciaOperacion();
		session.update(habitacion);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}
	



}



