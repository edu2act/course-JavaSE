import java.util.ArrayList;
import java.util.Collections;

public class Game {
	
	private ArrayList list = new ArrayList();
	static private int i = 0;
	static private int num = 0;
	public void init(){
		list.add(new Card("黑桃A",1));
		for(int i = 2;i<=10;i++){
			list.add( new Card("黑桃"+i,i));
		}
		list.add(new Card("黑桃J",1));
		list.add(new Card("黑桃Q",1));
		list.add(new Card("黑桃K",1));
		
		list.add(new Card("红桃A",1));
		for(int i = 2;i<=10;i++){
			list.add( new Card("红桃"+i,i));
		}
		list.add(new Card("红桃J",1));
		list.add(new Card("红桃Q",1));
		list.add(new Card("红桃K",1));
		
		list.add(new Card("方片A",1));
		for(int i = 2;i<=10;i++){
			list.add( new Card("方片"+i,i));
		}
		list.add(new Card("方片J",1));
		list.add(new Card("方片Q",1));
		list.add(new Card("方片K",1));
		
		list.add(new Card("梅花A",1));
		for(int i = 2;i<=10;i++){
			list.add( new Card("梅花"+i,i));
		}
		list.add(new Card("梅花J",1));
		list.add(new Card("梅花Q",1));
		list.add(new Card("梅花K",1));
		
		list.add(new Card("大王",0));
		list.add(new Card("小王",0));
		
		
	}
	
	  /**定义洗牌的方法*/
	public void shuffle(){
		Collections.shuffle(list);//随机洗牌
	}
	
	public void show(){
		while(num<=16){
				System.out.print(((Card) list.get(i)).getFlowerColor()+" ");
				i++;
				num++;
		}
		System.out.println();
		num = 0;
	}
	public void show1(){
		while(num<=19){
				System.out.print(((Card) list.get(i)).getFlowerColor()+" ");
				i++;
				num++;
		}
		System.out.println();
		num = 0;
	}
}
