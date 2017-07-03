package com.game;

public abstract class Person {
	
		public String name;
		public int bloodCount;  // 血量
		public int level;  //等级
		public int attackNum; // 攻击力
		
		public abstract void attack(Person p);// 攻击的方法

		public void setPerson(String name, int bloodCount, int level, int attackNum) {
			this.name = name;
			this.bloodCount = bloodCount;
			this.level = level;
			this.attackNum = attackNum;
		}
		
		
}
