package puke;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Game {

	Scanner scan = new Scanner(System.in); 
	public Player creatPlayer() throws WrongCommand{ 
		try{ 
			System.out.println("请输入玩家姓名");
			String name = scan.next(); 
			System.out.println("请输入玩家ID"); 
			int ID = scan.nextInt();
			Player player= new Player(ID,name); 
			return player; 
			}catch(Exception e){ 
				throw new WrongCommand("请输入正确的ID类型"); 
				} 
		} 
	public void Game(SetCard e,Player p1,Player p2 ){ 
		//游戏内容主体 
		e.buildCard(); 
		System.out.println("扑克牌已生成"); 
		for(Puku card:e.PukuList){ 
			System.out.println(card.getHuase()+card.getPoint()); } e.randomCard();
			System.out.println("扑克牌已洗牌"); 
			for(Puku card:e.PukuList){ 
				System.out.println(card.getHuase()+card.getPoint()); 
				} 
			for(int i=0;i<e.PukuList.size();i=i+4){ 
				for (int j = 0;j<2;j++){ 
					Puku card = new Puku(e.PukuList.get(i+j).getHuase(),e.PukuList.get(i+j).getPoint());
					p1.getHandCard().add(card); 
					} 
				for (int j = 2;j<4;j++){ 
					Puku card = new Puku(e.PukuList.get(i+j).getHuase(),e.PukuList.get(i+j).getPoint());
					p2.getHandCard().add(card); 
					} 
				Collections.sort(p1.getHandCard());
				Collections.sort(p2.getHandCard()); 
				Puku card1 = new Puku(p1.getHandCard().get(p1.getHandCard().size()-1).getHuase(),p1.getHandCard().get(p1.getHandCard().size()-1).getPoint());
				
		
				Puku card2 = new Puku(p2.getHandCard().get(p2.getHandCard().size()-1).getHuase(),p2.getHandCard().get(p2.getHandCard().size()-1).getPoint()); 
				List<Puku> GameList = new ArrayList<Puku>(); 
				GameList.add(card1); 
				GameList.add(card2); 
				Collections.sort(GameList); 
				if (p1.getHandCard().contains(GameList.get(1))){ 
					System.out.println("本轮"+p1.getName()+"获胜"); 
					}else if(p2.getHandCard().contains(GameList.get(1))){ 
						System.out.println("本轮"+p2.getName()+"获胜"); 
						} 
				System.out.println(p1.getName()+"手牌:"); 
				for(Puku card:p1.getHandCard()){ 
					System.out.println(card.getHuase()+card.getPoint()); 
					} 
				System.out.println(p2.getName()+"手牌"); 
				for(Puku card:p2.getHandCard()){ 
					System.out.println(card.getHuase()+card.getPoint()); 
					} 
				p1.getHandCard().clear(); 
				p2.getHandCard().clear(); 
				System.out.println("请输入是否进继续进行游戏，请输入yes或者no"); 
				String choose = scan.next(); 
				if(scan.equals("no")){
					break;
					} 
				}
			System.out.println("游戏结束");
	}
		

}
