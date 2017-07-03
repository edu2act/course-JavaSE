package rong;

import java.util.Random;
import java.util.ArrayList; 
import java.util.List; 

public class Player{
	 private String[] huase = { "红桃", "黑桃", "方片", "梅花" };
	    private String[] value = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	    private Puke[] card = null;
	    private List randomList = new ArrayList();
	    private int idx = 0;
	    public void reset() {
	        List data = new ArrayList();
	        for (int i = 0; i < huase.length; i++) {
	            for (int j = 0; j < value.length; j++) {
	               Puke c = new Puke();
	                c.setFlowercolor(huase[i]);
	                c.setValue(value[j]);
	                data.add(c);
	            }
	        }
	        card = (Puke[]) data.toArray(new Puke[0]);
	 
	    }
	    public void shuffle() {
	        while (randomList.size() < 52) {
	            int i = (int) (Math.random() * 52);
	            if (!randomList.contains(i)) {
	                randomList.add(i);
	            }
	        }
	        for (int i = 0; i < randomList.size(); i++) {
	            int idx = Integer.parseInt(String.valueOf(randomList.get(i)));
	            System.out.print(card[idx] + ",");
	        }
	        System.out.println();
	    }
	 
}
