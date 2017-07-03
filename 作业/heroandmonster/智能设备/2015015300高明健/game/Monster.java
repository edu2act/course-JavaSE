package game;

import java.util.Random;

public class Monster extends person {

	@Override
	public void attack(person p) {
		// TODO 自动生成的方法存根
		if
		(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum);
			p.bloodCount=p.bloodCount-down;
			p.bloodCount=p.bloodCount-attackNum;
			System.out.println(p.name+"被攻击"+down+"剩余"+p.bloodCount);
		}
		
	}
}
