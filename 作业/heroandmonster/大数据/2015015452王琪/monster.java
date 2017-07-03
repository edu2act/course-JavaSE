package com;

import java.util.Random;

public class monster extends person{
	
	public void attack(person h){
		int boo = new Random().nextInt(this.getSword());
		h.hp = h.hp - boo;
		if(h.hp >= 0){
		System.out.println("小怪兽"+this.getName()+"打你"+h.getName()+"一拳，你掉血了，目前你还剩生命"+h.hp+"点");
		}
		else{
			System.out.println("小怪兽"+this.getName()+"打你"+h.getName()+"一拳，你掉血严重了，你没有了生命");
		}
	}

}
