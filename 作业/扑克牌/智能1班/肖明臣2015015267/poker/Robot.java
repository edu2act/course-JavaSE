package com.poker;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Robot{
	
	public void send(Player e,Player s,Player t){
		
		String m,n,o;
		LinkedList<String> rob=new LinkedList<String>();;
		for(int i=1;i<=13;i++){
			rob.add("红桃"+i);
			rob.add("黑桃"+i);
			rob.add("方片"+i);
			rob.add("梅花"+i);
				
		}
		Collections.shuffle(rob);
		for(int i=1;i<=17;i++){ 
			m= rob.remove(0);
			e.pok.add(m);
			
			n= rob.remove(0);
			s.pok.add(n);
			
			o= rob.remove(0);
			t.pok.add(o);
			
			
		}
	}
}

