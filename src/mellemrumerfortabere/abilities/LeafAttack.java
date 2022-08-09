package mellemrumerfortabere.abilities;

import mellemrumerfortabere.utils.*;

public class LeafAttack extends Ability{
	
	public LeafAttack() {
		super(20, "Leaf Attack", 16, Types.Grass);
		}

	@Override
	public void baseDamageAmplifier(int level) {
		for (int i = 0; i < level; i++) {
			this.baseDamage = this.baseDamage*0.27;
		}
	}
	
}
