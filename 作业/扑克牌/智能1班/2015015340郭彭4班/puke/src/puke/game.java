package puke;

public class game {
	public static void main(String[] args) {
		puke puke = new puke();
		puke.reset();
		puke.shuffle();

		player pl1 = new player();
		player pl2 = new player();
		player pl3 = new player();

		pl1.setName("aaa");
		pl1.setLevel(1);
		pl2.setName("bbb");
		pl2.setLevel(2);
		pl3.setName("ccc");
		pl3.setLevel(3);

		System.out.println("aaa的牌是");
		for (int i = 0; i < 17; i++) {
			puke.drawPuke(puke);
		}
		System.out.println();

		System.out.println("bbb的牌是");
		for (int i = 0; i < 17; i++) {
			puke.drawPuke(puke);
		}
		System.out.println();

		System.out.println("ccc的牌是");
		for (int i = 0; i < 17; i++) {
			puke.drawPuke(puke);
		}
	}

}
