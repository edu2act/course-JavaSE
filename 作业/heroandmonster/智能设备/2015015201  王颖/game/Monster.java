package com.game;

import java.util.Random;

public class Monster extends Person {
	
	
	public void attack(Person p,Person h){
		if(p.bloodCount>0){
			int down=h.attackNum;
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(500);
		}catch(Exception e){}
	}

	public void attack(Person p,Person h,Weapon w){
		if(p.bloodCount>0){
			int down=h.attackNum+w.addAttackNum();
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(500);
		}catch(Exception e){}
		
	}
	

	@Override
	public void attack(Person p) {
		// TODO Auto-generated method stub
		
	}
}
