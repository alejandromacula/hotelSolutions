package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.Hotel;
public class HotelDao {
	
	
	
	
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

	public List<Hotel> traerListaHoteles() throws HibernateException {
	List<Hotel> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from Hotel  h inner join fetch h.provincia").list();

		} finally {
			session.close();

	}

		return lista;

	}
	
	
	public Hotel traerHotel(int idHotel) throws HibernateException {
		
		Hotel hotel = null; //cambiar localidad por tipo de usuario
		
		try {
			iniciaOperacion();
			hotel = (Hotel) session.createQuery("select h from Hotel h where h.idHotel =:id").setParameter("id", idHotel ).uniqueResult();

   		} finally {
   			session.close();
   		}
   		return hotel;

	}
	
	public long altaHotel(Hotel hotel) {
		long idHotel=0;
		try {
		iniciaOperacion();
		idHotel = Long.parseLong(session.save(hotel).toString());
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return idHotel;
		}
	
	
	
	public void modificarHotel(Hotel hotel) {
		try {
		iniciaOperacion();
		session.update(hotel);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}
	



}








