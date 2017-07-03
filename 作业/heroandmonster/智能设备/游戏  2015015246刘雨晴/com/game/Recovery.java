/*
 * 
 * 定义恢复类
 * 实现技能接口
 * */



package com.game;

public class Recovery implements Skill{

	int addNum = 20;
	@Override
	public int addBloodCountNum() {

		return addNum;
	}
	
	
	@Override
	public int keepBloodBalance() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	

}
