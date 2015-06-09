package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorHoteles;
import dao.HabitacionDao;
import dao.ReservaDao;
import dao.TipoDeHabitacionDao;
import dao.UsuarioDao;
import datos.Habitacion;
import datos.Reserva;
import datos.TipoDeHabitacion;
import datos.Usuario;
import funciones.Funciones;



public class ConsultaDisponibilidadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() throws ServletException {
		// Servlet initialization code here
		super.init();
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
	procesarPeticion( request, response);
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
		procesarPeticion( request, response);
	}
	
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			try {
			
				String desde=request.getParameter("desde");
				String hasta=request.getParameter("hasta");
				String tipoHabitacion=request.getParameter("tipoDeHabitacion");
				boolean disponibilidad=false;
				String mensaje="";
				
				int mesDesde=Integer.parseInt(desde.substring(0,2));
				int diaDesde=Integer.parseInt(desde.substring(3,5));
				int anioDesde=Integer.parseInt(desde.substring(6,10));
				int mesHasta=Integer.parseInt(hasta.substring(0,2));
				int diaHasta=Integer.parseInt(hasta.substring(3,5));
				int anioHasta=Integer.parseInt(hasta.substring(6,10));
				
				GregorianCalendar fechaDesde= new GregorianCalendar(anioDesde,mesDesde-1,diaDesde);
				GregorianCalendar fechaHasta= new GregorianCalendar(anioHasta,mesHasta-1,diaHasta);
				
				TipoDeHabitacionDao tipoHabDao=new TipoDeHabitacionDao();
				TipoDeHabitacion tipoHab= tipoHabDao.traerTipoHabitacion(tipoHabitacion);
				
				ReservaDao reservaDao=new ReservaDao();
				disponibilidad=reservaDao.hayDisponibilidad(fechaDesde, fechaHasta, tipoHab);
				
				if(disponibilidad)
					mensaje="Actualmente hay Disponibilidad para las plazas seleccionadas. Comuniquese con el hotel para realizar su reserva.";
				else
					mensaje="Actualmente no hay disponibilidad para el rango de fechas seleccionado.";
				
				response.setContentType("text/html;charset=UTF-8");
		        response.getWriter().write(mensaje);
				
			} catch (
			Exception e) {
				response.sendRedirect("500.html");
		}
		}
	
	
	
	@Override
	public void destroy() {
		// resource release
		super.destroy();
	}
}
