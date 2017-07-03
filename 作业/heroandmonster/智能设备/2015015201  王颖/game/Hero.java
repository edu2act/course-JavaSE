package com.game;

import java.util.Random;

public  class Hero extends Person{
	
	public void attack(Person p,Person m){
		if(p.bloodCount>0){
			int down=m.attackNum;
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(500);
		}catch(Exception e){}
	}
	
	public void attack(Person p,Person m,Defense d){
		if(p.bloodCount>0){
			
			int down=m.attackNum-d.defenseAttackNum();
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(500);
		}catch(Exception e){}
	}
	
	public void attack(Person p,Person m,Defense d,int addAttack1){
		if(p.bloodCount>0){
			addAttack1=10;
			int down=m.attackNum-d.defenseAttackNum()+addAttack1;
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
