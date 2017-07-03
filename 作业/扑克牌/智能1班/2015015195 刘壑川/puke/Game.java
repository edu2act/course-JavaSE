package puke;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	private ArrayList<Puke> list= new ArrayList<Puke>();
	public void init(){
		for(int i=1;i<14;i++){
			Puke p = new Puke();
			p.setColor("红桃");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<14;i++){
			Puke p = new Puke();
			p.setColor("黑桃");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<14;i++){
			Puke p = new Puke();
			p.setColor("方块");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<14;i++){
			Puke p = new Puke();
			p.setColor("梅花");
			p.setNumber(i);
			list.add(p);
		}
		Puke big = new Puke();
		big.setColor("大王");
		Puke small = new Puke();
		small.setColor("小王");
		list.add(big);
		list.add(small);
		Collections.shuffle(list);
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		p1.setLevel(1);
		p2.setLevel(2);
		p3.setLevel(2);
		for(int i=0;i<17;i++){
			p2.li.add(list.get(i));
		}
		for(int i=17;i<34;i++){
			p3.li.add(list.get(i));
		}
		for(int i=34;i<54;i++){
			p1.li.add(list.get(i));
		}
		System.out.println("p1的手牌为");
		for(int i=0;i<p1.li.size();i++){
			System.out.println(p1.getCard().get(i).getColor()+'\t'+p1.getCard().get(i).getNumber());
		}
		System.out.println("p2的手牌为");
		for(int i=0;i<p2.li.size();i++){
			System.out.println(p2.getCard().get(i).getColor()+'\t'+p2.getCard().get(i).getNumber());
		}
		System.out.println("p1的手牌为");
		for(int i=0;i<p3.li.size();i++){
			System.out.println(p3.getCard().get(i).getColor()+'\t'+p3.getCard().get(i).getNumber());
		}
	}
}
