package game;
import java.util.Random;
public class Monster extends person{

	@Override
	public void attack(person p) {
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum );
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"的血量还有"+p.bloodCount);
		}
		
	}

}
