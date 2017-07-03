package puke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cards {
    private List<card> list = new ArrayList<card>();

    //创建一副扑克牌
    public cards(){
        System.out.println("-----------------创建扑克牌------------------");
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q","K", "A"};
        for(int i=0;i<color.length;i++)
            for(int j=0;j<number.length;j++){
                list.add(new card(color[i], number[j]));
            }   
        System.out.println("----------------扑克牌创建成功！---------------");
    }

    //获取一副扑克牌
    public List<card> getList() {
        return list;
    }

    //洗牌（打乱）
    public void shufCards(){
        System.out.println("----------------开始洗牌------------------------");
        Collections.shuffle(list);
        System.out.println("----------------洗牌结束------------------------");
    }

    //展示一副扑克牌
    public void showCards(){
        System.out.print("当前的扑克牌为：");
        System.out.print("[ ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i).getColor() + list.get(i).getNumber()+ " ");
        }
        System.out.println(" ]");
    }

}