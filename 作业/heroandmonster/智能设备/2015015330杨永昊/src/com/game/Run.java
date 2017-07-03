package com.game;

public class Run {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "凹凸曼";
		hero.attackNumber = 100;
		hero.bloodCount = 100;
		hero.level = 1;
		
		Weapon k = new Knife();
		
		Monster monster = new Monster();
		monster.name = "哥斯拉";
		monster.bloodCount = 2000;
		monster.level = 100;
		monster.attackNumber = 20;
		
		while(true){
			hero.attack(monster,k);
			monster.attack(hero);
			
			if(hero.bloodCount <= 0){
				System.out.println("凹凸曼你不是哥斯拉的对手。");
				break;
			}
			if(monster.bloodCount <= 0){
				System.out.println("哥斯拉你不是凹凸曼的对手。");
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
