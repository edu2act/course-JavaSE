package Puker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayDemo {
	//创建玩家
	//要对玩家ID的异常处理 要求用户只能输入整数ID 否则需要重新输入
	public Player setPlayer() {
		int id = 0;
		String name = " ";
		Scanner console = new Scanner(System.in);
		boolean ready = true;
		do {
			try {
				System.out.println("输入ID");
				id = console.nextInt();
				ready = true;
			}catch(Exception e) {
				System.out.println("输入整数类型的ID");
				ready = false;
				console.nextLine();
			}
		}while(ready==false);
		
		System.out.println("输入姓名：");
		name = console.next();
		return new Player(id,name);
	}
	
	public static void main(String[] agrs) {
		//测试简易扑克牌程序
		PlayDemo game = new PlayDemo();
		//(1) 创建一副牌
		Cards cards = new Cards();
		//(2) 展示新的扑克牌
		cards.showCards();
		//(3) 洗牌
		cards.shufCards();
		//(4) 创建玩家
		System.out.println("--------------创建两个（or多个）玩家就可以开始游戏啦！-------------");
		List<Player> p = new ArrayList<Player>();
		for(int i=0;i<2;i++) {
			System.out.println("请输入第"+(i+1)+"位玩家的ID和姓名:");
			p.add(game.setPlayer());
		}
		for(int i=0;i<p.size();i++) {
			System.out.println("欢迎玩家："+p.get(i).getName());
		}
		//(5)扑克牌比大小游戏开始啦
		int count = 0;
		System.out.println("------------------开始发牌---------------------");
		//设定每人 分别那两张（或多张）
		for(int i=0;i<2;i++) {
			//玩家轮流拿牌
			for(int j=0;j<p.size();j++) {
				System.out.println(">玩家"+p.get(j).getName()+"拿牌");
				p.get(j).setHandCards(cards.getList().get(count));
				count++;
			}
		}
		System.out.println("------------------发牌结束！--------------------");
        System.out.println("------------------开始游戏 ---------------------");
        for(int i=0;i<p.size();i++) {
        	 System.out.print("玩家"+p.get(i).getName()+"的手牌为：[ ");
        	 for(int j=0;j<p.get(i).getHandCards().size();j++) {
        		 Card cur = p.get(i).getHandCards().get(j);
        		 System.out.println(cur.getColor()+cur.getNumber() + " ");
        	 }
        	 System.out.println("]");
        }
        
        //排序得到每个玩家最大的手牌
        for(int i=0;i<p.size();i++) {
        	Collections.sort(p.get(i).getHandCards(),new CardComparator());
        }
        List<Card> maxCard = new ArrayList<Card>();
        for(int i=0;i<p.size();i++) {
        	Card maxCur = p.get(i).getHandCards().get(0);
        	System.out.println("玩家"+p.get(i).getName()+"最大的手牌为："+ maxCur.getColor()+maxCur.getNumber());
        	maxCard.add(maxCur);
        }
        //得到最后的胜者
        List<Card> temp = new ArrayList<Card>();
        temp.addAll(maxCard);
        Collections.sort(temp,new CardComparator());
        for(int i=0;i<p.size();i++) {
        	if(maxCard.get(i).equals(temp.get(0)))	System.out.println("恭喜玩家："+p.get(i).getName()+"获胜！");
        }
	}
}
