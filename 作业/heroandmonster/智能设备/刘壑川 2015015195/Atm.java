package game;

import java.util.Random;

public class Atm extends Father{
	public void attack(Father f){
		if(f.bloodCount > 0){
			int down = new Random().nextInt(this.attackNum);
			f.bloodCount = f.bloodCount-down;
		}
	}
	public void attact(Father f,Weapen w){
		if(f.bloodCount > 0){
			int down = new Random().nextInt(this.attackNum+w.addAttackNum(10));
			f.bloodCount = f.bloodCount-down;
		}
	}
}
