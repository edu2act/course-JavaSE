package puke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
public class PokerFight{
	public static void main(String[] args){
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		String[] colors={"红桃","黑桃","梅花","方片"};
		String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		int count=0;
		for(String str1:colors){
			for(String str2:numbers){
				String s=str1+str2;
				hm.put(count,s);
				al.add(count);
				count++;
			}
		}
		hm.put(count,"小王");
		al.add(count);
		count++;
		hm.put(count,"大王");
		al.add(count);
		Collections.shuffle(al);
		TreeSet<Integer> dipai=new TreeSet<Integer>();
		TreeSet<Integer> wanjia1=new TreeSet<Integer>();
		TreeSet<Integer> wanjia2=new TreeSet<Integer>();
		TreeSet<Integer> wanjia3=new TreeSet<Integer>();
		for(int i=0;i<al.size();i++){
			if(i>al.size()-4){
				dipai.add(al.get(i));
			}
			else if(i%3==0){
				wanjia1.add(al.get(i));
			}	else if(i%3==1){
				wanjia2.add(al.get(i));
			}	else if(i%3==2){
				wanjia3.add(al.get(i));
			}
		}
			LookCard("玩家1",wanjia1,hm);
			LookCard("玩家2",wanjia2,hm);
			LookCard("玩家3",wanjia3,hm);
			LookCard("底牌",dipai,hm);
		}
		public static void LookCard(String name, TreeSet<Integer> ts,HashMap<Integer, String> hm){
			System.out.print(name+"的牌：");
			for(Integer it:ts){
				System.out.print(hm.get(it)+" ");
			}
			System.out.println();
		}
}
