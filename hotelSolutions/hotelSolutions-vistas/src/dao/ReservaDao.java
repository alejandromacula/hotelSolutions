package dao;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.Reserva;
public class ReservaDao {
	
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

	public List<Reserva> traerListaReservas( GregorianCalendar desde, GregorianCalendar hasta ) throws HibernateException {
		List<Reserva> lista=null;
		
		
		try {
			iniciaOperacion();
			lista=session.createQuery("from Reserva t where t.desde >= :desde and t.hasta <= :hasta").setCalendarDate("desde", desde).setCalendarDate("hasta", hasta).list();
			
			} finally {
				session.close();

		}

			return lista;

		}

	public List<Reserva> traerListaReservas( GregorianCalendar desde, GregorianCalendar hasta, int numeroHabitacion ) throws HibernateException {
		List<Reserva> lista=null;
		
		
		try {
			iniciaOperacion();
			lista=session.createQuery("from Reserva t where t.desde >= :desde and t.hasta <= :hasta and t.habitacion.nroHab = :habitacion").setCalendarDate("desde", desde).setCalendarDate("hasta", hasta).setParameter("habitacion", numeroHabitacion ).list();
			
			} finally {
				session.close();

		}

			return lista;

		}
	
	public Reserva traerReserva(int idReserva) throws HibernateException {
		
		Reserva reserva = null; //cambiar localidad por tipo de usuario
		
		try {
			iniciaOperacion();
			reserva = (Reserva) session.createQuery("select r from Reserva r where r.idReserva =:id").setParameter("id", idReserva ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return reserva;

	}
	
	public Reserva traerReserva(int numeroHabitacion, GregorianCalendar dia ) throws HibernateException {
		
		Reserva reserva = null; 
		
		try {
			iniciaOperacion();
			reserva = (Reserva) session.createQuery("from Reserva t where :dia between t.desde and t.hasta and t.habitacion.nroHab = :habitacion").setParameter("dia", dia ).setParameter("habitacion", numeroHabitacion ).uniqueResult();
			
   		} finally {
   			session.close();
   		}
   		return reserva;

	}
	
	public long altaReserva(Reserva reserva) {
		long idReserva=0;
		try {
		iniciaOperacion();
		idReserva = Long.parseLong(session.save(reserva).toString());
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return idReserva;
		}
	
	
	
	public void modificarReserva(Reserva reserva) {
		try {
		iniciaOperacion();
		session.update(reserva);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}
	



}



