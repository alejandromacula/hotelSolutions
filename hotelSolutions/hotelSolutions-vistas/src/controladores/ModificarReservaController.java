package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorUsuarios;
import dao.LocalidadDao;
import datos.Localidad;
import datos.Usuario;
import dao.UsuarioDao;
import datos.TipoDeUsuario;
import dao.TipoDeUsuarioDao;
import datos.Habitacion;
import dao.HabitacionDao;
import datos.Reserva;
import dao.ReservaDao;


public class ModificarReservaController extends HttpServlet {
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
				
				String idReserva = request.getParameter("idReserva");
				String senia =  request.getParameter( "senia" );
				String precioFinal = request.getParameter("precioFinal");
				String desdeDia = request.getParameter("desdeDia");
				String desdeMes = request.getParameter("desdeMes");
				String desdeAnio = request.getParameter("desdeAnio");
				String hastaDia = request.getParameter("hastaDia");
				String hastaMes = request.getParameter("hastaMes");
				String hastaAnio = request.getParameter("hastaAnio");
				String confirmada = request.getParameter("confirmada");
			//	String fechaDia = request.getParameter("fechaDia");
			//	String fechaMes = request.getParameter("fechaMes");
			//	String fechaAnio = request.getParameter("fechaAnio");
				String observaciones = request.getParameter("observaciones");
				String habitacion = request.getParameter("habitacion");
				String usuario = request.getParameter("usuario");
				
				
	System.out.println(idReserva+senia+precioFinal+desdeDia+desdeMes+desdeAnio+hastaDia+hastaMes+hastaAnio+confirmada+observaciones+habitacion+usuario);		
				
	
				GregorianCalendar fechaDesde = new GregorianCalendar(Integer.parseInt(desdeAnio),(Integer.parseInt(desdeMes)-1),Integer.parseInt(desdeDia));
				GregorianCalendar fechaHasta = new GregorianCalendar(Integer.parseInt(hastaAnio),(Integer.parseInt(hastaMes)-1),Integer.parseInt(hastaDia));
			//	GregorianCalendar fecha = new GregorianCalendar(Integer.parseInt(fechaAnio),(Integer.parseInt(fechaMes)-1),Integer.parseInt(fechaDia));
				
				HabitacionDao habdao = new HabitacionDao();
				Habitacion hab = habdao.traerHabitacion(Integer.parseInt(habitacion));
				
				UsuarioDao usdao = new UsuarioDao();
				Usuario us = usdao.traerUsuario(Integer.parseInt(usuario));
				
	 			ReservaDao resdao=new ReservaDao();
 				Reserva reserva=resdao.traerReserva(Integer.parseInt(idReserva));
 			
 				System.out.println(reserva);
				
 				reserva.setSenia(Float.parseFloat(senia));
				reserva.setPrecioFinal(Float.parseFloat(precioFinal));
				reserva.setDesde(fechaDesde);
				reserva.setHasta(fechaHasta);
				reserva.setConfirmada(Boolean.parseBoolean(confirmada));
		//		reserva.setFecha(fecha);
				reserva.setObservaciones(observaciones);
				reserva.setHabitacion(hab);
				reserva.setUsuario(us);	
				
				System.out.println(reserva);
				
				ReservaDao reservadao=new ReservaDao();
				Reserva reservaModificada=reservadao.modificarReserva(reserva);
	    
				System.out.println(reservaModificada);
				
				request.setAttribute("reserva", reservaModificada);
				System.out.println("reserva modificada");
				request.getRequestDispatcher("/vistaReservaModificada.jsp").forward(request ,response);
				
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
