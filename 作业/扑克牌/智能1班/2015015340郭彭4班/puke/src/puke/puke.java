package puke;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class puke {
	private String flowerColor;
	private String num;
	private String[] huase = { "红桃", "黑桃", "方片", "梅花" };
	private String[] value = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private puke[] puke = null;
	private List randomList = new ArrayList();
	private int idx=0;
	private int index = 0;
	public String getFlowerColor() {
		return flowerColor;
	}

	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String toString() {
		return flowerColor + num;
	}
	public void reset() {
		List data = new ArrayList();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				puke c = new puke();
				c.setFlowerColor(huase[i]);
				c.setNum(value[j]);
				data.add(c);
			}
		}		
		puke = (puke[]) data.toArray(new puke[0]);
	}

	public void shuffle() {
		
		ArrayList b = new ArrayList();
		while (randomList.size() < 52) {
			int i = (int) (Math.random() * 52);
			if (!randomList.contains(i)) {
				randomList.add(i);
			}
		}
		for (int i = 0; i < randomList.size(); i++) {
			int idx = Integer.parseInt(String.valueOf(randomList.get(i)));
		}
		System.out.println();
		}
			

	public void drawPuke(puke c) {
		int a = Integer.parseInt(String.valueOf(randomList.get(idx++)));
		System.out.print(puke[a] + " ");
	}
}

