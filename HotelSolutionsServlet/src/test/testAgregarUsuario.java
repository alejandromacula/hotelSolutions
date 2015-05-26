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
		
		adm.darDeAltaUnUsuario("martin123684","mar1234","martin","macario", 35855187,
				"sitio de montevideo", 150, "", lDao.traerLocalidad(1), 42251654,	"martin@gmail.com", new GregorianCalendar(1991, 6, 25), 'm',1);
		
	}
}
