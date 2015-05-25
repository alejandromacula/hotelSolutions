package controladores;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorUsuarios;
import dao.HabitacionDao;
import dao.ReservaDao;
import dao.UsuarioDao;
import datos.Habitacion;
import datos.Reserva;
import datos.Usuario;


public class NuevaReservaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NuevaReservaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nombreDeUsuario =  request.getParameter( "nombreDeUsuario" );
			String senia =  request.getParameter( "senia" );
			String precioFinal =  request.getParameter( "precioFinal" );
			String desde =  request.getParameter( "desde" );
			String hasta =  request.getParameter( "hasta" );
			String confirmada =  request.getParameter( "confirmada" );
			String observaciones =  request.getParameter( "observaciones" );
			
			AdministradorUsuarios admusuario=new AdministradorUsuarios();
			Usuario usuario=admusuario.traerUsuario( nombreDeUsuario);
			
			HabitacionDao habDao=new HabitacionDao();
			Habitacion habitacion=habDao.traerHabitacion(1);         //terminar
			
			ReservaDao reservaDao=new ReservaDao();
			reservaDao.altaReserva(new Reserva(112, 350, new GregorianCalendar(2014, 7, 12),
					new GregorianCalendar(2014, 7, 15), true, new GregorianCalendar(2014, 2, 28), "todo ok",
					habitacion, usuario));
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("/vistaUsuario.jsp").forward(request ,
			response);
			
		} catch (
		Exception e) {
		response.sendError(500, "El Nombre de Usuario ingresado no existe en la base de datos.");
		}
	}
	
	public void destroy() {
		// resource release
				super.destroy();
	}

}
