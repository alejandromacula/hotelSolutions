package test;

import dao.HabitacionDao;
import negocio.AdministradorHoteles;

public class testTraerHabitacion {
	
	public static void main(String[] args) {

		AdministradorHoteles admHoteles=new AdministradorHoteles();
		//System.out.println(admHoteles.traerHabitacion(1));
		
		HabitacionDao habitacionDao=new HabitacionDao();
		System.out.println(habitacionDao.traerListaHabitacion().size());
			
		//System.out.println(habitacionDao.cantidadDeHabitaciones());
		}
		

}
