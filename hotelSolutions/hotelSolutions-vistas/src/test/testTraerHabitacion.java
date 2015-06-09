package test;

import dao.HabitacionDao;
import dao.TipoDeHabitacionDao;
import negocio.AdministradorHoteles;

public class testTraerHabitacion {
	
	public static void main(String[] args) {

		AdministradorHoteles admHoteles=new AdministradorHoteles();
		//System.out.println(admHoteles.traerHabitacion(1));
		
		HabitacionDao habitacionDao=new HabitacionDao();
		TipoDeHabitacionDao tdao=new TipoDeHabitacionDao();
		System.out.println(habitacionDao.traerListaHabitacion(tdao.traerTipoHabitacion("doble")));
			
		//System.out.println(habitacionDao.cantidadDeHabitaciones());
		}
		

}
