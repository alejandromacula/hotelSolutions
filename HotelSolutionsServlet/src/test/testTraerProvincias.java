package test;

import dao.ProvinciaDao;

public class testTraerProvincias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProvinciaDao pDao=new ProvinciaDao();
		//System.out.println(pDao.traerProvincia(1)); 
		System.out.println(pDao.traerListaProvincias()); 
		
	}

}
