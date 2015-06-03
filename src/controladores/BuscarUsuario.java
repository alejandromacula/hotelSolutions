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
import dao.UsuarioDao;
import datos.Habitacion;
import datos.Reserva;
import datos.Usuario;
import funciones.Funciones;



public class BuscarUsuario extends HttpServlet {
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
			
				String nombreUsuario=request.getParameter("nombreDeUsuario");
				UsuarioDao usuarioDao=new UsuarioDao();
				Usuario usuario=usuarioDao.traerUsuario(nombreUsuario);
				response.setContentType("text/html;charset=UTF-8");
		        response.getWriter().write(usuario.getNombre()+" "+usuario.getApellido());
				
			} catch (
			Exception e) {
			response.sendError(500, "Usuario inexistente");
		}
		}
	
	
	
	@Override
	public void destroy() {
		// resource release
		super.destroy();
	}
}
