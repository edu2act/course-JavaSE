package game;

public class Run {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name ="超杀女";
		hero.attackNum = 100;
		hero.bloodCount = 200;
		hero.level = 2;
			
		Monster monster =new Monster();
		monster.name = "badpeople";
		monster.bloodCount = 2000;
		monster.attackNum = 20;
		monster.level = 20;
		
		Weapon k = new Knife();
		
		while(true) {
			hero.attack(monster,k);
			monster.attack(hero);
			if(hero.bloodCount<=0) {
				System.out.println("超杀女被打败了");
				break;
			}
			if(monster.bloodCount<=0) {
				System.out.println("badpeople被打败了");
				break;
			}
		
		}
	}
}
