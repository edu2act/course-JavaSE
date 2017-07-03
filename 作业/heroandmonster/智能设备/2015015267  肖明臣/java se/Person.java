package com.game;

public abstract class Person {
	public String name;
	public int bloodCount;
	public int level;
	public int attackNum;
	public abstract void attack(Person p);
}
