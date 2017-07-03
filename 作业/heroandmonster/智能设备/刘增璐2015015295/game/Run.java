package com.game;

public class Run {

	public static void main(String[] args) {

		Hero hero = new Hero();
		hero.setPerson("超人", 500, 200, 10);

		Weapon k = new Knife();

		Monster monster = new Monster();
		monster.setPerson("哥斯拉", 400, 30, 10);

		MonsterBoss monsterBoss = new MonsterBoss();
		monsterBoss.setPerson("哥斯拉之父", 700, 100, 20);
		while (true) {

			if(monster.bloodCount > 0)
				hero.attack(monster);
			if(monsterBoss.bloodCount > 0){
				hero.attack(monsterBoss, k);
				hero.bigAttack(monsterBoss);
			}
			
			if (monsterBoss.bloodCount <= 0 && monster.bloodCount <= 0) {
				System.out.println("你获胜了");
				break;
			}
			if(hero.bloodCount > 0 && monster.bloodCount > 0)
				monster.attack(hero);
			if(hero.bloodCount > 0 && monsterBoss.bloodCount > 0)
				monsterBoss.attack(hero);
			
			if (hero.bloodCount <= 0) {
				System.out.println("输 了！");
				break;
			}

		}

	}// 主函数

}// 大括号
