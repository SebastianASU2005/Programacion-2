package ClassesJuegoRol;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 11:08:55
 */
public class Guerrero extends BaseCharacter {

	private int swordLevel;

	public Guerrero(){

	}

	public Guerrero(int defende, int hp, int level, String name, int swordLevel,int damage) {
		super(defende, hp, level, name,damage);
		this.swordLevel = swordLevel;
	}

	public int getSwordLevel() {
		return swordLevel;
	}

	public void setSwordLevel(int swordLevel) {
		this.swordLevel = swordLevel;
	}


	@Override
	public int atacar() {
		int attackPoint=getDamage()+5+swordLevel;
		return attackPoint;
	}

	@Override
	public void defender(int hit) {
		int pointLost;
		if (hit-getDefende()<=0){
			System.out.println("Daño bloqueado");
		}
		else{
			pointLost=hit-getDefende();
			setHp(getHp()-pointLost);
			System.out.println("Golpe");
			System.out.println("Hp: "+getHp());
		}
	}
}