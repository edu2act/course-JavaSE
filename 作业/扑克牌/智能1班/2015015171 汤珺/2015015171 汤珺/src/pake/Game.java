package pake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Game {

      public static void main(String[] args){
    	 Puku g=new Puku();
    	 Player p=new Player();
    	 g.init();
    	 p.setName("第一个人");
    	 p.setLevel(9);
    	 Collections.shuffle(g.getPuku());
    	 for(int i=1;i<19;i++){
    		 System.out.println(p.getName()+"的第"+i+"张牌"+g.getPuku().get(i));
    	 }
    	 System.out.println("第二个人的发牌");
    	 Puku j=new Puku();
    	 Player r=new Player();
    	 r.setName("第二个人");
    	 r.setLevel(7);
    	 j.init();
    	 Collections.shuffle(j.getPuku());
    	 for(int i=1;i<19;i++){
    		 System.out.println(r.getName()+"的第"+i+"张牌"+g.getPuku().get(i));
    	 }
    	 System.out.println("第三个人的牌面");
    	 Puku m=new Puku();
    	 Player n=new Player();
    	 n.setName("第三个人");
    	 n.setLevel(10);
    	 j.init();
    	 Collections.shuffle(m.getPuku());
    	 for(int i=1;i<19;i++){
    		 System.out.println(n.getName()+"的第"+i+"张牌"+m.getPuku().get(i));
    	 }
    	
    	
      }

}