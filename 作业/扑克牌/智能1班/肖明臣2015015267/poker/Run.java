package com.poker;

import java.util.HashSet;

public class Run {
	public static void main(String[] args){
		Player player1=new Player();
		Player player2=new Player();
		Player player3=new Player();
		Robot robot=new Robot();
		robot.send(player1,player2,player3);
		
		System.out.println("----------player1-----------");
		System.out.println(player1.pok);
		System.out.println("----------player2-----------");
		System.out.println(player2.pok);
		System.out.println("----------player3-----------");
		System.out.println(player3.pok);
	}
}
