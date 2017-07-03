package com;

import java.util.Scanner;

public class run {

	public static void main(String[] args) throws InterruptedException {

		hero hh = new hero();
		hh.set("奥特曼", 100, 50);
		
		monster boss = new monster();
		boss.set("哥斯拉", 200, 40);
		
		System.out.println("输入1或2：（1为有武器，2没有武器,）");
		
		Scanner s = new Scanner(System.in);
		int sIn = s.nextInt();
		
		if(sIn == 1){
		while(true){
			
			weapon g = new gun();
			hh.attack(boss,g);
			if(boss.hp <= 0){
				System.out.println("");
				System.out.println("奥特曼，你赢了，你是英雄");
				return;
			}
			System.out.println("");
			Thread.sleep(1000);
			
			boss.attack(hh);
			if(hh.hp <= 0){
				System.out.println("");
				System.out.println("你输了，再来一次吧");
				return;
			}
			System.out.println("");
			Thread.sleep(1000);
		}
		}
	
		if(sIn == 2){
			while(true){
			
				hh.attack(boss);
				if(boss.hp <= 0){
					System.out.println("");
					System.out.println("你赢了，你是英雄");
					return;
				}
				System.out.println("");
				Thread.sleep(1000);
				
				boss.attack(hh);
				if(hh.hp <= 0){
					System.out.println("");
					System.out.println("你输了，再来一次吧，选择1你可以选择拥有武器。");
					return;
				}
				System.out.println("");
				Thread.sleep(1000);
			}
			}

	}

}
