package test;

import dao.PartidoDao;

public class testTraerPartido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartidoDao pDao=new PartidoDao();
		//System.out.println(pDao.traerPartido(231));
		System.out.println(pDao.traerListaPartidos());
		
		
	}

}
