package poker;

import java.util.*;

public class Game {
	Scanner input = new Scanner(System.in);


    List<Cards> CardsList = new ArrayList<Cards>();
    List<Player> PlayList = new ArrayList<Player>();
    List<Cards> nowCardsList = new ArrayList<Cards>();  

    String[] color =new String[] {"黑桃","红桃","梅花","方片"};
    String[] number = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    public void CreatePlays(){

        System.out.println("双方玩家各发2张牌，取出最大的一张牌与对手比较，点数大者赢，若点数相同，按'黑桃，红桃,梅花，方片'比较大小");
        for(int i=0;i<2;i++){
            System.out.println("请输入玩家"+(i+1)+"的姓名");
            PlayList.add(new Player(i, input.next()));
        }
    }

    public void CreateCards(){
        System.out.println("创建扑克牌");

        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                CardsList.add(new Cards(color[i], number[j]));

            }
        }
        System.out.println("扑克牌有："+CardsList.toString());
        System.out.println("创建完成！");
    }

    public void ChangeCards(){
        System.out.println("开始洗牌");
        Random rm = new Random();
        int x = rm.nextInt(5);
        for(int i=0;i<x;i++){
            System.out.println("第"+(i+1)+"次洗牌");
           
            Collections.shuffle(CardsList);
           
        }
        System.out.println("洗牌结束！");

    }

    public void SendCards(){
        System.out.println("开始发牌");
        for(int i=0;i<4;i++){
            
            nowCardsList.add(CardsList.get(i));
            System.out.println("玩家"+PlayList.get(i%2).getName()+"拿牌"+nowCardsList.get(i).toString());
        }
        System.out.println("发牌结束！");
    }

    public int Comparison(Cards x,Cards y){
        int Comparison1=0,Comparison2=0;//比较数字
        int Comparison3=0,Comparison4=0;//比较花色

        
        for(int i=0;i<13;i++){
            if(x.getNumber().equals(number[i])){
                Comparison1 = i;
            }

        }
        for(int i=0;i<4;i++){
            if(x.getColor().equals(color[i])){
                Comparison3 = i;
            }
        }
      
        for(int i=0;i<13;i++){
            if(y.getNumber().equals(number[i])){
                Comparison2 = i;
            }

        }
        for(int i=0;i<4;i++){
            if(y.getColor().equals(color[i])){
                Comparison4 = i;
            }
        }

     
        if(Comparison1<Comparison2){
            return 2;
        }else if(Comparison1>Comparison2){
            return 1; 
        }else if(Comparison3<Comparison4){
            return 2;
        }else{
            return 1;
        }


    }

    public void Contest(){
        List<Cards> maxCard = new ArrayList<Cards>();
        int last1=0,last2=0,last3=0;
       last1 = Comparison(nowCardsList.get(0), nowCardsList.get(2));
        if(last1==1){
            maxCard.add(nowCardsList.get(0));
        }else if(last1==2){
            maxCard.add(nowCardsList.get(2));
        }
        System.out.println("玩家"+PlayList.get(0).getName()+"的最大牌是"+maxCard.get(0).toString());
    
        last2 = Comparison(nowCardsList.get(1), nowCardsList.get(3));
        if(last2==1){
            maxCard.add(nowCardsList.get(1));
        }else if(last2==2){
            maxCard.add(nowCardsList.get(3));
        }
        System.out.println("玩家"+PlayList.get(1).getName()+"的最大牌是"+maxCard.get(1).toString());
        //比较
        last3 = Comparison(maxCard.get(0), maxCard.get(1));
        if(last3==1){
            System.out.println("玩家"+PlayList.get(0).getName()+"获胜。");
        }else if(last3==2){
            System.out.println("玩家"+PlayList.get(1).getName()+"获胜。");
        }
    }

}

