package game;

import java.util.Random;

public class hero extends person {

	@Override
	public void attack(person p) {
		// TODO 自动生成的方法存根
		if
		(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum);
			p.bloodCount=p.bloodCount-down;
		}

	}
	public void attack(person p,Weapon w){
		if(p.bloodCount>0){
			int  down=new Random().nextInt(this.attackNum+w.attackNum());
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击"+down+"剩余生命"+p.bloodCount);
		}
	}
}
