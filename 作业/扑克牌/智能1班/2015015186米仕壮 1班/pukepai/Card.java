public class Card {  
    public String num; 
    public String suit; 
      
    public Card(String num,String suit){  
        this.num = num;  
        this.suit = suit;  
    }  
      
    @Override  
    public String toString() {  
        String str = suit + " " + num;  
        return str;  
    }  
}  