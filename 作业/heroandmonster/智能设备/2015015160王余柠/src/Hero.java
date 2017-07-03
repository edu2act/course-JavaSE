import java.util.Random;

public class Hero extends Person {

	@Override
	public  void attack(Person p) {
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum);
			p.bloodCount=p.bloodCount-down;
			System.out.print("盖伦的血量还有"+p.bloodCount);
		}
		
	}
	public void attack(Person p,Weapon k){
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum+k.addAttackNum());
			p.bloodCount=p.bloodCount-down;
			System.out.print(p.name+"的血量还有"+p.bloodCount);
		}
	}

}
