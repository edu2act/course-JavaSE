package com.Card;

public class Poker {
	public String number;
	public String pokerColor;
	public String getPoker(){
		return number+pokerColor;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPokerColor() {
		return pokerColor;
	}
	public void setPokerColor(String pokerColor) {
		this.pokerColor = pokerColor;
	}
	
}
