package com.game;

import java.util.Random;

public class Monster extends Person {
	
	public void attack(Person p) {
		if (p.bloodCount > 0) {
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount - down;
			System.out.println("怪兽攻击了英雄"+down+"血,"+p.name+"剩余"+(p.bloodCount)+"血");
		}
	}
}
