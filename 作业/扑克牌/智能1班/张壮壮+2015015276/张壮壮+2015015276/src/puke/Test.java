package puke;

public class Test {
	public static void main(String []args){
	Game g1 = new Game();
	Game g2 = new Game();
	Game g3 = new Game();
	player p = new player();
	p.shuffle();
	g1.dispatchPuKe();
	g2.dispatchPuKe();
	g3.dispatchPuKe();
	
	
	
	System.out.println("真的打印不出来了，好难啊");
	}
}
