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


public class ModificarUsuarioController extends HttpServlet {
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
				
				String idUsuario = request.getParameter("idUsuario");
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
				
	System.out.println(nombreDeUsuario+password+nombre+apellido+dni+direccion+numero+puerta+telefono+email+diaNacimiento+mesNacimiento+anioNacimiento+sexo+tipoDeUsuario+localidad);		
				
	
				LocalidadDao loc = new LocalidadDao();
				Localidad local = loc.traerLocalidad(Integer.parseInt(localidad));
				
				GregorianCalendar fechaNacimiento = new GregorianCalendar(Integer.parseInt(anioNacimiento),(Integer.parseInt(mesNacimiento)-1),Integer.parseInt(diaNacimiento));
				
				char sex = sexo.charAt(0);
				
				TipoDeUsuarioDao tdusdao = new TipoDeUsuarioDao();
				TipoDeUsuario tdus = tdusdao.traerTipoUsuario(Integer.parseInt(tipoDeUsuario));
				
	
	 System.out.println(nombreDeUsuario+password+nombre+apellido+dni+direccion+numero+puerta+telefono+email+fechaNacimiento+sexo+tipoDeUsuario+localidad);

	 			AdministradorUsuarios admusuario=new AdministradorUsuarios();
 				Usuario usuario=admusuario.traerUsuario(Integer.parseInt(idUsuario));
 			
 				System.out.println(usuario);
				
 				usuario.setNombreDeUsuario(nombreDeUsuario);
				usuario.setPassword(password);
				usuario.setNombre(nombre);
				usuario.setApellido(apellido);
				usuario.setDni(Integer.parseInt(dni));
				usuario.setDireccion(direccion);
				usuario.setNumero(Integer.parseInt(numero));
				usuario.setPuerta(puerta);
				usuario.setLocalidad(local);
				usuario.setTelefono(Integer.parseInt(telefono));
				usuario.setEmail(email);
				usuario.setFechaNacimiento(fechaNacimiento);
				usuario.setSexo(sex);
				usuario.setTipoDeUsuario(tdus);		
				
				System.out.println(usuario);
				
				UsuarioDao usdao=new UsuarioDao();
				Usuario usuarioModificado=usdao.modificarUsuario(usuario);
	    System.out.println(usuarioModificado);
				
	// System.out.println(usuario);
				
				request.setAttribute("usuario", usuarioModificado);
				System.out.println("usuario modificado");
				request.getRequestDispatcher("/vistaUsuarioModificado.jsp").forward(request ,response);
				
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
