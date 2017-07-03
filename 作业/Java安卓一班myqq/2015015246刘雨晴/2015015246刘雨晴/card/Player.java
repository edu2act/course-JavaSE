package com.game.card;

import java.util.LinkedList;

public class Player {
	private String name;
	private int level;
	private LinkedList ll = new LinkedList();
	//抓牌方法
	public void getCard(Object object){
		
		ll.add(object);
		
	}

	public void setLl(LinkedList ll) {
		this.ll = ll;
	}

	public int getLl() {
		return ll.size();
	}

}
