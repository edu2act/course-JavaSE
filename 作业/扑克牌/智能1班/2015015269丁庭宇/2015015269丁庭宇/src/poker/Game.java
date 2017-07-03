package poker;

import java.util.ArrayList;

public class Game {
	private ArrayList<Puke> list = new ArrayList<Puke>();
	public void ValuePuke(){
		for(int i=0;i<13;i++){
			Puke puk = new Puke("黑桃",i+1);
			list.add(puk);
		}
		for(int i=0;i<13;i++){
			Puke puk=new Puke("红桃",i+1);
			list.add(puk);
		}
		for(int i=0;i<13;i++){
			Puke puk=new Puke("方片",i+1);
			list.add(puk);
		}
		for(int i=0;i<13;i++){
			Puke puk=new Puke("梅花",i+1);
			list.add(puk);
		}
	}
	public void DealCarls(Players p1,Players p2,Players p3,Players p4) {
		GetRandom ran=new GetRandom();
		int[] ranInt=new int[20];
		ranInt=ran.getRandom();
		for(int i=0;i<5;i++) {
			p1.lin.add(list.get(ranInt[i]));
		}
		for(int i=5;i<10;i++) {
			p2.lin.add(list.get(ranInt[i]));
		}
		for(int i=10;i<15;i++) {
			p3.lin.add(list.get(ranInt[i]));
		}
		for(int i=15;i<20;i++) {
			p4.lin.add(list.get(ranInt[i]));
		}
	}

}
