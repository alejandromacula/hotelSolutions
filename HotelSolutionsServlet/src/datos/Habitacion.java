package datos;

public class Habitacion {

	
	private int idHabitacion;
	private int piso;
	private int nroHab;
	private boolean estado;
	private boolean ocupada;
	private String observaciones;
	private Hotel hotel;
	private TipoDeHabitacion tipoDeHabitacion;
	
	
	public Habitacion() {}
	
	
	public Habitacion(int piso, int nroHab, boolean estado,
			boolean ocupada, String observaciones, TipoDeHabitacion tipoDeHabitacion, Hotel hotel) {

		this.piso = piso;
		this.nroHab = nroHab;
		this.estado = estado;
		this.ocupada = ocupada;
		this.observaciones = observaciones;
		this.hotel=hotel;
		this.tipoDeHabitacion=tipoDeHabitacion;
	}
	
	
	
	public int getIdHabitacion() {
		return idHabitacion;
	}
	private void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getNroHab() {
		return nroHab;
	}
	public void setNroHab(int nroHab) {
		this.nroHab = nroHab;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	

	public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	@Override
	public String toString() {
		return "Habitacion [idHabitacion=" + idHabitacion + ", piso=" + piso
				+ ", nroHab=" + nroHab + ", estado=" + estado + ", ocupada="
				+ ocupada + ", observaciones=" + observaciones + ", hotel="
				+ hotel + ", tipoDeHabitacion=" + tipoDeHabitacion + "]";
	}


	public TipoDeHabitacion getTipoDeHabitacion() {
		return tipoDeHabitacion;
	}


	public void setTipoDeHabitacion(TipoDeHabitacion tipoDeHabitacion) {
		this.tipoDeHabitacion = tipoDeHabitacion;
	}

	
	
	
}
