package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int id;
    private String name;
    private List<Puke> handCards = new ArrayList<Puke>();

    public Player(int id, String name){
        this.id = id;
        this.name = name;
    }

    public List<Puke> getHandCards() {
        return handCards;
    }

    public void setHandCards(Puke card) {
        handCards.add(card);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
