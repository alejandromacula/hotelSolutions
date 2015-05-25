package test;

import dao.TipoDeHabitacionDao;
import datos.TipoDeHabitacion;

public class testTipoHabitacion {
	
	public static void main(String[] args) {

		TipoDeHabitacionDao tipoHabDao=new TipoDeHabitacionDao();
		//tipoHabDao.altaTipoHabitacion(new TipoDeHabitacion("premium"));
		System.out.println(tipoHabDao.traerTipoHabitacion(1));
		
		
		
		
	}
}
