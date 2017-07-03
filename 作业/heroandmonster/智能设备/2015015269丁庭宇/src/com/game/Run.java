package com.game;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero=new Hero();
		hero.name="超人";
		hero.attackNum=100;
		hero.bloodCount=100;
		hero.level=1;
		
		Weapon k=new Knife();
		
		Monster monster = new Monster();
		monster.name = "哥斯拉";
		monster.bloodCount=2000;
		monster.attackNum=20;
		monster.level=20;
		
		while(true){
			hero.attack(monster,k);
			monster.attack(hero);
			if(hero.bloodCount <= 0){
				System.out.println("你输了");
				break;
			}
			if(monster.bloodCount <= 0){
				System.out.println("你赢了");
				break;
			}
		}
		
		
	}

}
