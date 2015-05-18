package negocio;

import dao.HabitacionDao;
import dao.HotelDao;
import dao.TipoDeHabitacionDao;
import datos.Habitacion;
import datos.Hotel;

public class AdministradorHoteles {

	HotelDao hotelDao= new HotelDao();
	TipoDeHabitacionDao tipoHabDao=new TipoDeHabitacionDao();
	HabitacionDao habitacionDao= new HabitacionDao();
	
	public Habitacion darDeAltaUnaHabitacion(int piso, int nroHab, boolean estado,
			boolean ocupada, String observaciones,int idTipoHab, int idHotel){
	
		System.out.println( tipoHabDao.traerTipoHabitacion(idTipoHab) );
			
		Habitacion hab= new Habitacion(piso, nroHab, estado, ocupada, observaciones,
				tipoHabDao.traerTipoHabitacion(idTipoHab), hotelDao.traerHotel(idHotel));
		habitacionDao.altaHabitacion(hab);
		
		return hab;
		
	
	}
	
	public Habitacion traerHabitacion( int idHab ){
	
		return habitacionDao.traerHabitacion(idHab);		
		
}


	
	

}