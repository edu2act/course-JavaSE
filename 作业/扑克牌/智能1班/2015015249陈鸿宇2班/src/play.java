
public class play {

	public static void main(String[] args) {
		
		game game=new game();
		game.CreateGame();
		game.CreatePuke();
		game.ShuffleTheCards();
		game.dealCard();
		game.gameOn();
	}

}
