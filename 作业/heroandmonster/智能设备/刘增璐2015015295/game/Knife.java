package com.game;

public class Knife implements Weapon {//接口的实现 -- 小刀

	int addNum = 10;
	@Override
	public int addAttackNum() {
		return addNum;
	}
}
