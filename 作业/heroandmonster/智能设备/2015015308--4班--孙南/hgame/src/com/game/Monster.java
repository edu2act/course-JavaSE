package com.game;
import java.util.Random;
public class Monster extends Person {

	@Override
	public void attack(Person p) {
		
	    if(p.bloodCount>0){
	    	int down = new Random().nextInt(this.attackNumber);
	    	p.bloodCount = p.bloodCount - down;
	    	System.out.print("九命猫攻击"+ p.name + " " + down + "血" + " 还剩下" + p.bloodCount + "血。");
	    }
	}

	

}
