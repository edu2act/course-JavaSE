package puke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class game {
	
	//创建玩家
    //要对玩家ID的异常处理，要求用户只能输入整数ID，否则需要重新输入
    public player setPlayer(){
        String name="";
        Scanner console = new Scanner(System.in);

        System.out.println("输入姓名：");
        name = console.next();      
        return new player(name);
    }
    
	public static void main(String[] args) {
		//测试简易扑克牌程序
        game game = new game();
        //（1）创建一副牌
        cards cards = new cards();
        //（2）展示新的扑克牌
        cards.showCards();
        //（3）洗牌
        cards.shufCards();
        //（4）创建玩家
        System.out.println("--------------创建玩家就可以开始了-------------");
        
        List<player> p = new ArrayList<player>();
        for(int i=0;i<2;i++)
        {
            System.out.println("请输入第"+(i+1)+"位玩家的姓名:");
            p.add(game.setPlayer());
        }
        for(int i=0;i<p.size();i++)
        {
            System.out.println("欢迎玩家："+p.get(i).getName());
        }
      //（5）开始啦~
        int count = 0;
        System.out.println("------------------开始发牌---------------------");
        //设定每人分别拿两张（or多张）
        for(int i=0; i<2;i++){
            //玩家轮流拿牌
            for(int j=0; j< p.size(); j++){
                System.out.println(">玩家"+p.get(j).getName()+"拿牌");
                p.get(j).setHandCards(cards.getList().get(count));
                count++;
            }
        }
        System.out.println("------------------展示手牌--------------------");
        for(int j=0; j< p.size(); j++){
            System.out.println(">玩家"+p.get(j).getName()+"的牌:");
            System.out.println(p.get(j).getHandCards());
        }
        
	}

}
