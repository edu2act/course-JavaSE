package game;

import java.util.Random;
public class Monster extends Paly {
	public Monster(String name,int bloodCount,int lavel,int attackNum ){
		this.name=name;
		this.bloodCount=bloodCount;
		this.lavel=lavel;
		this.attackNum=attackNum;
	}
	@Override
	public void attack(Paly a) {
		// TODO 自动生成的方法存根
		if(a.bloodCount>0){
			int down=new Random().nextInt(this.attackNum);
			a.bloodCount=a.bloodCount-down;
			System.out.println(this.name+"Win");
		}
	}
	public void atttack(Paly e,knife k){
		if(e.bloodCount>0){
			int down=new Random().nextInt(this.attackNum+k.addAttackNum(10));
			e.bloodCount=e.bloodCount-down;
			System.out.println(this.name+"Win");
		}
	}
}