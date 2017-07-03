package Pocker;

import java.util.LinkedList;

public class Player {

	private String name;
	private int level;
	private LinkedList<Pocker> ll=new LinkedList<Pocker>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void getPocker(Pocker poc) {
		ll.add(poc);
		System.out.print(poc.getFlowerColor()+" "+poc.getNumber()+"/");
	}
}
