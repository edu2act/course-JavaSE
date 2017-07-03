package pake;

import java.util.LinkedList;

public class Player {
	//玩家姓名
	private String name;
	//玩家等级
	private int level;
	//玩家所有的牌
	private LinkedList<String> Poker=new LinkedList<String>();
	public LinkedList<String> getPoker() {
		return Poker;
	}
	public void setPoker(LinkedList<String> poker) {
		Poker = poker;
	}
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
}
