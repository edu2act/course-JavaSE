 import java.util.ArrayList;  
import java.util.List;  
  
public class Player {  
    public String name;  
    public List<Card> cards; 
      
    public Player(String name) {  
        this.name = name;  
    }  
      
    public void getCard(Card card){  
        if(cards == null) cards = new ArrayList<Card>();  
        cards.add(card);  
    }  
      
    public String toString(){  
        return name + ":" + cards.toString();  
    }  
}  