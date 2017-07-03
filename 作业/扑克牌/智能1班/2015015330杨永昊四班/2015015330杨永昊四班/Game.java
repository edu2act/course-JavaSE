package 扑克牌;

import java.util.ArrayList;
import java.util.Random;

//游戏类
public class Game {
	//数组存储一整副扑克牌
	private ArrayList<PuKe> arrayList = new ArrayList<PuKe>(52);
	
	private User user1 = new User();
	private User user2 = new User();
	private User user3 = new User();
	private User user4 = new User();
	
	private Random random = new Random();
	
	//定义构造方法，将52张扑克（不包含大小王）全部定义
	Game(){	
		for(int i = 0; i < 52; i++){
			arrayList.add(i, new PuKe());
		}
		
		for(int i = 0; i < 52; i++){
			switch(i%4){
			case 0:
				arrayList.get(i).setSkin("红桃");
				break;
			case 1:
				arrayList.get(i).setSkin("方片");
				break;
			case 2:
				arrayList.get(i).setSkin("梅花");
				break;
			case 3:
				arrayList.get(i).setSkin("黑桃");
				break;
			default:
				break;
			}
		}
		for(int i = 0; i < 13; i++){
			arrayList.get(i*4).setValue(i+1);
			arrayList.get(i*4 + 1).setValue(i + 1);
			arrayList.get(i*4 + 2).setValue(i + 1);
			arrayList.get(i*4 + 3).setValue(i + 1);
		}
	} 
	
	//实现随机分配扑克牌的方法
	public void allocPuKe(){
		int[] count = new int[52];
		for(int i=0;i<52;i++){
			int number = random.nextInt(52)+1;
			if(count[number-1]==0 && i<13){
				user1.addPuKe(arrayList.get(number-1));
				count[number-1]++;
			} else if(count[number-1]==0 && i>=13 && i<26){
				user2.addPuKe(arrayList.get(number-1));
				count[number-1]++;
			} else if(count[number-1]==0 && i>=26 && i<39){
				user3.addPuKe(arrayList.get(number-1));
				count[number-1]++;
			} else if(count[number-1]==0 && i>=39 && i<52){
				user4.addPuKe(arrayList.get(number-1));
				count[number-1]++;
			} else {
				i--;
			}
		}
	}
	
	public static final void main(String[] args){
		Game game = new Game();
		game.allocPuKe();
//		for(int i=0;i<game.arrayList.size();i++){
//			System.out.println(game.arrayList.get(i).getSkin() + "    " + game.arrayList.get(i).getValue());
//		}
		game.user1.printPuKe();
		game.user2.printPuKe();
		game.user3.printPuKe();
		game.user4.printPuKe();
	}
}
