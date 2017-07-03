package com.game;

public class Run {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "妖刀姬";
		hero.attackNumber = 100;
		hero.bloodCount = 1000;
		hero.level = 1;
		
		Weapon k = new Knife();
		
		Monster monster = new Monster();
		monster.name = "九命猫";
		monster.bloodCount = 500;
		monster.level = 100;
		monster.attackNumber = 20;
		
		while(true){
			hero.attack(monster,k);
			monster.attack(hero);
			
			if(hero.bloodCount < 0){
				System.out.println("九命猫赢了");
				break;
			}
			if(monster.bloodCount < 0){
				System.out.println("妖刀姬赢了");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
