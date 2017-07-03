/*
	要求：英雄打小怪兽
	
	分析 ：
	首先应该要抽象一个父类，
		属性：
			两个都应该有名字
			两个都应该有等级
			两个都应该有血量
			两个都应该有攻击力
		方法：
			攻击的方法
			防御的方法
			
*/
import java.util.Random;
abstract class Person{
	public String name;
	public int level;
	public int hp;
	public int attackNum;
	
	public abstract void attack(Person p);
}
interface Weapon{
	public int addAttackNum();
}
class Gun implements Weapon{
	public int addAttackNum(){
		return 200;
	}
}
class Hero extends Person{
	public void attack(Person p){
		if(p.hp>0){
			int down = new Random().nextInt(this.attackNum);
			p.hp = p.hp - down; 
		}
	}
	public void attack(Person p,Weapon w){
		if(p.hp>0){
			int down = new Random().nextInt(this.attackNum+w.addAttackNum());
			p.hp = p.hp - down; 
			System.out.println("小怪兽"+p.name+"被攻击了,"+"掉了"+down+"的血，目前怪兽还剩下"+p.hp+"点的血量");
		}
	}
}
class Monster extends Person{
	public void attack(Person p){
		if(p.hp>0){
			int down = new Random().nextInt(this.attackNum);
			p.hp = p.hp - down; 
			System.out.println("英雄"+p.name+"被攻击了,掉了"+down+"的血,目前英雄还剩下"+p.hp+"点的血量");
		}
	}
}
class Test{
	public static void main(String[] args){
		Hero h = new Hero();
		h.name = "向伟大侠";
		h.hp = 400;
		h.level = 1;
		h.attackNum = 70;
		
		Monster m = new Monster();
		m.name = "特斯拉";
		m.level = 20;
		m.hp = 2000;
		m.attackNum = 50;
		Weapon w = new Gun();
		while(true){
			h.attack(m,w);
			System.out.println();
			m.attack(h);
			if(h.hp <= 0){
				System.out.println("超人挂了，不服？那就重新来过吧，哈哈哈！");
				break;
			}else if(m.hp <= 0){
				System.out.println("怪兽挂了，超人大人，继续挑战吧！");
				break;
			}
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
