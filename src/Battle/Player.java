package Battle;

import java.util.Random;

public class Player {
	
	String name;
	int hp = 20;
	
	public void attack(NPC n) {
		int point = new Random().nextInt(6) + 2;
		System.out.println("攻撃！" + point + "ダメージ与えた！");
		n.hp -= point;
	}
	
	public void block() {
		System.out.println(this.name + "は防御した");
	}
	
	public void heal() {
		int recover = new Random().nextInt(6) + 2;
		System.out.println(recover + "ポイント回復した");
		this.hp += recover;
	}

}
