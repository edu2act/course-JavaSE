package puke;
import java.util.LinkedList;
import java.util.Random;

public class Game {
	Random r=new Random();
	private Puke e;
	
	Player p1=new Player();
	Player p2=new Player();
	Player p3=new Player();
	
	public LinkedList link=new LinkedList();
	public void init(){
		for(int i=0;i<e.color.length;i++){
			for(int j=0;j<e.count.length;j++)
			link.add(e.color[i]+e.count[j]);
		}
	}
	

	public void getcord(){
		for(int i = 0;i<link.size();i++){
		
			System.out.println(link.get(i));
		}
	}
	public void select(){
		for(int i=0;i<link.size()/3;i++){
			int e1=r.nextInt(link.size());
			p1.li.add(link.get(e1));
			link.remove(e1);
			int e2=r.nextInt(link.size());
			p2.li.add(link.get(e1));
			link.remove(e2);
			int e3=r.nextInt(link.size());
			p3.li.add(link.get(e1));
			link.remove(e3);
		}
	}
	public void printdeal(){
		for(int i=0;i<p1.li.size();i++){
			System.out.println(p1.li.get(i));
		}
		for(int i=0;i<p2.li.size();i++){
			System.out.println(p2.li.get(i));
		}
		for(int i=0;i<p3.li.size();i++){
			System.out.println(p3.li.get(i));
		}
	}
	
}
