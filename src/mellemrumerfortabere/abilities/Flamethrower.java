package mellemrumerfortabere.abilities;

import java.util.Iterator;

import mellemrumerfortabere.utils.*;

public class Flamethrower extends Ability{
	
	public Flamethrower() {
		super(14,"Flamethrower", 25, Types.Fire);
		
	}

	@Override
	public void baseDamageAmplifier(int level) {
		for (int i = 0; i < level; i++) {
			this.baseDamage = this.baseDamage*0.28;
		}
		
	}

}
