package com.game;

public class Run {
	
	public static void main(String[] args) {
		
		Hero hero=new Hero();
		hero.name="安琪拉";
		hero.attackNum=100;
		hero.bloodCount=300;
		hero.level=1;
		
		Weapon k=new Knife();
		
		Defense c=new Clock();
		
		
		Monster monster=new Monster();
		monster.name="太乙真人";
		monster.attackNum=30;
		monster.bloodCount=2000;
		monster.level=20;
		
		
		int bloodCount1=hero.bloodCount/2;
		
		if(hero.bloodCount>bloodCount1){
			hero.attack(hero,monster);
			monster.attack(monster,hero,k);
		}
		
		System.out.println("!!!");
		System.out.println("前方高能预警。");
		System.out.println(hero.name+"被攻击，防御斗篷被激发！");
		
		while(hero.bloodCount>0){
			
			
			if(hero.bloodCount>bloodCount1){
				hero.attack(hero,monster,c);
				monster.attack(monster,hero,k);
			}
			if(hero.bloodCount<=bloodCount1){
				break;
			}
		}
		
		System.out.println("!!!");
		System.out.println("前方高能预警。");
		System.out.println(monster.name+"发怒了，攻击值增加！");
			
		while(true){
			if(hero.bloodCount<=bloodCount1){
				hero.attack(hero,monster,c,10);
				monster.attack(monster,hero,k);
			}
			
			
			if(hero.bloodCount<=0){
				System.out.println("您输了，重来吧");
				break;
			}
			if(monster.bloodCount<=0){
				System.out.println("您打赢了，请继续");
				break;
			}
			
		}
		
	}
}
