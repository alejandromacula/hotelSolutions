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
import datos.Localidad;
import datos.TipoDeUsuario;
import datos.Usuario;
import dao.LocalidadDao;


public class AgregarUsuarioController extends HttpServlet {
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
				
				
				String nombreDeUsuario =  request.getParameter( "nombreDeUsuario" );
				String password = request.getParameter("password");
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				String dni = request.getParameter("dni");
				String direccion = request.getParameter("direccion");
				String numero = request.getParameter("numero");
				String puerta = request.getParameter("puerta");
				String telefono = request.getParameter("telefono");
				String email = request.getParameter("email");
				String diaNacimiento = request.getParameter("diaNacimiento");
				String mesNacimiento = request.getParameter("mesNacimiento");
				String anioNacimiento = request.getParameter("anioNacimiento");
				String sexo = request.getParameter("sexo");
				String tipoDeUsuario = request.getParameter("tipoDeUsuario");
				String localidad = request.getParameter("localidad");
				
				
				LocalidadDao loc = new LocalidadDao();
				Localidad local = loc.traerLocalidad(Integer.parseInt(localidad));
				
				GregorianCalendar fechaNacimiento = new GregorianCalendar(Integer.parseInt(anioNacimiento),Integer.parseInt(mesNacimiento)-1,Integer.parseInt(diaNacimiento));
				
				char sex = sexo.charAt(0);
	// System.out.println("hola");
	// System.out.println(idUsuario+nombreDeUsuario+password+nombre+apellido+dni+direccion+numero+puerta+telefono+email+fechaNacimiento+sexo+tipoDeUsuario+localidad);
 
			AdministradorUsuarios admusuario=new AdministradorUsuarios();
				Usuario usuario=admusuario.darDeAltaUnUsuario(nombreDeUsuario, password, nombre, apellido,Integer.parseInt(dni), direccion,Integer.parseInt(numero), puerta, local, Integer.parseInt(telefono), email, fechaNacimiento, sex, Integer.parseInt(tipoDeUsuario));
	// System.out.println(usuario);
				request.setAttribute("usuario", usuario);
				request.getRequestDispatcher("/vistaUsuarioAgregado.jsp").forward(request ,response);
				
			} catch (
			Exception e) {
			response.sendError(500, "El Usuario no pudo ser ingresado en la base de datos.");
		}
		}
	
	
	
	@Override
	public void destroy() {
		// resource release
		super.destroy();
	}
}