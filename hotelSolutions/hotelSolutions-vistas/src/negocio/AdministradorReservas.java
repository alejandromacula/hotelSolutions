package negocio;

import java.util.GregorianCalendar;


import datos.Reserva;
import dao.ReservaDao;
import datos.Habitacion;
import datos.Usuario;


public class AdministradorReservas {
	
	ReservaDao reservaDao=new ReservaDao();
	

	public Reserva darDeAltaUnaReserva(float senia, float precioFinal, GregorianCalendar desde,
			GregorianCalendar hasta, boolean confirmada,
			GregorianCalendar fecha, String observaciones, Habitacion habitacion, Usuario usuario){

				
		ReservaDao reservaDao=new ReservaDao();

		 Reserva r=new Reserva(senia, precioFinal, desde, hasta, confirmada, fecha,
				 observaciones, habitacion, usuario);
	     
		 reservaDao.altaReserva(r);
		 
		return r;
	}
	
	
	public Reserva traerReserva(int idReserva){
		
		
		return reservaDao.traerReserva(idReserva);
	}
	
	
	
}
