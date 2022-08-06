package mellemrumerfortabere.abilities;

import java.util.Iterator;

import mellemrumerfortabere.utils.Types;

public class WaterBlast extends Ability{

	public WaterBlast() {
		super(17, "Water Blast", 15, Types.Water);		
	}

	@Override
	public void baseDamageAmplifier(int level) {
		for (int i = 0; i <= level; i++) {
			this.baseDamage = baseDamage*0.25;
		}
	}
	

}
