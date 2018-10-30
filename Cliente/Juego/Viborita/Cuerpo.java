package Viborita;

import Juego.Coordenada;
import Juego.Direccion;
import Juego.Entidad;

public class Cuerpo extends Entidad {
	private Direccion direccion;
	
	public Cuerpo(Coordenada posicion) {
		super(posicion);
		this.direccion = Direccion.izquierda;
	}
	
	public Cuerpo(Coordenada posicion, Direccion direccion) {
		super(posicion);
		this.direccion = direccion;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
