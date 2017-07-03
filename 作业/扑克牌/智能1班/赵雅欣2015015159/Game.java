package com;
import java.util.ArrayList;
import java.util.Arrays;


public class Game {
	static ArrayList list =new ArrayList();
	public void inti(){
		Zhao card = new Zhao();
	
		for (int i=1;i<10;i++){
			card.setFlowerColor("ºìÌÒ");
			card.setNumber(i);
			 list.add(card);
		}
		
		for (int i=1;i<10;i++){
			card.setFlowerColor("ºÚÌÒ");
			card.setNumber(i);
			 list.add(card);
		}
		
		for (int i=1;i<10;i++){
			card.setFlowerColor("Ã·»¨");
			card.setNumber(i);
			 list.add(card);
		}
		
		for (int i=1;i<10;i++){
			card.setFlowerColor("·½Æ¬");
			card.setNumber(i);
			 list.add(card);
		}
		
	}
	public static void main(String[] args){
		Game game=new Game();
		game.inti();
		Player l1=new Player();
		Player l2=new Player();
	
		for(int i=1;i<52;i++){
			l1.getCard(list.get(i));
			i++;
		}

		for(int i=1;i<52;i++){
			l2.getCard(list.get(i));
			i++;
		}
		
		System.out.println(l1);
		System.out.println((l2));
	}
}
