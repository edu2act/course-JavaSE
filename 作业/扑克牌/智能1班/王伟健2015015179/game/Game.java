package game;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	ArrayList<Pai> Paiku = new ArrayList();
	String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();
	public Game(){
		createPaiku();
		washPai();
		createPlayer();
	}
	public void createPaiku(){
		for(int i = 0;i<13;i++ ){
			Pai p= new Pai();
			p.setFlowerColor("红桃");
			p.setNum(num[i]);
			Paiku.add(p);
		}
		for(int i = 0;i<13;i++ ){
			Pai p= new Pai();
			p.setFlowerColor("方片");
			p.setNum(num[i]);
			Paiku.add(p);
		}
		for(int i = 0;i<13;i++ ){
			Pai p= new Pai();
			p.setFlowerColor("黑桃");
			p.setNum(num[i]);
			Paiku.add(p);
		}
		for(int i = 0;i<13;i++ ){
			Pai p= new Pai();
			p.setFlowerColor("梅花");
			p.setNum(num[i]);
			Paiku.add(p);
		}
		Pai bigKing = new Pai();
		bigKing.setFlowerColor("大王");
		bigKing.setNum("");
		Paiku.add(bigKing);
		
		Pai smallKing = new Pai();
		smallKing.setFlowerColor("小王");
		smallKing.setNum("");
		Paiku.add(smallKing);
	}
	public void washPai(){
		Collections.shuffle(Paiku);
	}
	public void createPlayer(){
		for(int i =0;i < 18;i++){
			player1.setPai(Paiku.get(i));
		}
		for(int i =0;i < 18;i++){
			player2.setPai(Paiku.get(i+18));
		}
		for(int i =0;i < 18;i++){
			player3.setPai(Paiku.get(i+36));
		}
	}
	public void showPai(){
		System.out.println("player1:");
		for(int i= 0;i<18;i++){
			System.out.print(player1.getPai().get(i).getFlowerColor()+player1.getPai().get(i).getNum()+"\t");
		}
		System.out.println();
		System.out.println("player2:");
		for(int i= 0;i<18;i++){
			System.out.print(player2.getPai().get(i).getFlowerColor()+player2.getPai().get(i).getNum()+"\t");
		}
		System.out.println();
		System.out.println("player3:");
		for(int i= 0;i<18;i++){
			System.out.print(player3.getPai().get(i).getFlowerColor()+player3.getPai().get(i).getNum()+"\t");
			
		}
		System.out.println();

		
	}
}
