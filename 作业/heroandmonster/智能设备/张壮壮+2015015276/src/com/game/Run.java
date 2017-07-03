package com.game;

public class Run {
	public static void main(String []args){
		Hero hero = new Hero();
		hero.name = "小黑";
		hero.attackNum = 100;
		hero.bloodCount = 100;
		hero.level = 1;
		
		
		Weapon k = new knife();
		
		
		Monster monster = new Monster();
		monster.name = "小白";
		monster.bloodCount = 200;
		monster.attackNum = 20;
		monster.level = 20;
		
		while(true){
			hero.attack(monster,k);
			monster.attack(hero);
			if(hero.bloodCount<=0){
				System.out.println("小黑拜拜");
				break;
			}
			if(monster.bloodCount<=0){
				System.out.println("小白拜拜");
				break;
			}
		}
	}
}
