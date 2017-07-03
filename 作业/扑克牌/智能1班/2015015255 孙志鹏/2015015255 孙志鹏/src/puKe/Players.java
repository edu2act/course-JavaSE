package puKe;

import java.util.LinkedList;;

public class Players {
	private String name;
	private int level;
	LinkedList<PuKe> lin = new LinkedList<PuKe>();
	public Players(String Sname,int Plevel){
		name=Sname;
		level=Plevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public LinkedList<PuKe> getLin() {
		return lin;
	}
	public void setLin(LinkedList<PuKe> lin) {
		this.lin = lin;
	}
	
}
