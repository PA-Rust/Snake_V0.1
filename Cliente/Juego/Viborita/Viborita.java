package Viborita;

import java.util.ArrayList;

import Juego.Coordenada;
import Juego.Direccion;
import Juego.Entidad;
import Juego.PuntoSpawn;

public class Viborita extends Entidad {
	private ArrayList<Cuerpo> cuerpo;
	private float velocidad = 1;
	private EstadoViborita estado;
	
	/**
	 * Se genera una nueva viborita con el cuerpo
	 * ubicado en base a la direccion del punto
	 * de spawn.
	 * @param spawn
	 */
	public Viborita(PuntoSpawn spawn) {
		super(spawn.obtenerPosicion());
		cuerpo = new ArrayList<Cuerpo>();
		for (int i = 0; i < 4; ++i) {
			Coordenada coord = spawn.obtenerPosicion();
			if (spawn.getDireccion() == Direccion.abajo) {
				coord.desplazar(new Coordenada(0, -i));
			}
			if (spawn.getDireccion() == Direccion.arriba) {
				coord.desplazar(new Coordenada(0, i));
			}
			if (spawn.getDireccion() == Direccion.izquierda) {
				coord.desplazar(new Coordenada(i, 0));
			}
			if (spawn.getDireccion() == Direccion.derecha) {
				coord.desplazar(new Coordenada(-i, 0));
			}
			cuerpo.add(new Cuerpo(coord, spawn.getDireccion()));
		}
	}
	
	/**
	 * Se devuelve el objeto Cuerpo que representa
	 * la cabeza de la serpiente.
	 * @return Cuerpo 
	 */
	public Cuerpo getCabeza() {
		return cuerpo.get(0);
	}
	
	public ArrayList<Cuerpo> getCuerpo() {
		return cuerpo;
	}
	
	public void crecer() {
	}
	
	public void decrecer() {
	}
	
	public void desplazar() {
	}
	
	public void actualizar() {
	}
	
	public void dibujar() {
	}
	
	public void escucharTeclas() {
	}
	
	public void cambiarEstado(EstadoViborita estado) {
	}
	
	public void cambiarDireccion(Direccion direccion) {
	}
	
	@Override
	public void enColision(Entidad entidad) {

	}
	
	/**
	 * Clases estado de la viborita
	 */
	public abstract class EstadoViborita {
		private int timer;
		
		public abstract void actualizarEstado();
		public abstract void escucharTeclasEstado();
		public abstract void reaccionarAColisionEstado();
	}
	
	public class Normal extends EstadoViborita {
		public void actualizarEstado() {
			// no pasa nada
			actualizar();
		}
		public void reaccionarAColisionEstado() {
			// morir();
		}
		public void escucharTeclasEstado() {
			escucharTeclas();
		}
	}
	
	public class Invulnerable extends EstadoViborita {
		public void actualizarEstado() {
			// no pasa nada
			actualizar();
		}
		public void reaccionarAColisionEstado() {
			// no pasa nada wachin();
		}
		public void escucharTeclasEstado() {
			escucharTeclas();
		}
	}
}
