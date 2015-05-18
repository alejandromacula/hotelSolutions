package test;

import java.util.GregorianCalendar;

import dao.HabitacionDao;
import dao.TipoDeHabitacionDao;
import datos.Habitacion;
import negocio.AdministradorHoteles;
import negocio.AdministradorUsuarios;

public class testAgregarHabitacion {
	
public static void main(String[] args) {
	TipoDeHabitacionDao tipoHabDao=new TipoDeHabitacionDao();
	AdministradorHoteles admHoteles=new AdministradorHoteles();
	//System.out.println( tipoHabDao.traerTipoHabitacion(1) );
	
	admHoteles.darDeAltaUnaHabitacion(1, 2, true, false, "ninguna", 1, 3);
		
		
	}
	

}
