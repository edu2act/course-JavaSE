package game;
import java.util.Random;

public class Hero extends person{

	@Override
	public void attack(person p) {
		// TODO Auto-generated method stub
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum );
			p.bloodCount=p.bloodCount -down;
			System.out.println(p.name+"的血量还有"+p.bloodCount);
			
		}
	}
	public void attack(person p,Knife k){
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum);
			down+=k.addAttackNum();
			p.bloodCount=p.bloodCount -down;
			System.out.println(p.name+"的血量还有"+p.bloodCount);
		}
	}
	
}
