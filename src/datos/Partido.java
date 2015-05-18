package datos;

public class Partido {

	private int idPartido;
	private String nombre;
	private Provincia provincia;
	
	public Partido(){}

	public Partido(String nombre, Provincia provincia) {
		
		this.nombre = nombre;
	}

	public int getIdPartido() {
		return idPartido;
	}

	private void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", nombre=" + nombre
				+ ", provincia=" + provincia + "]";
	}
	
	
	
	
}
