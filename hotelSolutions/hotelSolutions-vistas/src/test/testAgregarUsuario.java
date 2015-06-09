package test;

import java.util.Calendar;
import java.util.GregorianCalendar;





import dao.LocalidadDao;
import dao.TipoDeUsuarioDao;
import dao.UsuarioDao;
import datos.Localidad;
import datos.Usuario;
import datos.TipoDeUsuario;
import negocio.AdministradorUsuarios;


public class testAgregarUsuario {

	public static void main(String[] args) {

		TipoDeUsuarioDao tipoUsuarioDao = new TipoDeUsuarioDao();
		//System.out.println(tipoUsuarioDao.traerTipoUsuario(1));
		AdministradorUsuarios adm= new AdministradorUsuarios();
		LocalidadDao lDao= new LocalidadDao();
		
		adm.darDeAltaUnUsuario("admin","123456","Usuario","Admin", 37871698,
				"de la cruz", 365, "", lDao.traerLocalidad(1), 42255566,"alejandro_93_7@hotmail.com", new GregorianCalendar(1993, 12, 23), 'm',2);
		
	}
}
