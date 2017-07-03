package pukepai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Player {
    private int id;
    private String name;
    ArrayList<String>cardInfo=new ArrayList<String>();
    public Player(int id,String name){
        this.id=id;
        this.name=name;
    }
    public ArrayList<String> getCardInfo(){
        return cardInfo;
    }
    public void setCardInfo(String cardInfo){
        this.cardInfo.add(cardInfo);
    }
    public String maxCard(){
        Map<String, Integer> cardCompare=new HashMap<String, Integer>();
        cardCompare.put("梅花", 4);
	    cardCompare.put("黑桃", 3);
	    cardCompare.put("红心", 2);
	    cardCompare.put("方片", 1);
	    ArrayList<String> cards=getCardInfo();
	    String maxCard=null;
	    int a;
	    int b;
	    a=transfer(cards.get(0));
	    b=transfer(cards.get(1));
	    if(a>b){
	        maxCard = cards.get(0);
	    }
	    else if(a<b){
	        maxCard = cards.get(1);
	    }	
	    else{
	        String card1=cards.get(0).substring(0,2);
	        String card2=cards.get(1).substring(0,2);
	        if(cardCompare.get(card1) > cardCompare.get(card2)){
	            maxCard = cards.get(0);
	        }
	        else if(cardCompare.get(card1) < cardCompare.get(card2)){
	            maxCard = cards.get(1);
	        }
	        else{
	            maxCard = cards.get(0);
	        }
	    }
	    return maxCard;
	}
	public int transfer(String str){
	    int a;
	    if(str.substring(2).equals("J")){
	        a=11;
	    }
	    else if(str.substring(2).equals("Q")){
	        a=12;
	    }
	    else if(str.substring(2).equals("K")){
	        a=13;
	    }
	    else if(str.substring(2).equals("A")){
	        a=1;
	    }
	    else{
	        a=Integer.parseInt(str.substring(2));
	    }
	    return a;
	
	}
	public String getName() {
	    return name;
	}



}
