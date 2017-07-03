package com.game;

import java.util.Random;

public class Monster extends Person {
	@Override
	public void attack(Person p) {
		if(p.bloodCount > 0) {
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount - down;
			System.out.println(p.name+"被攻击了"+down+"还剩下"+p.bloodCount);
		}
	}
		
	
			
		
		}

