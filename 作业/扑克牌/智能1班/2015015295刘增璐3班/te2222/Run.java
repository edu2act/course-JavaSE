package te2222;

import java.util.Random;

public class Run {

	public static void main(String[] args) {

		Game a = new Game();
		a.init();
		System.out.println("总的扑克牌数："+Game.list.size());
		Player p1 = new Player();
		System.out.println("第一位玩家的扑克牌数："+p1.ll.size());
		Player p2 = new Player();
		System.out.println("第二位玩家的扑克牌数："+p2.ll.size());
		Player p3 = new Player();
		System.out.println("第三位玩家的扑克牌数："+p3.ll.size());

		Random rand = new Random();
		int size = 54;

		for (int i = 1; i <= size/3; i++) {
			// 任意取一个0~size的整数，注意此处的items.size()是变化的，所以不能用前面的size会发生数组越界的异常
			int myRand1 = rand.nextInt(Game.list.size());
			// 将取出的这个元素放到存放结果的集合中
			p1.ll.add(Game.list.get(myRand1));
			// 从原始集合中删除该元素防止重复。注意，items数组大小发生了改变
			Game.list.remove(myRand1);

			
			int myRand2 = rand.nextInt(Game.list.size());
			p2.ll.add(Game.list.get(myRand2));
			// 从原始集合中删除该元素防止重复。注意，items数组大小发生了改变
			Game.list.remove(myRand2);
			
			int myRand3 = rand.nextInt(Game.list.size());
			p3.ll.add(Game.list.get(myRand3));
			// 从原始集合中删除该元素防止重复。注意，items数组大小发生了改变
			Game.list.remove(myRand3);
		
		}
		System.out.println("第一位玩家的扑克牌数："+p1.ll.size());
		System.out.println("第二位玩家的扑克牌数："+p2.ll.size());
		System.out.println("第三位玩家的扑克牌数："+p3.ll.size());
		System.out.println("第一位玩家的牌：");
		for(Object obj1 : p1.ll){
			Puke p = (Puke) obj1;
			System.out.println(p.getFlowerColor() + ":" + p.getNumber());
		}
		System.out.println("第二位玩家的牌：");
		for(Object obj2 : p2.ll){
			Puke p = (Puke) obj2;
			System.out.println(p.getFlowerColor() + ":" + p.getNumber());
		}
		System.out.println("第三位玩家的牌：");
		for(Object obj3 : p3.ll){
			Puke p = (Puke) obj3;
			System.out.println(p.getFlowerColor() + ":" + p.getNumber());
		}
	}

}
