/*
 * 创建刀类
 * 实现武器接口
 * */


package com.game;

public class Knife implements Weapon{
	int addNum = 100;
	
	@Override
	/********实现增加攻击强度方法********/

	public int addAttackNum() {
		// TODO Auto-generated method stub
		return addNum;
	}

}
