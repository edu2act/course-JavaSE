/*
 * 创建英雄类
 * 继承人抽象类
 * */



package com.game;

import java.util.Random;

public class Hero extends Person {
	
	/********实现攻击方法********/
	public void attack(Person p){
		if(p.bloodCount>0){
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount - down;
		}
	}
	/********重载攻击方法********/
	public void attack(Person p,Weapon k){
		if(p.bloodCount>0){
			int down = new Random().nextInt(this.attackNum+k.addAttackNum());
			p.bloodCount = p.bloodCount - down;
			System.out.println(p.name+"被攻击了"+down+",还剩下"+p.bloodCount);
		}
		
	}
	/********实现恢复方法********/
	public void recoveryBloodConut(Person p,Recovery r){
		if(p.bloodCount>0){
			int down = new Random().nextInt(r.addBloodCountNum());
			p.bloodCount = p.bloodCount + down;
			System.out.println(p.name+"加了"+down+"血量，现在的血量是："+p.bloodCount);
		}
		
	}
	

}
