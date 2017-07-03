package puke;


import java.util.ArrayList;
import java.util.List;

public class player {
    private String name;
    private List<card> handCards = new ArrayList<card>();

    public player(String name){
        this.name = name;
    }

    public List<card> getHandCards() {
        return handCards;
    }

    public void setHandCards(card card) {
        handCards.add(card);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}