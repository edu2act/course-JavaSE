package cn.game;

public class Run {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "超人";
		hero.attackNum=100;
		hero.bloodCount=100;
		hero.level=1;
		weapon k = new knife();
		
		Monster  monster = new Monster();
		monster.name="哥斯拉";
		monster.bloodCount=200;
		monster.attackNum=20;
		monster.level=20;
		
		while(true) {
			hero.attack(monster,k);
			monster.attack(hero);
			
			if(hero.bloodCount<=0) {
				System.out.println("英雄从新来过");
				break;
			}
			if(monster.bloodCount <= 0) {
				System.out.println("恭喜  怪兽挂掉");
				break;
			}
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
   