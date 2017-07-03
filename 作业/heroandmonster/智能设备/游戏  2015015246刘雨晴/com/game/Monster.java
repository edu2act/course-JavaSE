/*
 * 定义怪兽类
 * 继承人抽象类
 * */


package com.game;

import java.util.Random;

public class Monster extends Person {
	public void attack(Person p){
		if(p.bloodCount>0){
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount - down;
			System.out.println(p.name+"被攻击了"+down+",还剩下"+p.bloodCount);

		}
	}
	/********实现恢复方法********/

	@Override
	public void recoveryBloodConut(Person p, Recovery r) {
		// TODO Auto-generated method stub
		if(p.bloodCount>0){
			int down = new Random().nextInt(r.addBloodCountNum());
			p.bloodCount = p.bloodCount + down;
			System.out.println(p.name+"加了"+down+"血量，现在的血量是："+p.bloodCount);
		}
		
	}
	/********重写攻击方法********/
	/*当对方使用防御技能时的方法*/
	public int attack(Person p,Skill s){
		if(p.bloodCount>0){
			int down = new Random().nextInt(s.keepBloodBalance());
			p.bloodCount = p.bloodCount + down;
			System.out.println(p.name+"使用了防御技能，掉血量减少，掉了"+down+"血量，"+p.name+"被攻击了"+down+",还剩下"+p.bloodCount);
		}
		return p.bloodCount;
		
		
	}
	
	
	
	
}
