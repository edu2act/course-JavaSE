package com.poker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Player {
	private String name;
	LinkedList<String> pok = new LinkedList<String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<String> getPok() {
		return pok;
	}
	public void setPok(LinkedList<String> pok) {
		this.pok = pok;
	}

}

