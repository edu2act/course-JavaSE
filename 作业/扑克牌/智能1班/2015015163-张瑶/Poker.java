package game1;

public class Poker {
	private String flowerColor;
	private int number;
	public String getFlowerColor() {
		return flowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void show(){
		System.out.print("  "+flowerColor+number);
	}
}
