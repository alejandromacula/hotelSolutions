package datos;
import java.util.Set;
public class TipoDeUsuario {
	
	
	

	private int idTipoDeUsuario;
	private String privilegio;
	private Set <Usuario> usuarios;

	
	public TipoDeUsuario (){}

	public TipoDeUsuario(String privilegio) {

		
		this.privilegio = privilegio;
	 
	}

	

	public int getIdTipoDeUsuario() {
		return idTipoDeUsuario;
	}

	private void setIdTipoDeUsuario(int idTipoDeUsuario) {
		this.idTipoDeUsuario = idTipoDeUsuario;
	}

	public String getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "TipoDeUsuario [idTipoDeUsuario=" + idTipoDeUsuario
				+ ", privilegio=" + privilegio + ", usuarios=" + usuarios + "]";
	}


	
	
	

}
