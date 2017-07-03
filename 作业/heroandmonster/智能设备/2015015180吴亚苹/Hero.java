package Game;
import java.util.Random;

/*public class Hero extends Person {
	public Hero(){
		
	}
	
	public hero(String a,int b,int c,int d){
		name=a;
		bloodCount=b;
		level=c;
		attackNum=d;
	} 
	
	public void attact (Person p ,Weapon a){
	if(p.bloodCount > 0){
		int down = new Random().nextInt(this.attackNum+addAttackNum());
		p.bloodCount = p.bloodCount - down;
		System.out.println("英雄打了小怪兽一下，掉血量是："+down+"怪兽还剩血量为："+p.bloodCount);
	}
	}

	
		
	
}*/



/*
 * 继承自person类
 * 完成了attack方法的定义
 */
import java.util.Random;

public abstract class Hero extends Person {
	public Hero(){
	}
	public Hero(String a,int b,int c,int d){
		name=a;
		bloodCount=b;
		level=c;
		attackNum=d;
	}
	public void attack(Person p,Weapon a){
		if(p.bloodCount>0){
			int down=new Random().nextInt(this.attackNum+a.addAttackNum());
			p.bloodCount=p.bloodCount-down;
			System.out.println("英雄打了怪兽一下，掉血量是："+down+"    怪兽还剩血量为："+p.bloodCount);
		}
			
	
	}
	
}
