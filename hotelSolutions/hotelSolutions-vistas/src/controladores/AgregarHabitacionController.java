package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorHoteles;
import datos.Habitacion;



public class AgregarHabitacionController extends HttpServlet {
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
			//	Usuario nuevoUsuario=new Usuario();
				
				String piso = request.getParameter("piso");
				String nroHab =  request.getParameter( "nroHab" );
				String estado = request.getParameter("estado");
				String ocupada = request.getParameter("ocupada");
				String observaciones = request.getParameter("observaciones");
				String idTipoHab = request.getParameter("idTipoDeHabitacion");
				String idHotel = request.getParameter("idHotel");
				
				
				
			
			AdministradorHoteles admhotel=new AdministradorHoteles();
				Habitacion habitacion=admhotel.darDeAltaUnaHabitacion(Integer.parseInt(piso), Integer.parseInt(nroHab),  Boolean.parseBoolean(estado), Boolean.parseBoolean(ocupada), observaciones, Integer.parseInt(idTipoHab),Integer.parseInt(idHotel));
	 System.out.println(habitacion);
				request.setAttribute("habitacion", habitacion);
				request.getRequestDispatcher("/vistaHabitacionAgregada.jsp").forward(request ,response);
				System.out.println("Hola");
			} catch (
			Exception e) {
			response.sendError(500, "La habitaci�n no pudo ser ingresada en la base de datos.");
		}
		}
	
	
	
	@Override
	public void destroy() {
		// resource release
		super.destroy();
	}
}
