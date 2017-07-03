package com.game;

import java.util.Random;

public class Hero extends Person {
	public void attack(Person p){
		if(p.bloodCount>0){
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount-down;
		}
	}
	public void attack(Person p,Weapon w){
		if(p.bloodCount>0){
			int down = new Random().nextInt(this.attackNum+w.addAttackNum());
			p.bloodCount = p.bloodCount-down;
			System.out.println(p.name+"-"+down);
		}
	}
}
