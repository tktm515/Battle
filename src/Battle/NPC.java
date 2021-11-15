package Battle;

import java.util.Random;

public class NPC {
int hp = 20;
	
	public void attack(Player p) {
		int point = new Random().nextInt(6) + 2;
		System.out.println("敵から" + point + "ダメージをくらった！");
		p.hp -= point;
	}
	
	public void block() {
		System.out.println("敵は防御している");
	}
	
	public void heal() {
		int recover = new Random().nextInt(6) + 2;
		System.out.println("敵が" + recover + "ポイント回復した");
		this.hp += recover;
	}

}
