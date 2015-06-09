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
import datos.Habitacion;
import datos.Reserva;
import funciones.Funciones;



public class TablaReservas extends HttpServlet {
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
			
				int mes=Integer.parseInt(request.getParameter("mes"));
				int anio=Integer.parseInt(request.getParameter("anio"));
				int cantidadDeDiasMes=Funciones.cantidadDiasMes(mes, anio);
				HabitacionDao habitacionDao=new HabitacionDao();
				ReservaDao reservaDao=new ReservaDao();
  			    List<Habitacion> habitaciones=habitacionDao.traerListaHabitacion();
				String cabeceraDiasTabla="";
				String filasHabitaciones="";
				for (int i = 1; i < cantidadDeDiasMes+1; i++) { 
        			if(i<10){
        				cabeceraDiasTabla= cabeceraDiasTabla+"<th> 0"+ i +"</th>";}  //le agrego un 0 para no romper el maquetado
       				else{
       					cabeceraDiasTabla= cabeceraDiasTabla+"<th>"+ i +"</th>";}
        		}
				for (Habitacion habitacion:habitaciones){
				  if(!habitacion.isEstado())
						filasHabitaciones= filasHabitaciones+"<tr><td style= 'background-color: rgb(239, 198, 198);'>" + habitacion.getNroHab() + "</td>";
				  else  
					  filasHabitaciones= filasHabitaciones+"<tr><td>" + habitacion.getNroHab() + "</td>";
				  for (int p = 1; p < cantidadDeDiasMes+1; p++) { 
					 Reserva reserva=reservaDao.traerReserva(habitacion.getNroHab(), new GregorianCalendar(anio, mes-1, p)); 
					 if(reserva != null && reserva.isConfirmada()){
						String observaciones=reserva.getObservaciones();
						filasHabitaciones= filasHabitaciones+"<td title='"+ observaciones.toString() +"' style='background-color: rgb(156, 239, 169);'>"+reserva.getIdReserva()+"</td>";
					 }
					 else if( reserva!= null && !reserva.isConfirmada()){
						String observaciones=reserva.getObservaciones();
						filasHabitaciones= filasHabitaciones+"<td title='"+ observaciones.toString() +"'  style='background-color: rgb(242, 250, 165);'>"+reserva.getIdReserva()+"</td>";
					 
					 }
					 else{
						if(!habitacion.isEstado())
							filasHabitaciones= filasHabitaciones+"<td style='background-color: rgb(239, 198, 198);'> - </td>";
						else
						filasHabitaciones= filasHabitaciones+"<td style='background-color: rgb(226, 226, 255);'> - </td>";
  					  } 
					 
				  }
				}
				String tabla=" "
						+ "<table class='table table-bordered table-striped table-condensed'>"
						+ "<thead>"
						+ "<tr>"
						+ "<th> Habitacion </th>"
						+ cabeceraDiasTabla
						+ "</tr>"
						+ "</thead>"
						+ "<tbody>"
						+ "<tr>"
						+ filasHabitaciones
						+ "</tr>"
						+ "</tbody></table>";
				
				response.setContentType("text/html;charset=UTF-8");
		        response.getWriter().write(tabla);
				
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
