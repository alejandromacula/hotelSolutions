package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import negocio.AdministradorUsuarios;
import datos.Usuario;


public class LoginController extends HttpServlet {
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
				
				HttpSession sesion = request.getSession();
				sesion.setMaxInactiveInterval(10*60);
				
				String nombreDeUsuario =  request.getParameter( "nombreDeUsuario" );
				String password =  request.getParameter( "password" );
				
				AdministradorUsuarios admusuario=new AdministradorUsuarios();
				Usuario usuario=null;
				usuario=admusuario.traerUsuario( nombreDeUsuario , password);
				
				if(usuario!=null && sesion.getAttribute("usuario") == null)
					sesion.setAttribute("usuario", usuario);

				if(usuario.getTipoDeUsuario().getTipoDeUsuario().compareTo("admin")==0)
					response.sendRedirect("index.jsp");
				else
					response.sendRedirect("indexUsuario.jsp");
				
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
		
