package test;

import java.util.GregorianCalendar;

import dao.ReservaDao;
import datos.Reserva;

public class testTraerReserva {

	public static void main(String[] args) {
		
		ReservaDao reservaDao=new ReservaDao();
		//System.out.println(reservaDao.traerReserva(4));
		GregorianCalendar desde = new GregorianCalendar(2015, 01, 01);
		GregorianCalendar hasta = new GregorianCalendar(2015, 01, 30);
		System.out.println(reservaDao.traerListaReservas(desde, hasta));
	}
	
	
}
