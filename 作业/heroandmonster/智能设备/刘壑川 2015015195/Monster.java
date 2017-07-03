package game;

import java.util.Random;

public class Monster extends Father{
	public void attack(Father f){
		if(f.bloodCount > 0){
			int down = new Random().nextInt(this.attackNum);
			f.bloodCount = f.bloodCount-down;
		}
	}
}
