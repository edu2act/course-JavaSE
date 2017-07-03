package a;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
 

public class qqqq {
	public static void main(String[] args) {
        // 创建一个HashMap集合
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
 
        // 创建一个ArrayList集合
        ArrayList<Integer> array = new ArrayList<Integer>();
 
        // 创建花色数组和点数数组
        // 定义一个花色数组
        String[] colors = { "♠", "♥", "♣", "♦" };
        // 定义一个点数数组
        String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2", };
 
        // 从0开始往HashMap里面存储编号，并存储对应的牌,同时往ArrayList里面存储编号即可。
        int index = 0;
 
        for (String number : numbers) {
            for (String color : colors) {
                String poker = color.concat(number);
                hm.put(index, poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
 
        // 洗牌(洗的是编号)
        Collections.shuffle(array);
 
        // 发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
        TreeSet<Integer> user1 = new TreeSet<Integer>();
        TreeSet<Integer> user2 = new TreeSet<Integer>();
        TreeSet<Integer> user3 = new TreeSet<Integer>();
        TreeSet<Integer> diPai = new TreeSet<Integer>();
 
        for (int x = 0; x < array.size(); x++) {
            if (x >= array.size() - 3) {
                diPai.add(array.get(x));
            } else if (x % 3 == 0) {
                user1.add(array.get(x));
            } else if (x % 3 == 1) {
                user2.add(array.get(x));
            } else if (x % 3 == 2) {
                user3.add(array.get(x));
            }
        }
 
        // 看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
        lookPoker("user1", user1, hm);
        lookPoker("user2", user2, hm);
        lookPoker("user3", user3, hm);
        lookPoker("底牌", diPai, hm);
    }
 
    // 写看牌的功能
    public static void lookPoker(String name, TreeSet<Integer> ts,
            HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是：");
        for (Integer key : ts) {
            String value = hm.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
