package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import dao.TipoDeUsuarioDao;
import dao.UsuarioDao;
import datos.Usuario;
import datos.TipoDeUsuario;
import negocio.AdministradorUsuarios;

public class testMostrarUsuario {

	public static void main(String[] args) {
			
		
		AdministradorUsuarios adm=new AdministradorUsuarios();
		//System.out.println(adm.traerUsuario("aa", "aa"));
		System.out.println(adm.traerUsuario("aa"));
		
		//System.out.println(adm.traerUsuario(1));
		
	}
}
