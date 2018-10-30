package Juego;

import java.util.ArrayList;

import Viborita.Viborita;

public class Mapa {
	
	private ArrayList<Viborita> viboritas;
	private ArrayList<Obstaculo> obstaculos;
	private int ancho;
	private int alto;
	private Entidad[][] grilla;
	private PuntoSpawn[] puntosSpawn;
	/**cada punto de Spawn son los puntos de incio para las
	 * vivoras y cada una de ellas debe tener una direccion
	**/
	public Mapa() {
		this.ancho = 30;
		this.alto = 30;
		
		grilla = new Entidad[ancho][alto];
		puntosSpawn = new PuntoSpawn[] {
			new PuntoSpawn(
					new Coordenada(5, alto / 2),
					Direccion.derecha
			),
			new PuntoSpawn(
					new Coordenada(ancho - 6, alto / 2),
					Direccion.izquierda
			),
		};
		viboritas = new ArrayList<Viborita>();
		viboritas.add(new Viborita(puntosSpawn[0]));
		viboritas.add(new Viborita(puntosSpawn[1]));
		for (Viborita v: viboritas) {
			grilla[v.obtenerPosicion().getX()][v.obtenerPosicion().getY()] =
				v;
		}
	}
	
	public void chequearColisiones() {
		
	}
	
	public void actualizar() {
	}
	
	public void dibujar() {
	}
	
	public Entidad obtenerEntidad(Coordenada posicion) {
		return grilla[posicion.getX()][posicion.getY()];
	}
}
