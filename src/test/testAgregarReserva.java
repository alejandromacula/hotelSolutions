package test;

import java.util.GregorianCalendar;

import dao.HabitacionDao;
import dao.ReservaDao;
import dao.UsuarioDao;
import datos.Reserva;

public class testAgregarReserva {
	
	public static void main(String[] args) {
		
		HabitacionDao habDao=new HabitacionDao();
		UsuarioDao usDao=new UsuarioDao();
		
		
		ReservaDao reservaDao=new ReservaDao();
		reservaDao.altaReserva(new Reserva(112, 500, new GregorianCalendar(2015, 1, 12),
				new GregorianCalendar(2015, 01, 30), true, new GregorianCalendar(2015, 1, 1), "reserva de prueba",
				habDao.traerHabitacion(1), usDao.traerUsuario(1)));
		
	}

}
