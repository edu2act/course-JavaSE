package com.game.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {
	private static ArrayList list = new ArrayList();
	
	public void init(){
		Card card = new Card();
		for(int i = 1;i<14;i++){
			card.setFlowerColor("黑桃");
			card.setNumber(i);
			list.add(card);
		}
		
		for(int i = 1;i<14;i++){
			card.setFlowerColor("红桃");
			card.setNumber(i);
			list.add(card);
		}
		
		for(int i = 1;i<14;i++){
			card.setFlowerColor("梅花");
			card.setNumber(i);
			list.add(card);
		}
		
		for(int i = 1;i<14;i++){
			card.setFlowerColor("方片");
			card.setNumber(i);
			list.add(card);
			
		}
		//对集合进行混乱排序
		Collections.shuffle(list); 		
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.init();//初始化牌，洗牌
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		//抓牌
		for(int i=0;i<52;i++){
			p1.getCard(list.get(i));
			i++;
			if(i>52 || i==52){
				break;
			}
			p2.getCard(list.get(i));
			i++;
			if(i>52 || i==52){
				break;
			}
			p3.getCard(list.get(i));
		}
		//打印出抓牌数，检测是否正确
		System.out.println(p1.getLl());
		System.out.println(p2.getLl());
		System.out.println(p3.getLl());

	}

}
