package JuegoTest.Helpers;

import Juego.PuntoSpawn;
import Viborita.Viborita;

public class ViboritaStub extends Viborita {
	public ViboritaStub(PuntoSpawn ps) {
		super(ps);
	}
	
	public boolean crecida = false;

	public void crecer() {
		this.crecida = true;
	}
}
