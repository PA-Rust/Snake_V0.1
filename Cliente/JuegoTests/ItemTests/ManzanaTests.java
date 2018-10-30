package ItemTests;

import org.junit.Assert;
import org.junit.Test;

import Item.Item;
import Item.Manzana;
import Juego.Coordenada;
import Juego.Direccion;
import Juego.Entidad;
import Juego.PuntoSpawn;
import JuegoTest.Helpers.ViboritaStub;

public class ManzanaTests {
	@Test
	public void relojSeReseteaAlColisionarConEntidad() {
		Item manzanita = new Manzana();
		manzanita.enColision(new Entidad());
		Assert.assertEquals(0, manzanita.getReloj());
	}
	
	@Test
	public void llamaACrecerEnLaViboritaAlSerConsumida() {
		Item manzanita = new Manzana();
		PuntoSpawn ps = new PuntoSpawn(
			new Coordenada(0, 0),
			Direccion.derecha
		);
		ViboritaStub v = new ViboritaStub(ps);
		manzanita.enColision(v);
		Assert.assertEquals(true, v.crecida);
	}
}
