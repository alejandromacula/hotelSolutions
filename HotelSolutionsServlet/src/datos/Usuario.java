package datos;

import java.util.GregorianCalendar;
import java.util.Set;
import funciones.Funciones;

public class Usuario {
	  
	  private int idUsuario;
	  private String nombreDeUsuario;
	  private String password;
	  private String nombre;
	  private String apellido;
	  private  int dni;
	  private String direccion;
	  private int numero;
	  private String puerta;
	  private int telefono;
	  private String email;
	  private GregorianCalendar fechaNacimiento;
	  private char sexo;	  
	  private TipoDeUsuario tipoDeUsuario;
	  private Localidad localidad;
	 
	  
	  public Usuario() {}

	  

	  public Usuario(String nombreDeUsuario, String password, String nombre,
			String apellido, int dni, String direccion, int numero,
			String puerta, Localidad localidad, int telefono, String email,
			GregorianCalendar fechaNacimiento, char sexo,
			TipoDeUsuario tipoDeUsuario) {
		
		this.nombreDeUsuario = nombreDeUsuario;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.numero = numero;
		this.puerta = puerta;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.tipoDeUsuario = tipoDeUsuario;
		this.setLocalidad(localidad);
	  }

	

	public int getIdUsuario() {
		return idUsuario;
	}



	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}



	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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



	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
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


	
	public TipoDeUsuario getTipoDeUsuario() {
		return tipoDeUsuario;
	}



	public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}



	public Localidad getLocalidad() {
		return localidad;
	}



	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}



	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreDeUsuario="
				+ nombreDeUsuario + ", password=" + password + ", nombre="
				+ nombre + ", apellido=" + apellido + "\n, dni=" + dni
				+ ", direccion=" + direccion + ", numero=" + numero
				+ ", puerta=" + puerta + ", telefono=" + telefono + "\n, email="
				+ email + ", fechaNacimiento=" + Funciones.traerFechaCorta(fechaNacimiento) + ", sexo="
				+ sexo + "\n, tipoDeUsuario=" + tipoDeUsuario + ", localidad="
				+ localidad + "]\n";
	}




	

	  
	  

}
