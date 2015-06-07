package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorUsuarios;
import negocio.generarMailConfirmacionReserva;
import dao.HabitacionDao;
import dao.ReservaDao;
import datos.Habitacion;
import datos.Reserva;
import datos.Usuario;
import funciones.Funciones;


public class NuevaReservaController extends HttpServlet {
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
			response.setContentType("text/html;charset=UTF-8");
			try {
				String switchConfirmada="";
				String nombreDeUsuario =  request.getParameter( "nombreDeUsuario" );
				int numeroDeHabitacion =  Integer.parseInt(request.getParameter( "habitacion" ));
				String rangoDeFechas =  request.getParameter( "daterange" );
				float senia =  Integer.parseInt(request.getParameter( "senia" ));
				float precioFinal =  Integer.parseInt(request.getParameter( "precioFinal" ));
				if(request.getParameter( "confirmada" ) != null){
					switchConfirmada =  request.getParameter( "confirmada" );}
				
				
				boolean confirmada=false;
				if(switchConfirmada.compareTo("on")==0) //compareTo = 0 => son iguales
					confirmada=true;
				System.out.println(confirmada);
				System.out.println(switchConfirmada);
				
				String observaciones =  request.getParameter( "observaciones" );
				
				int diaDesde= Integer.parseInt(rangoDeFechas.substring(0, 2));
				int mesDesde= Integer.parseInt(rangoDeFechas.substring(3, 5));
				int anioDesde= Integer.parseInt(rangoDeFechas.substring(6, 10));
				
				int diaHasta= Integer.parseInt(rangoDeFechas.substring(13, 15));
				int mesHasta= Integer.parseInt(rangoDeFechas.substring(16, 18));
				int anioHasta= Integer.parseInt(rangoDeFechas.substring(19, 23));
				
				GregorianCalendar desde= new GregorianCalendar(anioDesde, mesDesde-1, diaDesde);
				GregorianCalendar hasta= new GregorianCalendar(anioHasta, mesHasta-1, diaHasta);
				GregorianCalendar fechaActual=new GregorianCalendar();
				
				AdministradorUsuarios admusuario=new AdministradorUsuarios();
				Usuario usuario=admusuario.traerUsuario( nombreDeUsuario);
				
				HabitacionDao habDao=new HabitacionDao();
				Habitacion habitacion=habDao.traerHabitacion(numeroDeHabitacion);         //terminar
				
				ReservaDao reservaDao=new ReservaDao();
				long numReserva=reservaDao.altaReserva(new Reserva(senia, precioFinal, desde,
						hasta, confirmada, fechaActual, observaciones,
						habitacion, usuario));
				String directorio=request.getSession().getServletContext().getRealPath("/");
				generarMailConfirmacionReserva.generarMailConfirmacionReserva(directorio, numReserva, usuario.getNombre(), usuario.getApellido(),
						Funciones.traerFechaCorta(desde), Funciones.traerFechaCorta(hasta), habitacion.getTipoDeHabitacion().getTipo());
				
				response.sendRedirect("index.jsp");
				
			} catch (
			Exception e) {
			response.sendError(500, "excepcion de nueva reserva.");
			}
			}
	
	
	
	@Override
	public void destroy() {
		// resource release
		super.destroy();
	}
}
		
