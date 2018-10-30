package Juego;

public class PuntoSpawn extends Entidad {
	private Direccion direccion;
	
	public PuntoSpawn(Coordenada coord, Direccion direccion) {
		super(coord);
		this.direccion = direccion;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
}
