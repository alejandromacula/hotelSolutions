package datos;

public class Hotel {
	
	
	private int idHotel;
	private String nombre;
	private String razonSocial;
	private int cuit;
	private int estrellas;
	private String direccion;
	private int numero;
	private String puerta;
	private int telefono;
	private String email;
	private Localidad localidad;
	//private int idUsuario;               // los usuarios van a ser agregador por algun admin unicamente
										   //para certificar que es un comercio valido
	
	
	
	public Hotel(){}

	
	public Hotel(String nombre, String razonSocial, int cuit, int estrellas,
			String direccion, int numero, String puerta, Localidad localidad, int telefono,
			String email) {
		
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.estrellas = estrellas;
		this.direccion = direccion;
		this.numero = numero;
		this.puerta = puerta;
		this.telefono = telefono;
		this.email = email;
		this.setLocalidad(localidad);
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}

	
	
	public void setEmail(String email) {
		this.email = email;
	}



	public int getIdHotel() {
		return idHotel;
	}



	private void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRazonSocial() {
		return razonSocial;
	}



	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}



	public int getCuit() {
		return cuit;
	}



	public void setCuit(int cuit) {
		this.cuit = cuit;
	}



	public int getEstrellas() {
		return estrellas;
	}



	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getPuerta() {
		return puerta;
	}



	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}


	public Localidad getLocalidad() {
		return localidad;
	}


	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}


	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nombre=" + nombre
				+ ", razonSocial=" + razonSocial + ", cuit=" + cuit
				+ ", estrellas=" + estrellas + "\n, direccion=" + direccion
				+ ", numero=" + numero + ", puerta=" + puerta + ", localidad=" + localidad+ "\n, telefono="
				+ telefono + ", email=" + email 
				+ "]\n";
	}	
	
	

}
