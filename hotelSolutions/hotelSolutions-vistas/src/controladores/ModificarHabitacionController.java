package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorHoteles;
import dao.HotelDao;
import datos.Hotel;
import datos.Habitacion;
import dao.HabitacionDao;
import datos.TipoDeHabitacion;
import dao.TipoDeHabitacionDao;


public class ModificarHabitacionController extends HttpServlet {
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
				
				String idHabitacion = request.getParameter("idHabitacion");
				String piso =  request.getParameter( "piso" );
				String nroHab = request.getParameter("nroHab");
				String estado = request.getParameter("estado");
				String ocupada = request.getParameter("ocupada");
				String observaciones = request.getParameter("observaciones");
				String hotel = request.getParameter("hotel");
				String idTipoDeHabitacion = request.getParameter("idTipoDeHabitacion");
				
				
	System.out.println(idHabitacion+piso+nroHab+estado+ocupada+observaciones+hotel+idTipoDeHabitacion);	
				
				
				HotelDao hot = new HotelDao();
				Hotel hote = hot.traerHotel(Integer.parseInt(hotel));
				
				
				TipoDeHabitacionDao tdhabdao = new TipoDeHabitacionDao();
				TipoDeHabitacion tdhab = tdhabdao.traerTipoHabitacion(Integer.parseInt(idTipoDeHabitacion));
				

	 			AdministradorHoteles admhoteles=new AdministradorHoteles();
 				Habitacion habitacion=admhoteles.traerHabitacion(Integer.parseInt(idHabitacion));
 			
 				System.out.println(habitacion);
				
 				habitacion.setPiso(Integer.parseInt(piso));
				habitacion.setNroHab(Integer.parseInt(nroHab));;
				habitacion.setEstado(Boolean.parseBoolean(estado));
				habitacion.setOcupada(Boolean.parseBoolean(ocupada));
				habitacion.setObservaciones(observaciones);
				habitacion.setHotel(hote);
				habitacion.setTipoDeHabitacion(tdhab);
				
				System.out.println(habitacion);
				
				HabitacionDao habdao=new HabitacionDao();
				Habitacion habitacionModificada=habdao.modificarHabitacion(habitacion);
	    
				System.out.println(habitacionModificada);
				
	System.out.println("Llega");
				
				request.setAttribute("habitacion", habitacionModificada);
	System.out.println("Llega2");
				System.out.println("habitacion modificada");
				request.getRequestDispatcher("/vistaHabitacionModificada.jsp").forward(request ,response);
				
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
