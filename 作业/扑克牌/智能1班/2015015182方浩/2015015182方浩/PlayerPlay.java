import java.util.ArrayList;
import java.util.Collections;


public class PlayerPlay {
	
	private ArrayList list1 = new ArrayList();
	private ArrayList<String> list2 = new ArrayList();
	static private int i = 0;
	static private int j = 0;
	static private int k = -1;
	static private int num = 0;
	
	public void init(){
		list1.add(new Player("张三"));
		list1.add(new Player("李四"));
		list1.add(new Player("王五"));
		list2.add("平民");
		list2.add("平民");
		list2.add("地主");
	}
	
	public void shuffle(){
		Collections.shuffle(list2);//随机洗身份
	}
	
	public void setIdentify(){
		while(i<=2){
			((Player) list1.get(i)).setIdentify(list2.get(i));
			i++;
		}
	}
	
	public String getIdentify(){
			k++;
			return ((Player) list1.get(k)).getIdentify();
			

	}
	
	public void show(){
		while(num<1){
			System.out.println(((Player) list1.get(j)).getName()+" "+((Player) list1.get(j)).getIdentify());
				j++;
				num++;
		}
		num = 0;
	}
}
