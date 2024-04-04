package ClassesJuegoRol;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 11:08:52
 */
public abstract class BaseCharacter implements Character {

	private int defende;
	private int hp;
	private int level;
	private String name;
	private int damage;

	public BaseCharacter(){

	}

	public BaseCharacter(int defende, int hp, int level, String name,int damage) {
		this.defende = defende;
		this.hp = hp;
		this.level = level;
		this.name = name;
		this.damage=damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefende() {
		return defende;
	}

	public void setDefende(int defende) {
		this.defende = defende;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}