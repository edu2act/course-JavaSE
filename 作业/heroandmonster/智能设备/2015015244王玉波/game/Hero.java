package com.game;

import java.util.Random;

public class Hero extends Person{
	public void attack(Person p){
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum);
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
	}
	
	public void attack(Person p,Weapon w){
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum+=w.addAttackNum());
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		
	}
	
	public void defences(Person p){
		if(p.bloodCount<50){
			int down=50;
			p.bloodCount=p.bloodCount+down;
			System.out.println(p.name+"使用防御道具"+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
	}
	

}
