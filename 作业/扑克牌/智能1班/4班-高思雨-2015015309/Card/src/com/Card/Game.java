package com.Card;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class Game {
	private Poker []aPoker=null;
	private ArrayList allUser=new ArrayList();
	public Poker []str=null;
	public void initPoker(){
		String[] values={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] huase={"红桃","黑桃","方片","梅花"};
		 ArrayList alist=new ArrayList();
		for(int i=0;i<huase.length;i++){
			for(int j=0;j<values.length;j++){
				Poker a=new Poker();
				a.setPokerColor(huase[i]);
				a.setNumber(values[j]);
				alist.add(a);
			}
		}
		aPoker = (Poker[]) alist.toArray(new Poker[52]);
		
		
	}
	
	public void givePoker(){
		int sum=0;
			if(sum==52){
				System.out.print("发牌完毕！！！！");
			}else{
					int n=(int)(Math.random()*51);
					if(!allUser.contains(aPoker[n])){
						allUser.add(aPoker[n]);
						sum++;
			}
				
		}
		
	}
	
	
	public void giveUserPoker(){
		int i=0;
		Iterator iter = allUser.iterator();
		 while(iter.hasNext()){
		  Poker asd = (Poker) iter.next();
		  str[i]=asd;  //老师运行到这里，好像说没有实例化对象，出现空指针，为什么错。是我前面的代码有逻辑错误吗？
		  i++;
		 }
	}
	
	public void printfAll(User a1,User a2,User a3,User a4){
		System.out.println("玩家"+a1+"的牌是：");
		for(int i=0;i<13;i++){
			System.out.println(str[i].getPoker());
		}
		System.out.println("玩家"+a2+"的牌是：");
		for(int i=13;i<26;i++){
			System.out.println(str[i].getPoker());
		}
		System.out.println("玩家"+a3+"的牌是：");
		for(int i=26;i<39;i++){
			System.out.println(str[i].getPoker());
		}
		System.out.println("玩家"+a4+"的牌是：");
		for(int i=39;i<52;i++){
			System.out.println(str[i].getPoker());
		}
	}

}
