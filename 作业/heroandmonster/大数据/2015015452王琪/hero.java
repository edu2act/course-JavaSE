package com;

import java.util.Random;

public class hero extends person{

	public void attack(person mon){
		int boo = new Random().nextInt(this.getSword());
		mon.hp = mon.hp - boo;
		if(mon.hp > 0){
		System.out.println("你"+this.getName()+"打了小怪兽"+mon.getName()+"一拳，小怪兽掉血，目前小怪兽还剩生命"+mon.hp+"点");	
		}
		else{
			System.out.println("你"+this.getName()+"打了小怪兽"+mon.getName()+"一拳，小怪兽掉血，小怪兽没有了生命");	
		}
		
	}
	
	public void attack(person mon,weapon wea){
		int boo = new Random().nextInt(this.getSword()+wea.addAttack());
		mon.hp = mon.hp - boo;
		if(mon.hp > 0){
			System.out.println("你"+this.getName()+"打了小怪兽"+mon.getName()+"一拳，小怪兽掉血，目前小怪兽还剩生命"+mon.hp+"点");	
			}
			else{
				System.out.println("你"+this.getName()+"打了小怪兽"+mon.getName()+"一拳，小怪兽掉血严重，小怪兽没有了生命");	
			}
	}
}
