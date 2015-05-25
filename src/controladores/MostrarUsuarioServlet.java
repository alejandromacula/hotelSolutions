package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.AdministradorUsuarios;
import datos.Usuario;


public class MostrarUsuarioServlet extends HttpServlet {
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
				String nombreDeUsuario =  request.getParameter( "nombreDeUsuario" );
				
				AdministradorUsuarios admusuario=new AdministradorUsuarios();
				Usuario usuario=admusuario.traerUsuario( nombreDeUsuario);
				System.out.println(usuario);
				request.setAttribute("usuario", usuario);
				request.getRequestDispatcher("/vistaUsuario.jsp").forward(request ,
				response);
			} catch (
			Exception e) {
			response.sendError(500, "El Nombre de Usuario ingresado no existe en la base de datos.");
			}
			}
	
	
	
	@Override
	public void destroy() {
		// resource release
		super.destroy();
	}
}
		
