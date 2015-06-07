package controladores;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.Usuario;
import negocio.AdministradorUsuarios;

	public class ControladorMostrarUsuario extends HttpServlet {
		
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
				response.setContentType( "text/html;charset=UTF-8" );
			
	try {
			String nombreDeUsuario =  request.getParameter( "nombreDeUsuario" );
			String password =  request.getParameter( "password" );
				AdministradorUsuarios admusuario=new AdministradorUsuarios();
				Usuario usuario=admusuario.traerUsuario( nombreDeUsuario, password );
				response.setStatus(200);
				
				PrintWriter salida = response.getWriter();
					salida.println( "" );
					salida.println( "<!DOCTYPE 4.01 Transitional//EN\">" );
					salida.println( "<HTML>" ); salida.println( " <HEAD>" );
					salida.println( " <TITLE>Hotel Solutions</TITLE>" );
					salida.println( " </HEAD>" );
					salida.println( " <BODY>" );
					salida.println( " Apellido: " +usuario.getApellido()+"<BR>" );
					salida.println( " Nombre : " +usuario.getNombre()+"<BR>" );
					salida.println( " DNI : " +usuario.getDni()+"<BR>" );
					salida.println( " ID : " +usuario.getIdUsuario()+"<BR>" );
					salida.println( " <A href=\"/HotelSolutionsServlet/Usuario.html\">Volver...</A>" );
					salida.println( " </BODY>" );
					salida.println( "</HTML>" );
		}
					catch (Exception e) {
							response.sendError(500, "El Usuario Ingresado no existe en la base de datos." );
						}
					}
				}