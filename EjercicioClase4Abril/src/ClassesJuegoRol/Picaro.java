package ClassesJuegoRol;

/**
 * @author astud
 * @version 1.0
 * @created 04-abr.-2024 11:08:56
 */
public class Picaro extends BaseCharacter {

	private int dageLevel;

	public Picaro(){

	}

	public Picaro(int defende, int hp, int level, String name, int dageLevel,int damage) {
		super(defende, hp, level, name,damage);
		this.dageLevel = dageLevel;
	}

	@Override
	public int atacar() {
		int attackPoint=getDamage()+2+dageLevel;
		return attackPoint;
	}

	@Override
	public void defender(int hit) {
		int pointLost;
		if ((hit-getDefende())-2<=0){
			System.out.println("Daño bloqueado");
		}
		else{
			pointLost=hit-getDefende()-2;
			setHp(getHp()-pointLost);
			System.out.println("Golpe");
			System.out.println("Hp: "+getHp());
		}
	}
}