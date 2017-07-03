package Pocker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class Game {
	
	private ArrayList<Pocker> list=new ArrayList<Pocker>();
	
	public void init(){ //初始化牌
		for(int i=1;i<55;i++) {
			if(i<14) {
				for(int j=0;j<13;j++) {
					Pocker p = new Pocker();
					p.setFlowerColor("黑桃");
					p.setNumber(j+1);
					list.add(j,p);
				}
			}
			if(i>13 && i<27){
				for(int j=0;j<13;j++) {
					Pocker p = new Pocker();
					p.setFlowerColor("红桃");
					p.setNumber(j+1);
					list.add(j+13,p);
				}
			}
			if(i>26 && i<40){
				for(int j=0;j<13;j++) {
					Pocker p = new Pocker();
					p.setFlowerColor("方片");
					p.setNumber(j+1);
					list.add(j+26,p);
				}
			}
			if(i>39 && i<53){
				for(int j=0;j<13;j++) {
					Pocker p = new Pocker();
					p.setFlowerColor("梅花");
					p.setNumber(j+1);
					list.add(j+39,p);
				}
			}
			if(i==53){
				Pocker p = new Pocker();
				p.setFlowerColor("大王");
				p.setNumber(0);
				list.add(i-1,p);
			}
			if(i==54){
				Pocker p = new Pocker();
				p.setFlowerColor("小王");
				p.setNumber(0);
				list.add(i-1,p);
			}
			Collections.shuffle(list);//打乱牌
		}
	}
	public void dispatchPoker(Player p){//分发
		for(int i=0;i<17;i++) {
			p.getPocker(list.get(i));
			Collections.shuffle(list);
		}
	    System.out.println(" ");
	}
	
}
