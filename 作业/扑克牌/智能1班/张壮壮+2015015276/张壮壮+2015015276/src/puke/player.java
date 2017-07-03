package puke;

import java.util.ArrayList;
import java.util.Random;

public class player {
	private ArrayList num = new ArrayList(54);
	private ArrayList hongtao = new ArrayList(13);
	private ArrayList  heitao= new ArrayList(13);
	private ArrayList fangpian = new ArrayList(13);
	private ArrayList meihua = new ArrayList(13);
	private ArrayList wang = new ArrayList(2);
	private int sum1 = 13;
	private int sum2 = 2;
	
	public void shuffle(){
		for(int i=0;i<13;i++){
			PuKu p = new PuKu("红桃",i+1);
			hongtao.add(p);
		}
		for(int i=0;i<13;i++){
			PuKu p = new PuKu("黑桃",i+1);
			heitao.add(p);
		}
		for(int i=0;i<13;i++){
			PuKu p = new PuKu("方片",i+1);
			fangpian.add(p);
		}
		for(int i=0;i<13;i++){
			PuKu p = new PuKu("梅花",i+1);
			meihua.add(p);
		}
		PuKu p1 = new PuKu("大毛",14);
		wang.add(p1);
		PuKu p2 = new PuKu("小毛",14);
		wang.add(p2);
	}
	public void dispatch(Game a,Game b,Game c){
		do{
				int temp = new Random().nextInt(5);
				if(temp == 0 && sum1 > 0){
					int hong = new Random().nextInt(sum1);
					num.add(hongtao.get(hong));
					sum1--;
				}
				if(temp == 1 && sum1 > 0){
					int hei = new Random().nextInt(sum1);
					num.add(hongtao.get(hei));
					sum1--;
				}
				if(temp == 2 && sum1 > 0){
					int fang = new Random().nextInt(sum1);
					num.add(hongtao.get(fang));
					sum1--;
				}
				if(temp == 3 && sum1 > 0){
					int mei = new Random().nextInt(sum1);
					num.add(hongtao.get(mei));
					sum1--;
				}
				if(temp == 4 && sum1 > 0){
					int gui = new Random().nextInt(sum2);
					num.add(hongtao.get(gui));
					sum1--;
				}
		}
		while(num.size()<54);
	}
}
