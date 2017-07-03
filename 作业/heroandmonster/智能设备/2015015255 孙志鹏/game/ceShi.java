package game;

public class ceShi {
	public static void main  (String [] args){
		Hero t1=new Hero("张三", 120, 20, 40);
		Monster t2=new Monster("李四", 150, 30, 40);
		t1.attack(t2);
				
	}
}
