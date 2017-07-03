package com.game2;
import java.util.*;

public class Game {
	ArrayList<card> poker = new ArrayList<card>();
	player[] players;
	int n = 4;
	String[] name = {"Zang", "Li", "Wang","Zhao"};
	public Game(){
		players = new player[n];
	    for(int i = 0; i < players.length; i++){
	    	players[i] = new player(name[i]);
	    } 
	    
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				poker.add(new card(i,j));
			}
		}
		
		fapai();
		
		for(int i = 0; i < players.length; i++){
			System.out.println(players[i]);
		}	
	}
	
	public void fapai(){
		 int p = 0;
    	 while(!poker.isEmpty()) {
            card c = poker.get(0);
            players[p].addCard(c);
            p = (p + 1) % 4;
            poker.remove(0);
        }
	}
	
	public static void main(String[] args) {
		new Game();
	}
}
