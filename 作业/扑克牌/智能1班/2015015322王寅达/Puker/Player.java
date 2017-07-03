package Puker;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int id;
	private String name;
	private List<Card> handCards = new ArrayList<Card>();
	
	public Player(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public List<Card> getHandCards() {
		return handCards;
	}
	
	public void setHandCards(Card card) {
		handCards.add(card);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
