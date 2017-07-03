package te2222;

import java.util.ArrayList;

public class Game {
	public static ArrayList list = new ArrayList();

	public void init() {
		for (int i = 1; i <= 13; i++) {
			Puke p = new Puke();
			p.setFlowerColor("黑桃");
			p.setNumber(i);
			list.add(p);
		}
		for (int i = 1; i <= 13; i++) {
			Puke p = new Puke();
			p.setFlowerColor("红桃");
			p.setNumber(i);
			list.add(p);
		}
		for (int i = 1; i <= 13; i++) {
			Puke p = new Puke();
			p.setFlowerColor("梅花");
			p.setNumber(i);
			list.add(p);
		}
		for (int i = 1; i <= 13; i++) {
			Puke p = new Puke();
			p.setFlowerColor("方片");
			p.setNumber(i);
			list.add(p);
		}
		Puke bigKing = new Puke();
		bigKing.setFlowerColor("大王");
		list.add(bigKing);
		Puke smallKing = new Puke();
		smallKing.setFlowerColor("小王");
		list.add(smallKing);
		for (Object obj : list) {
			Puke p = (Puke) obj;
			System.out.println(p.getFlowerColor() + ":" + p.getNumber());
		}
	}

}
