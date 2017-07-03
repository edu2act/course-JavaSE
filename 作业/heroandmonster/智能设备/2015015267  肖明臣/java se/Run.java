package com.game;

public class Run {
	public static void main(String[] args){
		Hero hero=new Hero();
		hero.name="我很厉害";
		hero.attackNum=100;
		hero.bloodCount=100;
		hero.level=1;
		
		Monster monster=new Monster();
		monster.name="你不行";
		monster.bloodCount=2000;
		monster.attackNum=20;
		monster.level=25;
		
		
		Weapon k = new Knife();
		while(true){
			hero.attack(monster,k);
			if(hero.bloodCount<=0){
				System.out.println("你完蛋了");
				break;
			}
			if(monster.bloodCount<=0){
				System.out.println("你赢了");
				break;
			}
//			Thread.sleep();
		}
	}
}
