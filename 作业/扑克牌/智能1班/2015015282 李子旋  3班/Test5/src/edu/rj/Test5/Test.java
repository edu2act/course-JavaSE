package edu.rj.Test5;

public class Test {

	public static void main(String[] args) {
		Palyer p1 = new Palyer(); // 地主
		Palyer p2 = new Palyer(); // 农民1
		Palyer p3 = new Palyer(); // 农民2
		Deal d = new Deal();
		d.ruffle();  //生成扑克
		d.deal(p1, p2, p3);//洗牌并发牌
		System.out.println("地主的牌面为：");
		p1.printf();
		System.out.println("");
		System.out.println("农民1的牌面为：");
		p2.printf();
		System.out.println("");
		System.out.println("农民2的牌面为：");
		p3.printf();
	}

}
