package poker;

import java.util.ArrayList;

public class Game {
	private ArrayList<Puke> list = new ArrayList<Puke>();
	public void f(){
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
	public void DealCarls(Players e,Players s,Players t) {
		GetRandom ran=new GetRandom();
		int[] ranInt=new int[9];
		ranInt=ran.getRandom();
		for(int i=0;i<3;i++) {
			e.lin.add(list.get(ranInt[i]));
		}
		for(int i=3;i<6;i++) {
			s.lin.add(list.get(ranInt[i]));
		}
		for(int i=6;i<9;i++) {
			t.lin.add(list.get(ranInt[i]));
		}
	}

}
