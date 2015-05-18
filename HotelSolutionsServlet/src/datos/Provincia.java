package datos;

public class Provincia {
	
	private int idProvincia;
	private String nombre;
	
	
	public Provincia(){}


	public Provincia(String nombre) {
		
		this.nombre = nombre;
	}


	public int getIdProvincia() {
		return idProvincia;
	}


	private void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", nombre=" + nombre
				+ "]";
	}
	
	
	
	

}
