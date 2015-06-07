package test;

import dao.LocalidadDao;

public class testTraerLocalidades {

	public static void main(String[] args) {
	
	
	LocalidadDao lDao=new LocalidadDao();
	System.out.println(lDao.traerLocalidad(1));
	//System.out.println(lDao.traerListaLocalidades());
	
	}

}