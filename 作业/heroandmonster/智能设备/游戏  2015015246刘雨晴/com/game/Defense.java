package com.game;

/*
 * 实现技能接口
 * 定义防御类
 * */


public class Defense implements Skill{

	int numCount = 50;
	@Override
	public int addBloodCountNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int keepBloodBalance(){
		
		return numCount;
		
	}
	
	
	

}
