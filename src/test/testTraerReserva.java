package test;

import java.util.GregorianCalendar;

import dao.ReservaDao;
import datos.Reserva;

public class testTraerReserva {

	public static void main(String[] args) {
		
		ReservaDao reservaDao=new ReservaDao();
		System.out.println(reservaDao.traerReserva(4));
	}
	
	
}
