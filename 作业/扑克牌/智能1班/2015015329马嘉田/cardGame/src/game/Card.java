package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
	private List<Puke> list = new ArrayList<Puke>();

    //创建扑克牌
    public Card(){
        System.out.println("创建扑克牌");
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q","K", "A"};
        for(int i=0;i<color.length;i++)
            for(int j=0;j<number.length;j++){
                list.add(new Puke(color[i], number[j]));
            }   
        System.out.println("扑克牌创建成功！");
    }

    //获取一副扑克牌
    public List<Puke> getList() {
        return list;
    }

    //洗牌）
    public void shufCards(){
        System.out.println("洗牌");
        Collections.shuffle(list);
        System.out.println("洗牌结束");
    }

    //展示扑克牌
    public void showCards(){
        System.out.print("当前的扑克牌为：");
        System.out.print("( ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i).getColor() + list.get(i).getNumber()+ " ");
        }
        System.out.println(" )");
    }
}
