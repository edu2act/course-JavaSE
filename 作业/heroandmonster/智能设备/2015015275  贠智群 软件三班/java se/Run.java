package com.game;

public class Run {
	public static void main(String[] args){
		Hero hero=new Hero();
		hero.name="上官狗剩";
		hero.attackNum=100;
		hero.bloodCount=100;
		hero.level=1;
		
		Monster monster=new Monster();
		monster.name="独孤铁柱";
		monster.bloodCount=2000;
		monster.attackNum=20;
		monster.level=25;
		
		
		Weapon k = new Knife();
		while(true){
			hero.attack(monster,k);
			if(hero.bloodCount<=0){
				System.out.println("大侠，请从新来过");
				break;
			}
			if(monster.bloodCount<=0){
				System.out.println("您成功凌辱了一头小怪兽");
				break;
			}
//			Thread.sleep();
		}
	}
}
