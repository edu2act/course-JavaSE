package com.game;

import java.util.Random;

public class Monster extends Person {

	@Override
	public void attack(Person p) {
		// TODO Auto-generated method stub
		if(p.bloodCount>0){
			int down = new Random().nextInt(this.attackNumber);
			p.bloodCount = p.bloodCount - down;
			System.out.println(this.name + "攻击"+ p.name + " " + down + "血" + " 还剩下" + p.bloodCount + "血。");
		}
	}

}
