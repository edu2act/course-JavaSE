package com.game;
import java.util.Random;

public class ZhuzhuHero extends Person{
	public void attack(Person p) {
		if(p.bloodCount>0) {
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount-down;
		}
	}
	public void attack(Person p,Weapon w) {
		if(p.bloodCount>0) {
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+",还剩下了"+p.bloodCount);
		}
	}
}
