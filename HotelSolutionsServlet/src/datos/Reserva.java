package datos;

import java.util.GregorianCalendar;
import funciones.Funciones;

public class Reserva {
	
	
	private int idReserva;
	private float senia;
	private float precioFinal;
	private GregorianCalendar desde;
	private GregorianCalendar hasta;
	private boolean confirmada;
	private GregorianCalendar fecha;
	private String observaciones;
	private Habitacion habitacion;
	private Usuario usuario;
	
	public Reserva(){}
	
	public Reserva(float senia, float precioFinal, GregorianCalendar desde,
			GregorianCalendar hasta, boolean confirmada,
			GregorianCalendar fecha, String observaciones, Habitacion habitacion, Usuario usuario) {
	
		this.senia = senia;
		this.precioFinal = precioFinal;
		this.desde = desde;
		this.hasta = hasta;
		this.confirmada = confirmada;
		this.fecha = fecha;
		this.observaciones = observaciones;
		this.habitacion=habitacion;
		this.usuario=usuario;
	}



	public int getIdReserva() {
		return idReserva;
	}



	private void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}



	public float getSenia() {
		return senia;
	}



	public void setSenia(float senia) {
		this.senia = senia;
	}



	public float getPrecioFinal() {
		return precioFinal;
	}



	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}



	public GregorianCalendar getDesde() {
		return desde;
	}



	public void setDesde(GregorianCalendar desde) {
		this.desde = desde;
	}



	public GregorianCalendar getHasta() {
		return hasta;
	}



	public void setHasta(GregorianCalendar hasta) {
		this.hasta = hasta;
	}



	public boolean isConfirmada() {
		return confirmada;
	}



	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}



	public GregorianCalendar getFecha() {
		return fecha;
	}



	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	

	@Override
	public String toString() {
		return "\n\nReserva [idReserva=" + idReserva + ", senia=" + senia
				+ ", precioFinal=" + precioFinal + ", desde=" + Funciones.traerFechaCorta(desde)
				+ ", hasta=" + Funciones.traerFechaCorta(hasta) + ", confirmada=" + confirmada
				+ ", fecha=" + Funciones.traerFechaCorta(fecha) + ", observaciones=" + observaciones
				+ "\n, habitacion=" + habitacion + "\n, usuario=" + usuario + "]";
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
  	
	
	
	
	

}
