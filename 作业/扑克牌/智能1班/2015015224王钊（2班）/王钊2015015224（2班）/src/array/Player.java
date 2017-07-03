package array;

import java.util.LinkedList;

public class Player {
	private String name;
	private int level;
	
	private LinkedList l1=new LinkedList();

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

	public LinkedList getL1() {
		return l1;
	}

	public void setL1(LinkedList l1) {
		this.l1 = l1;
	}
	
	
}
