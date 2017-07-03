package game;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Hero hero = new Hero();
		hero.name = "Jiesi";
		hero.attackNum = 20;
		hero.bloodCount = 100;
		hero.level = 1;
		Knife k = new Knife();

		Monster monster = new Monster();
		monster.name = "哥斯拉";
		monster.attackNum = 10;
		monster.bloodCount = 1000;
		monster.level = 100;
		while (true) {
			Thread.sleep(500);
			if (hero.bloodCount <= 0) {
				System.out.println("你输了");
				break;
			}
			hero.attack(monster, k);
			if (monster.bloodCount <= 0) {
				System.out.println("YOU WIN");
				break;
			}
			monster.attack(hero);
		}

	}

}
