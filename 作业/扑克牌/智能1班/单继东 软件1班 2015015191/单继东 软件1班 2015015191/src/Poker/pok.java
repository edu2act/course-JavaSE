package Poker;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class pok {
	 private static String[] pokerColor = { "♠", "♥", "♣", "♦" };
	    private static String[] pokerNum = { "3", "4", "5", "6", "7", "8", "9",
	            "10", "J", "Q", "K", "A", "2" };
	    public static void setPoker(Map<Integer, String> mapPoker,
	            List<Integer> listIndex) {
	        int index = 0;
	        for (String nums : pokerNum) {
	            for (String colors : pokerColor) {
	                String poker = colors.concat(nums);
	                mapPoker.put(index, poker);
	                listIndex.add(index);
	                index++;
	            }
	        }
	        mapPoker.put(index, "大王");
	        listIndex.add(index);
	        index++;
	        mapPoker.put(index, "小王");
	        listIndex.add(index);
	    }
	    public static void washPoker(List<Integer> listIndex) {
	        Collections.shuffle(listIndex);
	    }
}
