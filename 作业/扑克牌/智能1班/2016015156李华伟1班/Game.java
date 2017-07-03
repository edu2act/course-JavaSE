import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;


public class Game {
	ArrayList<Cards> list=new ArrayList<Cards>();//必须得加泛型 我的一下午啊！！！
	ArrayList list1=new ArrayList();
	
	public void init(){//把牌放到数组集合中
		list1.add("地主");
		list1.add("农民");
		list1.add("农民");
		Collections.shuffle(list1);	
		for(int i=1;i<14;i++){
			Cards p=new Cards();
			p.setFlowerColor("黑桃");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<14;i++){
			Cards p=new Cards();
			p.setFlowerColor("方片");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<14;i++){
			Cards p=new Cards();
			p.setFlowerColor("梅花");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=1;i<14;i++){
			Cards p=new Cards();
			p.setFlowerColor("红桃");
			p.setNumber(i);
			list.add(p);
		}
		Cards p=new Cards();
		p.setFlowerColor("大王");
		list.add(p);
		Cards p1=new Cards();
		p1.setFlowerColor("小王");
		list.add(p1);
		Collections.shuffle(list);
	}
	public void Firsthave(){//发牌
		
		Player one =new Player();
		if(list1.get(0)=="地主"){
			one.setLevel(1000);
			one.setName("张三");
			one.setIdentity("地主");
			for(int i=0;i<17;i++){
				one.list1.add(list.get(i));
			}
			for(int i=51;i<54;i++){
				one.list1.add(list.get(i));
			}
			
			System.out.println("分数:"+one.getLevel()+"  姓名:"+one.getName()+"  身份:"+one.getIdentity());
			for(Cards b:one.list1){
				b.show();
			}
			list1.remove(0);
		}else{
			one.setLevel(1000);
			one.setName("张三");
			one.setIdentity("农民");
			for(int i=0;i<17;i++){
				one.list1.add(list.get(i));
			}
			System.out.println("分数:"+one.getLevel()+"  姓名:"+one.getName()+"  身份:"+one.getIdentity());
			for(Cards b:one.list1){
				b.show();
			}
			list1.remove(0);
		}
		
	}
	public void Sceondhave(){//发牌
		Player two =new Player();
		if(list1.get(0)=="地主"){
			two.setLevel(1000);
			two.setName("李四");
			two.setIdentity("地主");
			System.out.println("\n"+"分数:"+two.getLevel()+"  姓名:"+two.getName()+"  身份:"+two.getIdentity());
			for(int i=17;i<34;i++){
				two.list1.add(list.get(i));
			}
			for(int i=51;i<54;i++){
				two.list1.add(list.get(i));
			}
			for(Cards b:two.list1){
				b.show();
			}
			list1.remove(0);
		}else{
			two.setLevel(1000);
			two.setName("李四");
			two.setIdentity("农民");
			System.out.println("\n"+"分数:"+two.getLevel()+"  姓名:"+two.getName()+"  身份:"+two.getIdentity());
			for(int i=17;i<34;i++){
				two.list1.add(list.get(i));
			}
			for(Cards b:two.list1){
				b.show();
			}
			list1.remove(0);
		}
		
		
	}
	public void Thirdhave(){//发牌
		Player three =new Player();
		if(list1.get(0)=="地主"){
			three.setLevel(1000);
			three.setName("王五");
			three.setIdentity("地主");
			System.out.println("\n"+"分数:"+three.getLevel()+"  姓名:"+three.getName()+"  身份:"+three.getIdentity());
			for(int i=34;i<51;i++){
				three.list1.add(list.get(i));
			}
			for(int i=51;i<54;i++){
				three.list1.add(list.get(i));
			}
			for(Cards b:three.list1){
				b.show();
			}
			
		}else{
			three.setLevel(1000);
			three.setName("王五");
			three.setIdentity("农民");
			System.out.println("\n"+"分数:"+three.getLevel()+"  姓名:"+three.getName()+"  身份:"+three.getIdentity());
			for(int i=34;i<51;i++){
				three.list1.add(list.get(i));
			}
			for(Cards b:three.list1){
				b.show();
			}
			
		}
		
	}
	
}
