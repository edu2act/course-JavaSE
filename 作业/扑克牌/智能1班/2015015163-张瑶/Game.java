package game1;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	ArrayList<Poker> list = new ArrayList<Poker>();
	
	public void setA(){
		for(int i=1;i<=13;i++){
			Poker p = new Poker();
			p.setFlowerColor("黑桃");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<=13;i++){
			Poker p = new Poker();
			p.setFlowerColor("梅花");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<=13;i++){
			Poker p = new Poker();
			p.setFlowerColor("方块");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<=13;i++){
			Poker p = new Poker();
			p.setFlowerColor("红桃");
			p.setNumber(i);
			list.add(p);
		}
		Poker p1=new Poker();
		p1.setFlowerColor("大王");
		list.add(p1);
		
		Poker p2=new Poker();
		p2.setFlowerColor("小王");
		list.add(p2);
		Collections.shuffle(list);
	}
	public void putPoker(){
		player p3 = new player();
		p3.setName("A");
		for(int j=0;j<18;j++){
			p3.l2.add(list.get(j));
		}
		System.out.println(p3.getName());
		for(Poker o:p3.l2)
			o.show();
		player p4 = new player();
		p4.setName("B");
		for(int j=18;j<36;j++){
			p4.l2.add(list.get(j));
		}
		System.out.println(p4.getName());
		for(Poker o:p4.l2)
			o.show();
		player p5 = new player();
		p5.setName("C");
		for(int j=36;j<54;j++){
			p5.l2.add(list.get(j));
		}
		System.out.println(p5.getName());
		for(Poker o:p5.l2)
			o.show();
	}

}
