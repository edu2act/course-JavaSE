package Paly;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero= new Hero();
		hero.name="小垃圾";
		hero.blooCount=10000;
		hero.attackNum=2;
		hero.level=1;
		
		Monster monster= new Monster();
		monster.name="垃圾";
		monster.attackNum=1;
		monster.blooCount=10000;
		monster.level=20;
		knife k=new knife();
		while(true) {
			hero.attack(monster,k);
			monster.attack(hero);
			if(hero.blooCount <=0) {
				System.out.println("你输了，再来一局吧！");
				break;
			}
			if(monster.blooCount  <=0) {
				System.out.println("你赢了，英雄！");
				break;
			}
		}
		
				

	}

}
