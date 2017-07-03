package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
public class Game {
	private ArrayList list=new ArrayList();
	
	static int mm=54;
	public void init() throws InterruptedException {
		
		
		
		for(int i=0;i<13;i++){
			Puke p=new Puke();
			p.setFlowerColor("方片");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=0;i<13;i++){
			Puke p=new Puke();
			p.setFlowerColor("红桃");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=0;i<13;i++){
			Puke p=new Puke();
			p.setFlowerColor("黑桃");
			p.setNumber(i);
			list.add(p);
		}
		for(int i=0;i<13;i++){
			Puke p=new Puke();
			p.setFlowerColor("梅花");
			p.setNumber(i);
			list.add(p);
		}
		
		Puke p1=new Puke();
		p1.setNumber(53);
		p1.setFlowerColor("小丑");
		Puke p2=new Puke();
		p2.setNumber(54);
		p2.setFlowerColor("小丑皇");
		
		list.add(p1);
		list.add(p2);
	
    	  
        LinkedList<Puke> l1=new LinkedList();
        LinkedList<Puke> l2=new LinkedList();
        LinkedList<Puke> l3=new LinkedList();
        
        
        
        
        Player pl1=new Player();
        Player pl2=new Player();
        Player pl3=new Player();
        
        pl1.setName("迪迦");
        pl1.setLevel(1);
        pl1.setL1(l1);
        
        pl2.setName("戴拿");
        pl2.setLevel(1);
        pl2.setL1(l2);
        
        pl3.setName("盖亚");
        pl3.setLevel(1);
        pl3.setL1(l3);
        
       
        
        for(int i=0;i<18;i++){
        	
        	Random random=new Random();
            int num1=random.nextInt(mm);
        	l1.add((Puke) list.get(num1));
        	
        	list.remove(num1);
        	
        	mm=mm-1;
        	
        }
        
       
        
        for(int i=0;i<18;i++){
        	
        	Random random=new Random();
            int num1=random.nextInt(mm);
        	l2.add((Puke) list.get(num1));
        	list.remove(num1);
        	mm=mm-1;
        	
        }
        
        
        
        for(int i=0;i<18;i++){
        	Random random=new Random();
            int num1=random.nextInt(mm);
        	l3.add((Puke) list.get(num1));
        	list.remove(num1);
        	mm=mm-1;
        	
        }
        
        
        
        
        
        
        
	
        
        
        int a=0,b=0,c=0;
        
        for(int i=0;i<18;i++){
        	int m,n,q;
        	String x,y,z;
        	
        	m=(l1.get(i)).getNumber();
        	x=(l1.get(i)).getFlowerColor();
            
            n=(l2.get(i)).getNumber();
            y=(l2.get(i)).getFlowerColor();
            
            q=(l3.get(i)).getNumber();
            z=(l3.get(i)).getFlowerColor();
            
            
            System.out.println("迪迦的牌为"+x+m);
            System.out.println("戴拿的牌为"+y+n);
            System.out.println("盖亚的牌为"+z+q);
            
            if(m>=n&&m>=q){
            	System.out.println("迪迦牌大,加一分\n");
            	a=a+1;
            	
            }else if(n>=m&&n>=q){
            	System.out.println("戴拿牌大,加一分\n");
            	b=b+1;
            }else if(q>=m&&q>=n){
            	System.out.println("盖亚牌大,加一分\n");
            	c=c+1;
            }
            
            
            Thread.sleep(1000);
            
				
			
        }
        
        System.out.println("迪迦最终分数为"+a);
        System.out.println("戴拿最终分数为"+b);
        System.out.println("盖亚最终分数为"+c);
        System.out.println("\n");
        if(a>b&&a>c){
        	System.out.println("迪迦胜利");
        }else if(b>a&&b>c){
        	System.out.println("戴拿胜利");
        }else if(c>a&&c>b){
        	System.out.println("盖亚胜利");
        }else if(a>c&&b>c&&a==b){
        	System.out.println("迪迦和戴拿胜利");
        }else if(a>b&&c>b&&a==c){
        	System.out.println("迪迦和盖亚胜利");
        }else if(b>a&&c>a&&b==c){
        	System.out.println("戴拿和盖亚胜利");
        }else if(a==b&&b==c){
        	System.out.println("迪迦和戴拿和盖亚都胜利");
        }
        
        
        
        
        
        
       
        
   
	   
        
        
        
        
       
        
	}
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
	
	
	

	
}
