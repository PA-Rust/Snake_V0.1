package Item;

import Viborita.Viborita;

public class Manzana extends Item {
	@Override
	public void ejecutarAccion(Viborita viborita) {
		viborita.crecer();
	}

}
