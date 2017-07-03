package com.game;

public class Run {

	public static void main(String[] args) {
		ZhuzhuHero hero = new ZhuzhuHero();
		hero.name ="朱肖宇";
		hero.attackNum = 100;
		hero.bloodCount = 100;
		hero.level = 1;
		
		Weapon k = new Knife();
		
		Monster monster =new Monster();
		monster.name = "穆添";
		monster.bloodCount = 2000;
		monster.attackNum = 20;
		monster.level = 20;
		
		while(true) {
			hero.attack(monster,k);
			monster.attack(hero);
			if(hero.bloodCount<=0) {
				System.out.println("猪猪侠被怪兽打败了");
				break;
			}
			if(monster.bloodCount<=0) {
				System.out.println("猪猪侠战胜了怪兽");
				break;
			}
			try{
				Thread.sleep(1000);
			}
			catch (Exception e) {
				 System.out.println(e.getMessage());
			}
		}
	}

}
