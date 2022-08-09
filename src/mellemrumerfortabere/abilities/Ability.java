package mellemrumerfortabere.abilities;

import mellemrumerfortabere.utils.Types;

public abstract class Ability {
	int charges;
	String name;
	double baseDamage;
	Types type;

	public Ability(int charges, String name, double baseDamage, Types type) {
		super();
		this.charges = charges;
		this.name = name;
		this.baseDamage = baseDamage;
		this.type = type;
	}

	public abstract void baseDamageAmplifier(int level);
}
