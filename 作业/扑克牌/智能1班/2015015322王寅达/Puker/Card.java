package Puker;

public class Card {
	private String color;
	private String number;
	
	public Card(String color,String number) {
		this.color = color;
		this.number = number;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getNumber() {
		return number;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		if(color==null) {
			if(other.getColor()!=null) 
				return false;
		}else if(!color.equals(other.getColor()))
			return false;
		if(number==null) {
			if(other.getNumber()!=null)
				return false;
		}else if(!number.equals(other. getNumber()))
				return false;
		return true;
	}
}
