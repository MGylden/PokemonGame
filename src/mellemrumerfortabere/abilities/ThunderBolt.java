package mellemrumerfortabere.abilities;

import mellemrumerfortabere.utils.Types;

public class ThunderBolt extends Ability {
	
	public ThunderBolt() {
		super(18, "Thunder Bolt", 17, Types.Electric);
	}

	@Override
	public void baseDamageAmplifier(int level) {
		for (int i = 0; i < level; i++) {
			this.baseDamage = this.baseDamage*0.23;
		}
		
	}

}
