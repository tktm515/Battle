package Battle;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Player p = new Player();
		NPC n = new NPC();
		
		System.out.println("ニックネームを入てください。");
		try (Scanner scanner2 = new Scanner(System.in)) {
			String scanner = scanner2.nextLine();
			p.name = scanner;
			System.out.println(p.name + "さん、コマンドを駆使して敵を倒してください");
			
			//以下戦闘
			while(p.hp >= 0 || n.hp >= 0) {
				System.out.println("0:[攻撃] 1:[防御] 2:[回復]     HP" + p.hp);	
				
				int attackNum= scanner2.nextInt(3);
				int attackNPC = new Random().nextInt(3);
				//防御
				if(attackNum == 1) {
					if(attackNPC == 0) {
						System.out.println("敵の攻撃を防いだ！");
						continue;
					}else{
						p.block();}
					}
				if(attackNPC == 1) {
					if(attackNum == 0) {
					System.out.println("攻撃が防がれた！");
					continue;
				}else{
					n.block();}
				}
				//プレイヤー攻撃
				if(attackNum == 0) {
					p.attack(n);
					if(n.hp<=0) {
						System.out.println("You are Win");
						System.out.println("残りのHPは" + p.hp);
						break;}
					}
				
				//NPC攻撃
				if(attackNPC == 0) {n.attack(p);
				if(p.hp<=0) {
					System.out.println("Game Over!");
					break;}
				}
				
				//回復
				if(attackNum == 2) {p.heal();}
				if(attackNPC == 2) {n.heal();}
			}
		}
	}

}
