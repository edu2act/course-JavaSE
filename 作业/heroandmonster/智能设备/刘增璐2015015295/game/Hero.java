package com.game;

import java.util.Random;

public class Hero extends Person {

	public void attack(Person p) {//攻击方法
		if (p.bloodCount > 0) {
			int down = new Random().nextInt(this.attackNum);//随机数
			p.bloodCount = p.bloodCount - down;
			System.out.println("英雄攻击了怪兽"+down+"血,"+p.name+"剩余"+(p.bloodCount)+"血");
		}
	}

	public void attack(Person p, Weapon w) {  //带武器攻击方法
		if (p.bloodCount > 0) {
			int down = new Random().nextInt(this.attackNum) + w.addAttackNum();
			p.bloodCount = p.bloodCount - down;
			System.out.println("英雄攻击了怪兽"+down+"血,"+p.name+"剩余"+(p.bloodCount)+"血");
		}
	}
	public void bigAttack(Person p) {
		if(p.bloodCount > p.bloodCount/3) {
			p.bloodCount=p.bloodCount-50;
			System.out.println("英雄发动狮吼功，减少怪兽" + 50 + "血," + p.name + "剩余" + (p.bloodCount) + "血");
		}
	}
	
}
