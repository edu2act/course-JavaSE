package 扑克牌;

import java.util.Iterator;
import java.util.LinkedList;

public class User {
	//定义扑克的数组 用来存储玩家的扑克牌，因为扑克牌是随机分发的，使用LinkedList不错
	private LinkedList<PuKe> linkedList = new LinkedList<PuKe>();
	
	//用户收到牌的方法:在自己的手牌中加上该扑克牌
	public void addPuKe(PuKe puke){
		linkedList.add(puke);
	}
	//显示用户手中的牌
	public void printPuKe(){
		for(int i=0;i<linkedList.size();i++){
			System.out.println(linkedList.get(i).getSkin() + linkedList.get(i).getValue());
		}
		System.out.println();
	}
}
