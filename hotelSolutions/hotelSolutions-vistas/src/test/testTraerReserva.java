package test;

import java.util.GregorianCalendar;

import dao.ReservaDao;
import datos.Reserva;

public class testTraerReserva {

	public static void main(String[] args) {
		
		ReservaDao reservaDao=new ReservaDao();
		//System.out.println(reservaDao.traerReserva(4));
		GregorianCalendar desde = new GregorianCalendar(2015, 00, 02);  //enero es el mes 0
		GregorianCalendar hasta = new GregorianCalendar(2015, 00, 06);
		System.out.println(reservaDao.traerListaReservas(desde, hasta, 111));
		//GregorianCalendar dia = new GregorianCalendar(2015, 00, 26);
		//Reserva reserva=reservaDao.traerReserva(111, dia);
		//System.out.println(reserva.getObservaciones());
		//String observaciones=reserva.getObservaciones();
		//System.out.println(observaciones);
	}
	
	
}
