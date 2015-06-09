package dao;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Habitacion;
import datos.HibernateUtil;
import datos.Reserva;
import datos.TipoDeHabitacion;
import funciones.Funciones;
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

	public boolean hayDisponibilidad( GregorianCalendar desde, GregorianCalendar hasta, TipoDeHabitacion tipoHab ) throws HibernateException {
		List<Integer> lista=null;
		List<Integer> lista2=null;
		List<Integer> lista3=null;
		boolean disponibilidad=false;
		
		try {
			iniciaOperacion();
			lista=session.createQuery("select h.nroHab from Reserva r inner join r.habitacion as h "
					+ " inner join h.tipoDeHabitacion as t"
					+ " WITH t.tipo = :tipoHabitacion"
					+ " where :fecha1 between r.desde and r.hasta").setCalendarDate("fecha1", desde).setParameter("tipoHabitacion", tipoHab.getTipo()).list();
			
			lista2=session.createQuery("select h.nroHab from Reserva r inner join r.habitacion as h "
					+ " inner join h.tipoDeHabitacion as t"
					+ " WITH t.tipo = :tipoHabitacion "
					+ " where :fecha2 between r.desde and r.hasta").setCalendarDate("fecha2", hasta).setParameter("tipoHabitacion", tipoHab.getTipo()).list();

			lista3=session.createQuery("select h.nroHab from Reserva r inner join r.habitacion as h "
					+ " inner join h.tipoDeHabitacion as t"
					+ " WITH t.tipo = :tipoHabitacion "
					+ " where :fecha1 <= r.desde").setCalendarDate("fecha1", desde).setParameter("tipoHabitacion", tipoHab.getTipo()).list();

					
		} finally {
				session.close();

		}
			
				HabitacionDao habDao= new HabitacionDao();
				TipoDeHabitacionDao tipoHabDao= new TipoDeHabitacionDao();
				List<Habitacion> listaHab = habDao.traerListaHabitacion(tipoHabDao.traerTipoHabitacion(tipoHab.getTipo()));
				int cantidadDeHabitaciones=listaHab.size();
				int cantidadDeReservas=lista.size()+lista2.size()+lista3.size();
				if (cantidadDeHabitaciones > cantidadDeReservas)
					disponibilidad=true;
				
			return disponibilidad;

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
	
	public Integer cantidadDeReservasHoy() throws HibernateException {
		GregorianCalendar dia =new GregorianCalendar();
		List<Reserva> lista=null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Reserva t where :dia between t.desde and t.hasta or :dia = t.desde").setParameter("dia", dia ).list();
			
   		} finally {
   			session.close();
   		}
   		return lista.size();

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
	
	
	
	public Reserva modificarReserva(Reserva reserva) {
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
		return reserva;
		}
	


	public void eliminarReserva(Reserva reserva) {
		try {
		iniciaOperacion();
		session.delete(reserva);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return;
		}


}



