package mellemrumerfortabere.models;

import mellemrumerfortabere.abilities.*;
import mellemrumerfortabere.utils.*;

public class Charmander extends Pokemon {
	
	public Charmander() {
		super("Charmander", new Stats(100, 100, 100, 100), new Flamethrower(),new Flamethrower(), new Flamethrower(), new Flamethrower());
	}

}
