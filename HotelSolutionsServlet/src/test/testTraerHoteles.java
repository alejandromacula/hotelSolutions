package test;

import dao.HotelDao;
import dao.LocalidadDao;
import datos.Hotel;

public class testTraerHoteles {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HotelDao hotel=new HotelDao();
	LocalidadDao lDao=new LocalidadDao();
	System.out.println(hotel.traerHotel(3));
	
	}

}
