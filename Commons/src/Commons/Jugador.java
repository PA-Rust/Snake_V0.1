package Commons;

public class Jugador {

	private String usuarioId;
	private String nombreDeUsuario;
	private String claveUsuario;
	private int partidasGanadas;
	private int puntajeAcumulado;
	
	public Jugador(String usuarioId, String nombreDeUsuario, String claveUsuario) {

		this.usuarioId = usuarioId;
		this.nombreDeUsuario = nombreDeUsuario;
		this.claveUsuario = claveUsuario;
	}

	public Jugador() {

		this.usuarioId = null;
		this.nombreDeUsuario = null;
		this.claveUsuario = null;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public static void main(String[] args) {

	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public int getPuntajeAcumulado() {
		return puntajeAcumulado;
	}

	public void setPuntajeAcumulado(int puntajeAcumulado) {
		this.puntajeAcumulado = puntajeAcumulado;
	}
	
}
