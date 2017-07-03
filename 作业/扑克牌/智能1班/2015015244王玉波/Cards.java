package poker;

public class Cards {
	 private String color;//花色
	 private String number;//数字
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Cards [color=" + color + ", number=" + number + "]";
	}
	public Cards(String color, String number) {
		super();
		this.color = color;
		this.number = number;
	}
	 
}
