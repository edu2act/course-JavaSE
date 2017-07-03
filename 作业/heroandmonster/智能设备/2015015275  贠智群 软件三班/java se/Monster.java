package com.game;

import java.util.Random;

public class Monster extends Person{
	
		public void attack(Person p){
			if(p.bloodCount>0){
				int down=new Random().nextInt(this.attackNum);
				p.bloodCount=p.bloodCount-down;
				System.out.println("攻击"+ p.name + " " + down + "血" + " 还剩下" + p.bloodCount + "血。");
			}
		}



}
