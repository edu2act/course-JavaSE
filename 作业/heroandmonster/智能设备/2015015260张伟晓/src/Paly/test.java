package Paly;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero= new Hero();
		hero.name="崔庆伟";
		hero.blooCount=1000;
		hero.attackNum=2;
		hero.lavel=1;
		
		Monster monster= new Monster();
		monster.name="毛毛虫";
		monster.attackNum=1;
		monster.blooCount=100;
		monster.lavel=20;
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
