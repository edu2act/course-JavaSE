package Pocker;

public class Test {
	
	public static void main(String[] args) {
		Game g=new Game();
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		g.init();
		System.out.println("第一位玩家：");
		g.dispatchPoker(p1);
		System.out.println("第二位玩家：");
		g.dispatchPoker(p2);
		System.out.println("第三位玩家：");
		g.dispatchPoker(p3);
	}
}
