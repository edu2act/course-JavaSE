package com.game;

import java.util.Random;

public class Monster extends Person{
	
	public void attack(Person p){
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum);
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"被攻击了"+down+","+"剩余血量"+bloodCount);
		}
		
	}
	
	public void magic(Person p){
		if(p.bloodCount<100){
			int down=80;
			p.bloodCount=p.bloodCount-down;
			System.out.println(p.name+"使用魔法道具"+","+"剩余血量"+bloodCount);
		}
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
	}
	
}
