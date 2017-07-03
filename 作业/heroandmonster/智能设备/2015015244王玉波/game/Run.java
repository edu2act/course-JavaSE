package com.game;

public class Run {
	
	public static void main(String[] args) {
		
		Hero hero=new Hero();
		hero.name="超人";
		hero.attackNum=100;
		hero.bloodCount=100;
		hero.level=1;
		
		Weapon k=new Knife();
		
		
		Monster monster=new Monster();
		monster.name="哥斯拉";
		monster.attackNum=20;
		monster.bloodCount=2000;
		monster.level=20;
		
		while(true){
			hero.attack(monster,k);
			monster.attack(hero);
			hero.defences(hero);
			monster.magic(hero);
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
