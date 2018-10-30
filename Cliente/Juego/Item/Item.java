package Item;

import Juego.Entidad;
import Viborita.Viborita;

public abstract class Item extends Entidad {
	private int reloj;
	
	public Item() {
		reloj = 5000;
	}
	
	public Item(int reloj) {
		this.reloj = reloj;
	}
	
	public int getReloj() {
		return reloj;
	}
	
	public void setReloj(int tiempo) {
		reloj = tiempo;
	}
	
	@Override
	public void enColision(Entidad entidad) {
		reloj = 0;
		if (entidad instanceof Viborita) {
			Viborita viborita = (Viborita)entidad;
			ejecutarAccion(viborita);
		}
	}
	
	public abstract void ejecutarAccion(Viborita viborita);
}
