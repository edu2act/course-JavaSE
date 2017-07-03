
public class Card {
	private String flowerColor;
	private int score;
	public Card() {
		
	}
	public Card(String flowerColor, int score) {
		this.flowerColor = flowerColor;
		this.score = score;
	}
	public String getFlowerColor() {
		return flowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
