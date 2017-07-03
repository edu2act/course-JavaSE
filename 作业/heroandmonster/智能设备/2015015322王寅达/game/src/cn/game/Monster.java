package cn.game;

import java.util.Random;

public class Monster extends PersonFa {

	
	
		public void attack(PersonFa e ) {
			if(e.bloodCount>0) {
				int down = new Random().nextInt(this.attackNum);
				e.bloodCount=e.bloodCount-down;
				System.out.println(e.name +"被攻击了"+down+"还剩下" + bloodCount +"的血量");
			}
		}
		
	
		
	}
	
