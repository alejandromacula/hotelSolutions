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
		reservaDao.altaReserva(new Reserva(112, 350, new GregorianCalendar(2014, 7, 12),
				new GregorianCalendar(2014, 7, 15), true, new GregorianCalendar(2014, 2, 28), "todo ok",
				habDao.traerHabitacion(1), usDao.traerUsuario(1)));
		
	}

}
