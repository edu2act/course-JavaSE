package Paly;

import java.util.Random;

public class Hero extends paly{

	@Override
	public void attack(paly e) {
		if(e.blooCount>0) {
			int down=new Random().nextInt(this.attackNum);
			e.blooCount = e.blooCount-down; 
		}
		
	}
	public void attack(paly e,knife k) {
		if(e.blooCount>0) {
			int down=new Random().nextInt(this.attackNum+k.addAttackNum(10));
			e.blooCount = e.blooCount-down;
		}
	}
	
}
