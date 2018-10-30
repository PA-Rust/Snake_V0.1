package ViboritaTests;

import org.junit.Assert;
import org.junit.Test;

import Juego.Coordenada;
import Juego.Direccion;
import Juego.PuntoSpawn;
import Viborita.Cuerpo;
import Viborita.Viborita;

public class ViboritaTest {
	@Test
	public void viboritaSeCreaConPosicionCorrectaConParam() {
		PuntoSpawn ps = new PuntoSpawn(
			new Coordenada(5, 5),
			Direccion.derecha
		);
		Viborita v = new Viborita(ps);
		Assert.assertEquals(ps.obtenerPosicion(), v.obtenerPosicion());
	}
	
	@Test
	public void cuerpoDeViboritaSeCreaConPosicionYDireccionCorrecta() {
		PuntoSpawn ps = new PuntoSpawn(
			new Coordenada(5, 5),
			Direccion.derecha
		);
		Viborita v = new Viborita(ps);
		for (Cuerpo c: v.getCuerpo()) {
			Assert.assertEquals(c.getDireccion(), Direccion.derecha);
		}
	}
	
	@Test
	public void cabezaSeUbicaEnLaPosicionDelSpawn() {
		PuntoSpawn ps = new PuntoSpawn(
			new Coordenada(5, 5),
			Direccion.derecha
		);
		Viborita v = new Viborita(ps);
		Assert.assertEquals(v.getCabeza().obtenerPosicion(), ps.obtenerPosicion());
	}
	
	
}
