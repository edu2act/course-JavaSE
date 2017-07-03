package com;

public abstract class person {
	public String name;//姓名
	public int hp;//生命值
	public int sword;//攻击力
	
	public person(){}
	
	public void set(String name, int hp, int sword){
		this.name = name;
		this.hp = hp;
		this.sword = sword;
	}
	
	public String getName(){
		return name;
	}
	
	public int getHp(){
		return hp;
	}
	
	public int getSword(){
		return sword;
	}
	
	public abstract void attack(person p);
	
}
