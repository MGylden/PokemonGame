package mellemrumerfortabere.models;

import mellemrumerfortabere.abilities.*;
import mellemrumerfortabere.abilities.WaterBlast;
import mellemrumerfortabere.utils.*;

public class Squirtle extends Pokemon {

	public Squirtle() {
		super("Squirtle", new Stats(100, 100, 100, 100), new WaterBlast(), new WaterBlast(), new WaterBlast(), new WaterBlast());
	}

}
