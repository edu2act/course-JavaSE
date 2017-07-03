package game;
import java.lang.Thread;
public class Run {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		hero hero1=new hero();
		hero1.name="你";
		hero1.attackNum=100;
		hero1.bloodCount=200;
		hero1.level=1;
		Weapon aa=new Knife();
		Monster monster=new Monster();
		monster.name="怪兽";
		monster.bloodCount=500;
		monster.attackNum=20;
		
		while(true){
			hero1.attack(monster,aa);
			monster.attack(hero1);
			if(hero1.bloodCount<=0&&monster.bloodCount>0){
				System.out.println("You lose");
				break;
			}
			if(monster.bloodCount<=0&&hero1.bloodCount>0){
				System.out.println("You win");
				break;
			}
			if(monster.bloodCount<=0&&hero1.bloodCount<=0){
				System.out.println("You soso");
				break;
			}
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}

}
