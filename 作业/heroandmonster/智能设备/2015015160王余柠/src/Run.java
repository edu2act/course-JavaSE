
public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hero hero=new Hero();
		hero.name="寒冰";
		hero.bloodCount=100;
		hero.level=1;
		hero.attackNum=60;
		
		Monster monster=new Monster();
		monster.name="盖伦";
		monster.bloodCount=900;
		monster.level=20;
		monster.attackNum=8;
			
		while(true){
			Thread.sleep(500);
			hero.attack(monster);
			monster.attack(hero);
			if(hero.bloodCount<=0){
				System.out.println("盖伦赢了");
				break;
			}
			if(monster.bloodCount<=0){
				System.out.println("赢了");
				break;
			}
		}
		
		

		
	}

}
