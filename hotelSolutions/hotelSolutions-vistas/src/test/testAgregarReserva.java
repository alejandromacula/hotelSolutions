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
		reservaDao.altaReserva(new Reserva(112, 500, new GregorianCalendar(2015, 0, 22),
				new GregorianCalendar(2015, 0, 30), false, new GregorianCalendar(2015, 1, 1), "reserva sin confirmar",
				habDao.traerHabitacion(2), usDao.traerUsuario(1)));
		
	}

}
