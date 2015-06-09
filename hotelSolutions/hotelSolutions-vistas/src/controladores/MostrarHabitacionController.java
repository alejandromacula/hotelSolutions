package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorHoteles;
import datos.Habitacion;


public class MostrarHabitacionController extends HttpServlet {
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
				String idHabitacion =  request.getParameter( "idHabitacion" );
			//	int idHab = Integer.parseInt(idHabString);
				
				AdministradorHoteles admhotel=new AdministradorHoteles();
				Habitacion habitacion=admhotel.traerHabitacion(Integer.parseInt(idHabitacion));
				System.out.println(habitacion);
				request.setAttribute("habitacion", habitacion);
				request.getRequestDispatcher("/vistaHabitacion.jsp").forward(request ,
				response);
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
		
