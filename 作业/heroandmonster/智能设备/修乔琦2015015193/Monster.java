package game;

import java.util.Random;

public class Monster extends Person {
	public void attack(Person p) {
		if(p.bloodCount>0) {
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount-down;
			System.out.println(p.name+"掉血量："+down+"剩余血量："+p.bloodCount);
		}
	}
}
