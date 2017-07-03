package edu.rj.Test5;

import java.util.ArrayList;

public class Palyer {
	public ArrayList hand = new ArrayList(); // 玩家手牌

	public void printf() {
		for (int i = 0; i < hand.size(); i++) {
			Poker p = (Poker) hand.get(i);
			System.out.print(p.color + p.num + " ");
		}
	}
}
