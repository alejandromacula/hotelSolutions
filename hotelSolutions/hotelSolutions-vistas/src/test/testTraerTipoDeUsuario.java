package test;

import dao.TipoDeUsuarioDao;

public class testTraerTipoDeUsuario {

	public static void main(String[] args) {
		
		
		TipoDeUsuarioDao tipoDeUsuarioDao= new TipoDeUsuarioDao();
		System.out.println(tipoDeUsuarioDao.traerTipoUsuario(1));

	}

}
