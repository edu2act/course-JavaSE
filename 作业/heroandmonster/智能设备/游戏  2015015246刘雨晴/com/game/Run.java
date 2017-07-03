/*
 * 测试类
 * */


package com.game;

public class Run {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name="超人";
		hero.attackNum=100;
		hero.bloodCount=300;
		hero.level=1;
		
		Weapon k = new Knife();
		Recovery r = new Recovery();
		Defense d = new Defense();
		
		Monster monster = new Monster();
		monster.name="哥斯拉";
		monster.bloodCount=500;
		monster.attackNum=20;
		
		while(true){
			hero.attack(monster,k);
			monster.recoveryBloodConut(monster, r);
			monster.attack(hero);
			hero.recoveryBloodConut(hero, r);
			monster.attack(hero,d);
			monster.attack(hero);
			
			
			if(hero.bloodCount<=0){
				System.out.println("您输了，重来吧！");
				break;
			}else if(monster.bloodCount<=0){
				System.out.println("您赢了，继续冒险吧！");
				break;
			}
		}
		
		
	}

}
