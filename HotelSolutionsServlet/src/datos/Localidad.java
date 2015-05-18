package datos;

public class Localidad {
	
	private int idLocalidad;
	private String nombre;
	private Partido partido;
	
	
	public Localidad (){}
	
	public Localidad(String nombre, Partido partido) {
	
		this.nombre = nombre;
		this.partido=partido;
	}


	public int getIdLocalidad() {
		return idLocalidad;
	}


	private void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", nombre=" + nombre
				+ ", partido=" + partido + "]\n";
	}
	
		

}
