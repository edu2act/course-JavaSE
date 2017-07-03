package puke;

public class game {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.reset();
		deck.shuffle();

		player pl1 = new player();
		player pl2 = new player();
		player pl3 = new player();

		pl1.setName("张三");
		pl1.setLevel(1);
		pl2.setName("李四");
		pl2.setLevel(2);
		pl3.setName("王五");
		pl3.setLevel(3);

		System.out.println("张三的牌是");
		for (int i = 0; i < 17; i++) {
			deck.drawPuke();
		}
		System.out.println();

		System.out.println("李四的牌是");
		for (int i = 0; i < 17; i++) {
			deck.drawPuke();
		}
		System.out.println();

		System.out.println("王五的牌是");
		for (int i = 0; i < 17; i++) {
			deck.drawPuke();
		}
	}

}
