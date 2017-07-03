package Game;
//人物的父类（抽象类），一个怪兽，一个英雄类，一个测试类
import java.util.Random;
/*public class Monstar extends Person{
	public void attack(Person p){
		if(p.bloodCount > 0){
			int down = new Random().nextInt(this.attackNum);
			p.bloodCount = p.bloodCount - down;
		}
	}
	

}*/

public class Monstar extends Person {
	public Monstar(){
	}
	public Monstar(String a,int b,int c,int d){
		name=a;
		bloodCount=b;
		level=c;
		attackNum=d;
	}
	public void attack(Person p,Weapon a){
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum+a.addAttackNum());
			p.bloodCount=p.bloodCount-down;
			System.out.println("怪兽打了英雄一下，掉血量是："+down+"   英雄还剩血量为："+p.bloodCount);
		}
	
	}
}
