package puke;

public class PuKu {
	public int Number;
	public String FlowerColor;
	public PuKu(String color, int num) {
		this.FlowerColor = color;
		this.Number = num;
	}

	public String setFlowerColor(String color) {
		return this.FlowerColor = color;
	}

	public int setNumber(int num) {
		return this.Number = num;
	}
	
}
