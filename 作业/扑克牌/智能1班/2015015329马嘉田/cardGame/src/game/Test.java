package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //测试简易扑克牌程序
        Game game = new Game();
        //（1）创建一副牌
        Card cards = new Card();
        //（2）展示新的扑克牌
        cards.showCards();
        //（3）洗牌
        cards.shufCards();
        //（4）创建玩家
        System.out.println("创建两个（or多个）玩家就可以开始游戏");
        List<Player> player = new ArrayList<Player>();
        for(int i=0;i<2;i++)
        {
            System.out.println("请输入第"+(i+1)+"位玩家的ID和姓名:");
            player.add(game.setPlayer());
        }
        for(int i=0;i<player.size();i++)
        {
            System.out.println("欢迎玩家："+player.get(i).getName());
        }
        //开始扑克牌比大小游戏
        int count = 0;
        System.out.println("开始发牌");
        //设定每人分别拿两张
        for(int i=0; i<2;i++){
            //玩家轮流拿牌
            for(int j=0; j< player.size(); j++){
                System.out.println(">玩家"+player.get(j).getName()+"拿牌");
                player.get(j).setHandCards(cards.getList().get(count));
                count++;
            }
        }
        System.out.println("发牌结束！");
        System.out.println("开始游戏");
        for(int i=0;i<player.size();i++){
            System.out.print("玩家"+player.get(i).getName()+"的手牌为：( ");
            for(int j=0;j<player.get(i).getHandCards().size();j++){
                Puke cur = player.get(i).getHandCards().get(j);
                System.out.print(cur.getColor()+cur.getNumber()+" ");
            }
            System.out.println(" )");
        }

        //排序得到每个玩家最大的手牌（排序规则自定义）
        for(int i=0;i<player.size();i++){
            Collections.sort(player.get(i).getHandCards(), new Cardsort());
        }
        List<Puke> maxCard = new ArrayList<Puke>();
        for(int i=0;i<player.size();i++){
            Puke maxCur = player.get(i).getHandCards().get(0);
            System.out.println("玩家"+player.get(i).getName()+"最大的手牌为："+ maxCur.getColor()+maxCur.getNumber());
            maxCard.add(maxCur);
        }

        //得到最后的胜者
        List<Puke> temp = new ArrayList<Puke>();
        temp.addAll(maxCard);
        Collections.sort(temp, new Cardsort());
        for(int i=0;i<player.size();i++){
            if(maxCard.get(i).equals(temp.get(0))) System.out.println("恭喜玩家："+player.get(i).getName()+"获胜！"); 
        }
	}

}
