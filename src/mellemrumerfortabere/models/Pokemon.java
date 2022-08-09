package mellemrumerfortabere.models;

import mellemrumerfortabere.utils.*;
import mellemrumerfortabere.abilities.*;

public abstract class Pokemon {
	String Name;
	Stats Stats;
	Ability AbilityOne;
	Ability AbilityTwo;
	Ability AbilityThree;
	Ability AbilityFour;
	
	public Pokemon(String name, Stats stats, Ability abilityOne, Ability abilityTwo,
			Ability abilityThree, Ability abilityFour) {
		super();
		Name = name;
		Stats = stats;
		AbilityOne = abilityOne;
		AbilityTwo = abilityTwo;
		AbilityThree = abilityThree;
		AbilityFour = abilityFour;
	}
	
	
}
