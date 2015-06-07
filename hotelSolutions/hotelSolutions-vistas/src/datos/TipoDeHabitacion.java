package datos;

import java.util.Set;

public class TipoDeHabitacion {
	
	
	private int idTipoDeHabitacion;
	private String tipo;
	private Set <Habitacion> habitaciones;

	
	public TipoDeHabitacion (){}

	public TipoDeHabitacion(String tipo) {

		this.tipo=tipo;
	 
	}

	public int getIdTipoDeHabitacion() {
		return idTipoDeHabitacion;
	}

	private void setIdTipoDeHabitacion(int idTipoDeHabitacion) {
		this.idTipoDeHabitacion = idTipoDeHabitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Set<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		return "TipoDeHabitacion [idTipoDeHabitacion=" + idTipoDeHabitacion
				+ ", tipo=" + tipo + ", habitaciones=" + habitaciones + "]";
	}
	
	
	
	
	

}
