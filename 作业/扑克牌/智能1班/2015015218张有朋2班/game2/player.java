package com.game2;
import java.util.*;
public class player {
	ArrayList<card> cards = new ArrayList<card>();
	String name;
	public player(String n){
		this.name = n;
	}
	public void addCard(card c){
		cards.add(c);
	}
	public String toString() {
	    return name + ":\t" + cards;
	}
}
