package mellemrumerfortabere.utils;

public class Stats {

	private int health;
	private int attack;
	private int defense;
	private int speed;
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Stats(int health, int attack, int defense, int speed) {
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
	}
}
