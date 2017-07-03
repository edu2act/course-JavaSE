package puke;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {

	private int ID; 
	private String name; 
	private List<Puku> HandCard; 
	public Player(int _ID , String _name){ 
		this.ID = _ID; 
		this.name = _name; 
		HandCard = new ArrayList<Puku>(); 
		} 
	public int getID() { 
		return ID; 
		} 
	public void setID(int iD) { 
		ID = iD; 
		} 
	public String getName() { 
		return name;
		} 
	public void setName(String name) { 
		this.name = name; 
		} 
	public List<Puku> getHandCard() { 
		return HandCard; 
		} 
	public void setHandCard(List<Puku> handCard) { 
		HandCard = handCard; 
		} 
	
}
