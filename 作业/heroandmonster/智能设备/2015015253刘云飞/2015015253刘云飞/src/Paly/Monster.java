package Paly;

import java.util.Random;

public class Monster  extends paly{

	@Override
	public void attack(paly e) {
		// TODO Auto-generated method stub
		if(e.blooCount>0) {
			int down=new Random().nextInt(this.attackNum);
			e.blooCount = e.blooCount-down;
		}
	}
	

}
