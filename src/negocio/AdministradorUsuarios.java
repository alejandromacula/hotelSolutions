package negocio;

import java.util.GregorianCalendar;

import dao.TipoDeUsuarioDao;
import datos.Localidad;
import datos.TipoDeUsuario;
import dao.UsuarioDao;
import datos.Usuario;

public class AdministradorUsuarios {
		
		UsuarioDao usuarioDao=new UsuarioDao();
		
		
		public Usuario darDeAltaUnUsuario(String nombreDeUsuario, String password, String nombre,
				String apellido, int dni, String direccion, int numero,
				String puerta,Localidad localidad, int telefono, String email,
				GregorianCalendar fechaNacimiento, char sexo,
				int idTipoDeUsuario){

			TipoDeUsuarioDao tipoDeUsuarioDao=new TipoDeUsuarioDao();		
			UsuarioDao usuarioDao=new UsuarioDao();

			 Usuario u=new Usuario(nombreDeUsuario, password, nombre, apellido, dni, direccion,
					 numero, puerta, localidad, telefono, email, fechaNacimiento, sexo, tipoDeUsuarioDao.traerTipoUsuario(idTipoDeUsuario));
		     
			 usuarioDao.altaUsuario(u);
			 
			return u;
		}
		
		
		
		public Usuario traerUsuario(String nombreUsuario, String password){
			
			
			return usuarioDao.traerUsuario(nombreUsuario, password);
		}

	
		public Usuario traerUsuario(int idUsuario){
			
			
			return usuarioDao.traerUsuario(idUsuario);
		}
	

}
