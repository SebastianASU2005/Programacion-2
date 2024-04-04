package ClassesJuegoRol;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 11:08:56
 */
public class Mago extends BaseCharacter {

	private int wandLevel;

	public Mago(){

	}

	public Mago(int defende, int hp, int level, String name, int wandLevel,int damage) {
		super(defende, hp, level, name,damage);
		this.wandLevel = wandLevel;
	}

	public int getWandLevel() {
		return wandLevel;
	}

	public void setWandLevel(int wandLevel) {
		this.wandLevel = wandLevel;
	}

	@Override
	public int atacar() {
		int attackPoint=getDamage()+wandLevel;
		return attackPoint;
	}

	@Override
	public void defender(int hit) {
		int pointLost;
		if ((hit-getDefende())-5<=0){
			System.out.println("Daño bloqueado");
		}
		else{
			pointLost=hit-getDefende()-5;
			setHp(getHp()-pointLost);
			System.out.println("Golpe");
			System.out.println("Hp: "+getHp());
		}
	}
}