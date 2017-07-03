package edu.rj.Test5;

import java.util.ArrayList;
import java.util.Random;

public class Deal {
	private ArrayList list = new ArrayList(54); // 洗牌后的数组
	private ArrayList list1 = new ArrayList(13); // 黑桃的数组列表
	private ArrayList list2 = new ArrayList(13); // 红桃的数组列表
	private ArrayList list3 = new ArrayList(13); // 梅花的数组列表
	private ArrayList list4 = new ArrayList(13); // 方片的数组列表
	private ArrayList list5 = new ArrayList(2); // 大小王
	private int n1 = 13; // list1中剩余的牌数
	private int n2 = 13; // list2中剩余的牌数
	private int n3 = 13; // list3中剩余的牌数
	private int n4 = 13; // list4中剩余的牌数
	private int n5 = 2; // list5中剩余的牌数

	public void ruffle() {	//生成扑克牌，分别存入5个数组列表中
		for (int i1 = 0; i1 < 13; i1++) {
			Poker p = new Poker("黑桃", i1 + 1);
			list1.add(p);
		}

		for (int i2 = 0; i2 < 13; i2++) {
			Poker p = new Poker("红桃", i2 + 1);
			list2.add(p);
		}

		for (int i3 = 0; i3 < 13; i3++) {
			Poker p = new Poker("梅花", i3 + 1);
			list3.add(p);
		}

		for (int i4 = 0; i4 < 13; i4++) {
			Poker p = new Poker("方片", i4 + 1);
			list4.add(p);
		}

		Poker k1 = new Poker("大王", 0);
		Poker k2 = new Poker("小王", 0);

		list5.add(k1);
		list5.add(k2);

	}

	public void deal(Palyer p1, Palyer p2, Palyer p3) {
		//洗牌 并 存入 list中
		while (list.size() < 54) {

			int col = new Random().nextInt(5);

			if (col == 0 && n1 > 0) {
				int crad1 = new Random().nextInt(n1);
				list.add(list1.get(crad1));
				list1.remove(crad1);
				n1--;
			}
			if (col == 1 && n2 > 0) {
				int crad2 = new Random().nextInt(n2);
				list.add(list2.get(crad2));
				list2.remove(crad2);
				n2--;
			}

			if (col == 2 && n3 > 0) {
				int crad3 = new Random().nextInt(n3);
				list.add(list3.get(crad3));
				list3.remove(crad3);
				n3--;
			}

			if (col == 3 && n4 > 0) {
				int crad4 = new Random().nextInt(n4);
				list.add(list4.get(crad4));
				list4.remove(crad4);
				n4--;
			}

			if (col == 4 && n5 > 0) {
				int crad5 = new Random().nextInt(n5);
				list.add(list5.get(crad5));
				list5.remove(crad5);
				n5--;
			}

		}
		// 发牌
		for (int i = 0; p1.hand.size() < 17; i += 3) {
			p1.hand.add(list.get(i));
		}
		for (int i = 1; p2.hand.size() < 17; i += 3) {
			p2.hand.add(list.get(i));
		}
		for (int i = 2; p3.hand.size() < 17; i += 3) {
			p3.hand.add(list.get(i));

		}
		p1.hand.add(list.get(53));
		p1.hand.add(list.get(52));
		p1.hand.add(list.get(51));
	}

}
