package game;

import java.util.Random;
public class Hero extends Paly {
	public Hero(String name,int bloodCount,int lavel,int attackNum ){
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
	public void attack(Paly a,knife j){
		if(a.bloodCount>0){
			int down=new Random().nextInt(this.attackNum+j.addAttackNum(10));
			a.bloodCount=a.bloodCount-down;
			System.out.println(this.name+"Win");
		}
	}
}
