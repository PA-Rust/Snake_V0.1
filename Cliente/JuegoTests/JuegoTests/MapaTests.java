package JuegoTests;

import org.junit.Assert;
import org.junit.Test;

import Juego.Coordenada;
import Juego.Mapa;
import Viborita.Viborita;

public class MapaTests {
	@Test
	public void obtenerEntidadEnUnLugarVacioDevuelveNull() {
		Mapa m = new Mapa();
		Coordenada coord = new Coordenada(15, 15);
		Assert.assertEquals(m.obtenerEntidad(coord), null);
	}
	
	@Test
	public void obtenerEntidadEnUnLugarOcupadoDevuelveLaEntidad() {
		Mapa m = new Mapa();
		// Tenemos hardcodeado que ahi deberia haber una viborita.
		Coordenada coord = new Coordenada(5, 15);
		Assert.assertEquals(true, m.obtenerEntidad(coord) instanceof Viborita);
	}
}
