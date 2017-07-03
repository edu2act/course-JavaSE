package game;

public class Demo {
	public static void main(String[] args) {
		Atm hero = new Atm();
		hero.name = "泰罗";
		hero.attackNum = 100;
		hero.bloodCount = 100;
		hero.level = 1;
		
		Monster monster = new Monster();
		monster.name = "哥斯拉";
		monster.bloodCount = 200;
		monster.attackNum = 20;
		monster.level = 20;
		
		Kinef k = new Kinef();
		while(true){
			hero.attact(monster, k);
			monster.attack(hero);
			if(hero.bloodCount <= 0){
				System.out.println("你挂了");
				break;
			}
			if(monster.bloodCount <= 0){
				System.out.println("你打赢了小怪兽");
			}
		}
	}
}
