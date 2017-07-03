package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class player {
	 private String name;
	    player() {
	        super();
	    }

	    player(String name) {
	        super();
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public static void getPoker(List<Integer> player1, List<Integer> player2,
	            List<Integer> player3, List<Integer> dp, List<Integer> list) {
	        for (int i = 0; i < list.size(); i++) {
	            if (i >= list.size() - 3) {
	                dp.add(list.get(i));
	            } else if (i % 3 == 1) {
	                player1.add(list.get(i));
	            } else if (i % 3 == 2) {
	                player2.add(list.get(i));
	            } else if (i % 3 == 0) {
	                player3.add(list.get(i));
	            }
	        }
	    }
	    public void showPoker(List<Integer> list, Map<Integer, String> mapPoker) {
	        System.out.println("\n" + name + "的手牌是：");
	        List<String> listPoker = new ArrayList<>();
	        for (Integer key : list) {
	            listPoker.add(mapPoker.get(key));
	        }
	        Collections.sort(listPoker, new MyComparator());
	        for (String string : listPoker) {
	            System.out.print(string + "   ");
	        }
	    }
	    public int throwsElbows() {
	        Random random = new Random();
	        int num = random.nextInt(6) + 1;
	        System.out.println(name + "摇了" + num + "点");
	        return num;
	    } 
	    public static class MyComparator implements Comparator<String> {
	        public int compare(String o1, String o2) {
	            String m1 = o1.substring(1, 2);
	            String m2 = o2.substring(1, 2);
	            if (m1.equals("1")) {
	                m1 = "a";
	            } else if (m1.equals("J")) {
	                m1 = "b";
	            } else if (m1.equals("Q")) {
	                m1 = "c";
	            } else if (m1.equals("K")) {
	                m1 = "d";
	            } else if (m1.equals("A")) {
	                m1 = "e";
	            } else if (m1.equals("2")) {
	                m1 = "f";
	            }
	            if (m2.equals("1")) {
	                m2 = "a";
	            } else if (m2.equals("J")) {
	                m2 = "b";
	            } else if (m2.equals("Q")) {
	                m2 = "c";
	            } else if (m2.equals("K")) {
	                m2 = "d";
	            } else if (m2.equals("A")) {
	                m2 = "e";
	            } else if (m2.equals("2")) {
	                m2 = "f";
	            }
	            return m1.compareTo(m2);

	        }
	    }
	
}
