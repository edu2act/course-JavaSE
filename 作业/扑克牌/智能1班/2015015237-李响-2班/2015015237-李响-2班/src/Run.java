
public class Run {
	   public static void main(String... args) {
	        Dexk deck = new Dexk();
	        deck.reset();
	        deck.shuffle();
	        for (int i = 0; i < 53; i++) {
	            deck.drawCard();
	        }
	    }
}
