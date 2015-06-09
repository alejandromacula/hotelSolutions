package test;

import java.util.GregorianCalendar;

import dao.HabitacionDao;
import dao.ReservaDao;
import dao.TipoDeHabitacionDao;
import datos.Reserva;
import datos.TipoDeHabitacion;

public class testTraerReserva {

	public static void main(String[] args) {
		
		ReservaDao reservaDao=new ReservaDao();
		//System.out.println(reservaDao.traerReserva(4));
		//GregorianCalendar desde = new GregorianCalendar(2015, 00, 1);  //enero es el mes 0
		//GregorianCalendar hasta = new GregorianCalendar(2015, 00, 6);
		//System.out.println(reservaDao.traerListaReservas(desde, hasta, 111));
		//GregorianCalendar dia = new GregorianCalendar(2015, 00, 26);
		//Reserva reserva=reservaDao.traerReserva(111, dia);
		//System.out.println(reserva.getObservaciones());
		//String observaciones=reserva.getObservaciones();
		//System.out.println(observaciones);
		TipoDeHabitacionDao tipoHabDao= new TipoDeHabitacionDao();
		HabitacionDao habDao= new HabitacionDao();
		TipoDeHabitacion tipoHab= tipoHabDao.traerTipoHabitacion(2);
		//System.out.println(reservaDao.hayDisponibilidad(desde, hasta, tipoHab));
		System.out.println(habDao.traerListaHabitacion().size());
		System.out.println(reservaDao.cantidadDeReservasHoy());
		System.out.println("aa");
	}
	
	
}
