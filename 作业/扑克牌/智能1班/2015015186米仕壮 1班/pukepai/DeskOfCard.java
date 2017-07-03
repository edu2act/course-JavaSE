import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
  
public class DeskOfCard {      
    List<Card> cards;  
    public void initCard(){  
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};  
        String[] suits = {"方块","梅花","红桃","黑桃"};  
        String[] jokers = {"小王","大王"};  
          
        cards = new ArrayList<Card>();  
        for(int i = 0; i<52; i++){  
            cards.add(new Card(nums[i%13],suits[i/13]));  
        }  
        cards.add(new Card("",jokers[0]));  
        cards.add(new Card("",jokers[1]));  
    }  
      
      
    public static void main(String[] args) {  
        DeskOfCard test = new DeskOfCard();  
        test.initCard(); 
          
        Collections.shuffle(test.cards); 
          
        Player pl1 = new Player("玩家一");  
        Player pl2 = new Player("玩家二");  
        Player pl3 = new Player("玩家三");  
          
        for(int i=0; i<54; i++){  
            if(i%3 == 0){  
                pl1.getCard(test.cards.get(i));  
            }else if(i%3 == 1){  
                pl2.getCard(test.cards.get(i));  
            }else if(i%3 == 2){  
                pl3.getCard(test.cards.get(i));  
            }  
        }  
          
        System.out.println("玩家拿到的手牌为：");  
        System.out.println(pl1.toString());  
        System.out.println(pl2.toString());  
        System.out.println(pl3.toString());  
    }  
}  