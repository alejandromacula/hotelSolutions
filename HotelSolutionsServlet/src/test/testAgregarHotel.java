package test;

import dao.HotelDao;
import dao.LocalidadDao;
import datos.Hotel;

public class testAgregarHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelDao hotel=new HotelDao();
		LocalidadDao lDao=new LocalidadDao();
		hotel.altaHotel(new Hotel("luna morena", "luna morena", 1234567, 2, "cale 33", 241,"",
		lDao.traerLocalidad(1), 522222, "hotellunamorena@live.com"));
		
		
	
	}

}
